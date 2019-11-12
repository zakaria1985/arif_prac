package tusatHouse1;

public class Person {
 String name;
 String gender;
 int age;
 int id;
 static String nationality = "Bangladeshi";
 
  Person (){
	 
 }
  Person ( String name, int age){
	  this.name=name;
	  this.age= age;
  }
  
  Person (String name, String gender,int age){
	  this.name =name;
	  this.gender =gender;
	  this.age = age;
	    
  }
  Person (String name, String gender,int age,int id){
	  this.name =name;
	  this.gender=gender;
	  this.age =age;
	  this.id= id; 
	  }
  
public void displayInfo() {
	System.out.println("name=" + name);
	System.out.println("gender=" + gender);
	System.out.println("age=" + age);
	System.out.println("id=" + id);
	System.out.println("nationality="+ nationality);
}
 
}
