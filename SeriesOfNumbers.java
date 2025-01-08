package test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SeriesOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter numbers separated by spaces: ");
        String[] input = scanner.nextLine().split(" ");
        
        int[] numbers = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();

        Arrays.sort(numbers);
        System.out.println("Ascending Order: " + Arrays.toString(numbers));

        Integer[] numbersDesc = Arrays.stream(numbers).boxed().toArray(Integer[]::new);
        Arrays.sort(numbersDesc, Collections.reverseOrder());
        System.out.println("Descending Order: " + Arrays.toString(numbersDesc));

        scanner.close();
    }
}

