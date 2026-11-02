public class Square {
    public double width;

    Square (double width){
        this.width = width;
    }

    public double calculateArea(){
        return this.width * this.width;
    }

    public double calculateCircumference(){
        return this.width * 4;
    }
}
