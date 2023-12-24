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
        }
        // perimeter of shape
        System.out.println(shape.perimeter());
        //method that outputs the array for checking
        System.out.print(shape.longestSide());
    }
}