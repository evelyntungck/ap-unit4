public class PrintAmerican {
    public static void PrintAmerican (String date, int day, String month, int year) {
        System.out.print(date + ":");
        System.out.print(month + " ");
        System.out.print (day + ",");
        System.out.print (year);
    }
    
    public static void main (String [] args) {
        String date = ("Tuesday");
        int day = 16;
        String month = ("September");
        int year = 2025;
        
        PrintAmerican (date, day, month, year);
    }
}