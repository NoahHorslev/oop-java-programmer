public class Circle implements Shape2D {
    public double radius;

    Circle (double radius){
        this.radius = radius;
    }

    double pi = 3.14;

    public double calculateArea(){
        return this.radius * this.radius * pi;  
    }

    public double calculateCircumference(){
        return this.radius * 2 * pi;
    }
}
