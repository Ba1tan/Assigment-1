package models;
import java.util.ArrayList;

public class Shape
{
    private ArrayList<Point> points = new ArrayList<>(); //array for store all points
    public void addPoint(Point point) //adds points to the array
    {
        points.add(point);
    }
    public void showArray() //shows points that every point consists
    {
        int size = points.size();
        for(int i = 0; i < size; i++)
        {
            System.out.print(points.get(i).getX() + " ");
            System.out.println(points.get(i).getY());
        }
    }
}

