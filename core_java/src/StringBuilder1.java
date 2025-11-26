public class StringBuilder1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Akash");
        System.out.println(sb.capacity());  // 16 capacity + 5 string size
        System.out.println(sb.length());
        sb.append(" Anand");
        System.out.println(sb);
        sb.deleteCharAt(7);
        System.out.println(sb);
        sb.insert(6, "Java ");
        System.out.println(sb);
    }
}
