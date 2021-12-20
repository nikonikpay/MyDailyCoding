package serialization;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FloatProblem {

    public static void main(String[] args) throws Exception {
        float[] myFloat = {10.2f, 3.45f, 6.78f, 9.01f, 2.34f};
        FileOutputStream fos = new FileOutputStream("List.txt");
        DataOutputStream dos = new DataOutputStream(fos);

        dos.writeInt(myFloat.length);
        for (float f : myFloat
        ) {
            dos.writeFloat(f);
        }
        dos.close();
        fos.close();

        FileInputStream fis = new FileInputStream("List.txt");
        DataInputStream dis = new DataInputStream(fis);

        int length = dis.readInt();
        float data;
        for (int i = 0; i < length; i++) {
            data = dis.readFloat();
            System.out.println(data);

        }
        fis.close();
        dis.close();


    }

}
