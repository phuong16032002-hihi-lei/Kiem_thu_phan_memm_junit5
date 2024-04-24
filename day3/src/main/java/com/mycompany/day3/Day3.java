/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.day3;
import java.util.Scanner;
public class Day3 {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập độ dài các cạnh của tam giác
        System.out.println("Enter the lengths of the sides of the triangle:");
        System.out.print("Side 1: ");
        int side1 = scanner.nextInt();
        System.out.print("Side 2: ");
        int side2 = scanner.nextInt();
        System.out.print("Side 3: ");
        int side3 = scanner.nextInt();

        // Kiểm tra loại tam giác
        String triangleType = checkTriangleType(side1, side2, side3);

        // In kết quả
        System.out.println("The triangle is: " + triangleType);

        scanner.close();
    }

    public static String checkTriangleType(int side1, int side2, int side3) {
        if (side1 <= 0 || side2 <= 0 || side3 <= 0)
            return "NotATriangle";

        if (side1 == side2 && side2 == side3)
            return "Equilateral";
        else if (side1 == side2 || side1 == side3 || side2 == side3)
            return "Isosceles";
        else if (side1 * side1 + side2 * side2 == side3 * side3 || side1 * side1 + side3 * side3 == side2 * side2
                || side2 * side2 + side3 * side3 == side1 * side1)
            return "RightTriangle";
        else
            return "Scalene";
    }
}
