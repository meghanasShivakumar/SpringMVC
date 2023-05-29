package com.MVC.MVCSpring.serviceimpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.MVC.MVCSpring.entity.Student;
import com.MVC.MVCSpring.repository.StudentRepository;
import com.MVC.MVCSpring.service.StudentService;
@Service
public class StudentServiceImpl  implements StudentService{

	private StudentRepository studentRepository;
	//no @autowired spring bean uses one const
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}
	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}
	
	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
	return studentRepository.save(student);

	}

	@Override
	public Student getStudentById(Long id) {
		return studentRepository.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
  public void deleteStudentById(Long id) {
		
		studentRepository.deleteById(id);
	}}	

