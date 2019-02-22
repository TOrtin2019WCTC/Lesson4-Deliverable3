package NumberInClassActivity;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        String ans = in.nextLine();

        long newNumber = Long.parseLong(ans);


        if ((newNumber <= Byte.MAX_VALUE) && (newNumber >= Byte.MIN_VALUE)) {
            System.out.println("Byte");
        }else if (newNumber <= Short.MAX_VALUE && newNumber >= Short.MIN_VALUE) {
            System.out.println("Short");
        } else if (newNumber <= Integer.MAX_VALUE && (newNumber >= Integer.MIN_VALUE)){
            System.out.println("Integer");
        }else if(newNumber <=Long.MAX_VALUE && newNumber >= Long.MIN_VALUE){
            System.out.println("Long");
        }

    }
}
