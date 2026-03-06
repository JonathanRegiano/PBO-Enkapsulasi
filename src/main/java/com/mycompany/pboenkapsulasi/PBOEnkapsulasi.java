/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pboenkapsulasi;

/**
 *
 * @author jonat
 */
public class PBOEnkapsulasi {

 public static void main(String[] args) {

        Student student = new Student("S001", "Jonathan", 19);

        Grade grade = new Grade();
        grade.setScore1(80);
        grade.setScore2(75);
        grade.setScore3(90);

        System.out.println("Student ID : " + student.getStudentId());
        System.out.println("Nama       : " + student.getName());
        System.out.println("Umur       : " + student.getAge());

        System.out.println("Rata-rata Nilai : " + grade.calculateAverage());
        System.out.println("Status          : " + grade.getGradeStatus());
    }
}
