package com.nuketree3.example;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Employee {
    private long id;
    private long phoneNumber;
    private String name;
    private int experience;

    public Employee(long id, long phoneNumber, String name, int experience) {
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.experience = experience;
    }

}
