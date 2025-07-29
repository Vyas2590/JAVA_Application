public class Variables_02 {
    public static void main(String[] args) {
        String a = "apple";
        int val1 = 10;
        int val2 = 11;

        System.out.println(val1*val2);


        System.out.println(a+val1+val2); // apple1011

        System.out.println(a+(val1+val2)); // apple21

        System.out.println(a+val1*val2); // apple110

        System.out.println(val1+a+val2); // 10apple11

        System.out.println(val1+val2+a); // 21apple

    }
}


