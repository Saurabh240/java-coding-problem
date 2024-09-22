package src.array;
/*
A string S of length L is passed as the input. The program must rotate the string S by N position in forward direction and print the result as the output.

input : cricket
roatation : 2
output : etcrick
 */
public class RotateString {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("cricket");
        int rotation =5;
        int rotchar = stringBuilder.length()-rotation;
        String start = stringBuilder.substring(rotchar);
        String substring = stringBuilder.substring(0,rotchar);
        stringBuilder = new StringBuilder(start + substring);
        System.out.println(stringBuilder);
    }

}
