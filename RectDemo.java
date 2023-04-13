import java.util.*;
class Rectangle {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double calculateArea() {
        return length * width;
    }
}

 

public class RectDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Rectangle> rect = new ArrayList<Rectangle>();

        for (int i = 0; i < 4; i++) {
            System.out.println("Enter value for rectangle ");
            System.out.println("Enter length :");
            double len = sc.nextDouble();
            System.out.println("Enter width :");
            double wid = sc.nextDouble();
            rect.add(new Rectangle(len, wid));
        }

        for (Rectangle rectangle : rect) {
            System.out.println("Area is:"+rectangle.calculateArea());
        }
    }
}

 

      
 
