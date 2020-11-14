public class Tester{
  public static void main(String[] args){
    Point p1 = new Point(0, 0);
    Point p2 = new Point(3, 4);
    Point p3 = new Point(p1);
    Point p4 = new Point(7, 5);
    System.out.println(p1.distanceTo(p2));
    System.out.println(p1.equals(p3));
    Triangle t1 = new Triangle(p1, p2, p4);
    Triangle t2 = new Triangle(0, 0, 3, 4, 7, 5);
    System.out.println(t1.getPerimeter());
    System.out.println(t1.getArea());
    System.out.println(t1.classify());
    System.out.println(t1.toString());
    System.out.println(t2.toString());
  }
}
