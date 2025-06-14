package src.basic.oops.encapsulation;

public class Sample {
    public static void main(String[] args) {
//        Student student = new Student();
//        student.setName("Mike");
//        student.setAge(30);
//        System.out.println(student.getName());
//        System.out.println(student.getAge());
//        Student clone = student.clone();
//        System.out.println(clone);
        Student student1 = new Student();
        student1.name="ABC";
        Student student2 = new Student();
        student2.name="ABC";
        Student student3 =student1;
        System.out.println(student1.equals(student2));
        System.out.println(student1.equals(student3));

        //Marker Interface are interface without any method
        // Cloneable and Serializable as marker interface

    }
}