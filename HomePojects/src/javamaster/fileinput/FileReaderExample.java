package javamaster.fileinput;

import java.io.*;

public class FileReaderExample {

    public static void main(String[] args) throws Exception {
       FileInputStream myFileInput = new FileInputStream("D:/Text1.txt");
        FileInputStream myFileInput2 = new FileInputStream("D:/Text2.txt");
        FileOutputStream myFileOutput3 = new FileOutputStream("D:/Text3.txt");

        SequenceInputStream lastfile = new SequenceInputStream(myFileInput,myFileInput2);



        int b;
        while ((b = lastfile.read()) != -1) {
            myFileOutput3.write(b);
        }
        lastfile.close();
        myFileInput.close();
        myFileInput2.close();

    }

}
