import java.io.*;
class WriteFile{
    public static void main(String[] args) throws Exception{
        FileOutputStream fout = new FileOutputStream("hello.txt");
        String s = "Vishnu Institute of Technology...";
        byte[] b= s.getBytes();
        fout.write(b);
        fout.close();
    }
}