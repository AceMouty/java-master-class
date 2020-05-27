public class Main {
    public static void main(String[] args) {
        int dayOfTheWeek = 5;
        printDayOfTheWeek(dayOfTheWeek);
    }

    public static void printDayOfTheWeek(int day){
        switch (day){
            case 0:
                System.out.println("Today is Sunday");
                break;
            case 1:
                System.out.println("Today is Monday");
                break;
            case 2:
                System.out.println("Today is Tuesday");
                break;
            case 3:
                System.out.println("Today is Wednesday");
                break;
            case 4:
                System.out.println("Today is Thursday");
                break;
            case 5:
                System.out.println("Today is Friday");
                break;
            case 6:
                System.out.println("Today is Saturday");
                break;
            default:
                System.out.println("That is not a day in the week....");
                break;
        }
    }
}
