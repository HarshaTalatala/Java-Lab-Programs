interface Eatable{
    void eat();
}
interface Flyable{
    void fly();
}
class Bird implements Eatable,Flyable{
    public void eat(){
        System.out.println("Bird is Eating");
    }
    public void fly() {
        System.out.println("Bird is Flying");
    }
}

public class MultipleInterface {
    public static void main(String[] args) {
        Bird b = new Bird();
        b.eat();
        b.fly();
    }
}
