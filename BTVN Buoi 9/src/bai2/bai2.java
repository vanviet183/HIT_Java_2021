package bai2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class bai2 {
    public static void main(String[] args) {
        List<IShape> shapes = new ArrayList<IShape>();
        shapes.add(new Rectangle(3.4,5.3));
        shapes.add(new Circle(5.5));
        shapes.add(new Rectangle(7.4,4.3));
        int i = 1;
        for(IShape shape : shapes) {
            System.out.println("Area of shapes[" + i + "]: " + shape.getArea());
            System.out.println("Perimeter of shapes[" + i + "]: " + shape.getPerimeter());
            i++;
        }
    }
}
