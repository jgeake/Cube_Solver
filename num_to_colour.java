import java.util.Scanner;

public class num_to_colour {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder input = new StringBuilder(); // To collect the input

        System.out.println("Enter text (type 'END' on a new line to finish):");

        // Loop to read multiple lines of input until "END" is entered
        while (true) {
            String line = in.nextLine(); // Read a line of input

            if (line.equals("END")) { // Check for the keyword to stop
                break; // Exit the loop
            }

            input.append(line).append("\n"); // Append the line to the StringBuilder
        }

        // Use StringBuilder for easier modification of colors
        StringBuilder result = new StringBuilder();
        String inputString = input.toString(); // Convert StringBuilder to String

        // Split the input by lines
        String[] lines = inputString.split("\n");

        // Process each line in the input string
        for (String line : lines) {
            if (line.length() < 13) { // Skip lines that don't have enough characters
                continue;
            }

            // Append the image name (first 8 characters) to the result
            result.append(line.substring(0, 8)).append(" ");

            // Extract the numbers after the image name and space
            String numbers = line.substring(9); // Numbers with commas

            // Split the numbers by commas
            String[] digits = numbers.split(",");

            // Convert each digit to its corresponding color
            for (int i = 0; i < digits.length; i++) {
                String trimmedDigit = digits[i].trim(); // Remove extra spaces
                
                // Ensure that the trimmed digit is not empty
                if (trimmedDigit.isEmpty()) {
                    continue;
                }

                switch (trimmedDigit) { // Process each valid digit
                    case "0":
                        result.append("white");
                        break;
                    case "1":
                        result.append("blue");
                        break;
                    case "2":
                        result.append("yellow");
                        break;
                    case "3":
                        result.append("green");
                        break;
                    case "4":
                        result.append("orange");
                        break;
                    case "5":
                        result.append("red");
                        break;
                    default:
                        // Append non-numeric characters as is
                        result.append(trimmedDigit);
                        break;
                }

                // Add a comma after each color except the last one
                if (i < digits.length - 1) {
                    result.append(",");
                }
            }

            // Add a newline after each processed line
            result.append("\n");
        }

        // Convert StringBuilder back to String and print it
        String output = result.toString().trim(); // Remove any trailing space and new lines
        System.out.println("You entered:");
        System.out.println(output);

        // Close the scanner
        in.close();
    }
}
