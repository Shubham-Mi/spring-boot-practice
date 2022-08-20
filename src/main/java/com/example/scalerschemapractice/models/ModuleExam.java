package com.example.scalerschemapractice.models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.List;

@Entity
public class ModuleExam extends BaseModel {
    @ManyToOne
    private Module module;
    @ManyToOne
    private Exam exam;
    private Date dateOfExam;
    @OneToMany(mappedBy = "moduleExam")
    private List<StudentModuleExam> studentModuleExams;
}
