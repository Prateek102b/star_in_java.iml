import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the row : ");
        int r = sc.nextInt();
        int i,j,k;
//        for upper pattern
        for(i=1;i<=r;i++){
            for(j=1;j<=i;j++){
                System.out.print("* ");
            }
            int space = 2*(r-i);
            for(k=1;k<=space;k++){
                System.out.print("  ");
            }
            for(int l =1;l<=i;l++){
                System.out.print("* ");
            }
            System.out.println();
        }
//        for lower pattern
        for(i=r;i>=1;i--){
            for(j=1;j<=i;j++){
                System.out.print("* ");
            }
            int space = 2*(r-i);
            for(k=1;k<=space;k++){
                System.out.print("  ");
            }
            for(int l =1;l<=i;l++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}