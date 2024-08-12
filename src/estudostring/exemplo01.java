package estudostring;

public class exemplo01 {
    public static void main(String[] args) {
        String original = "abcde ABCD EFG hef DEF";

        String s01 = original.toLowerCase();
        String s02 = original.toUpperCase();
        String s03 = original.trim();
        String s04 = original.substring(2);
        String s05 = original.substring(2, 9);
        String s06 = original.replace('a', 'x');
        String s07 = original.replace("abc", "xy");
        int i = original.indexOf("bc");
        int j = original.lastIndexOf("EF");

        System.out.println("Original: -" + original + "-");
        System.out.println("toLoweCase: -" + s01 + "-");
        System.out.println("toUpperCase: -" + s02 + "-");
        System.out.println("trim: -" + s03 + "-");
        System.out.println("substring: -" + s04 + "-");
        System.out.println("substring: -" + s05 + "-");
        System.out.println("replace: -" + s06 + "-");
        System.out.println("replace: -" + s07 + "-");
        System.out.println("index: -" + i + "-");
        System.out.println("indexof: -" + j + "-");

    }
}
