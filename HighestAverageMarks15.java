package gs;

import java.util.HashMap;
import java.util.Map;

public class HighestAverageMarks15 {

    public static void main(String[] args) {
        String[][] students = {{"Charles", "84"}, {"John", "100"}, {"Andy", "37"}, {"John", "23"}, {"Charles", "20"}};

        System.out.println("Highest Average Marks: " + findHighestAverage(students));
    }

    public static double findHighestAverage(String[][] students) {
        Map<String, Integer> sumMap = new HashMap<>();   // Stores total marks for each student
        Map<String, Integer> countMap = new HashMap<>(); // Stores the count of scores for each student

        // Loop through each student entry and calculate the cumulative sum and count of scores
        for (String[] student : students) {
            String name = student[0];
            int mark = Integer.parseInt(student[1]);

            // Update the total marks for the student
            sumMap.put(name, sumMap.getOrDefault(name, 0) + mark);
            // Update the count of entries for the student
            countMap.put(name, countMap.getOrDefault(name, 0) + 1);
        }

        double maxAverage = Double.NEGATIVE_INFINITY; // Initialize to track highest average
        String topStudent = ""; // Stores name of the student with highest average

        // Calculate average marks for each student and find the highest average
        for (String student : sumMap.keySet()) {
            double average = (double) sumMap.get(student) / countMap.get(student); // Calculate average

            // Update max average and top student if current average is higher
            if (average > maxAverage) {
                maxAverage = average;
                topStudent = student;
            }
        }

        System.out.println("Top Student: " + topStudent); 
        return maxAverage; 
    }
}
