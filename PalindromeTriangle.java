public class PalindromeTriangle {
    public static void main(String[] args){


    //         1
    //        121
    //       12321
    //      1234321

    int n=4;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(k);
            }
            for(int x=i-1;x>=1;x--){
                System.out.print(x);
            }
            System.out.println();
        }


    }
    
}
