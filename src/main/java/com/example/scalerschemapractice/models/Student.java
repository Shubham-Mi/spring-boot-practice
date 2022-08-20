package com.example.scalerschemapractice.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Student extends BaseModel {
    private String name;
    private String address;
    private String email;
    private String  phoneNumber;
    private String password;
    @ManyToMany
    private List<Module> enrolledModules;
    @OneToMany(mappedBy = "student")
    private List<StudentModuleExam> studentModuleExams;
}
