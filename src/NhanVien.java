public class NhanVien extends Canbo {
    private String position;
    public NhanVien() {

    }
    public NhanVien(String position) {
        this.position = position;
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    @Override
    public String toString() {
        return super.toString() + "position=" + position;
    }
}
