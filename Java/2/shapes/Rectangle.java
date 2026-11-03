public class Rectangle implements Shape2D {
    public double width;
    public double height;

    Rectangle (double width, double height){
        this.width = width;
        this.height = height;
    }

    public double calculateArea(){
        return this.width * this.height;
    }

    public double calculateCircumference(){
        // Ved ikke om java respekterer pemdas
        return this.width * 2 + this.height * 2;
    }

}
