package assignments;

public class Subfrommain extends Addfrommain{
	public void result(int a, int b) {
		int c = a-b;
		super.result(5,6);
		System.out.println("The result of 2 numbers after subtraction is "+c);
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	Subfrommain obj = new Subfrommain();
	obj.result(3,4);
}
}
