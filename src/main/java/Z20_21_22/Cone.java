package Z20_21_22;

//zad.21
public class Cone extends Shape3D implements Fillable {

    private double r;
    private double height;

    public double getR(){
        return this.r;
    }

    public double getHeight(){
        return this.height;
    }

    public Cone(double r,double height){
        if (r>0 && height>0){
            this.r=r;
            this.height=height;
        } else System.out.printf("Incorrect data of cone constructor.%nGiven r: %.2f and height: %.2f.%nRadius and " +
                "height should be greater than 0.%n%n",r,height);
    }


    @Override
    public double calculateVolume() {
        if (r>0 && height>0){
            return (Math.PI*Math.pow(r,2)*height)/3;
        } else return 0;
    }

    @Override
    public double calculatePerimeter() {
        if (r>0 && height>0){
            final double L=Math.sqrt(Math.pow(height,2)+Math.pow(r,2));
            return 2*(2*Math.PI*r)*2*L;
        } else return 0;
    }

    @Override
    public double calculateArea() {
        if (r>0 && height>0){
            final double PP=Math.PI*Math.pow(r,2);
            final double L=Math.sqrt(Math.pow(height,2)+Math.pow(r,2));
            final double PB=Math.PI*r*L;
            return PP+PB;
        } else return 0;
    }

    public static void printMessage(Z20_21_22.Cone cone){
        if (!(cone.calculateArea()==0) && !(cone.calculatePerimeter()==0) && !(cone.calculateVolume()==0) ){
            System.out.printf("Cone perimeter for radius: %.2f and height: %.2f is equal: %.2f.%n",
                    cone.getR(), cone.getHeight(),cone.calculatePerimeter());
            System.out.printf("Area of the cone is equal: %.2f.%n",cone.calculateArea());
            System.out.printf("Volume of the cone is equal: %.2f.%n%n",cone.calculateVolume());
        }
    }

    //zad.22
    @Override
    public void fill(int filler) {
        System.out.printf("You are trying to fill in the cone (radius: %.2f, height: %.2f, approximate volume: %.2f) " +
                        "with %d.%n",
                r,height,calculateVolume(),filler);
        if (calculateVolume()>filler){
            System.out.printf("The cone has still extra space to fill in. You can pour more water.%n%n");
        } else if (calculateVolume()==filler){
            System.out.printf("The cone is fulled to capacity. You can't pour more water.%n%n");
        } else System.out.printf("The cone is overfull. Water spilled out the vessel. You can't pour more water.%n%n");
    }


}
