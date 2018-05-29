import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import java.util.Scanner;

public class Point3d {
    private double x;
    private double y;
    private double z;

    public Point3d(double x1, double y1, double z1) 
   {

        x = x1;
        y = y1;
        z = z1;
    }

    public Point3d() {
        x = 0;
        y = 0;
        z = 0;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }
 
    public static double distanceTo(Point3d firstPoint, Point3d secondPoint) {
    return sqrt(pow((firstPoint.getX() + secondPoint.getX()), 2) + pow((firstPoint.getY() + secondPoint.getY()), 2) +
    pow(firstPoint.getZ() + secondPoint.getZ(), 2));
    }
    private static double scanADouble(){ 
     Scanner in = new Scanner(System.in); 
     return in.nextDouble(); 
    } 
    public static Point3d getPoint(){ 
    System.out.print("input x1: "); 
    double x1=scanADouble(); 
    System.out.print("input y1: "); 
    double y1=scanADouble(); 
    System.out.print("input z1: "); 
    double z1=scanADouble(); 
    return new Point3d(x1,y1,z1); 
   }
}
