public class Calculate {
    public static void main(String[] args)
    {
	System.out.println("Calculate");
	double first = Double.valueOf(args[0]);
	double second = Double.valueOf(args[1]);
	double summ = first * second;
	System.out.println("summ = " + summ);
    }
}
