package models;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) //Constructor
    {
        this.x = x;
        this.y = y;
    }
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }


    public double distance(Point dest) // Calculate the distance between current and next points
    {
        return Math.sqrt(Math.pow(this.x - dest.x, 2) + Math.pow(this.y - dest.y, 2));
    }

}