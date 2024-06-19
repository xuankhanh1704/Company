public class KySu extends  Canbo {
    private String major;
    public KySu() {

    }
    public KySu(String major) {
        this.major = major;
    }
    public String getMajor() {
        return major;
    }
    public void setMajor(String major) {
        this.major = major;
    }
    @Override
    public String toString() {
        return super.toString() + "major=" + major;
    }
}
