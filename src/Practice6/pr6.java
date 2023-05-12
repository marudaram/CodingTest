package Practice6;

public class pr6 {

    public static void main(String[] args) {
        String str = "      Hello world ! ! !      ";

        str = str.trim();
        str = str.replace(" ", "");

        System.out.println(str);
    }
}
