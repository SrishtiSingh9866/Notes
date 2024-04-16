import java.io.FileInputStream;
class k22bk{
    public static void main(String args[])
    {
        try{
            FileInputStream fil=new FileInputStream("D:\\dummy\\demo.txt");
            int i=fil.read();
            fout.write(66);
            fout.write(69);
            String s1="CSE310 programing in java";
            byte b[]=s1.getBytes();
            fout.write(b);
            fout.close();
        }
    }
}