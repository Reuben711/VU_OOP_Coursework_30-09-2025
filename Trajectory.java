package vu.trajectory;

/**
 *
 * @author Muhindo Reuben
 */

import java.util.Scanner;
public class Trajectory {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the initial velocity, u(m/s): ");
        double u = scanner.nextDouble();
        
        System.out.print("Enter launch angle in degrees: ");
        double theta = Math.toRadians(scanner.nextDouble()); // Convert Degrees to Radians
        
        double uy = (u * Math.sin(theta)); // Verticle component
        double ux = (u * Math.cos(theta)); // Horizontal component
        
        final float g = 9.8f; // Acceleration due to gravity (m/s^2
        double t = (2 * uy) / g; // Time of flight
        System.out.println("Time of flight, T = " + Math.round(t * 10.0)/10.0 + "s"); //Round off to one decimal place
        double h = (Math.pow(uy, 2)) / (2 * g);
        System.out.println("Maximum height, H = " + Math.round(h * 100.0)/100.0 + "m");
        
        double r = (ux * t);
        System.out.println("Horizontal range, R = " + Math.round(r * 100.0)/100.0 + "m");

    }
}
