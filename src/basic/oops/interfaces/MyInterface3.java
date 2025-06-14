package src.basic.oops.interfaces;

/**
 * Java 8 new feature
 * default and static methods can be defined with body
 * All the methods defined in the interface are public , abstract and final
 *
 *
 */

@FunctionalInterface
public interface MyInterface3 {
    void print();

    default void myprint() {

    }
}