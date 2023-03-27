import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Row : ");
        int r = sc.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=1;j<=r-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=2*i-r;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
//        for lower half
        for(int i=r;i>=1;i--){
            for(int j=1;j<=r-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=2*i-r;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}