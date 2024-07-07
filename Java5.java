public class Java5 {
    public static void main(String[] args) {
        int num1 = 90;
        int num2 = 80;
        int num3 = 100;
        int num4 = 110;
        boolean r1 = ((num1==num2)&&(num3==num4));
        boolean r2 = ((num1!=num2)||(num3!=num4));
        boolean r3 = ((num1*num2==num3*num4)&&(num3==num4));
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
    }
}
