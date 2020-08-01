package Z20_21_22;

//zad.20
public class Triangle extends Shape {

    //na wejściu 3 boki trójkąta
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1,double side2,double side3){

        //sprawdzenie czy może powstać trójkąt o podanych bokach
        //sprawdzenie warunku na zbudownie trójkąta: najdłuższy bok musi być krótszy niż suma pozostałych

        boolean condition1= side1>=side2 && side1>=side3 && side1<side2+side3;// side1 najdłuższy bok
        boolean condition2= side2>side1 && side2>=side3 && side2<side1+side3; // side2 najdłuższy bok
        boolean condition3= side3>side1 && side3>side2 && side3<side1+side2; //// side3 najdłuższy bok

        if (condition1 || condition2 || condition3 ){
                this.side1=side1;
                this.side2=side2;
                this.side3=side3;

        } else throw new IllegalArgumentException("You can't form a triangle from sides: "+side1+", "+side2+", "+side3+".\n\n");


    }

    public double getSide1(){
        return this.side1;
    }

    public double getSide2(){
        return this.side2;
    }

    public double getSide3(){
        return this.side3;
    }



    @Override
    public double calculatePerimeter() {
        if (side1>0 && side2>0 && side3>0){
            return side1+side2+side3;
        } else return 0;
    }

    @Override
    public double calculateArea() {
        if (side1>0 && side2>0 && side3>0){
            double halfPerimeter=calculatePerimeter()/2;

            //ze Wzoru Herona
            //https://pl.wikipedia.org/wiki/Wz%C3%B3r_Herona
            return Math.sqrt(halfPerimeter*(halfPerimeter-side1)*(halfPerimeter-side2)*(halfPerimeter-side3));
        } else return 0;
    }

    public static void printMessage(Triangle triangle){
        if (!(triangle.calculateArea()==0) && !(triangle.calculatePerimeter()==0)){
            System.out.printf("Triangle perimeter with sides: %.2f, %.2f and %.2f is equal: %.2f.%n",
                    triangle.getSide1(), triangle.getSide2(),triangle.getSide3(),triangle.calculatePerimeter());
            System.out.printf("Area of the rectangle is equal: %.2f.%n%n",triangle.calculateArea());
        }
    }

}
