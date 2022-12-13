public class Tester {
    public static void main(String[] args) {
        String string1 = new String("United Kingdom");
        String string2 = "Germany";

        String sub1 = string1.substring(0, string1.indexOf(' '));
        String sub2 = string1.substring(string1.indexOf('K'), string1.length());

        char[] charArray = ((sub1 + " " + string2 + " " + sub2).toUpperCase()).toCharArray();
        System.out.println(charArray);
    }
}
