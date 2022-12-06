package coding;

public class RevString {

    public static void main(String[] args) {
        String str = "My name is Neha";
        String[] str1 = str.split(" ");

        for (int i=str1.length-1; i>=0; i--){
            System.out.println(str1[i]);
        }
    }
}
