package day00_other_school;

import java.util.Arrays;
import java.util.Scanner;

public class ZombieAttack22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] inhabitants = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

        int[] arr = new int[inhabitants.length];
        int[] arr2 = new int[inhabitants.length];

        System.arraycopy(inhabitants, 0, arr, 0, arr.length); // for (int a = 0; a < arr.length; a++) { arr[a] = inhabitants[a];}

        for (int i = 0; i < Integer.MAX_VALUE; i++) {

            System.out.println("Day " + i + " " + Arrays.toString(inhabitants));

            for (int j = 1; j < inhabitants.length - 1; j++) {

                if (inhabitants[1] == 0 && j == 1) {
                    arr[0] /= 2;
                }

                if (inhabitants[j - 1] == 0 || inhabitants[j + 1] == 0) {
                    arr[j] /= 2;
                }

                if (inhabitants[inhabitants.length - 2] == 0 && j == 6) {
                    arr[arr.length - 1] /= 2;
                }
            }

            System.arraycopy(arr, 0, inhabitants, 0, arr.length); // for (int a = 0; a < arr.length; a++) { inhabitants[a] = arr[a];}
            System.arraycopy(arr, 0, arr2, 0, arr.length);

            Arrays.sort(arr2);
            if (arr2[arr2.length - 1] == 0) {
                System.out.println("Day " + (i+1) + " " + Arrays.toString(inhabitants));
                System.out.println("---- EXTINCT ----");
                break;

            }

        }
    }
}
