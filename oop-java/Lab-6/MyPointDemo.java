/*4. Design a class named MyPoint to represent a point with x and ycoordinates. The class contains:
a. The data fields x and y that represent the coordinates with
getter methods.
b. A no-arg constructor that creates a point (0, 0).
c. A constructor that constructs a point with specified
coordinates.
d. A method named distance that returns the distance from this
point to a specified point of the MyPoint type.
e. A method named distance that returns the distance from this
point to another point with specified x- and y-coordinates.
 */


 class MyPoint{
    double x;
    double y;

    public  double getX(){
        return x;
    }
    public  double getY(){
        return y;
    }
    MyPoint(){
        this.x=0;
        this.y=0;
    }
    MyPoint(double x,double y){
        this.x=x;
        this.y=y;
    }
    public double distance(MyPoint mp){
        return Math.sqrt(Math.pow((mp.getX()-x), 2)+
                         Math.pow(mp.getY()-y, 2));
    }
    public double distance(double x1,double y1){
        return distance(new MyPoint(x1, y1));
    }
}
public class MyPointDemo {
    public static void main(String[] args) {
        MyPoint mp1=new MyPoint(2.5, 8.26);
        MyPoint mp2=new MyPoint(33.12, 4.2);
        double ans1=mp1.distance(mp2);
        System.out.println("Distance 1"+ans1);
        double ans2=mp2.distance(45.2, 3.156);
        System.out.println("Distance 2"+ans2);
    }
}
