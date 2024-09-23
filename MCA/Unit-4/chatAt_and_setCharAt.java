public class chatAt_and_setCharAt {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println("buffer before = " + sb);
        System.out.println("charAt(1) before = " + sb.charAt(1));
        sb.setCharAt(1, 'i');
        System.out.println("String set charAt(1) after = " + sb);
        sb.setLength(2);
        System.out.println("buffer after = " + sb);
        System.out.println("String after set new length = " + sb);
    }
}
