package com.example.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.sms.entity.Student;

//extent it to JpaRepository so that we can use all the CRUD functionalities
// of JPA

//JpaRepository is a JPA (Java Persistence API) specific extension of 
//Repository. It contains the full API of CrudRepository and 
//PagingAndSortingRepository. So it contains API for basic CRUD operations
//and also API for pagination and sorting.


// JPA Repository has a class SimpleJpaRepository, which is annotated with 
// @Repository so we don't need to annotate it again but if we will annotate
// than also there will be no problem.


//Generally the @Transactional annotation is written at the service level.
//It is used to combine more than one writes on a database as a single atomic
// operation. 
//@Repository

// Here we are using interface to provide loose coupling 
// 
public interface StudentRepository extends JpaRepository<Student,Long>{
	
}
