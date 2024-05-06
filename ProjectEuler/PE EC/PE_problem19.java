public class PE_problem19 {
    public static void main(String[] args) {
        int sundaysOnFirst = countFirstSundays();
        System.out.println("First Sundays: " + sundaysOnFirst);
    }
    public static int countFirstSundays() {
        int dayOfWeek = 1; // 1 Jan 1901 was a Tuesday (0 for Monday, 1 for Tuesday, ..., 6 for Sunday)
        int sundaysOnFirst = 0;

        for (int year = 1901; year <= 2000; year++) {
            for (int month = 1; month <= 12; month++) {
                int daysInMonth = getDaysInMonth(month, year);
                for (int day = 1; day <= daysInMonth; day++) {
                    if (day == 1 && dayOfWeek == 6) { // Sunday
                        sundaysOnFirst++;
                    }
                    dayOfWeek = (dayOfWeek + 1) % 7;
                }
            }
        }
        return sundaysOnFirst;
    }
    public static boolean isLeapYear(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }
    public static int getDaysInMonth(int month, int year) {
        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                return isLeapYear(year) ? 29 : 28;
            default:
                return 31;
        }
    }
}
