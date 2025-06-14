package src.basic.condition;

/*
    switch(expression) {
         case value1:
            // do something
         case value2:
            //do something
         default:
            //do something
    }
 */
public class SwitchCaseDemo {
    public static void main(String[] args) {
        String str = "WED";
        switch (str) {
            case "MON":
                System.out.println("MONDAY");
                break;
            case "TUE":
                System.out.println("TUESDAY");
                break;
            case "WED":
                System.out.println("WEDNESDAY");
                break;
            case "THU":
                System.out.println("THURSDAY");
                break;
            case "FRI":
                System.out.println("FRIDAY");
                break;
            case "SAT":
                System.out.println("SATURDAY");
                break;
            case "SUN":
                System.out.println("SUNDAY");
                break;
            default:
                System.out.println("NOT A VALID CASE");
        }

    }
}
