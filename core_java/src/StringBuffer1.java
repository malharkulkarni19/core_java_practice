public class StringBuffer1 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Navin");
        System.out.println(sb.capacity());  // 16 capacity + 5 string size
        System.out.println(sb.length());
        sb.append(" Martin");
        System.out.println(sb);
        sb.deleteCharAt(7);
        System.out.println(sb);
        sb.insert(6, "Springboot ");
        System.out.println(sb);

        //StringBuffer is thread safe but slower compare to StringBuilder

    }
}
