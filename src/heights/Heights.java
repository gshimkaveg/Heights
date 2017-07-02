/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heights;

import java.util.Scanner;

/**
 *
 * @author bshimkaveg
 */
public class Heights {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ask = new Scanner(System.in);
        int numStudents;
        //double [] heights;
        System.out.println("Enter the total number of students in your class: ");
        numStudents = ask.nextInt();
        double[] heights = new double[numStudents];
        for (int i = 0; i < numStudents; i++) {

            System.out.println("Enter the height of student #"+(i+1)+": ");
            heights[i] = ask.nextDouble();
        }
        double maxHeight = heights[0];
        for (int i = 1; i < heights.length; i++) {

            if (maxHeight < heights[i]) {
                maxHeight = heights[i];
            }
        
        }
        double totalHeight = 0;
        
        for(int i=0;i<heights.length;i++){
            
            totalHeight += heights[i];
        }
        
        double avgHeight = totalHeight / numStudents;
        System.out.println();
        System.out.println("The tallest person in your class is "+maxHeight+" inches tall.");
        System.out.println("The average height of your class is "+avgHeight+" inches tall.");
    }

}
