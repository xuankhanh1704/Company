public class CongNhan extends Canbo {
    private int level;


    public CongNhan() {
    }
    public CongNhan(int level) {
        this.level = level;
    }
    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return super.toString() + "level=" + level;
    }
}
