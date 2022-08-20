package com.example.scalerschemapractice.models;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Exam extends BaseModel {
    private String name;
    private int duration;
    @OneToMany(mappedBy = "exam")
    private List<ModuleExam> moduleExams;
}
