package core.io;

import java.io.*;

/*
1.Java Input/output
- la 1 phan quan trong trong Java , cung cap api de doc du lieu tu cac nguon input va ghi du lieu ra cac dich out put
nguon input va dich(output) co the la:
- ban phim, man hinh (consolog)
- file (tep tin tren he thong)
- mang(network socket)
- bo nho (memnory stream )
2. cac goi java i/o chinh
Java cung cap 2 goi co ban:
- java.io: ho tro i/o dua tren stream(luong byte va ky tu )
- java.nio: ( new i/o): ho tro I/o phi khoi(non- blocking), toi uu cho xu ly du lieu lon va ung dung mang
3. cac khai niem quan trong
a. stream(luong du lieu)
-inputstream:luong du lieu di vao doc
-outstream:luong du lieu di ra ghi
co 2 loai stream chinh :
Byte Stream (InputStream, OutputStream) → xử lý dữ liệu nhị phân (hình ảnh, video, file nén…).
Character Stream (Reader, Writer) → xử lý dữ liệu dạng văn bản (text).
b. cac lop chinh tron Java.io
Byte Streams: FileInputStream, FileOutputStream → đọc/ghi file dạng nhị phân.
Character Streams: FileReader, FileWriter → đọc/ghi file dạng text.
Buffered Streams: BufferedReader, BufferedWriter → tăng hiệu suất khi đọc/ghi.
Data Streams: DataInputStream, DataOutputStream → đọc/ghi dữ liệu nguyên thủy (int, double, boolean…).
Object Streams: ObjectInputStream, ObjectOutputStream → đọc/ghi đối tượng (serialization).
4,. Uu diem cua java i/o
cung cap api manh me xu ly nhieu laoi du lieu khac nhau
co san buffering  giup tang hieu suat
- ho tro serialization de luu tru va truyen doi tuong
- co java nio cho cac ung dung hien dai va can hieu nang cao
 */
public class JavaIO {
    public static void main(String[] args) {
        // doc van ban
        try(BufferedReader reader = new BufferedReader(new FileReader("input.txt")))
        {
            String line;
            while ((line = reader.readLine())!= null)
            {
                System.out.println(line);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        // ghi van ban
        try(BufferedWriter writer= new BufferedWriter(new FileWriter("output.txt")))
        {
            writer.write("xin chao Vu Minh Ha");
            writer.newLine();
            writer.write(" Day la vd ve Java I/o");
        }catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
