import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n,r,combination,nTotal=1,rTotal=1,nMinusR=1;

        System.out.print("Number of Elements (n) : ");
        n = input.nextInt();

        System.out.print("Number of Choices (r) : ");
        r = input.nextInt();

        for(int i=1; i<=n; i++){
            nTotal *= i;
        }

        for(int j=1; j<=r; j++){
            rTotal *= j;
        }

        for(int k=1; k<=(n-r); k++){
            nMinusR *= k;
        }

        combination = nTotal / (rTotal * nMinusR);
        System.out.println("C("+n+","+r+") Combination = "+combination);
    }
}