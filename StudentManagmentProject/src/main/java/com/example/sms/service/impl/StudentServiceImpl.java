package com.example.sms.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sms.entity.Student;
import com.example.sms.repository.StudentRepository;
import com.example.sms.service.StudentService;
//It is used to mark the class as a service provider. So overall @Service
//annotation is used with classes that provide some business functionalities.

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public List<Student> getAllStudent() {
		return studentRepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		studentRepository.save(student);
		return student;
	}

	@Override
	public Student updateStudent(Student student) {
		studentRepository.save(student);
		return student;
	}

	@Override
	public Student getStudentById(Long id) {
		return studentRepository.findById(id).get();
		
	}

	@Override
	public void DeleteStudentById(Long id) {
		studentRepository.deleteById(id);
	}

}
