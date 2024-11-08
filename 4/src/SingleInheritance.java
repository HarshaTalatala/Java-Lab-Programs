class X{
    int i,j;
    void show(){
        System.out.println("i = "+i+" j = "+j);
    }
}
class Y extends X{
    int k;
    void display(){
        System.out.println("k = "+k);
    }
}
class SingleInheritance {
    public static void main(String[] args) {
        Y y = new Y();
        y.i=10;
        y.j=20;
        y.k=30;
        y.show();
        y.display();
    }
}
