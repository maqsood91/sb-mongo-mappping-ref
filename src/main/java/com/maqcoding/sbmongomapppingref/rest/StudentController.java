package com.maqcoding.sbmongomapppingref.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maqcoding.sbmongomapppingref.model.Products;
import com.maqcoding.sbmongomapppingref.model.Student;
import com.maqcoding.sbmongomapppingref.repo.ProductRepo;
import com.maqcoding.sbmongomapppingref.repo.StudentRepo;

@RestController
@RequestMapping("/student")
public class StudentController {

	
	@Autowired
	StudentRepo studentRepo;
	
	@Autowired
	ProductRepo productRepo;
	
	

	
	@GetMapping("/list")
	public ResponseEntity<?> getAllStudent() {
		return ResponseEntity.ok(this.studentRepo.findAll());
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getStudent(@PathVariable final int id ) {
		return ResponseEntity.ok(this.studentRepo.findById(id));
		
	}
	
	@PostMapping("/update")
	public ResponseEntity<?> deleteStudent(@RequestBody Student student) {
		//List<Products> products = student.getProducts();
		//products.forEach(products1-> productRepo.save(products1));
		
		return ResponseEntity.ok(this.studentRepo.save(student));
		
	}
	
	@PostMapping("/update1")
	public ResponseEntity<?> updStudent(@RequestBody Products products) {
		Student student =  products.getStudent();
		this.studentRepo.save(student);
		
		return ResponseEntity.ok(this.productRepo.save(products));
		
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteStudent(@PathVariable final int id) {
        this.studentRepo.deleteById(id);		
	}
	
	@GetMapping("/city/{city}")
	public ResponseEntity<?> getStudentByCity(@PathVariable final String city ) {
		return ResponseEntity.ok(this.studentRepo.findByCity(city));
		
	}
	
	@GetMapping("/product/{name}")
	public ResponseEntity<?> getStudentByProductName(@PathVariable final String name ) {
		return ResponseEntity.ok(this.studentRepo.findByProductName(name));
		
	}
	
	
	
	
}
