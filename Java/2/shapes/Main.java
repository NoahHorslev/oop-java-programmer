public class Main {
    
    public static void main(String[] args) {
        Square square1 = new Square(10);
        Rectangle rectangle1 = new Rectangle(10, 20);
        Circle circle1 = new Circle(10);

        System.out.println(square1.calculateArea());
        System.out.println(rectangle1.calculateArea());
        System.out.println(circle1.calculateArea());

        Shape3D box1 = new Shape3D(10, square1);
        Shape3D rectangleBox1 = new Shape3D(10, rectangle1);
        Shape3D cylinder1 = new Shape3D(10, circle1);

        System.out.println(box1.calculateVolume());
        System.out.println(rectangleBox1.calculateVolume());
        System.out.println(cylinder1.calculateVolume());



    }
}
