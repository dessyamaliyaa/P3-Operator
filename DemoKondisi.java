public class DemoKondisi{
	public static void main(String[] args){
	String status = "";
	int grade = 80;
	// mendapatkan status pelajar
	status = (grade >= 60)?"passed":"Fail";
	// print status
	System.out.println(status);
}
}