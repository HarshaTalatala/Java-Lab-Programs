class A{
    int i,j;
    A(int x,int y){
        i=x;
        j=y;
    }
    void show(){
        System.out.println("i = "+i+" j = "+j);
    }
}
class B extends A{
    int k;
    B(int a,int b,int c){
        super(a,b);
        k=c;
    }
    void display(){
        System.out.println("k = "+k);
    }
}
class Super{
    public static void main(String[] args) {
        B b = new B(1,2,3);
        b.show();
        b.display();
    }
}