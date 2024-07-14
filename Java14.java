public class Java14 {
    public static void main(String[] args) {
        // Arrays
        int[] numsArr = {1,2,3,4,5,6,7,8,9};
        for(int i=0;i<numsArr.length;i++){
            System.out.println(numsArr[i]*12);
        }
        // 2-D array
        int[][] Matrix = new int[3][3];
        int l=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                Matrix[i][j] = numsArr[l++];
                System.out.print(Matrix[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
