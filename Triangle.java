public class Triangle{
  private Point v1, v2, v3;

  public Triangle(Point a, Point b, Point c){
    v1 = a;
    v2 = b;
    v3 = c;
  }

  public Triangle(double x1, double y1, double x2, double y2, double x3, double y3){
    v1 = new Point(x1, y1);
    v2 = new Point(x2, y2);
    v3 = new Point(x3, y3);
  }

  public double round(double x){
    double x1 = x * 10000.0;
    double x2 = Math.round(x1);
    int x3 = (int) x2;
    double x4 = x3 / 10000.0;
    return x4;
  }

  public double getPerimeter(Point a, Point b, Point c){
    double side1 = a.distanceTo(b);
    double side2 = b.distanceTo(c);
    double side3 = c.distanceTo(a);
    double finalside = side1 + side2 + side3;
    return round(finalside);
  }

  public double getPerimeter(){
    Point a = this.v1;
    Point b = this.v2;
    Point c = this.v3;
    double side1 = a.distanceTo(b);
    double side2 = b.distanceTo(c);
    double side3 = c.distanceTo(a);
    double finalside = side1 + side2 + side3;
    return round(finalside);
  }
}
