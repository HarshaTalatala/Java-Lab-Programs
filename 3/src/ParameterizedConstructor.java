class Box1 {
    double width,height,depth;
    Box1(double w,double h,double d){
        width = w;
        height = h;
        depth = d;
    }
    double volume(){
        return width*height*depth;
    }
}
class ParameterizedConstructor{
    public static void main(String[] args) {
        Box1 b1 = new Box1(2.34,3.45,4.56);
        Box1 b2 = new Box1(3.45,4.56,5.67);
        System.out.println("Volume 1 : "+b1.volume());
        System.out.println("Volume 2 : "+b2.volume());
    }
}
