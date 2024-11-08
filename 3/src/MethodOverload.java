class Overload{
    void display(){
        System.out.println("Method with no parameters");
    }
    void display(int a){
        System.out.println("a = "+a);
    }
    void display(int a,int b){
        System.out.println("a = "+a+" b = "+b);
    }
    double display(double a){
        System.out.println("double a = "+a);
        return a*a;
    }
}
class MethodOverload {
    public static void main(String[] args) {
        Overload ol = new Overload();
        ol.display();
        ol.display(10);
        ol.display(20,30);
        double x = ol.display(6.9);
        System.out.println("Volume = "+x);
    }
}
