package coding;

public class CountWords {

    public static void main(String[] args) {

        String str = "My name is Neha";
        System.out.println(str);
        int c = 1;
        for (int i=0; i< (str.length()-1); i++) {
            if(str.charAt(i) ==' ' && str.charAt(i+1)!=' '){
                c++;
            }
        }
            System.out.println("No. of words in a string: " +c );
    }
}
