package Review;

public class ExamplArray {
    public static void main(String[] args) {
        String [] days ={"Monday", "Tuesday", "Wednesday", " Thursday", "Friday", "Saturday", "Sandy"};
        String  day = days[5];
        switch (day){
            case "Monday":
                System.out.println("Today is Monday");
                break;
            case "Tuesday":
                    System.out.println("Today is Tuesday");
                break;
            case "Wednesday":
                System.out.println("Today is Wednesday");
                break;
            case "Thursday":
                System.out.println("Today is Thursday");
                break;
            case "Friday":
                System.out.println("Today is Friday");
                break;
            case "Saturday":
                System.out.println("Today is Saturday");
                break;
            default:
                System.out.println("Today is Sandy");
        }

    }
}
