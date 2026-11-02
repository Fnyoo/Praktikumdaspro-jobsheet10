# Basic Programming Practicum Report
## Session 10: LOOPS 2

**Department of Information Technology — Politeknik Negeri Malang — 2026/2027**

</div>

| | |
|---|---|
| **Name** | Fauz Dino |
| **NIM** | 264107020241 |
| **Study Program** | D-IV Informatics Engineering |
| **Class** | 1I |

## Objectives
1. Understand the concept of nested loops in algorithms.
2. Understand the flow of nested loops.
3. Recognize the syntax of nested loops.
4. Apply nested loops to solve a simple case study.

---
## Experiment 1: Review of Loops 1
Source code:
```java
import java.util.Scanner;
public class star13 {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the value of n = ");
    
    int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
        System.out.print("*");
    }
        System.out.println();
        sc.close();
    }
}
```
Output:
![](images/exp1_output_3.png)

##Questions

1. If the initialization i = 1 is changed to i = 0 without changing the condition, how many
* characters are printed when n = 5? Explain.
Answer: 
With i = 0 and the condition i <= n, the iteration will run for i = 0, 1, 2, 3, 4, 5, resulting in 6 stars,
while the upper limit remains the same.

2. If the condition i <= n is changed to i < n, how many times does the loop run when
n = 5? Why is the result different?
Answer: 
With i < n and n = 5, the loop runs for i = 1, 2, 3, 4—that is, 4 times. The result differs because, when i = 5, the condition 5 < 5 is false, so the final iteration does not execute.

3. Predict the output of the following code fragment when n = 9, then verify it by replacing
the FOR loop in your program and running it.

![](images/exp1_q3_snippet.png)

Answer:

![](images/exp1_output_3.png)

4. Explain why changing the increment i++ to i-- (with the condition still i <= n) makes
the loop run endlessly, so that it does not stop in a reasonable time for positive n. Do not
run that version; if it has already started running, stop the program by pressing Ctrl + C
in the terminal.
Answer:
With i--, the value of i starts at 1 and continuously decreases (0, -1, -2, ...). Since its value is always less than a positive n, the condition i <= n never becomes false. The loop only terminates once i decreases past the limits of an int and overflows a process requiring billions of iterations—meaning that, in practice, the loop will not finish within a reasonable amount of time.

##Experiment 2: Rectangle Star Pattern (Nested FOR)
Source code:
```java
import java.util.Scanner;
public class rectangle13 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of rows: ");
        int baris = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int kolom = sc.nextInt();
            for (int i = 1; i <= baris; i++) {
            for (int j = 1; j <= kolom; j++) {
            System.out.print("#");
        }
            System.out.println();
        }
    sc.close();
    }
}
```
Output:

![](images/exp1_output_1.png)

![](images/exp1_output_2.png)

![](images/exp1_output_3.png)

##Questions
1. Explain the function of the variables i and j in the program.

Answer: i is the counter of the outer loop and represents the current row.
j is the counter of the inner loop and represents the current column within that row.

2. How many times are the outer loop, the inner loop, and the statement print("*")
executed for rows = 4 and columns = 7?

Answer:
Outer loop: 4 times
Inner loop: started 4 times, with 7 iterations each, so 28 iterations in total
print("*"): 28 times (4 × 7)

3. What happens if the bounds of the outer and inner loops are swapped (the outer loop
uses columns and the inner loop uses rows)? Use rows = 3 and columns = 6 to explain.

Answer: The outer loop runs 6 times and the inner loop runs 3 times per round, so the output becomes 6 lines of 3 stars each (***).
The shape changes from 3×6 to 6×3. The total number of stars stays the same (18), but the rows and columns are exchanged.

4. Explain the effect of removing System.out.println(); after the inner loop.

Answer: The cursor never moves to a new line, so all stars are printed on a single line (for 3×6: 18 stars in one row). The rectangle shape is not formed.

5. Modify the program so that the printed character is #, then commit and push the changes
to GitHub.
```java
import java.util.Scanner;
public class rectangle13 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of rows: ");
        int baris = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int kolom = sc.nextInt();
            for (int i = 1; i <= baris; i++) {
            for (int j = 1; j <= kolom; j++) {
            System.out.print("#");
        }
            System.out.println();
        }
    sc.close();
    }
}
```

##Experiment 3: Debugging a Star Triangle – Nested WHILE

Source code:
```java
import java.util.Scanner;

public class triangle13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n = ");
        int n = sc.nextInt();

        int i = 1;
        while (i <= n) {
            int j = 0;

            while (j < i) {
                System.out.print("*");
                j++;
            }

            System.out.println();
            i++;
        }

        i = n;
        while (i >= 2) {
            int j = 0;

            while (j < i) {
                System.out.print("*");
                j++;
            }

            System.out.println();
            i--;
        }

        sc.close();
    }
}

```
Output:

![](images/exp3_output.png)

##Questions

1. Identify the mismatches in the initial output, and at least two fixes needed to produce a
nested triangle pattern.

Answer:
Mismatches:
All stars are printed on one line (n = 3 gives ******; n = 5 gives 15 stars) instead of separate rows.
The outer loop starts at i = 0, creating an extra empty first row, so it runs n + 1 times.

2. Explain the roles of the variables i and j. Why must the value of j be reset to 0 in every
iteration of the outer loop? What happens if j is not reset?

Answer: i is the row number (and the number of stars in that row). j counts the stars already printed in the current row.
j must be reset to 0 so the inner loop starts counting from zero for every new row. If j is not reset (for example, declared outside the outer loop), it keeps the value from the previous row. After the first row, 
j already equals i of that row, so the condition j < i is true for only one iteration in each later row. The result is only 1 star per row instead of a triangle.

3. Explain the changes to the initialization, the condition, and the update of the outer loop
that are needed to form the inverted triangle.

Answer:
Initialization: i = n; (instead of 1, and without int because i is already declared)
Condition: i >= 1 (instead of i <= n)
Update: i-- (instead of i++)

##Experiment 4 Case Study of Group Project Scores

Source code:
```java
import java.util.Scanner;

public class GroupScore13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of groups : ");
        int numGroups = sc.nextInt();

        System.out.print("Enter the number of graders: ");
        int numGraders = sc.nextInt();

        if (numGroups <= 0 || numGraders <= 0) {
            System.out.println("Groups and graders must be > 0.");
        } else {
            int groupNo = 1;
            double highestAverage = -1;
            int bestGroup = 0;

            while (groupNo <= numGroups) {
                System.out.println("Group " + groupNo);
                double totalScore = 0;
                for (int j = 1; j <= numGraders; j++) {
                    int score;
                    do {
                        System.out.print(" Score from Grader " + j + ": ");
                        score = sc.nextInt();
                        if (score < 0 || score > 100) {
                            System.out.println(" Score must be 0-100. Retry!");
                        }
                    } while (score < 0 || score > 100);
                    totalScore += score;
                }

                double averageScore = totalScore / numGraders;
                System.out.println("Group " + groupNo + ": average score = " + averageScore);
                if (averageScore > highestAverage) {
                    highestAverage = averageScore;   
                    bestGroup = groupNo;             
                }

                groupNo++; 
            }
            
            System.out.println("Best group : " + bestGroup);
            System.out.println("Highest average : " + highestAverage);
        }
        sc.close();
    }
}
```
Output:

![](images/exp4_output.png)

##Questions

1. Why must totalScore be reset inside the outer loop, but highestAverage must not be reset for each group?

Answer: totalScore stores the sum of scores for one group only. If it is not reset, scores from previous groups accumulate and the average becomes wrong. highestAverage stores the best average found across all groups, so it must persist. If it were reset for every group, the previous record would be lost and the comparison would be meaningless.

2. For 3 groups and 2 graders (without any invalid input), how many times is the body of the
FOR loop executed in total?

Answer: 3 groups × 2 graders = 6 times.

3. What happens if totalScore is declared as int and the average is calculated using
integer division? Give an example of values.

Answer: The decimal part of the average is truncated (cut off), so the result is inaccurate. Example: scores 80 and 85 give a total of 165, and 165 / 2 = 82 instead of 82.5. The average is shown as 82.0 rather than 82.5.

4. Why is highestAverage given the initial value -1 rather than 0? Give an example of
input that produces a wrong result if the initial value were 0.

Answer: Any valid average is at least 0, so with an initial value of -1 the first group is always recorded as the best (averageScore > -1 is always true). If the initial value were 0, a group with an average of 0 would never satisfy 0 > 0. Example: 2 groups where all graders give 0. Both averages are 0, so bestGroup stays at 0, which is a group that does not exist.

5. This program has three levels of loops. Name each type of loop and its role.

Answer: WHILE (outer): repeats the process for each group, running while groupNo <= numGroups.
FOR (middle): repeats score input for each grader, because the number of graders is known in advance.
DO-WHILE (inner): asks for a score at least once and repeats while the score is outside 0–100 (input validation).

##Assignment

#Assignment 1
Write a program that prints a number pattern from 1 up to the row number. Enter an integer n (n is at least 1). The first row prints 1, the second row prints 1 2, and so on up to row n. 
After the pattern is complete, display the total number of digits that have been printed. Save the file with the name: Task1StudentNo.java. For n = 5:
Source code:
```java
import java.util.Scanner;

public class Assigment1_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n = ");
        int n = sc.nextInt();

        int total = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);

                if (j < i) {
                    System.out.print(" ");
                }

                total++;
            }

            System.out.println();
        }

        System.out.println("Total numbers printed : " + total);

        sc.close();
    }
}
```
Output:

![](images/task1_output.png)

#Assignment 2
Write a program that displays a multiplication table of size n × n using nested FOR or WHILE loops. The value of n is at least 3. Each position displays the product of its row number and column number. 
Arrange the spacing so that the output is neat, then display the sum of all the numbers in the table. Save the program with the file name: Task2StudentNo.java. For n = 4:
Source code:

```java
import java.util.Scanner;

public class Assigemtn2_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n = ");
        int n = sc.nextInt();

        int total = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int result = i * j;

                System.out.printf("%4d", result);

                total += result;
            }

            System.out.println();
        }

        System.out.println("Total of all numbers : " + total);

    sc.close();
    }
}

```
Output:

![](images/task2_output.png)

#Assignment 3
A shopping center has several stores. Each store serves a number of customers on the same day, and each customer buys several items. The program asks for the number of stores, then the number of customers at each store, and the number of items bought by each customer. Calculate and display the total number of customers and the total number of items for each store, the total number of items across all stores, and the number of the store with the most items. If several stores share the highest value, display the store with the smallest number. Save the program with the file name: Task3StudentNo.java. 
Requirements: the number of stores is at least 1. The number of customers and the number of items per customer may be 0, but must not be negative. Use nested loops. The data does not need to be stored one by one; it is sufficient to accumulate it into the total variables. Example: Store 1 has 2 customers who bought 3 and 2 items; Store 2 has 3 customers who bought 1, 4, and 2 items. The expected summary is:

Source code:
```java
import java.util.Scanner;

public class Assigment3_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of stores: ");
        int numberOfStores = sc.nextInt();

        int totalItemsAcrossAllStores = 0;
        int storeWithMostItems = 1;
        int maxItemsCount = -1;

        for (int i = 1; i <= numberOfStores; i++) {
            System.out.println("\nStore " + i);

            System.out.print("Enter the number of customers: ");
            int numberOfCustomers = sc.nextInt();

            int totalItemsInStore = 0;

            for (int j = 1; j <= numberOfCustomers; j++) {
                System.out.print("Number of items for customer " + j + ": ");
                int numberOfItems = sc.nextInt();

                totalItemsInStore += numberOfItems;
            }

            System.out.println("Store " + i
                    + " - customers: " + numberOfCustomers
                    + ", total items: " + totalItemsInStore);

            totalItemsAcrossAllStores += totalItemsInStore;

            if (totalItemsInStore > maxItemsCount) {
                maxItemsCount = totalItemsInStore;
                storeWithMostItems = i;
            }
        }

        System.out.println("\nTotal items across all stores: " + totalItemsAcrossAllStores);
        System.out.println("Store with the most items: " + storeWithMostItems);

        sc.close();
    }
}
```
Output:

![](images/task3_output.png)

