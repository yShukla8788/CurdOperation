package com.assignment.revise.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.revise.model.Relative;
import com.assignment.revise.model.Student;
import com.assignment.revise.repository.RelativeRepository;
import com.assignment.revise.repository.StudentRepository;

@RestController
public class StudentController {

	@Autowired
	StudentRepository studentRepository;

	@Autowired
	RelativeRepository relativeRepository;

	@PostMapping("/save")
	public String saveStudent(@RequestBody Student student) {
		// relativeRepository.saveAll(student.getRelatives());
		
		if (null != studentRepository.save(student))
			return "Success";
		else
			return "error";

	}

	@GetMapping("/get-all")
	public List<Student> getAll() {
		return studentRepository.findAll();

	}

	@GetMapping("get-by-id/{id}")
	public Optional<Student> getById(@PathVariable Integer id) {
		return studentRepository.findById(id);

	}

	@DeleteMapping("/delete/{id}")
	public void deleteStudent(@PathVariable Integer id) {
		studentRepository.deleteById(id);
	}

//	@PutMapping("/update")
//	public void updateStudent(@RequestBody Student stud) {
//		Optional<Student> s = studentRepository.findById(stud.getsId());
//		s.get().setsName(stud.getsName());
//		s.get().setsMarks(stud.getsMarks());
//		// s.get().setRelatives(stud.getRelatives());
//
//		for (Relative re : s.get().getRelatives()) {
//			//Optional<Relative> rel = relativeRepository.findById(re.getrId());
//			for(Relative rrr : stud.getRelatives()) {
//				re.setrName(rrr.getrName());
//				re.setRelation(rrr.getRelation());
//				
//			}
//			relativeRepository.save(re);
//		}
//
//		studentRepository.save(s.get());
//
//	}
	@PutMapping("/update")
	public void updateStudent(@RequestBody Student stud) {
		Optional<Student> s = studentRepository.findById(stud.getsId());
		s.get().setsName(stud.getsName());
		s.get().setsMarks(stud.getsMarks());
		s.get().setRelatives(stud.getRelatives());
		studentRepository.save(stud);

	}
}
