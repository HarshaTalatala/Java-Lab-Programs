abstract class Shape{
    double d1,d2;
    Shape(double x,double y){
        d1 = x;
        d2 = y;
    }
    abstract double area();
}
class Triangle extends Shape{
    Triangle(double a,double b){
        super(a,b);
    }
    double area(){
        return 0.5*d1*d2;
    }
}
class Rectangle extends Shape{
    Rectangle(double i,double j){
        super(i,j);
    }
    double area(){
        return d1*d2;
    }
}
class AbstractArea{
    public static void main(String[] args) {
        Shape S;
        S= new Triangle(4.5,5.6);
        System.out.println("Area of Triangle : "+S.area());
        S= new Rectangle(4.5,5.6);
        System.out.println("Area of Rectangle : "+S.area());
    }
}