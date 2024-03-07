package application;

import model.entities.Circle;
import model.entities.Rectangle;
import model.entities.Triangle;
import model.enums.Color;

public class Program {
    public static void main(String[] args) {


        Circle c1 = new Circle(Color.BLACK, 2.0);
        Rectangle r2 = new Rectangle(Color.WHITE, 3.0, 4.0);
        Triangle t1 = new Triangle(Color.WHITE, 4.0, 7.5);

        System.out.println("Circle color: " + c1.getColor());
        System.out.println("Circle area: " + String.format("%.3f", c1.area()));
        System.out.println("Rectangle color: " + r2.getColor());
        System.out.println("Rectangle area: " + String.format("%.3f", r2.area()));
        System.out.println("Tringle color: " + t1.getColor());
        System.out.println("Triangle area: " + String.format("%.3f", t1.area()));

    }
}
