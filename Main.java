
public class Main {
    static void Decision_Problem1(){
        String Day ="Tuesday";
        int Total_Day = 7;

        if (Day.equals("Tuesday")){
            System.out.println("Today is Tuesday");
        }
        else {
            System.out.println("Today is Not Tuesday");
        }

        if (Total_Day==7){
            System.out.println("Today is Tuesday");
        }
        else {
            System.out.println("Today is Not Tuesday");
        }

    }

    static void Decision_Problem2(){

        String Day = "Tuesday";
        int Total_Day = 7;

        if(Day.equals("Monday")){
            System.out.println("Today is not Monday");
        }
        else {
            System.out.println("Today is Tuesday");
        }

        if (Total_Day==7){
            System.out.println("Today is Tuesday");

        }
        else {
            System.out.println("Today is not Sunday");
        }
    }

    static void Decision_Problem3(){

        String Day = "Saturday";
        int Total_Day = 2;

        if (Day.equals("Sunday")){
            System.out.println("Today is not Sunday");
        }
        else if (Total_Day == 7) {
            System.out.println("Today is Saturday");

        }
        else {
            System.out.println("Today is not Sunday");
        }
    }

    static void Decision_Problem4(){

        String Day = "Tuesday";
        int Total_Day = 7;

        switch (Total_Day){
            case 1:
                System.out.println("Today is Sunday");
                break;

            case 2:
                System.out.println("Today is Monday");
                break;

            case 3:
                System.out.println("Today is Tuesday");
                break;

            case 4:
                System.out.println("Today is Wednesday");
                break;

            case 5:
                System.out.println("Today is Thursday");
                break;

            case 6:
                System.out.println("Today is Friday");
                break;

            case 7:
                System.out.println("Today is Saturday");
                break;

            default:
                System.out.println("Today is Tuesday");
                break;
        }

        switch (Day){

            case "Sunday":
            System.out.println("Today is Sunday");
            break;

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

            case "Fiday":
                System.out.println("Today is Friday");
                break;

            case "Saturday":
                System.out.println("Today is Saturday");
                break;

            default:
                System.out.println("Today is Tuesday");
                break;

        }
    }

    public static void main(String[] args) {
        Decision_Problem1();
        Decision_Problem2();
        Decision_Problem3();
        Decision_Problem4();

        }
    }
