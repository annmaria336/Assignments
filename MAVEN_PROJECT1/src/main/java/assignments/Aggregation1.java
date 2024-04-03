package assignments;

public class Aggregation1 {
String name;
int id;
Aggregation details;
Aggregation1(String name , int id, Aggregation details){
	this.name = name;
	this.id= id;
	this.details = details;
	
}
public void show() {
	System.out.println(name+"  "+id);
	System.out.println(details.name+"  "+details.place+"  "+details.animal);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Aggregation obj=new Aggregation("Ann","Chengaroor","DOG");
Aggregation1 obj1=new Aggregation1("Noora",12,obj);
obj1.show();
	}

}
