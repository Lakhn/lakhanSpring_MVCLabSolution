package com.spring.com.springorm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.com.springorm.dao.Studentdao;
import com.spring.com.springorm.entities.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Studentdao studentdao = context.getBean("studentdao", Studentdao.class);
  
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			System.out.println("Press 1 for new record in table");
			System.out.println("Press 2 Update existing records into the table");
			System.out.println("Press 3 Delete existing records from the table");
			System.out.println("Press 4 Print all records from the table");

			try {
				int input = Integer.parseInt(br.readLine());
				switch (input) {
				case 1:
					System.out.println("enter user id");
					int uid=Integer.parseInt(br.readLine());
					
					System.out.println("enter user name");
					String uName=br.readLine();
					System.out.println("enter user department");
					String uDepartment=br.readLine();
					System.out.println("enter user country");
					String uCountry=br.readLine();
					 
					Student s=new Student(uid, uName, uDepartment, uCountry);
					studentdao.insert(s);
					
					break;
				case 2:
			System.out.println("Enter the id to update:");
				int dt = Integer.parseInt(br.readLine());
                   studentdao.updateStudent(null);
                   
                   
					break;
				case 3:   
					System.out.println("Enter user id:");
					int id = Integer.parseInt(br.readLine());
					studentdao.deleteStudent(id);
				
					

					break;
				case 4:
                    List<Student> allStudents= studentdao.getAllStudents();
                    for(Student st: allStudents)
                    {
                    	System.out.println("id:"+st.getStudentID());
                    	System.out.println("name"+st.getStudentName());
                    	System.out.println("department:"+st.getSrudentDepartment());
                    	System.out.println("country:"+st.getStudentCountry());
                    }
					break;

				default:
					
					break;
				}

			} catch (Exception e) {
				System.out.println("invalid input");
				System.out.println(e.getMessage());
			}

		}

	}
}
