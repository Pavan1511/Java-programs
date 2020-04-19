package Constructors_chaining;

class Dog {
	String name;
	int cost;
	String breed;
	
	Dog(String name,int cost,String breed){
	 super();	
	 this.name=name;  //this key word is used for defining the instance variable from local variable
	 this.cost=cost;  //local variable is name,cost,breed
	 this.breed=breed;  //instance variable is this.name,cost,breed
	} 
	Dog(){
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
public class Constructor_chain {


	public static void main(String[] args) {
			
			Dog d= new Dog("jimmy",20000,"husky");
			System.out.println(d.getName());
			System.out.println(d.getCost());
			System.out.println(d.getBreed());
			
			Dog d1=new Dog();
			System.out.println(d1.getName());
			System.out.println(d1.getCost());
			System.out.println(d1.getBreed());
		}
	}


