package Z20_21_22;


public class Main {
    public static void main(String[] args) {

        System.out.println("RECTANGLE");
        System.out.println("*****************************************************************");

        Rectangle rectangle=new Rectangle(5,3);
        Rectangle.printMessage(rectangle);


        //wyświetli: IllegalArgumentException
        /*Rectangle rectangle1=new Rectangle(0,2);
        Rectangle.printMessage(rectangle1);*/

        System.out.println("TRIANGLE");
        System.out.println("*****************************************************************");

        //wyświetli: IllegalArgumentException
        /*Triangle triangle=new Triangle(1,2,3);
        Triangle.printMessage(triangle);*/

        Triangle triangle1=new Triangle(5,3,4);
        Triangle.printMessage(triangle1);


        System.out.println("HEXAGON");
        System.out.println("*****************************************************************");

        Hexagon hexagon=new Hexagon(4);
        Hexagon.printMessage(hexagon);
        //sprawdzić test: shouldSayThat6sqrt3IsCalculatedAreaOfHexagonForSide2()

        Hexagon hexagon1=new Hexagon(-1);
        Hexagon.printMessage(hexagon1);

        System.out.println("CUBE");
        System.out.println("*****************************************************************");


        Cube cube=new Cube(1,2,3);
        Cube.printMessage(cube);
        cube.fill(3);
        cube.fill(6);
        cube.fill(8);

        Cube cube1=new Cube(0,1,2);
        Cube.printMessage(cube1);

        System.out.println("CONE");
        System.out.println("*****************************************************************");

        Cone cone=new Cone(3,5);
        Cone.printMessage(cone);
        cone.fill(46);
        cone.fill(48);

        Cone cone1=new Cone(0,2);

    }
}
