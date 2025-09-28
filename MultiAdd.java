public class MultiAdd
{
    public static double MultiAdd (double a, double b, double c) {
        return a * b + c;
    }
    
    public static void main (String [] args) {
        double test1 = MultiAdd (1.0, 2.0, 3.0);
        System.out.println ("multiadd (1.0, 2.0, 3.0) = " + test1);
        double test2 = MultiAdd (Math.sin(Math.PI / 4), 1.0, (Math.cos(Math.PI / 4)) / 2);
        System.out.println ("sin(π/4) + cos(π/4)/2 = " + test2);
        double test3 = MultiAdd (Math.log (10), 1.0, Math.log (20));
        System.out.println ("log (10) + log (20) = " + test3);
        
}

    public static double expSum (double x) {
        return MultiAdd (x, Math.exp(-x), Math.sqrt (1 - Math.exp(-x)));
    }

}