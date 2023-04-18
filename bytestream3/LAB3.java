package bytestream3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class LAB3 {
    public static void main(String[] args) {
        
        try {
            DataOutputStream output = new DataOutputStream(new FileOutputStream("temp.dat"));
            output.writeInt(123);
            output.writeDouble(25.5);
            output.writeChar('A');
            output.writeUTF("Jim");
            output.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(LAB2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex){
            Logger.getLogger(LAB2.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            DataInputStream input = new DataInputStream(new FileInputStream("temp.dat"));
            System.out.println(input.readInt());
            System.out.println(input.readDouble());
            System.out.println(input.readChar());
            System.out.println(input.readUTF());
            input.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LAB2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex){
            Logger.getLogger(LAB2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
