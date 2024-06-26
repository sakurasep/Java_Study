package Geometric;

/**
 * @author sakurasep
 * * @date 2024/3/19
 **/
public class Circle extends GeometricObject {
    private double radius;

    public Circle(String color, double weight, double radius) {
        super(color, weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double findArea(){
        return 3.14 * radius * radius;
    }
}
