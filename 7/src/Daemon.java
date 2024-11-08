class NewThread3 extends Thread{
    NewThread3(String name){
        super(name);
    }
    public void run(){
        if(Thread.currentThread().isDaemon()){
            System.out.println(getName()+" is Daemon Thread");
        }else{
            System.out.println(getName()+" is user thread");
        }
    }
}
class Daemon{
    public static void main(String[] args) {
        NewThread3 nt1 = new NewThread3("First Thread");
        NewThread3 nt2 = new NewThread3("Second Thread");
        NewThread3 nt3 = new NewThread3("Third Thread");
        nt1.setDaemon(true);
        nt3.setDaemon(true);
        nt1.start();
        nt2.start();
        nt3.start();
    }
}