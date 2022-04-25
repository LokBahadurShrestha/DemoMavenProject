package InterviewPreparation;

public class FizzBuzz {

    //Print numbers from 1 to 100 .If the number is divisible by 3 and 5 print fizzbuzz.
//If the number is divisible by 3,Print fizz and if the number is divisible by 5,Print buzz.
    public static void main(String[] args) {
        for(int i=1; i<=100;i++){
            if(i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
            }else if(i%3==0){
                System.out.println("Fizz");
            }else if(i%5==0){
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }
        }
    }
}
