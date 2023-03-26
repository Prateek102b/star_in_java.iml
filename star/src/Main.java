import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row : ");
        int r = sc.nextInt();
        int i,j,k;
        for(i=1;i<=r;i++){
            for(j=1;j<=r-i+1;j++){
                System.out.print("  ");
            }
            for(k=1;k<=i;k++){
                System.out.print(i+"   ");
            }
            System.out.println();
        }
    }
}