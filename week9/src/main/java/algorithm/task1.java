package algorithm;

import java.util.*;

public class task1 {
    public static void main(String[] args) {
        fin_10_max();
    }

    /**
     * @Author bunny
     * @Description //TODO
     * @Date 20:30 2021/4/10
     * @Param []
     * @return void
     **/
    private static void fin_10_max() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Random random = new Random();
        for(int i = 0;i < 1000;i++) {
            int val = random.nextInt(10000)+1;
            arrayList.add(val);
        }
        Comparator<Map.Entry<Integer,Integer>> comparator = new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o1.getValue()-o2.getValue();
            }
        };
        PriorityQueue<Map.Entry<Integer,Integer>> priorityQueue = new PriorityQueue<>(10,comparator);

        HashMap<Integer,Integer> hashMap = new HashMap<>();
        Iterator<Integer> iterator = arrayList.iterator();
        while(iterator.hasNext()) {
            Integer next = iterator.next();
            if(hashMap.containsKey(next)) {
                hashMap.put(next,hashMap.get(next)+1);
            }else {
                hashMap.put(next,1);
            }
        }

        Iterator<Map.Entry<Integer,Integer>> iterator1 = hashMap.entrySet().iterator();
        while (iterator1.hasNext()) {
            Map.Entry<Integer,Integer> next = iterator1.next();
            int value = next.getValue();
            if(priorityQueue.size() < 10) {
                priorityQueue.add(next);
            }else {
                if(priorityQueue.peek().getValue() < value) {
                    priorityQueue.remove();
                    priorityQueue.add(next);
                }
            }
        }
        Iterator<Map.Entry<Integer,Integer>> iterator2 = priorityQueue.iterator();
        System.out.println("数字:出现次数");
        while(iterator2.hasNext()) {
            Map.Entry<Integer,Integer> next = iterator2.next();
            int key = next.getKey();
            int value = next.getValue();
            System.out.println(key+"   "+value);
        }
    }
}
