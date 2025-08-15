package com.example.restrepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.binding.Student;

@RepositoryRestResource(path= "book")
public interface StudentRestRepository extends JpaRepository<Student, Integer> {

}
