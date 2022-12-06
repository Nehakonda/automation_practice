package coding;

public class ReverseString {

    public static void main(String[] args) {

        String str = "Neha";
         //Using StringBuilder
        StringBuilder str1 = new StringBuilder(str);
        System.out.println(str1.reverse());

        //Using toCharArray method
        char[] strChar =str.toCharArray();
        for (int i = (str.length() - 1); i>=0; i--){
            System.out.println(strChar[i]);
        }

    }
}
