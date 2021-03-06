import java.util.Scanner;

class JavaBasics{

	public static Scanner user = new Scanner(System.in);

	public static void main(String args[]) throws java.io.IOException {
		//countUp();
		//countDown();
		//userInput();
		//ifLoop();
		//whileLoop();
		//switchStatement();
		//casting();
		//classObject();
		//instance();
		//array();
		//forEach();
		//printNumber(5);
		//input();
	}
/* //Recieving input from console without Scanner
	public static void input() throws java.io.IOException {
		System.out.print("Please enter a single character:");
        	char c = (char) System.in.read();
        	System.out.println("You pressed: " + c);		
	}
*/

/* //Practice with Methods, return values, and parameters
	public static int number(int alpha){
		return alpha;
	}
	public static void printNumber(int _alpha){
		System.out.println(number(_alpha));
	}
*/

/* //Enhanced for loops aka for each loop
	public static void forEach(){
		int index[] = {0,1,2,3,4};
		for(int i: index){
			System.out.println(i);
			System.out.println(" ");
		}		
	}
*/

/* //Arrays
	public static void array(){

	//Here we are declaring and initializing an int type array object with 5 alloted elements
		//int numberArray1[] = new int[5];
		int[] numberArray = new int[5];
	
	//To assign values to any individual elements:
		numberArray1[0] = 67;
		numberArray1[1] = 1398;
		numberArray1[2] = 5;
		numberArray1[3] = 10_300;
		numberArray1[4] = 731;
	

	//A short-hand way of declaring an initializing an int type array object:
		int numberArray2[] = {67, 1398, 5, 10_300, 731};

		System.out.println(numberArray2[0]);

	}
*/

/* //Instance Variables
	public static Object small = new Object();
	public static Object medium = new Object();
	public static Object large = new Object();

	public static void instance(){

		//The "small" object will retain its own variable value changes
		small._length = 5;
		small._width = 5;
		small._height = 5;
		System.out.println("The volume of the small box is: " + small.volume());
		
		//The ""medium" object will retain its own variable value changes
		medium._length = 10;
		medium._width = 10;
		medium._height = 10;
		System.out.println("The volume of the mediium box is: " + medium.volume());

		//The "large" object will retain its own variable value changes
		large._length = 15;
		large._width = 15;
		large._height = 15;
		System.out.println("The volume of the large box is: " + large.volume());
	//Reference variables are similar to Instance Variables
	//Reference vairables deal with objects and instances of said object
	
	}
*/

/* //Basic use of an object
	public static Object object = new Object();
	public static void classObject(){
		object.hello();
	}

*/

/* //Numeric Promotion
	public static void numericPromotion(){
	//	Any operand as a double will result in a double
	//	Any operand as a float will result in a float
	//	Any operand as a long will result in a long
	//	byte, short, char, int will result in an int
	//	(target) = (cast) (expression of various operands)

		byte b = 0, a = 6;
		int x = 50;
		b = (byte) (x + a);
//The expression automatically promotes to int, but since "b" is a byte
//	the expression must be "cast down" to byte to fit the variable type

	}

*/

/* //Casting
	public static void casting(){
		double x = 1.99;
		int y = (int) x;
		System.out.println(y);
		break;
		
	}

*/

/* //Logical Operators
	public static void compare(){
	//	|| is the equivilant of "or"
	//	&& is the equivilant of "and"
	//	!  is the equivilant of "not"
	//	== is the equivilant of "equal to"
	//	^  is the equivilant of "xor"

	int x = 0;
	int y = 0;

		if(x == y){
			System.out.println("Has to result in true");
		} else if(x == y || y == 0){
			System.out.println("Only one has to result in true");
		} else if(x == y && y == 0){
			System.out.println("Both sides have to be true");
		} else if(x != y)[
			System.out.println("Can't be true to result in true");
		} else if(x == y ^ x == 1){
			System.out.println("ONLY one has to be true");
		}
	}

*/

/* //Basic code to count upwards from a lower extremity to an upper
	public static void countUp(){
		for(int i = 0; i < 10; i ++){
			System.out.println(i)
		}
	}
*/

/* //Basic code to count downwards from an upper extremity to a lower
	public static void countDown(){
		for(int i = 10; i > 0; i --){
			System.out.println(i)
		}
	}
*/

/* //Basic user input code to print an input
	public static void userInput(){
		Scanner user = new Scanner(System.in);
		System.out.println(user.next());
	}
*/

/* //Basic if statement w/ user input
	public static void ifLoop(){
		int x = user.nextInt();

		if(x > 0){
			System.out.println("Hella");
		}
		else if(x == 0){
			System.out.println("Y u be zero?");
		}
		else if(x < 0){
			System.out.println("Why less than zero fam?");
		}
	}
*/

/* //Basic while loop w/ user input
	public static void whileLoop(){
		int x = user.nextInt();
		
		while(x < 25){
			System.out.println(x);
			x ++;
		}
		System.out.println("Aaaaaand, we're done!");
	}
	//There is also a do-while loop that will run AT LEAST a single time
	//do{ }while(){ }

*/

/* //Basic switch statement w/ user input
	public static void switchStatement(){
		int x = user.nextInt();

		switch(x){
			case 0:
				System.out.println("It's zero for nothing");
				break;
			case -1:
				System.out.println("Negative captain");
				break;
			case 1:
				System.out.println("Are you positive about this?");
				break;
			default:
				System.out.println("What the hell did you do?");
				break;
		}
	}
*/






}