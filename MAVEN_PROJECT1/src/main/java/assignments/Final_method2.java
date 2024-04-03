package assignments;

public class Final_method2 extends Final_method1 {
String name ;
int age;
public void display(String name, int age) {
	this.name = name;
	this.age = age;
	System.out.println(name+age);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Final_method2 obj = new Final_method2();
obj.display("ann", 3);
	}

}
