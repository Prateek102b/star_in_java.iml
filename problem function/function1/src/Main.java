import java.util.Scanner;

public class Main {
    public static int printAverage(int a, int b, int c){
        int sum = a+b+c;
        int divisions = sum/3;
        return divisions;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();
        System.out.print("Enter third number : ");
        int c = sc.nextInt();
        System.out.print("Average of three numbers is  : "+printAverage(a,b,c));
    }
}