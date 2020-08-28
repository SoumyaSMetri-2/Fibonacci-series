package fibonacci;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int a=0,b=1,c;
        System.out.println("FIBONACCI SERIES : ");
        System.out.print(a+" "+b);
        for(int i=1; i<13 ; i++){
            c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
        }
        System.out.print(" etc");
        System.out.println();
    } 
}
