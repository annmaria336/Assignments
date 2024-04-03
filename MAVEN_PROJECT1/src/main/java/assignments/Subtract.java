package assignments;


public class Subtract extends Add{
	public void value() {
		int a = 20;
		int b = 10;
		int c = a-b;
		super.value();
		System.out.println("The result of 2 numbers after subtraction is "+c);
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	Subtract obj = new Subtract();
	obj.value();
		}
}
