public class Plane extends Transport {

    private double fly;

    public Plane(String moving, double fly) {
        super(moving);
        this.fly = fly;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Самолет: " + fly);
    }
}
