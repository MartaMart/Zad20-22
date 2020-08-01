package Z20_21_22;

//zad.20
public class Rectangle extends Shape {

    private double length;
    private double width;

    public double getLength(){
        return this.length;
    }

    public double getWidth() {
        return this.width;
    }

    public Rectangle(double length,double width){
        if (length>0 && width>0){
            this.length=length;
            this.width=width;
        } else throw new IllegalArgumentException("\nIncorrect data in constructor of Rectangle. Given length:"+ length +
                " width: "+ width + "\nWidth and length should be greater than 0.\n\n");

        //OR
        /*System.out.printf("Incorrect data in constructor of Rectangle. Given length: %.2f, width: %.2f. " +
                "%nWidth and length should be greater than 0.%n%n",length,width);*/
    }

    @Override
    public double calculatePerimeter() {
        if (length>0 && width>0){
            return 2*length+2*width;
        } else return 0;

    }

    @Override
    public double calculateArea() {
        if (length>0 && width>0){
            return length*width;
        } else return 0;
    }

    public static void printMessage(Rectangle rectangle){
        //chcemy drukować tylko calculateArea() i calculatePerimeter() info dla length i width>0
        if (!(rectangle.calculateArea()==0) && !(rectangle.calculatePerimeter()==0)){
            System.out.printf("Rectangle perimeter with lenght %.2f and width %.2f is equal: %.2f.%n",
                    rectangle.getLength(),
                    rectangle.getWidth(),rectangle.calculatePerimeter());
            System.out.printf("Area of the rectangle is equal: %.2f.%n%n",rectangle.calculateArea());
        }
    }
}
