package coding;

public class StringCode{
    public static void main(String[] args) {

        String s = "hhhhjjjnnnn";
        char[] s1 = s.toCharArray();
        int a=0;
        int b=0;
        int c=0;
        for(int i = 0; i< s.length(); i++){
            if (s.charAt(i) == 'h'){
                a++;
            }
            if(s.charAt(i) == 'j'){
                b++;
            }
            else if(s.charAt(i) == 'n'){
                c++;
            }

        }
        System.out.println("No. of words:" +"h" +a +"j" +b+"n"+ c);
    }
}
