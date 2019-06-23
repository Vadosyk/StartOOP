package ua.kiev.prog;

public class Rectangle {
    private int height;
    private int wight;

    public Rectangle () {
        System.out.println("Rectangle()");
    }

    public Rectangle (int height, int wight) {

    }

    public int sqr() {
        return height * wight;


    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWight() {
        return wight;
    }

    public void setWight(int wight) {
        this.wight = wight;
    }
}
