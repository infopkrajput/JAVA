package leetCode;

public class temp {
    public static void main(String[] args) {
        String date = "2019-01-09";  // Date in the format "YYYY-MM-DD"

        // Split the string using the "-" as a delimiter
        String[] parts = date.split("-");

        // Convert the parts to integers
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);

        // Print the results
        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);
    }
    
}
