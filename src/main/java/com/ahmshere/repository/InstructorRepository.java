package com.ahmshere.repository;


import com.ahmshere.entity.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstructorRepository extends JpaRepository<Instructor, Integer>{
}
