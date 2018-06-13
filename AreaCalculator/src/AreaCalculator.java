import javax.xml.bind.SchemaOutputResolver;

public class AreaCalculator {

    public static void main(String[] args) {
        area(-5);
    }


    public static double area(double radius){
        if(radius < 0){
            System.out.println(radius + "This is the area of a circle");
            return -1.0;
        }
        double PI = 3.14159;
        double areaOfCircle = radius * radius * PI;
        return areaOfCircle;


    }

    public static double area(double x, double y){
        if((x < 0) || (y < 0)){
            return -1.0;
        }
        double areaOfRectangle = x * y;
        return areaOfRectangle;
    }
}