package InterviewPreparation;

public class Palindrome {
    public static void main(String[] args) {
        String original="racecart";
        String reversed="";
        for(int i=original.length()-1;i>=0;i--){
            reversed=reversed+original.charAt(i);
        }
        if(original.equals(reversed)){
            System.out.println("Given string  is palindrome.");
        }else{
            System.out.println("Given string is not palindrome ");
        }


    }
}
