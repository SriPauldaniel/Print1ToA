import java.util.Scanner;
public class PrintToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Print(n);
        sc.close();
    }

    static void Print(int n) {
        if(n == 1) {
            System.out.print(1+ " ");
        }
        else {
            Print(n-1);
            System.out.print(n+" ");
        }
        
    }
}