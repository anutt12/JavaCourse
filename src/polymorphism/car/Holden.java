package polymorphism.car;

public class Holden extends Car{
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public void startEngine() {
        super.startEngine();
    }

    @Override
    public void accelerate() {
        super.accelerate();
    }

    @Override
    public void brake() {
        super.brake();
    }
}
