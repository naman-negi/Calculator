
import java.util.Scanner;
public class allmain {
    public static void main(String[] args){
        float a,b,c;
        allfunc calling = new allfunc();

        System.out.println("Kindly Provide an Input:");
        Scanner val= new Scanner(System.in);
        a=val.nextFloat();
        b=val.nextFloat();
        System.out.println("Which Operation would you like to perform:");
        System.out.println("1. Addition");
        System.out.println("2. Multiplication");
        System.out.println("3. Division");
        System.out.println("4. Percentage");
        System.out.println("Give the answer with the appropriate serial number");
        c= val.nextInt();

        if (c==1){
            calling.add(a,b);
           }
           if (c==2){
            calling.multiply(a,b);
           }
           if (c==3){
            calling.divide(a,b);
           }
           if (c==4){
            calling.percentage(a,b);
           } 
    }
}
