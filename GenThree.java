/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args){
		double min = Double.parseDouble(args[0]);
		double max = Double.parseDouble(args[1]);

		int gen1 = (int) (Math.random() * (max - min) + min);
		int gen2 = (int) (Math.random() * (max - min) + min);
		int gen3 = (int) (Math.random() * (max - min) + min);

		int minGen = Math.min(Math.min(gen1, gen2), gen3);

		System.out.println(gen1);
		System.out.println(gen2);
		System.out.println(gen3);

		System.out.println("The minimal generated number was " + minGen);
	}
}
