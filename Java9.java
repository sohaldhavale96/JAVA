import java.util.Scanner;
public class Java9 {
    // Scanner 
    // Ternary operator
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num1 = sc.nextInt();
        boolean isEven = num1%2==0 ? true : false;
        System.out.println(num1 + " is a even : " + isEven);
        sc.close();
    }   
}
