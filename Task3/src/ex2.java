import java.util.Random;

public class ex2 {
    public static void main(String[] args) {
        final int ITERATIONS = 1000; // Number of age values to generate
        final int MAX_AGE = 26; // Maximum age in the group

        // Age distribution table
        int ageDistribution[][] = {
                {20, 20},  // 20% students aged 20
                {35, 21},  // 15% students aged 21
                {50, 22},  // 15% students aged 22
                {70, 23},  // 20% students aged 23
                {85, 24},  // 15% students aged 24
                {95, 25},  // 10% students aged 25
                {100, 26}  // 5% students aged 26
        };

        int[] generatedAges = new int[MAX_AGE + 1]; // Array to count occurrences of each age

        // Generate ages based on distribution
        Random random = new Random();
        for (int i = 0; i < ITERATIONS; i++) {
            int randomNumber = random.nextInt(100) + 1; // Random number between 1 and 100
            int j = 0;
            while (randomNumber > ageDistribution[j][0]) {
                j++;
            }
            generatedAges[ageDistribution[j][1]]++; // Increment count for the selected age
        }

        // Output the result
        System.out.println("Age  Count   %-share");
        for (int age = 0; age <= MAX_AGE; age++) {
            if (generatedAges[age] != 0) {
                double percentage = ((double) generatedAges[age] / ITERATIONS) * 100;
                System.out.printf("%-4d %-7d %-8.2f%%\n", age, generatedAges[age], percentage);
            }
        }
    }
}