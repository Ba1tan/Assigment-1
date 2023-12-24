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
        double x, y = 0;
        //Reading the file for points
        while (sc.hasNext())
        {
            x = sc.nextDouble();
            y = sc.nextDouble();
            //creating points with x, y coordinates
            Point point = new Point(x, y);
            //adding point to the shape
            shape.addPoint(point);
        }
        // perimeter of shape
        System.out.println(shape.perimeter());
        //method that outputs the array for checking
        shape.showArray();
    }
}