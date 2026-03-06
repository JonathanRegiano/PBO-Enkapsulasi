/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pboenkapsulasi;

/**
 *
 * @author jonat
 */
public class Grade {

    private double score1;
    private double score2;
    private double score3;

    public Grade() {
        score1 = 0;
        score2 = 0;
        score3 = 0;
    }

    public Grade(double score1, double score2, double score3) {
        setScore1(score1);
        setScore2(score2);
        setScore3(score3);
    }

    public void setScore1(double score1) {
        if(score1 < 0 || score1 > 100) {
            System.out.println("Nilai harus antara 0 - 100");
        } else {
            this.score1 = score1;
        }
    }

    public void setScore2(double score2) {
        if(score2 < 0 || score2 > 100) {
            System.out.println("Nilai harus antara 0 - 100");
        } else {
            this.score2 = score2;
        }
    }

    public void setScore3(double score3) {
        if(score3 < 0 || score3 > 100) {
            System.out.println("Nilai harus antara 0 - 100");
        } else {
            this.score3 = score3;
        }
    }

    public double calculateAverage() {
        return (score1 + score2 + score3) / 3;
    }

    public String getGradeStatus() {
        double avg = calculateAverage();

        if(avg >= 75) {
            return "Lulus";
        } else {
            return "Tidak Lulus";
        }
    }
}