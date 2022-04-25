package InterviewPreparation;

import java.util.ArrayList;
import java.util.HashSet;

public class RemovingDuplicateFromArrayList {
    public static void main(String[] args) {
        ArrayList<String>aList=new ArrayList();
        aList.add("Hari");
        aList.add("Mohan");
        aList.add("Gopal");
        aList.add("Mohan");

        System.out.println(aList);
        HashSet<String>hSet=new HashSet<>(aList);
        System.out.println(hSet);
    }
}
