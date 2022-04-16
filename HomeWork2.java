package HomeWork2;



public class HomeWork2 {
    public static void main(String[] args) {
        sumComparison(20,8);
        positiveOrNegative(-5);
        numberPositiveOrNegative(7);
        linePrinting("Hello, world!",10);
        determineLeapYear(2023);
    }

    private static boolean sumComparison(int a, int b) {
       int sum = a + b;
        if(sum > 10 && sum < 20){
            return true;
        }else{
            return false;
        }

    }

    private static void positiveOrNegative(int a) {
        if(a >=0){
            System.out.println("Число положительное");
        }else if (a < 0){
            System.out.println("Число отрицательное");
        }
    }


    private static boolean numberPositiveOrNegative(int b) {
        if(b < 0){
            return true;
        }else{
            return false;
        }
    }

    private static void linePrinting(String a, int b) {
        for (int i = 0; i < b; i++) {
            System.out.println(a);
        }
    }


    private static boolean determineLeapYear(int date) {
        if(date % 4 == 0 && date % 100 != 0 || date % 400 == 0){
            System.out.println( date + " високосный");
            return true;

        }else{
            System.out.println(date + " не високосный");
            return false;
        }
    }
}
