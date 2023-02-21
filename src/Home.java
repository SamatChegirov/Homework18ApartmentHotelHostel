public class Home implements Services {
    public String father;
    public String mather;
    public String son;
    public String daughter;
    public String grandson;

    public Home() {
    }

    public Home(String father, String mather, String son, String daughter, String grandson) {
        this.father = father;
        this.mather = mather;
        this.son = son;
        this.daughter = daughter;
        this.grandson = grandson;
    }

    @Override
    public String toString() {
        return father + ", " + mather + ", " + son + ", " + daughter + ", " + grandson;
    }

    @Override
    public int services() {
        return 5000;
    }


}
