class NewThread implements Runnable
{
    Thread t;
    String name;
    NewThread(String threadname){
        name=threadname;
        t=new Thread(this,name);
        t.start();
    }
    public void run(){
        try{
            for (int i = 5; i >0 ; i--) {
                if(t.getName().equals("First Thread")){
                    System.out.println("Good Morning");
                    Thread.sleep(1000);
                }
                if(t.getName().equals("Second Thread")){
                    System.out.println("Hello");
                    Thread.sleep(2000);
                }
                if(t.getName().equals("Third Thread")){
                    System.out.println("Welcome");
                    Thread.sleep(3000);
                }
            }
        }catch (InterruptedException ie){
            System.out.println(ie);
        }
    }
}
class ThreadRunnable{
    public static void main(String[] args) {
        NewThread nt1 = new NewThread("First Thread");
        NewThread nt2 = new NewThread("Second Thread");
        NewThread nt3 = new NewThread("Third Thread");
    }
}