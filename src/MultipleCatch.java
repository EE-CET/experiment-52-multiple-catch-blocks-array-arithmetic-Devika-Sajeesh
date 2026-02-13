import java.util.Scanner;

public class MultipleCatch {
        public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        int index = sc.nextInt();
        int divisor = sc.nextInt();

        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        try {
            int result = arr[index] / divisor; // Enclose array access and division in try block
            System.out.println("Result: " + result);
        } catch (ArrayIndexOutOfBoundsException e) { // Catch ArrayIndexOutOfBoundsException
            System.out.println("Invalid Index");
        } catch (ArithmeticException e) { // Catch ArithmeticException
            System.out.println("Divide by zero error");
        }
        
        }
}
