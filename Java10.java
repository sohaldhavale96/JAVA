import java.util.Scanner;
public class Java10 {
    public static void main(String[] args) {
        // While loop
        int i = 1;
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        num = sc.nextInt();
        // 📌 While loop
        while(i<11){
            System.out.println(i*num);
            i+=1;
        }
        sc.close();
    }
}
