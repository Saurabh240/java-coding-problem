package src.basic.oops;

public class Box<T> {
    private T content;

    public Box(T content) {
        this.content = content;
    }
    public T getContent() {
        return content;
    }

//    public static <T extends Number> String getElement(List<T> genericList) {
//        return "dsd";
//    }


}