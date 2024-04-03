package assignments;

public class Encaps1 {
public static void main(String[] args) {
	Encaps2 obj=new Encaps2();
	obj.setCollegename("CEK");
	System.out.println("College name is "+obj.getCollegename());
	obj.setClassNO(12);
	System.out.println("Class number"+ obj.getClassNO());
	
}
}
