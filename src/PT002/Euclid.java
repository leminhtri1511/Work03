/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PT002;

/**
 *
 * @author ACER
 */
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

import java.util.Scanner;

public class Euclid 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double kq;
        kq = sqrt(pow(x2 - x1, 2) + pow(y2 - y1, 2));
        System.out.println( String.format("%.4f", kq));
    }
}
