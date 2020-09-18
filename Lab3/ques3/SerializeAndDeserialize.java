package Lab3.ques3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeAndDeserialize {
	
	public static void main(String[] args) {
		Employee emp=new Employee("1", "Ankit", "wills colony", 1200.0);
		try {
			ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(new File("file.ser")));
			oos.writeObject(emp);
			oos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Serialized the object Successfully ");
		System.out.println("Now Deserializing the Same Object ");
		try {
			ObjectInputStream ois=new ObjectInputStream(new FileInputStream(new File("file.ser")));
			Employee e=(Employee)ois.readObject();
			System.out.println(e);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}