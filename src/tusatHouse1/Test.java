package tusatHouse1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Person p1 =new Person();
    Person p2 =new Person( "zakaria", 34);
    Person p3 = new Person("tusar","male",29);
     Person p4 = new Person (" arif","male", 35,1234);

     
     p1.displayInfo();
     p2.displayInfo();
     p3.displayInfo();
     p4.displayInfo();
	
		Teacher t1 = new Teacher("bba",51678);
		t1.displayInfo();

}
}
