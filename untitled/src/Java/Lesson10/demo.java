package Java.Lesson10;

import java.io.*;
import java.util.Date;

public class demo {
    public static void main(String[] args) throws IOException {

        Student student1= new Student("ha",22);
        FileOutputStream obs= new FileOutputStream("F:/outagain.txt");
        ObjectOutputStream oos= new ObjectOutputStream(obs);
        oos.writeObject(student1.toString());
        oos.writeObject(new Date());
        obs.close();
        oos.close();
        // doc file
        InputStream fis= null;
        OutputStream os=null;
        try {
            fis= new FileInputStream("F:/outagain.txt");
            //os= new ObjectOutputStream()
        }
        catch (Exception e)
        {

        }
    }

}
