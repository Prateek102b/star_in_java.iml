import java.util.Scanner;

public class Main {
    public static float circumferenceOfCircle(float r){
        float n = (float) (2*3.14*r);
        return n;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the radius : ");
        float r = sc.nextFloat();
        System.out.println("Circumference is : "+circumferenceOfCircle(r));
    }
}