import java.io.FileReader;

public class ReadFile {
    public static void main(String[] args) throws Exception{
        FileReader fin = new FileReader("hello.txt");
        int i;
        while((i = fin.read())!= -1){
            System.out.print((char)i);
        }
        fin.close();
    }
}
