package com.thoughtworks.capability.gtb.entrancequiz.Controller.dto;

import com.thoughtworks.capability.gtb.entrancequiz.Model.Student;

import java.util.List;

public class StudentListResponse {

    private List<Student> students;


    public StudentListResponse() {
    }

    public StudentListResponse(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudentList() {
        return students;
    }

    public void setStudentList(List<Student> students) {
        this.students = students;
    }
}
