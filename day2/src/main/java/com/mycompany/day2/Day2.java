/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.day2;

/**
 *
 * @author 605
 */
public class Day2 {
 public static String classify(int number) {
        String result;
        
        if (number < 0) {
            result = "negative";
        } else if (number == 0) {
            result = "zero";
        } else {
            result = "positive";
        }
        
        return result;
    }
}