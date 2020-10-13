package com.thoughtworks.capability.gtb.entrancequiz.Repository;

import com.thoughtworks.capability.gtb.entrancequiz.DataProvider.DataProvider;
import com.thoughtworks.capability.gtb.entrancequiz.Model.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentRepository {

    private final List<Student> studentList = DataProvider.studentList;

    public List<Student> findAll() {
        return studentList;
    }

}
