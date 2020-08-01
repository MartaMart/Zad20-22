package Z20_21_22;

//zad.21
public class Cube extends Shape3D implements Fillable {

    private double length;
    private double width;
    private double height;

    public double getLength() {
        return this.length;
    }

    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }

    public Cube(double length, double width, double height) {
        if (length > 0 && width > 0 && height > 0) {
            this.length = length;
            this.width = width;
            this.height = height;
        } else System.out.printf("Incorrect data in constructor of Cube. Given length: %.2f, width: %.2f, height: %" +
                ".2f.%nWidth, length and height should be greater than 0.%n%n", length, width, height);

    }

    @Override
    public double calculatePerimeter() {
        if (length > 0 && width > 0 && height > 0) {
            return 4 * length + 4 * width + 4 * height;
        } else return 0;

    }

    @Override
    public double calculateArea() {
        if (length > 0 && width > 0 && height > 0) {
            return (2 * length * width) + (2 * width * height) + (2 * length * height);
        } else return 0;
    }

    @Override
    public double calculateVolume() {
        if (length > 0 && width > 0 && height > 0) {
            return length * width * height;
        } else return 0;
    }

    public static void printMessage(Z20_21_22.Cube cube) {
        //chcemy drukować tylko calculateArea() i calculatePerimeter() info dla length i width>0
        if (!(cube.calculateArea() == 0) && !(cube.calculatePerimeter() == 0) && !(cube.calculateVolume() == 0)) {
            System.out.printf("Cube perimeter with lenght: %.2f, width: %.2f and height: %.2f is equal: %.2f.%n",
                    cube.getLength(),
                    cube.getWidth(), cube.getHeight(), cube.calculatePerimeter());
            System.out.printf("Area of the cube is equal: %.2f.%n", cube.calculateArea());
            System.out.printf("Volume of the cube is equal: %.2f.%n%n", cube.calculateVolume());
        }
    }


    //zad.22
    @Override
    public void fill(int filler) {
        System.out.printf("You are trying to fill in the cube (length: %.2f, width: %.2f, height: %.2f, " +
                        "approximate volume: %.2f)" +
                        " with %d.%n",
                length,width,height,calculateVolume(),filler);
        if (calculateVolume()>filler){
            System.out.printf("The cube has still extra space to fill in. You can pour more water.%n%n");
        } else if (calculateVolume()==filler){
            System.out.printf("The cube is fulled to capacity. You can't pour more water.%n%n");
        } else System.out.printf("The cube is overfull. Water spilled out the vessel. You can't pour more water.%n%n");
    }

}
