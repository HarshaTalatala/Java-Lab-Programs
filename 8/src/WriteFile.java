import java.io.*;
class WriteFile{
    public static void main(String[] args) throws Exception{
        FileWriter fout = new FileWriter("hello.txt");
        String s = "Vishnu Institute of Technology...";
        fout.write(s);
        fout.close();
        System.out.println("written successfully");
    }
}