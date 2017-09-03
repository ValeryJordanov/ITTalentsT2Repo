package utilities;

public class TestClass {

	public static void main(String[] args) {
		System.out.println("Enter something to test the utilities:");
		String testInput = Utility.SCAN.nextLine();
		System.out.println("You've inserted : " + testInput);
		
		System.out.println("=======================================");
		int test = Utility.RANDOM.nextInt(Integer.MAX_VALUE);
		System.out.println("Testing random : " + test);
		
		System.out.println("=======================================");
		String phone = Utility.generatePhone();
		System.out.println("Testing random phone : " + phone);
		
		System.out.println("=======================================");
		String name = Utility.generateName();
		System.out.println("Testing random name : " + name);
	}
}
