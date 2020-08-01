package Z20_21_22;

//zad.20
public class Hexagon extends Shape {

    private double side;

    public double getSide(){
        return this.side;
    }

    public Hexagon(double side){

        //lub poprzez wyrzycenie wyjątku dla side<=0
        if (side<=0){
            System.out.println("Side of the hexagon should be greater than 0.");
            System.out.printf("Given data of side: %.2f.%n%n",side);
        } else {
            this.side=side;
        }
    }

    @Override
    public double calculatePerimeter() {
        if (side>0){
            return 6*side;
        } else return 0;
    }

    @Override
    public double calculateArea() {
        if (side>0){
            //https://matematykaszkolna.pl/strona/882.html
            return (3*Math.pow(side,2)*Math.sqrt(3))/2;
        } else return 0;
    }

    public static void printMessage(Hexagon hexagon){
        if (!(hexagon.calculatePerimeter()==0) || !(hexagon.calculateArea()==0)){
            System.out.printf("Hexagon perimeter with side %.2f is equal: %.2f.%n",
                    hexagon.getSide(),hexagon.calculatePerimeter());
            System.out.printf("Area of the hexagon is approximately equal: %.3f.%n%n",hexagon.calculateArea());
        }
    }
}
