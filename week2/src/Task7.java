public class Tesk7 {
    public static void main(String[] args) {
        Duck duck = new Duck("鸭子", "感冒", "发烧", 2);
        duck.showMsg();
        duck.showSymptom();
    }
}

abstract class Poultry {

    private String name;
    private String illness;

    private String symptom;
    private int age;

    public abstract void showSymptom();

    public void showMsg() {
        System.out.print("动物种类:" + name);
        System.out.println(",年龄:" + age + "岁");
        System.out.println("入院原因:" + illness);
    }

    public Poultry() {
        super();
    }

    public Poultry(String name, String illness, String symptom, int age) {
        this.name = name;
        this.illness = illness;
        this.symptom = symptom;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIllness() {
        return illness;
    }

    public void setIllness(String illness) {
        this.illness = illness;
    }

    public String getSymptom() {
        return symptom;
    }

    public void setSymptom(String symptom) {
        this.symptom = symptom;
    }
}

class Duck extends Poultry {

    public Duck() {

    }

    public Duck(String name, String illness, String symptom, int age) {

        super(name, illness, symptom, age);

    }

    @Override

    public void showSymptom() {

        System.out.println("症状为:" + getSymptom());

    }

}