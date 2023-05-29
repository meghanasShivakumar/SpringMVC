package com.MVC.MVCSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.MVC.MVCSpring.entity.Student;
import com.MVC.MVCSpring.repository.StudentRepository;


@SpringBootApplication
//execute springboot application 
public class MvcSpringApplication  implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(MvcSpringApplication.class, args);
		//System.out.println("heee");
	}
	//inject studentrepo
	@Autowired
	private StudentRepository studentRepository;
	
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		/*
		 * Student student1 = new Student("Deepu", "S", "deepu@gmail.com");
		 * studentRepository.save(student1);
		 * 
		 * Student student2 = new Student("Geeta", "H", "geeta@gmail.com");
		 * studentRepository.save(student2);
		 * 
		 * Student student3 = new Student("Seeta", "K", "seeta@gmail.com");
		 * studentRepository.save(student3);
		 */
	}
}
