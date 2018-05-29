public class laba3 {
    public static void main(String[] args)
    {
        Point3d o=Point3d.getPoint();
        Point3d t=Point3d.getPoint();
        Point3d th=Point3d.getPoint();
        double lot= Point3d.distanceTo(o,t);
        double loth= Point3d.distanceTo(o,th);
        double ltth=Point3d.distanceTo(t,th);
        System.out.println("Area = "+ computeArea(lot,loth,ltth));
    }
    public static double computeArea(double lot,double loth, double ltth){
        double s=(lot+loth+ltth)/2;
        double g=Math.sqrt(s*(s-lot)*(s-loth)*(s-ltth));
        return g;
    }
}
