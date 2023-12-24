package models;
import java.util.ArrayList;

public class Shape
{
    public ArrayList<Point> points = new ArrayList<>(); //array for store all points
    public void addPoint(Point point) //adds points to the array
    {
        points.add(point);
    }
    public double perimeter() // calculate shapes perimeter via distance method from Point
    {
        int size = points.size();
        double result = 0;
        for(int i = 0; i < size; i++)
        {
            Point currentPoint;
            Point nextPoint;
            if(i == size - 1) // checks that iterator reached the last Point to close the shape
            {
                currentPoint = points.get(i);
                nextPoint = points.get(1);
            }
            else
            {
                currentPoint = points.get(i);
                nextPoint = points.get(i + 1);
            }
            result += currentPoint.distance(nextPoint);
        }
        return result;
    }
    public double longestSide() //determines which side is longest
    {
        double longest = 0;
        double current = 0;
        for(int i = 0; i < points.size(); i++)
        {
            Point currentPoint;
            Point nextPoint;
            if(i == points.size() - 1)
            {
                currentPoint = points.get(i);
                nextPoint = points.get(1);
            }
            else
            {
                currentPoint = points.get(i);
                nextPoint = points.get(i + 1);
            }
            current = currentPoint.distance(nextPoint);
            if(current > longest) // comparing current with last longest
            {
                longest = current;
            }
        }
        return longest;
    }
    public double averageSide()
    {
        return perimeter() / points.size();
    }
}

