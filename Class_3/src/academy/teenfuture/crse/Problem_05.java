package academy.teenfuture.crse;

import java.util.Scanner;

class Problem_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.print("Input the first integer: ");
        int num_1 = scan.nextInt();

        System.out.print("Input the second integer: ");
        int num_2 = scan.nextInt();

        System.out.print("Input the third integer: ");
        int num_3 = scan.nextInt();

        //Check equal
        if(num_1 % 10 == num_2 % 10 || num_2 % 10 == num_3 % 10 || num_1 % 10 == num_3 % 10){
            System.out.println("The result is: true");
        } else {
            System.out.println("The result is: false");
        }




        scan.close();
    }


}