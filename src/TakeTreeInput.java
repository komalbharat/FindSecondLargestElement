import java.util.Scanner;
public class TakeTreeInput {
    public static void main(String[] args) {
        int a,b,c ,largest,temp;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the first number");
        a = sc.nextInt();
        System.out.printf("Enter the second number");
        b= sc.nextInt();
        System.out.printf("Enter the third number");
        c=sc.nextInt();
        temp=a>b?a:b;
        largest=c>temp?c:temp;
        System.out.printf("this is largest num"+largest);
    }
}
