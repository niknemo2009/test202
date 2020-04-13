package Gress.lab2;

public class Coordinates {
    private double x;
    private double y;

    public Coordinates(double x, double y) {
        this.x = x;
        this.y = y;
    }


    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public static double countLength(Coordinates c1, Coordinates c2){

        double length = Math.sqrt(square(c2.getX() - c1.getX()) + square(c2.getY() - c1.getY()));
        return length;
    }

    public static double square(double a){
        return a*a;
    }

    @Override
    public String toString() {
        return "Coordinates{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
