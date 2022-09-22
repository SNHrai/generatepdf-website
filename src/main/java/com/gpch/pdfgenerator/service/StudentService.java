package com.gpch.pdfgenerator.service;

import com.gpch.pdfgenerator.model.Student;
import com.gpch.pdfgenerator.repository.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repository;


   // public List<Student> getAllStudents(){
   //  List<Student> list = repository.findAll();
   //  for (Student student : list) {
   //     student.getId().toString();
   //     student.getAddress().getCity();
   //     student.getAddress().getCountry();
   //     student.getAddress().getPostalCode();
        
   //      System.out.println(student.getAddress().getCity());

        
   // }
  //  return list;

 //}

}
