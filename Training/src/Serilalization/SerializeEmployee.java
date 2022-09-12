package Serilalization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeEmployee {

	public static void main(String[] args) {
		System.out.println("program started...");
		FileOutputStream fileoutputstream=null;
		try {
			fileoutputstream = new FileOutputStream("D:\\Serialization\\Employee.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		ObjectOutputStream objectoutputstream=null;
		try {
			 objectoutputstream=new ObjectOutputStream(fileoutputstream);
		} catch (IOException e) {
			e.printStackTrace();
		}
		Employee emp=new Employee("Divya",765653,"diya.ab@attra.com");	
		try {
			 objectoutputstream.writeObject(emp);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		System.out.println("Employee object haas been serialized");
		
		

	}

}
