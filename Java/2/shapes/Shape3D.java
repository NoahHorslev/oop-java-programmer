public class Shape3D {

    public double height;
    public Shape2D baseShape;

    public Shape3D(double height, Shape2D baseShape) {
        this.height = height;
        this.baseShape = baseShape;
    }

    public double calculateVolume (){
        return this.baseShape.calculateArea() * this.height;
    }
}
