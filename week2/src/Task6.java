class Vehicle
{
    private int wheels;
    private double weight;
    public int getWheels() {
        return wheels;
    }
    public void setWheels(int wheels) {
        this.wheels = wheels;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Vehicle(int wheels, double weight) {
        super();
        this.wheels = wheels;
        this.weight = weight;
    }
}

class Car extends Vehicle {
    private int loader;

    public int getLoader() {
        return loader;
    }

    public void setLoader(int loader) {
        this.loader = loader;
    }

    public Car(int wheels, double weight,int loader) {
        super(wheels, weight);
        this.loader=loader;

    }
}

class Truck extends Car
{
    private double payload;

    public double getPayload() {
        return payload;
    }

    public void setPayload(double payload) {
        this.payload = payload;
    }
    public Truck(int wheels, double weight, int loader, double payload ) {
        super(wheels, weight, loader);
        this.payload=payload;
    }

}

public class Task6 {

    public static void main(String[] args) {

        Car v= new Car(4,1150.0,3);
        System.out.println("车轮的个数是: "+v.getWheels()+"  车重: "+v.getWeight());
        System.out.println("这是一辆小车，能载6人，实载3人");

        Truck t= new Truck(6,15000.0,1,5000);
        System.out.println("车轮的个数是: "+t.getWheels()+"  车重: "+t.getWeight());
        System.out.println("这是一辆卡车，能载3人，实载1人");
        System.out.println("这是一辆卡车，核载5000kg,你已装载3000.0kg");
    }

}