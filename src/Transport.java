public class Transport implements Printable {

    private String moving;

    public Transport(String moving) {
        this.moving = moving;
    }

    @Override
    public void print() {
        System.out.println("Использовать: " + moving);
    }
}
