package de.neuefische.hhjava241springdata.controller;

import de.neuefische.hhjava241springdata.repository.StudentRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/student")
@RequiredArgsConstructor
public class StudentController {

    //Dependency Injection -> Abhängigkeiten in Klassen "Injizieren" -> Spring befüllt diese zur Laufzeit!
    // Constructor Injection
    private final StudentRepo studentRepo;


    @PostMapping
    public Student saveNewStudent(@RequestBody Student student){
        return studentRepo.save(student);
    }



}
