interface A{
    void show();
    default void display(){
        System.out.println("Default method");
    }
}
class B implements A{
    public void show(){
        System.out.println("Show Method");
    }
}
class InterfaceDefault{
    public static void main(String[] args) {
        B b = new B();
        b.show();
        b.display();
    }
}