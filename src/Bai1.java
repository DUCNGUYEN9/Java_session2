import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
//        phương trình bậc nhất
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation 'a * x + b = c', please enter constants:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        double a = scanner.nextDouble();
        System.out.println("Enter b: ");
        double b = scanner.nextDouble();
        System.out.println("Enter c: ");
        double c = scanner.nextDouble();
        if(a !=0){
        double x= (c-b)/a;
            System.out.printf("Equation pass with x = %f",x);
        }else {
            if (b==c) {
                System.out.println("The solution is all x!");
            }else {
                System.out.println("No solution!");
            }
        }

    }
}
