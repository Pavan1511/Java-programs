package encapulation_constructors;

	class Doog3 {
		String name;
		int cost;
		String breed;
		
		Doog3(String name,int cost,String breed){
		 super();	
		 this.name=name;  //this key word is used for defining the instance variable from local variable
		 this.cost=cost;  //local variable is name,cost,breed
		 this.breed=breed;  //instance variable is this.name,cost,breed
		} 
		Doog3(){
			
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

	public class Constructor_chaining {

		public static void main(String[] args) {
			
			Doog3 d=new Doog3("jimmy",20000,"husky");
			System.out.println(d.getName());
			System.out.println(d.getCost());
			System.out.println(d.getBreed());
			
			Dog d1=new Dog();
			System.out.println(d1.getName());
			System.out.println(d1.getCost());
			System.out.println(d1.getBreed());
		}
	}
