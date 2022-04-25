package InterviewPreparation;

public class AlphaCharacter {
    public static void main(String[] args) {
        // find alpha character in the given String.

        String str="AHDTabfakdh237257%@@";
       String str1= str.replaceAll("[^A-Za-z]]","");
        System.out.println(str1.length());



   }

}
