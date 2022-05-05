package day00_other_school;

import java.util.Arrays;
import java.util.Scanner;

public class ZombieAttack2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] inhabitants = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

        int[] arr = new int[inhabitants.length];
        System.arraycopy(inhabitants, 0, arr, 0, arr.length); // for (int a = 0; a < arr.length; a++) { arr[a] = inhabitants[a];}
        
        System.out.println("Day 0 " + Arrays.toString(inhabitants));

        for (int i = 1; i < Integer.MAX_VALUE; i++) {

            if(inhabitants[1]==0) { arr[0] /= 2;}

            if (inhabitants[0] == 0 || inhabitants[2] == 0) { arr[1] /= 2;}

            if (inhabitants[1] == 0 || inhabitants[3] == 0) { arr[2] /= 2;}

            if (inhabitants[2] == 0 || inhabitants[4] == 0) { arr[3] /= 2;}

            if (inhabitants[3] == 0 || inhabitants[5] == 0) { arr[4] /= 2;}

            if (inhabitants[4] == 0 || inhabitants[6] == 0) { arr[5] /= 2;}

            if (inhabitants[5] == 0 || inhabitants[7] == 0) { arr[6] /= 2;}

            if (inhabitants[6]== 0 ){ arr[7] /= 2; }

            if (inhabitants[0] == 0  && inhabitants[2] == 0 && inhabitants[3] == 0 && inhabitants[4] == 0 && inhabitants[5] == 0 && inhabitants[6] == 0 && inhabitants[7] == 0){
                System.out.println("---- EXTINCT ----");  break; }

            System.arraycopy(arr, 0, inhabitants, 0, arr.length); // for (int a = 0; a < arr.length; a++) { arr[a] = inhabitants[a];}

         System.out.println("Day " + i + " " + Arrays.toString(inhabitants));
        }
    }
}
