public class Tut6 {
    public static void main(String[] args) {
        //STRING FUNCTIONS
        String a="Garv";
        System.out.println(a);
        System.out.println(a.length());
        System.out.println(a.toLowerCase());
        System.out.println(a.toUpperCase());
        String b="  garv  ";
        System.out.println(b);
        System.out.println(b.trim());
        String x="my name is garv";
        System.out.println(x.substring(4));
        System.out.println(x.substring(2,14));
        System.out.println(x.replace('a','o'));
        System.out.println(x.replace("garv","harry"));
        System.out.println(x.startsWith("my"));
        System.out.println(x.endsWith("garv"));
        System.out.println(x.charAt(3));
        System.out.println(x.indexOf("a"));
        System.out.println(x.indexOf("a",5));
        System.out.println(x.lastIndexOf(" "));
        System.out.println(x.lastIndexOf(" ",8));
        System.out.println(a.equals("Garv"));
        System.out.println(a.equalsIgnoreCase("garv"));

        System.out.println("i a\tm escape s\nequ\'ence \" doub\\le quote");
    }
}
