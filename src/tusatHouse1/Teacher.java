package tusatHouse1;

public class Teacher extends Person {

	String qualification;
	int cell;
	
	Teacher ( String qualification, int cell){
		this.qualification = qualification;
		this.cell = cell;
		System.out.println("qualification =" + qualification);
		System.out.println("cell =" +cell);
		
	}
}
