package encapulation_constructors;
class Dog1 {
	String name;
	int cost;
	String breed;
	
	Dog1(){
	 super();	
	} 
	String getName() {
		return name;	
	}
	int getCost() {
		return cost;	
	}
	String getBreed() {
		return breed;	
	}
}
public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog1 d=new Dog1();
		System.out.println(d.getName());
		System.out.println(d.getCost());
		System.out.println(d.getBreed());
	}

}
