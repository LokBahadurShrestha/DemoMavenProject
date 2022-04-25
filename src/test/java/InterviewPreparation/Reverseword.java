package InterviewPreparation;

public class Reverseword {
    public static void main(String[] args) {
        String str="Today is Thursday";
        String[]arr=str.split(" ");
        String reversed="";
        for(int i= arr.length-1;i>=0;i--){
            reversed=reversed+arr[i]+" ";
        }
        System.out.println(reversed);
    }
}
