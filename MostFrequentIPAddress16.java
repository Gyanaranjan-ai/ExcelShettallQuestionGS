package gs;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentIPAddress16 {

    public static void main(String[] args) {
        String[] logs = {
                "10.0.0.1 bytes=32 time=50ms TTL=63",
                "10.0.0.2 bytes=32 time=50ms TTL=73",
                "10.0.0.4 bytes=32 time=50ms TTL=83",
                "10.0.0.2 bytes=32 time=50ms TTL=93",
        };

        System.out.println("Most Frequent IP: " + findMostFrequentIP(logs));
    }

    public static String findMostFrequentIP(String[] logs) {
        Map<String, Integer> ipCount = new HashMap<>(); // Map to store IP and its frequency
        String mostFrequentIP = "";
        int maxCount = 0;

        for (String log : logs) {
            String ip = extractIPAddress(log); // Extract IP from log string
            if (isValidIP(ip)) { // Check if extracted IP is valid
                ipCount.put(ip, ipCount.getOrDefault(ip, 0) + 1); // Update frequency
                // Track the IP with the highest count
                if (ipCount.get(ip) > maxCount) {
                    maxCount = ipCount.get(ip);
                    mostFrequentIP = ip;
                }
            }
        }

        return mostFrequentIP;
    }

    // Method to extract IP address from the log entry
    private static String extractIPAddress(String log) {
        // Assuming IP is the first part of the log string
        return log.split(" ")[0];
    }

    // Method to validate if a string is a valid IP address
    private static boolean isValidIP(String ip) {
        String[] parts = ip.split("\\.");
        if (parts.length != 4) 
        	return false; // IP must have exactly 4 parts

        for (String part : parts) {
            try {
                int num = Integer.parseInt(part);
                if (num < 0 || num > 255) return false; // Each part must be between 0 and 255
            } catch (NumberFormatException e) {
                return false; // Non-numeric parts indicate an invalid IP
            }
        }
        return true;
    }
}
