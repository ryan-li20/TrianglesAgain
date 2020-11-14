public class Point{
   private double x,y;

   public Point(double X, double Y){
     x = X;
     y = Y;
   }

   public Point(Point p){
     x = p.x;
     y = p.y;
   }

   public double getX(){
     return x;
   }

   public double getY(){
     return y;
   }

   public double distanceTo(Point other){
     double deltaX = Math.abs(this.x - other.x);
     double deltaY = Math.abs(this.y - other.y);
     double dist = Math.sqrt(deltaX * deltaX + deltaY * deltaY);
     return dist;
   }

   public boolean equals(Point other){
     return(this.x == other.x && this.y == other.y);
   }
}
