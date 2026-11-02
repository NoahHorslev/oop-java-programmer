public class Circle {
    public double radius;

    Circle (double radius){
        this.radius = radius;
    }

    double pi = 3.14;

    public double calculateApproxArea(){
        return this.radius * this.radius * pi;  
    }

    public double calculateApproxCircumference(){
        return this.radius * 2 * pi;
    }
}
