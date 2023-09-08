public class Car extends Transport {

    private int drive;

    public Car(String moving, int drive) {
        super(moving);
        this.drive = drive;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Машина: " + drive);
    }
}