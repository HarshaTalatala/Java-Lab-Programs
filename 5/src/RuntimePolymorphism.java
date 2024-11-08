class X{
    void show(){
        System.out.println("Method in Super class");
    }
}
class Y extends X{
    void show(){
        System.out.println("Method in Sub class1");
    }
}
class Z extends Y{
    void show(){
        System.out.println("Method in Sub class2");
    }
}
public class RuntimePolymorphism {
    public static void main(String[] args) {
        X x;
        X x1 = new X();
        Y y1 = new Y();
        Z z1 = new Z();
        x = x1;
        x.show();
        x = y1;
        x.show();
        x = z1;
        x.show();
    }
}
