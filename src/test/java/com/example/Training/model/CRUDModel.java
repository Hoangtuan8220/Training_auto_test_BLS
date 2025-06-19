package com.example.Training.model;

import java.util.ArrayList;
import java.util.List;

public class CRUDModel {
    private final List<Student> students = new ArrayList<>();

    // Create
    public void addStudent(Student student) {
        students.add(student);
    }

    // Update
    public boolean updateStudent(String id, String newName, int newAge) {
        for (Student s : students) {
            if (s.getId().equals(id)) {
                s.setName(newName);
                s.setAge(newAge);
                return true;
            }
        }
        return false;
    }

    // Delete
    public boolean removeStudent(String id) {
        return students.removeIf(s -> s.getId().equals(id));
    }

    // Read
    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("Danh sách trống.");
            return;
        }
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
