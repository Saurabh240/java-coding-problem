public class Main {

    int num; // class variable or instance variable
    static int stNum; // static variable
    public static void main(String[] args) {
        String s1 = new String("DATA");
        String s2 = "123";
//        System.out.println(s1==s2);
//        System.out.println(s1.equalsIgnoreCase(s2));
//        String s3 = null;
//        int i = Integer.parseInt(s2);
//        System.out.println(i+5);

        //Integer i = 10; // autobox to int
        // compile error   int b = null;
        Integer f = null;
        //Primitive int , boolean , byte , double , float , char , long , short
        int i = 0; // local variable you have to initialize before use
        System.out.println(i);
        Main m = new Main();
        System.out.println(m.num); // instance variable you can access only with Object
        System.out.println(stNum); // static can be accessed directly and have the default value
        // Object / Wrapper Class Integer , Boolean , Byte , Double , Float , Character , Long , Short
        //Whatsapp Number +919821163151
    }
}
