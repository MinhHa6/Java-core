package OT.File.B2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SaveText {
    public SaveText()
    {

    }

    // viet ham ghi du lieu ra filetext
    public void writeText(List<NhanVien>stData)throws IOException {
        String filepath= "writeText2File.txt";
        boolean isVietTiep =false;
        File myFile= new File(filepath);
        FileOutputStream fos= new FileOutputStream(myFile,isVietTiep);
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        // ghi ra file
        for (NhanVien nhanVien:stData)
        {
            osw.write(nhanVien.toString());
        }
        osw.flush();// Tong du lieu tu bo nho tam xuong file
        osw.close();// dong ket noi voi file
    }
    // Viet ham ghi du lieu ra file text tung dong
    public void writeTextByLine(List<NhanVien>st2)throws FileNotFoundException,IOException
    {
        String filePath= "C:\\Devmaster1\\WriteTextByLine.txt";
        boolean isVietTiep= true;
        File myFile= new File(filePath);
        FileOutputStream fos = new FileOutputStream(myFile,isVietTiep);
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(fos));
        // ghi ra file
        for (NhanVien nhanVien:st2)
        {
            bw.write(nhanVien.toString());
            bw.newLine();// them dong moi goi
        }
        bw.flush();// do du lieu tu bo nho tam xuong file
        bw.close();// dong ket noi voi file
    }
    // viet ham doc du lieu trong file
    public void readTextByLine() throws FileNotFoundException,IOException
    {
        String filePath= "C:\\Devmaster1\\WriteTextByLine.txt";
        File myFile= new File(filePath);
        FileInputStream fos= new FileInputStream(myFile);
        BufferedReader br = new BufferedReader(new InputStreamReader(fos));
        String temp;
        int cnt=1;
        while ((temp=br.readLine())!=null)
        {
            System.out.println(cnt+"\t"+temp);
            cnt++;
        }
    }

    public static void main(String[] args) {

        try {
            SaveText demo = new SaveText();
            // du lieu ao
            List<NhanVien> stNhanvien= new ArrayList<>();
            NhanVien nv1 = new NhanVien("Nguyen van A",18,"Hn");
            NhanVien nv2 = new NhanVien("Nguyen van b",18,"Hn");
            NhanVien nv3 = new NhanVien("Nguyen van v",18,"Hn");

            stNhanvien.add(nv1);
            stNhanvien.add(nv2);
            stNhanvien.add(nv3);
            demo.writeText(stNhanvien);
            demo.readTextByLine();
            demo.writeTextByLine(stNhanvien);
            System.out.println("ghi du lieu thanh cong");
        }
        catch (Exception e)
        {
            System.out.println("Loi:"+e.toString());
            Logger.getLogger(SaveText.class.getName()).log(Level.SEVERE,null,e);

        }
    }
}
