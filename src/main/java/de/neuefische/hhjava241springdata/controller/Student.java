package de.neuefische.hhjava241springdata.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @Id
    private String id;
    private String name;
    private int age;
}

/**
 * {
 *     "name" : "Alex",
 *     "age" : 22
 * }
 */
