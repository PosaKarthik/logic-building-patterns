public class DiamondPattern{
    public static void main(String[] args){
        int n=4;

        //Higher
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                System.out.print(" ");
            }
            for(int k=0;k<=2*i;k++){
                System.out.print("*");
            }
            System.out.println();
        }

        //Lower
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}