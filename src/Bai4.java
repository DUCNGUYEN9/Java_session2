import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        //Tính chỉ số cân nặng của cơ thể
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;
        System.out.print("your weight (in kilogram): ");
        weight = Double.parseDouble(scanner.nextLine());
        System.out.print("Your height (in meter) : ");
        height = Double.parseDouble(scanner.nextLine());
        bmi = weight / Math.pow(height, 2);
        System.out.printf("%-20s%s", "bmi", "Interpretation\n");
        if (bmi < 18)
            System.out.printf("%-20.3f%s", bmi, "Underweight");
        else if (bmi < 25.0)
            System.out.printf("%-20.3f%s", bmi, "Normal");
        else if (bmi < 30.0)
            System.out.printf("%-20.3f%s", bmi, "Overweight");
        else
            System.out.printf("%-20.3f%s", bmi, "Obese");

    }
}
