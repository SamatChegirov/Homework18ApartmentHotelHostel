public class Apartment implements Services {
    private String name1;
    private String name2;
    private String name3;

    public Apartment() {
    }

    public Apartment(String name1, String name2, String name3) {
        this.name1 = name1;
        this.name2 = name2;
        this.name3 = name3;
    }

    @Override
    public String toString() {
        return name1 + ", " + name2 + ", " + name3;
    }

    @Override
    public int services() {
        return 15000;
    }
}
