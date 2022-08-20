package com.example.scalerschemapractice.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Module extends BaseModel {
    private String name;
    @ManyToMany(mappedBy = "enrolledModules")
    private List<Student> enrolledStudent;
    @OneToMany(mappedBy = "module")
    private List<ModuleExam> moduleExams;
}
