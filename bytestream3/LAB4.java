package bytestream3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LAB4 {
    public static void main(String[] args) {
        try{
            BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream("temp2.dat"));
        String s = "Hello world";
        byte[]  b = s.getBytes();
        output.write(b);
        output.close();
        }catch(FileNotFoundException ex){
            Logger.getLogger(LAB2.class.getName()).log(Level.SEVERE, null, ex);
        }catch (IOException ex){
            Logger.getLogger(LAB2.class.getName()).log(Level.SEVERE, null, ex);
        }

        try{
            BufferedInputStream Input = new BufferedInputStream(new FileInputStream("temp2.dat"));
        int ch;
        while((ch = Input.read())!= -1){
            System.out.print((char) ch);
        }
        
        }catch(FileNotFoundException ex){
            Logger.getLogger(LAB2.class.getName()).log(Level.SEVERE, null, ex);
        }catch (IOException ex){
            Logger.getLogger(LAB2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
}
