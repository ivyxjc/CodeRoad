package typeinfo;

import java.util.Arrays;
import java.util.List;

/**
 * Created by jc on 11/8/2015.
 */

abstract class Shape{
    void draw(){
        System.out.println(this+" .draw()");
    }
    abstract public String toString();
}

class Circle extends Shape{
    public String toString() {
        return "Circle";
    }
}

class Square extends Shape{
    public String toString(){
        return "Square";
    }
}

class Triangle extends Shape{
    public String toString(){
        return "Triangle";
    }
}
public class Shapes {
    public static void main(String[] args){
        List<Shape> shapeList= Arrays.asList(
                new Circle(),new Circle(),new Triangle()
        );
        for(Shape e:shapeList){
            e.draw();
        }
    }
}
