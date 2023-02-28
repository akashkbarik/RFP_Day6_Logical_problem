public class couponCode {
    public static void main(String[] args) {
//    coupon code
        char[] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        int max = 100000000;
        double d = Math.random();
        int random = (int) (d * max);
        String sb = "";
        while (random > 0) {
            sb = sb + (chars[random % chars.length]);
            random /= chars.length;
            System.out.println(random + "  " + random % chars.length + " sb is " + sb);
        }

        String couponCode = sb.toString();
        System.out.println("Coupon Code: " + couponCode);
    }
}
