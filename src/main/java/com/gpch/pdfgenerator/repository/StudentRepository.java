package com.gpch.pdfgenerator.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.gpch.pdfgenerator.model.Student;

public interface StudentRepository extends MongoRepository<Student,String>{
    
    //public List<StudentInformation> allStudents();
}
