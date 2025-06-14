package src.basic;

public class PrimitiveDemo {
    public static void main(String[] args) {
        byte b =10;
        System.out.println(b);
        Byte byteValue = Byte.valueOf("10");
        System.out.println(byteValue);

        if((Byte) b instanceof Byte) {
            System.out.println("b instance of Byte");
        }
        if(byteValue instanceof  Byte) {
            System.out.println("byteValue instance of Byte");
        }

    }
}