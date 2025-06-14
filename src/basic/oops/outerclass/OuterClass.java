package src.basic.oops.outerclass;

public class OuterClass {
    private String outerField;

    static class InnerClass {
        private String innerField="Mike";
    }
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        InnerClass innerClass = new InnerClass();
        System.out.println(innerClass.innerField);

    }
}