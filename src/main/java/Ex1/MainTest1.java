package Ex1;

public class MainTest1 {
    public static void main(String[] args) {
        // Circle[r = 1]
        Circle c = new Circle();
        System.out.println(c);
        System.out.println("Chu vi của hình tròn là: "+c.getArea());
        System.out.println("Diện tích của hình tròn là: "+c.getCircumferce());

        // Circle[r = 3]
        Circle c2 = new Circle(3);
        System.out.println(c2);
        System.out.println("Chu vi của hình tròn là: "+c2.getArea());
        System.out.println("Diện tích của hình tròn là: "+c2.getCircumferce());

        // Test Error
        try{
            Circle c3 = new Circle(-2);
        }
        catch (Exception e){
            System.out.println(e);
        }

        try{
            Circle c4 = new Circle(6);
            c4.setRadius(-3);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}