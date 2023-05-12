package Practice6;

public class pr4 {

    public static void main(String[] args) {
        String str = "가나다라마바사";
        StringBuilder sb = new StringBuilder(str);
        String output = sb.reverse().toString();
        System.out.println(output);
    }


}
