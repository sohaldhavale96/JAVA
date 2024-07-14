class Calculator{
    private int a;
    private int b;
    int add(int num1,int num2){
        a = num1;
        b = num2;
        return a+b;
    }
}

public class Java13 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int ans = calc.add(12, 23);
        System.out.println("Addition of two numbers is "+ans);
    }
}
