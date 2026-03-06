/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pboenkapsulasi;

/**
 *
 * @author jonat
 */
public class Student {

    private String studentId;
    private String name;
    private int age;

    public Student() {
        studentId = "Unknown";
        name = "Unknown";
        age = 0;
    }

    public Student(String studentId, String name, int age) {
        setStudentId(studentId);
        setName(name);
        setAge(age);
    }

    public void setStudentId(String studentId) {
        if(studentId == null || studentId.isEmpty()) {
            System.out.println("Student ID tidak boleh kosong");
        } else {
            this.studentId = studentId;
        }
    }

    public void setName(String name) {
        if(name == null || name.length() < 3) {
            System.out.println("Nama minimal 3 karakter");
        } else {
            this.name = name;
        }
    }

    public void setAge(int age) {
        if(age < 15 || age > 100) {
            System.out.println("Umur tidak valid");
        } else {
            this.age = age;
        }
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
