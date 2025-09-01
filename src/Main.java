import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many students have taken a test: ");
        int students = scanner.nextInt();
        String[] studentNames = new String[students];
        Integer[] studentScores = new Integer[students];
        for (int i = 0; i < students; i++)
        {
            System.out.printf("Name of student %d: ", (i + 1));
            studentNames[i] = scanner.next();
        }

        for (int j = 0; j < students; j++)
        {
            System.out.printf("Enter grade of %s: ", studentNames[j]);
            studentScores[j] = scanner.nextInt();
        }

        int totalScore = 0;
        int avgScore = 0;

        for (int k = 0; k < students; k++)
        {
            totalScore += studentScores[k];
            avgScore = totalScore /  students;
        }

        int highestScore = 0;
        String highestName = "";
        for  (int l = 0; l < students; l++)
        {
            highestScore = Math.max(highestScore, studentScores[l]);
            if(highestScore == studentScores[l])
                {
                highestName = studentNames[l];
                }
        }

        System.out.printf("Average grade: %d", avgScore);
        System.out.println();
        System.out.printf("Student %s has the highest grade: %d", highestName, highestScore);

    }
}