class UserException extends Exception{
    public UserException(String messege){
        super(messege);
    }
}
public class MyException {
    static void checkValue(int value) throws UserException{
        if(value<0){
            throw new UserException("value cannot be Negative");
        }else{
            System.out.println("Value is valid : "+value);
        }
    }

    public static void main(String[] args) {
        try{
            checkValue(-5);
        }catch (UserException e){
            System.out.println("Caught Exception : "+e.getMessage());
        }
    }
}

