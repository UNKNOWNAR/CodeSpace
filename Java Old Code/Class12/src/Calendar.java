import java.util.*;
public class Calendar {
    int month = 1;
    int year = 0;
    int daysinaMonth(int monthNumber) {
        if (monthNumber == 1 || monthNumber == 3 || monthNumber == 5 || monthNumber == 7 || monthNumber == 8 || monthNumber == 10 || monthNumber == 12)
            return 31;
        else if (monthNumber == 2) {
            if (year % 400 == 0)
                return 29;
            else if (year % 4 == 0 && year % 100 != 0)
                return 29;
            else
                return 28;
        } else
            return 30;
    }
    int daymonthcalculator(int days)
    {
        while (days >= daysinaMonth(month))
        {
            days -= daysinaMonth(month);
            if(days==0)
                break;
            month++;
            if(month==13) {
                month = 1;
                year += 1;
            }
        }
        if(days==0)
            days = daysinaMonth(month);
        System.out.println("Date: "+days+" "+getMonthName(month)+" "+year);
        if(days == daysinaMonth(month)) {
            days = 0;
            month++;
            if(month==13) {
                month = 1;
                year += 1;
            }
        }
        return days;
    }
    String getMonthName(int monthNumber) {
        String monthName = "";
        switch (monthNumber) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                break;
        }
        return monthName;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calendar dates = new Calendar();
        System.out.println("Enter Days:-");
        int days = sc.nextInt();
        System.out.println("Enter Years:-");
        dates.year = sc.nextInt();
        days = dates.daymonthcalculator(days);
        System.out.println("Enter Additional Days to Calculate a Subsequent Date:");
        days +=sc.nextInt();
        days = dates.daymonthcalculator(days);
    }
}