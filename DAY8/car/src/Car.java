public class Car {
    private String type;
    private int inHour;
    private int inMinute;
    private int outHour;
    private int outMinute;
    private String num;

    public Car() {
    }

    public Car(String num,String type, int inHour, int inMinute, int outHour, int outMinute) {
        this.type = type;
        this.inHour = inHour;
        this.inMinute = inMinute;
        this.outHour = outHour;
        this.outMinute = outMinute;
        this.num = num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getNum() {
        return num;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getInHour() {
        return inHour;
    }

    public void setInHour(int inHour) {
        this.inHour = inHour;
    }

    public int getInMinute() {
        return inMinute;
    }

    public void setInMinute(int inMinute) {
        this.inMinute = inMinute;
    }

    public int getOutHour() {
        return outHour;
    }

    public void setOutHour(int outHour) {
        this.outHour = outHour;
    }

    public int getOutMinute() {
        return outMinute;
    }

    public void setOutMinute(int outMinute) {
        this.outMinute = outMinute;
    }
}
