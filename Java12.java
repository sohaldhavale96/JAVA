import java.util.Scanner;
public class Java12 {
    public static void main(String[] args) {
        System.out.println("For loop \n\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int num = sc.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
        sc.close();
    }
}
