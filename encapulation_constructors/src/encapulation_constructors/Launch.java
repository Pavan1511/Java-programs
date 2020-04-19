package encapulation_constructors;

class Dog {
	private String name;
	private int cost;
	private String breed;
	
	void setData(String x,int y,String z) {
		name=x;
		cost=y;
		breed=z;
	}
	public String getName() {
		return name;
	}
	public int getCost() {
		return cost;
	}
	public String getBreed() {
		return breed;
	}
}
public class Launch {

	public static void main(String[] args) {
		Dog d=new Dog();                     // Dog is a constructor with zero parameter and address as return type
		d.setData("jimmy",20000,"husky");
		System.out.println(d.getName());
		System.out.println(d.getCost());
		System.out.println(d.getBreed());
	}

}
