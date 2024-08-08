import java.util.Scanner;
class Document {
    public static void main(String args[]) {
        
        Scanner sc=new Scanner{System.in};
        
        System.out.println("choose your option");
        System.out.println("enter 1 for Addition");
        System.out.println("enter 2 for Subtraction");
        int value=sc.nextInt();
        switch(value){
            case 1:
                System.out.println("enter 1st number");
                int m=sc.nextInt();
                System.out.println("enter 2nd number");
                int n=sc.nextInt();
                System.out.println(add(m,n));
            break;
            case 2:
                System.out.println("enter 1st number");
                int m=sc.nextInt();
                System.out.println("enter 2nd number");
                int n=sc.nextInt();
                System.out.println(sub(m,n));
            break;
            default:
                System.out.println("invalid input");
                break;

        }

    }
    public static int add(int m,int n){
        int sum=m+n;
        return sum;
    }
public static int sub(int m,int n){
        int s=m-n;
        return s;
    }

}