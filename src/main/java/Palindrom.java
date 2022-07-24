import java.util.Arrays;

public class Palindrom {

    public static void main(String[] args) {
        String a = "tennet";
        StringBuilder sb = new StringBuilder(a);
        sb.reverse();
        sb.toString().equals(a);
        System.out.println(a.length());
        System.out.println(a.length() / 2);



        char[] charArray = a.toCharArray();

        int modulo = charArray.length % 2;

        for (int i = 0; i < charArray.length / 2; i++) {
            System.out.println(charArray[i]);
        }



    }




}
