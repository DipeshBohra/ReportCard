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
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Marksheet msheet = new Marksheet();

        Scanner myInput = new Scanner(System.in);
        Scanner inputSubMarks = new Scanner(System.in);

        msheet.entry();
        double totalMarks = msheet.getTotal();
        if (msheet.isFail()) {
            System.out.println("You are Fail, WorkHarder");
        } else {
            msheet.report();
            double percentage=msheet.getPercentage();
            String grade=msheet.getGrade();
            System.out.println("Your Percentage is : "+percentage);
            System.out.println("Your Grade is : "+grade);
             

        }

       

        System.out.println("Your total obtained mark is : " + totalMarks);

    }
}
