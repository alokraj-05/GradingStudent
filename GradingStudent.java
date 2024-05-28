//replace all the files 

import java.util.*;

public class GradingStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] originalGrade = new int[n];
        for(int i = 0; i < n; i++) {
            originalGrade[i] = sc.nextInt();
        }
        int[] roundedGrade = new int[n];
        for(int i = 0; i < n; i++) {
            if(originalGrade[i] >= 38) {
                int nextMultipleOf5 = ((originalGrade[i] / 5) + 1) * 5;
                if(nextMultipleOf5 - originalGrade[i] < 3) {
                    roundedGrade[i] = nextMultipleOf5;
                } else {
                    roundedGrade[i] = originalGrade[i];
                }
            } else {
                roundedGrade[i] = originalGrade[i];
            }
        }
        for(int i = 0; i < n; i++) {
            System.out.println(roundedGrade[i]);
        }
    }
}
