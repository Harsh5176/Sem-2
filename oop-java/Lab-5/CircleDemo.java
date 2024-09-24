class Circle{
    void area(int r)
    {
        double area = 3.14159*r*r;
        System.out.println(area);
    }
    
}

public class CircleDemo{
    public static void main(String[] args) {
        
        Circle c= new Circle();
        c.area(2);
    }
}