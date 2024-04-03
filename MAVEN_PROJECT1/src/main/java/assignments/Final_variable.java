package assignments;

public class Final_variable {
final String name = "Ann";

public void show() {
	name ="Noora";  //final is declared on the top
	System.out.println("Her name is "+name);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Final_variable obj = new Final_variable();
obj.show();
	}

}
