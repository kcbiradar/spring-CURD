package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.spring.jdbc.dao.StudentDao;
import java.util.Scanner;
import com.spring.jdbc.entity.Student;

public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("Program is started........");
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        
        StudentDao temp= context.getBean("objDao" , StudentDao.class);
        
        Student student = new Student();
        
		/* This is getting a single data object from the database...
		 * 
		 * student = temp.getDetails(1);
		 * 
		 * System.out.println(student);
		 */
    
		Scanner sc = new Scanner(System.in);
		int operation;
		System.out.println("Select the following....." 
				+ "\n" + "1. Add the new student" + "\n" + "2. Modifying Data" + "\n" + "3. Removing existing data" + "\n");
		operation = sc.nextInt();
		if(operation == 1) {
			System.out.println("Enter id: "); 
			int id = sc.nextInt();
			System.out.println("Enter name : "); 
			String name = sc.next();
			System.out.println("Enter city : "); 
			String city = sc.next();
			 
	        student.setId(id);
	        student.setName(name);
	        student.setCity(city);
	        temp.insert(student);
		} else if(operation == 2) {
			System.out.println("Enter id: ");
			int id = sc.nextInt();
			// Here I have to write the one edge case for checking is there exists id entered by the user......
			System.out.println("Enter name : ");
			String name = sc.next();
			System.out.println("Enter city : ");
			String city = sc.next();
			student.setId(id);
			student.setName(name);
	        student.setCity(city);
			temp.updateDetails(student);
		} else if(operation == 3){
			System.out.println("Enter id: ");
			int id = sc.nextInt();
			student.setId(id);
			temp.remove(id);
		} else {
			System.out.println("Please select the correct option!!" + "\n" + "Thank You!!" + "\n");
		}
    }
}
