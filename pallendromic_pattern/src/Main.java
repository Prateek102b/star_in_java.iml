import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Row : ");
        int r = sc.nextInt();
        for(int i=1;i<=r;i++){
//            for spaces
            for(int j=1;j<=r-i;j++){
                System.out.print(" ");
            }
//            for left number
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
//            for right number
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}