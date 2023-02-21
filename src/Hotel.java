public class Hotel implements Services{
    private String living1;
    private String living2;

    public Hotel() {
    }

    public Hotel(String living1, String living2) {
        this.living1 = living1;
        this.living2 = living2;
    }

    @Override
    public String toString() {
        return living1 + ", " + living2;
    }

    @Override
    public int services() {
        return 8000;
    }
}
