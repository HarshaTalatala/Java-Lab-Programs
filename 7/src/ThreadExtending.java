class NewThread1 extends Thread{
    NewThread1(String threadname){
        super(threadname);
        start();
    }
    public void run(){
        try{
            for (int i = 5; i > 0 ; i--) {
                if(getName().equals("First Thread")){
                    System.out.println("Good Morning");
                    Thread.sleep(1000);
                }
                if(getName().equals("Second Thread")){
                    System.out.println("Hello");
                    Thread.sleep(2000);
                }
                if(getName().equals("Third Thread")){
                    System.out.println("Welcome");
                    Thread.sleep(3000);
                }
            }
        }catch (InterruptedException ie){
            System.out.println(ie);
        }
    }
}
class ThreadExtending{
    public static void main(String[] args) {
        NewThread1 nt1 = new NewThread1("First Thread");
        NewThread1 nt2 = new NewThread1("Second Thread");
        NewThread1 nt3 = new NewThread1("Third Thread");
    }
}