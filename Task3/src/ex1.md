# Custom Age Distribution Simulation

---

## Task 1.3.1

Suppose you are compiling statistics on the age structure of students in our group. You should then draw 1000 age values and these should be distributed in the same way as the age distribution of the students in the group. How do you do it? Explain the algorithm in enough details to be able to program it directly. Take an idea/model from the example on section Your own distribution.

---

## Steps to Implement Custom Age Distribution

### 1. **Define the Age Distribution Table**

- **Description**: Gather the percentage distribution of age values in the group and define an array that represents this distribution. Each entry maps a range of random values to a specific age based on the percentage of students in that age category.
- **Example**:
    - 20% of students are 20 years old.
    - 15% are 21, 15% are 22, etc.
- **Implementation**:
  ```java
  int ageDistribution[][] = {
      {20, 20},  // 20% students aged 20
      {35, 21},  // 15% students aged 21
      {50, 22},  // 15% students aged 22
      {70, 23},  // 20% students aged 23
      {85, 24},  // 15% students aged 24
      {95, 25},  // 10% students aged 25
      {100, 26}  // 5% students aged 26
  };
  ```

### 2. **Initialize the Age Counter Array**

- **Description**: Create an array to store the frequency count of each age, which will help track how often each age appears in the generated data.
- **Implementation**:
  ```java
  int[] generatedAges = new int[MAX_AGE + 1]; // Counter array for each age
  ```

### 3. **Generate Ages According to the Distribution**

- **Description**: Using a loop, generate 1000 random age values based on the predefined distribution.
    - Generate a random number between 1 and 100.
    - Determine the age based on the age distribution table. For example, if the random number is between 1 and 20, assign the age as 20.
- **Implementation**:
  ```java
  Random random = new Random();
  for (int i = 0; i < ITERATIONS; i++) {
      int randomNumber = random.nextInt(100) + 1; // Random number 1-100
      int j = 0;
      while (randomNumber > ageDistribution[j][0]) {
          j++;
      }
      generatedAges[ageDistribution[j][1]]++; // Increment the counter for the determined age
  }
  ```

### 4. **Display the Generated Age Distribution**

- **Description**: Output the age distribution results, showing each age, its frequency in the generated data, and its percentage share.
- **Implementation**:
  ```java
  System.out.println("Age  Count   %-share");
  for (int age = 0; age <= MAX_AGE; age++) {
      if (generatedAges[age] != 0) {
          double percentage = ((double) generatedAges[age] / ITERATIONS) * 100;
          System.out.printf("%-4d %-7d %-8.2f%%\n", age, generatedAges[age], percentage);
      }
  }
  ```

---

## Full Code Implementation

```java
import java.util.Random;

public class AgeDistributionSimulation {
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