import models.Point;
import models.Shape;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyApplication
{
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("D:\\My Projects\\Assigment 1\\src\\Points.txt");
        Scanner sc = new Scanner(file);
        Shape shape = new Shape();
        //Reading the file for points
        while (sc.hasNext())
        {
            //creating points with x, y coordinates
            Point point = new Point(sc.nextDouble(), sc.nextDouble());
            //adding point to the shape
            shape.addPoint(point);
            System.out.println(point.toString());
        }
        //Shape methods
        System.out.println("Perimeter: " + shape.perimeter());
        System.out.println("Longest side: " + shape.longestSide());
        System.out.println("Average side: " + shape.averageSide());
    }
}