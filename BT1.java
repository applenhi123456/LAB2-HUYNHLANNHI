/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class BT1 {
   import java.util.Scanner;

public class BT1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Nhap vao he so a: ");
    double a = scanner.nextDouble();

    System.out.print("Nhap vao he so b: ");
    double b = scanner.nextDouble();

    double x = -b / a;

    System.out.println("Nghiem cua phuong trinh " + a + "x + " + b + " = 0 la: " + x);
  }
}
}
