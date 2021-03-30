import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

class record{
    int Id;
    String Name;
    long Salary;
    String ManagerId;
    public record(int Id,String Name,long Salary,String ManagerId) {
        this.Id=Id;
        this.Name=Name;
        this.Salary=Salary;
        this.ManagerId=ManagerId;
    }
}
class Tesk2 {
    public static void main(String[] args) {
        List<record> list1=new List<record>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<record> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(record record) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends record> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends record> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public record get(int index) {
                return null;
            }

            @Override
            public record set(int index, record element) {
                return null;
            }

            @Override
            public void add(int index, record element) {

            }

            @Override
            public record remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<record> listIterator() {
                return null;
            }

            @Override
            public ListIterator<record> listIterator(int index) {
                return null;
            }

            @Override
            public List<record> subList(int fromIndex, int toIndex) {
                return null;
            }
        };
        record joe=new record(1,"Joe",70000,"3");
        list1.add(joe);
        System.out.println(list1.get(0));
    }
}
