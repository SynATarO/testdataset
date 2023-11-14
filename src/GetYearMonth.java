public class GetYearMonth {
    public static void main(String args[]) {
        int year = getYear();
        System.out.print(year+"年");
        int month = getMonth();
        System.out.println(month+"月");
    }

    static int getYear(){
        int year = 2021;
        return year;
    }

    static int getMonth(){
        int month = 1;
        return month;
    }
}