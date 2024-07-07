public class Java6 {
    public static void main(String[] args) {
        // If else
        int age = 19;
        boolean bringVoterID = true;
        if(age<18){
            System.out.println("You are not eligible for voting");
        }else{
            System.out.println("You're elgible for voting.");
            if(bringVoterID){
                System.out.println("Go and vote");
            }else{
                System.out.println("Bring voter ID first and then vote.");
            }
        }
    }
}
