package bytestream3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;


public class LAB5 {
    public static void main(String[] args) {
        Student s = new Student(1111, "eiei");
        
        try{
            ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("object.dat"));
            output.writeObject(s);
            output.close();
        }catch(FileNotFoundException ex){
            Logger.getLogger(LAB2.class.getName()).log(Level.SEVERE, null, ex);
        }catch (IOException ex){
            Logger.getLogger(LAB2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try{
            ObjectInputStream input = new ObjectInputStream(new FileInputStream("object.dat"));
            Student s1 = (Student) input.readObject();
            System.out.println(s1.id + " " + s.name);
            input.close();

        }catch(FileNotFoundException ex){
            Logger.getLogger(LAB2.class.getName()).log(Level.SEVERE, null, ex);
        }catch (IOException ex){
            Logger.getLogger(LAB2.class.getName()).log(Level.SEVERE, null, ex);
        }catch(ClassNotFoundException ex){
            Logger.getLogger(LAB2.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
