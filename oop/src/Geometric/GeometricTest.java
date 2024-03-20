package Geometric;

/**
 * @author sakurasep
 * * @date 2024/3/19
 **/
public class GeometricTest {

    public static void main(String[] args) {
        GeometricTest test = new GeometricTest();
        Circle c1 = new Circle("red", 1.0, 4);
        Circle c2 = new Circle("bule", 1.0, 4);
        MyRectangle m1 = new MyRectangle("red", 1.0, 4, 4);
        test.displayGeometricObject(c1);
        test.displayGeometricObject(c2);
        test.displayGeometricObject(m1);

        boolean isEquals = test.equalsArea(c1, c2);
        if (isEquals){
            System.out.println("面积相等");
        }
        else {
            System.out.println("面积不等");
        }

    }
    public boolean equalsArea(GeometricObject object1, GeometricObject object2){
        return object1.findArea() == object2.findArea();
    }

    public void displayGeometricObject(GeometricObject object){
        System.out.println("几何图形的面积为: " + object.findArea());
    }
}
