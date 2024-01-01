import java.util.Scanner;

public class GradeCalculator {
   
    public static void main(String[] args) {
         int totalmarks = 0;
         double average; char grade =' ';
        Scanner sc = new Scanner(System.in);
        //Assume there are 5 subjects
        int n = 5;
        String Sub[] = {"Subject 1","Subject 2","Subject 3","Subject 4","Subject 5"};
        int[] marks = new int[Sub.length];
        for (int i = 0; i < Sub.length; i++) {
            System.out.print("Enter marks for " + Sub[i] + ": ");
            marks[i] = sc.nextInt();
        }
        sc.close();

         for (int i = 0; i < Sub.length; i++) {
            totalmarks += marks[i];
        }

        average = (double)totalmarks/n;
        if(average >=90) grade = 'A';
        else if(average>= 85)  grade = 'B';
        else if(average>= 75)  grade = 'C';
        else if(average>= 65)  grade = 'D';
        else if(average>= 55)  grade = 'E';
        else if(average>= 40) grade = 'P';
        else {grade = 'F';}

    
        System.out.println("Total Marks: "+totalmarks);
         System.out.println("Average Marks: "+average);
          System.out.println("Grade obtained: "+grade);
    }
 
   

}