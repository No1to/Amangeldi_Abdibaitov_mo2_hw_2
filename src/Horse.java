public class Horse extends Transport {

    private boolean ride;

    public Horse(String moving, boolean ride) {
        super(moving);
        this.ride = ride;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Лошадь: " + ride);
    }
}
