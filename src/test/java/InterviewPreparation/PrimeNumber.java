package InterviewPreparation;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String [] args) {

// print whether given number is prime or not
//        Scanner Sc = new Scanner(System.in);
//        System.out.println("Enter your given number:");
//        int givenNumber = Sc.nextInt();
//        boolean isPrime = true;
//        if (givenNumber > 1) {
//            for (int i = 2; i < givenNumber; i++) {
//                if (givenNumber % 2 == 0) {
//                    isPrime = false;
//                    break;
//                }
//            }
//
//
//        }else{
//            isPrime=false;
//        }
//        System.out.println("Is " + givenNumber + " is prime? " +isPrime);

        int given=11;
        boolean isPrime=true;
        if(given>1){
            for(int i=2; i<given;i++){
                if(given%2==0){
                    isPrime=false;
                    break;
                }
            }

        }else{
            isPrime=false;
        }
        System.out.println("Is "+given+ " is prime ?"+isPrime);
    }
}