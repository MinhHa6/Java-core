package OT.File.B1;

import java.io.File;
import java.io.IOException;

public class FileHanding {
    // ham createFolder
    public void CreateFolder(String path)
    {
        File folder= new File(path);
        if(folder.exists()) {
            System.out.println("Tong tai duong dan nay");
            if (folder.isDirectory()) {
                System.out.println("Ton tai thu muc nay");
            }
        }
        else
        {
            // ko ton tai thi tao moi
            folder.mkdirs();
            System.out.println("Ko ton tai duong dan nay da tao moi");
        }
    }
    //ham create file
    public void createFile(String path)
    {
        File file= new File(path);
        if(file.exists())
        {
            System.out.println("Ton tai file nay");
        }
        else {
            try
            {
                // ko ton tai thi tao moi
                file.createNewFile();
            }
            catch (IOException e)
            {
                System.out.println("Loi tao file"+e.toString());
            }
            System.out.println("Ko ton tai file nay,da tao moi");
        }
    }

    public static void main(String[] args) {
        FileHanding demo= new FileHanding();
        demo.CreateFolder("C:/Devmaster1/slide");
        demo.createFile("C:/Devmaster1/slide/sinhvien.db");
    }
}
