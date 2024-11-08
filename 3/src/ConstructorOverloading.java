class Constructor {
    int a,b;
    Constructor(){
        a = 0;
        b = 0;
    }
    Constructor(int x){
        a=x;
        b=0;
    }
    Constructor(int x,int y){
        a=x;
        b=y;
    }
    public void display() {
        System.out.println("a = "+a+" b = "+b);
    }
}
class ConstrictorOverloading{
    public static void main(String[] args) {
        Constructor a1 = new Constructor();
        Constructor a2 = new Constructor(5);
        Constructor a3 = new Constructor(5,6);
        a1.display();
        a2.display();
        a3.display();
    }
}
