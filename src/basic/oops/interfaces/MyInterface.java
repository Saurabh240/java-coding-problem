package src.basic.oops.interfaces;

/*
 * After Java 8
 * default and static methods with body are introduced for Interface
 *
 */
public interface MyInterface {

    public void setSpeed2();
    default void setSpeed() {

    }
    static void setSpeed3() {

    }
}