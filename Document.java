import java.util.Scanner;
class Document {
    public static void main(String args[]) {
        
        Scanner sc=new Scanner{System.in};
        System.out.println("enter 1st number");
        int m=sc.nextInt();
        System.out.println("enter 2nd number");
        int n=sc.nextInt();
        System.out.println(add(m,n));
	System.out.println(sub(m,n));

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