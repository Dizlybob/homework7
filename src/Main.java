import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Task 1
        int [] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        float [] fractionalNumbers = {1.57F,7.654F,9.986F};
        short [] populationOfVillages = new short[3];
        populationOfVillages[0] = 25_189;
        populationOfVillages[1] = 27_520;
        populationOfVillages[2] = 29_725;
        //Task 2
        System.out.println("Task 1 and 2");
        System.out.println("Целочисленный массив:");
        for (int i = 0; i < numbers.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(numbers[i]);
        }
        System.out.println();
        System.out.println("Массив с дробными числами:");
        for (int i = 0; i < fractionalNumbers.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(fractionalNumbers[i]);
        }
        System.out.println();
        System.out.println("Произвольный массив:");
        for (int i = 0; i < populationOfVillages.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(populationOfVillages[i]);
        }
        System.out.println();
        //Task 3
        System.out.println("Task 3");
        System.out.println("Целочисленный массив:");
        for (int i = 2; i >= 0; i--) {
            if (i < 2) {
                System.out.print(", ");
            }
            System.out.print(numbers[i]);
        }
        System.out.println();
        System.out.println("Массив с дробными числами:");
        for (int i = 2; i >= 0; i--) {
            if (i < 2) {
                System.out.print(", ");
            }
            System.out.print(fractionalNumbers[i]);
        }
        System.out.println();
        System.out.println("Произвольный массив:");
        for (int i = 2; i >= 0; i--) {
            if (i < 2) {
                System.out.print(", ");
            }
            System.out.print(populationOfVillages[i]);
        }
        System.out.println();
        //Task 4
        System.out.println("Task 4");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]%2 !=0) {
                numbers[i]++;
            }
        }
        System.out.println(Arrays.toString(numbers));
        for (int i = 0; i < populationOfVillages.length; i++) {
            if (populationOfVillages[i]%2 !=0) {
                populationOfVillages[i]++;
            }
        }
        System.out.println(Arrays.toString(populationOfVillages));
    }
}