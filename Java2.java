public class Java2 {
    public static void main(String[] args) {
        byte marks = 98; // Use "byte(1 byte)" when we are storing values between -256 to 255
        short totalCollegeStudents = 12345; // Use "short(2 byte)" when storing values between -32768 to 32767
        int totalVotes = 93249342; // Range : -2147483648 to 2147483647
        long totalpopulation = 882322342l; // Range : -9223372036854775808 to 9223372036854775807 (Mention l after value)
        System.out.println("Printing Integer values");
        System.out.println(marks);
        System.out.println(totalCollegeStudents);
        System.out.println(totalVotes);
        System.out.println(totalpopulation);
        float temperature = 3.45f; // mentioning 'f' after float declaration is compulsory
        double size = 0.32423;
        System.out.println("Printing Float Values");
        System.out.println(temperature);
        System.out.println(size);
        char myLetter = '1';
        System.out.println("Printing characters");
        System.out.println(myLetter);
        boolean isLoggedIn = true;
        System.out.println("Printing boolean values");
        System.out.println(isLoggedIn);
    }
}
