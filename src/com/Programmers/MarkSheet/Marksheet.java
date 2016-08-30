/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Programmers.MarkSheet;

import java.util.Scanner;

/**
 *
 * @author SchizoBrain
 */
public class Marksheet {

    int totalSubjects = 7;
    String sub1 = "", sub2 = "", sub3 = "", sub4 = "", sub5 = "", sub6 = "", sub7 = "";

    double mSub1, mSub2, mSub3, mSub4, mSub5, mSub6, mSub7;

   

    String Subjects = "Please Enter the Subject Name", Marks = "Please enter the obtained mark of ";

    Scanner myInput = new Scanner(System.in);
    Scanner inputSubMarks = new Scanner(System.in);

    public void entry() {
        System.out.println(Subjects);
        sub1 = myInput.nextLine();
        System.out.println(Marks + sub1);
        mSub1 = inputSubMarks.nextDouble();

        System.out.println(Subjects);
        sub2 = myInput.nextLine();
        System.out.println(Marks + sub2);
        mSub2 = inputSubMarks.nextDouble();

        System.out.println(Subjects);
        sub3 = myInput.nextLine();
        System.out.println(Marks + sub3);
        mSub3 = inputSubMarks.nextDouble();

        System.out.println(Subjects);
        sub4 = myInput.nextLine();
        System.out.println(Marks + sub4);
        mSub4 = inputSubMarks.nextDouble();

        System.out.println(Subjects);
        sub5 = myInput.nextLine();
        System.out.println(Marks + sub5);
        mSub5 = inputSubMarks.nextDouble();

        System.out.println(Subjects);
        sub6 = myInput.nextLine();
        System.out.println(Marks + sub6);
        mSub6 = inputSubMarks.nextDouble();

        System.out.println(Subjects);
        sub7 = myInput.nextLine();
        System.out.println(Marks + sub7);
        mSub7 = inputSubMarks.nextDouble();

    }

    public double getTotal() {
        return (mSub1 + mSub2 + mSub3 + mSub4 + mSub5 + mSub6 + mSub7);
    }

    public double getPercentage() {
        return (getTotal() / totalSubjects);
    }

    public void report() {
        System.out.println("==========================");
        System.out.println("      Your Report Card    ");
        System.out.println("==========================");
        System.out.println(sub1 + "\t\t\t" + mSub1);
        System.out.println(sub2 + "\t\t\t" + mSub2);
        System.out.println(sub3 + "\t\t\t" + mSub3);
        System.out.println(sub4 + "\t\t\t" + mSub4);
        System.out.println(sub5 + "\t\t\t" + mSub5);
        System.out.println(sub6 + "\t\t\t" + mSub6);
        System.out.println(sub7 + "\t\t\t" + mSub7);
    }
    
    public boolean isFail(){
         return (mSub1 < 32 || mSub2 < 32 || mSub3 < 32 || mSub4 < 32 || mSub5 < 32 || mSub6 < 32 || mSub7 < 32);
           
    }

    public String getGrade() {
        String grade="";
        double percentage=getPercentage();
               
       
            
         if (percentage >= 80) {
            grade = "Distinction";

        } else if (percentage >= 60 && percentage < 80) {
            grade = "First Division";

        } else if (percentage >= 45 && percentage < 60) {
            grade = "Second Divison";

        } else if (percentage >= 32 && percentage < 45) {
            grade = "Third Divison";

        }
        return grade;

    }
}

