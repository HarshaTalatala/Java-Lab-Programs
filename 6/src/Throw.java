public class Throw {
    static void show(){
        try{
            throw new NullPointerException("Hello...");
        }catch (NullPointerException ne){
            System.out.println(ne);
        }
    }
    public static void main(String[] args) {
        show();
    }
}
