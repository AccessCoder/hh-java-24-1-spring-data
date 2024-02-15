package de.neuefische.hhjava241springdata.repository;

import de.neuefische.hhjava241springdata.controller.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepo extends MongoRepository<Student, String> {
}
