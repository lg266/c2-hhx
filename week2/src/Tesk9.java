public class Tesk9 {
    public static void main(String[] args) {
        Star s = new Star();
        s.shine();
        System.out.println("====================");
        Universe u = new Sun();
        u.doAnything();
        Star sun = (Star) u;
        sun.shine();
    }
}
interface Universe{
    void doAnything();
}
class Star{
    public void shine(){
        System.out.println("star:星星一闪一闪亮晶晶");
    }
}
class Sun extends Star implements Universe {
    @Override
    public void shine() {
        System.out.println("sun:光照8分钟到达地球");
    }

    @Override
    public void doAnything() {
        System.out.println("sun:太阳吸引着9大行星旋转");
    }

}