import java.util.*;
public class Pssgenr{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        String upper ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower ="abcdefghijklmnopqrstuvwyz";
        String num="1234567890";
        String specialChars="!@#$%^&*()~?/}{)(][*";
        
        String combination = upper + lower +specialChars+ num;

        System.out.print("enter the lenth your password = ");
        int len  = sc.nextInt();
        // int len=8;
        char[] password=new  char[len];
        Random r =new Random();
        for(int i=0;i<len;i++){
            password[i]= combination.charAt(r.nextInt(combination.length()));
        }
        System.out.println("Generated Password is : "+ new String(password));


    }
}