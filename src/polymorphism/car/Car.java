package polymorphism.car;

public class Car {

    private boolean engine = true;
    private int cylinders;
    private String name;
    private int wheels = 4;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
    }

    public void startEngine() {
        System.out.println("The " + getName() + "'s engine is starting " + getClass().getSimpleName());
    }

    public void accelerate() {
        System.out.println("The " + getName() + " is accelerating " + getClass().getSimpleName());
    }

    public void brake() {
        System.out.println("The " + getName() + " is braking " + getClass().getSimpleName());
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}
