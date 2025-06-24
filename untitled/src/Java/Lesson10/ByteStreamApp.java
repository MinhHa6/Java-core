package Java.Lesson10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamApp {
    public static void main(String[] args) throws IOException {
        FileInputStream inObj=null;
        FileOutputStream outObj=null;
        try {
            inObj= new FileInputStream("F:/minhhha.txt");
            outObj= new FileOutputStream("F:/outagain.txt");
            int ch;
            while ((ch=inObj.read())!=-1)
            {
                outObj.write(ch);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if(inObj!=null)
            {
                inObj.close();
            }
            if(outObj!=null)
            {
                outObj.close();
            }
        }
    }
}
