package com.p1t1.SOLID;

class Rectangle {
    int Width, Height;

    public Rectangle(int w, int h) {
        Width = w;
        Height = h;
    }

    public Rectangle() {
        Width = 0;
        Height = 0;
    }

    public void setWidth(int width) {
        this.Width = width;
    }

    public void setHeight(int height) {
        this.Height = height;
    }

    @Override
    public String toString() {
        return "Chiều rộng: " + Width + " " + "Chiều cao: " + Height;
    }
}

class Square extends Rectangle {
    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width);
    }

    @Override
    public void setHeight(int height) {
        super.setWidth(height);
        super.setHeight(height);
    }
}

public class LiskovSubstitutionPrinciple {
    static int Area(Rectangle r) {
        return r.Height * r.Width;
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle(2, 3);
        System.out.println(r);
        System.out.println(Area(r));
        Rectangle s1 = new Square();
        s1.Width = 2;
        System.out.println(s1);
        System.out.println(Area(s1));
    }
}
