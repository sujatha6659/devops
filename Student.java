import java.util.Scanner;
 public class Student{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter firstname");
        String fn=sc.nextLine();
        System.out.println("enter lastname");
        String ln=sc.nextLine();
        System.out.println("hi "+fn+' '+ln);
        System.out.println("enter your details:");
        System.out.println("email");
        String em=sc.nextLine();
        System.out.println("enter phone no:");
        int ph=sc.nextInt();
        System.out.println("your email id is: "+em+" and phone number is:"+ph);
    }
}
