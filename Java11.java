import java.util.Scanner;
public class Java11 {
    // Do while loop
    public static void main(String[] args) {
        int Marks;
        Scanner sc = new Scanner(System.in);
        System.out.println("Study till you don't get marks above 90 !!!!");
        do{
            System.out.println("Enter your Marks : ");
            Marks = sc.nextInt();
        }while(Marks<90);
        sc.close();
    }
}
