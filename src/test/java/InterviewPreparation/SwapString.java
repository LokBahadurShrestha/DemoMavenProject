package InterviewPreparation;

public class SwapString {
    public static void main (String[] args) {
        // by using StringBuffer or StringBuilder
        String str ="Hello world";
        StringBuilder strBfr=new StringBuilder(str);
        System.out.println(strBfr.reverse());

        // By using char array

        String str1="Hello world";
        String reversed="";
        char[]chars=str1.toCharArray();// Helloworld
        for(int i=chars.length-1;i>=0;i--){
            reversed=reversed+chars[i];
        }

        System.out.println(reversed);

    }
}
