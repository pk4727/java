import java.util.Scanner;
class area
{
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("enter length: ");
        int l=sc.nextInt();
        System.out.print("enter width: ");
        int b= sc.nextInt();
        int area=l*b;
        System.out.print("area= "+area);
        sc.close();                                                   // close scannner 
    }
}