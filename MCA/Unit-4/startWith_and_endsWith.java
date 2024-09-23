public class startWith_and_endsWith {
    public static void main(String[] args) {
        String str1 = "Hello_world";
        String str2 = "hello";

        if (str1.startsWith("He")) {
            System.out.println("Matches with str1");
        } else if (str2.startsWith("he")) {
            System.out.println("Matches with str2");
        } else {
            System.out.println("Not matches with any string");
        }
        if (str1.endsWith("lo")) {
            System.out.println("Matches with str1");
        } else if (str2.endsWith("lo")) {
            System.out.println("Matches with str2");
        } else {
            System.out.println("Not matches with any string");
        }
    }
}
