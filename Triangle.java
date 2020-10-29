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

  public void setVertex(int index, Point newP){
    if(index == 0){
      v1 = newP;
    }
    if(index == 1){
      v2 = newP;
    }
    if(index == 2){
      v3 = newP;
    }
  }

  public double round(double x){
    double x1 = x * 10000.0;
    double x2 = Math.round(x1);
    int x3 = (int) x2;
    double x4 = x3 / 10000.0;
    return x4;
  }

  public double getPerimeter(){
    Point a = this.v1;
    Point b = this.v2;
    Point c = this.v3;
    double side1 = a.distanceTo(b);
    double side2 = b.distanceTo(c);
    double side3 = c.distanceTo(a);
    double finalside = side1 + side2 + side3;
    return finalside;
  }

  public double getArea(){
    Point a = this.v1;
    Point b = this.v2;
    Point c = this.v3;
    double side1 = a.distanceTo(b);
    double side2 = b.distanceTo(c);
    double side3 = c.distanceTo(a);
    double semi = (side1 + side2 + side3) / 2.0;
    double area = Math.sqrt(semi*(semi - side1)*(semi - side2)*(semi - side3));
    return area;
  }

  public String classify(){
    Point a = this.v1;
    Point b = this.v2;
    Point c = this.v3;
    double side1 = round(a.distanceTo(b));
    double side2 = round(b.distanceTo(c));
    double side3 = round(c.distanceTo(a));
    boolean onetwo = (side1 == side2);
    boolean onethree = (side1 == side3);
    boolean twothree = (side2 == side3);
    if (onetwo && twothree){
      return "equilateral";
    }
    if (onetwo){
      return "isosceles";
    }
    if (twothree){
      return "isosceles";
    }
    if (onethree){
      return "isosceles";
    }
    return "scalene";
  }

  public String toString(){
    String brk1 = "v1(" + v1.getX() + ", " + v1.getY() + ") ";
    String brk2 = "v2(" + v2.getX() + ", " + v2.getY() + ") ";
    String brk3 = "v3(" + v3.getX() + ", " + v3.getY() + ")";
    return brk1 + brk2 + brk3;
  }
}
