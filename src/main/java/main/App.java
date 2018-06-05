package main;

import java.io.File;
import com.fasterxml.jackson.databind.ObjectMapper;

import model.Student;

public class App {

	public static void main(String args[]) {
		ObjectMapper mapper = new ObjectMapper();
		
		try {
			Student s = mapper.readValue(new File("data/simple-student.json"), Student.class);
			System.out.println("id:" + s.getId());
			System.out.println("name:" + s.getName());
			System.out.println("surname:" + s.getSurname());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}
}
