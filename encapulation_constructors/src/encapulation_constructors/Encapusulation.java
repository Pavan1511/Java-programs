package encapulation_constructors;

class Book{
	private int pg_no;
	
	void setPg_no(int x) {
		if(x<0)
		 {
			System.out.println("invalid input");
			System.exit(0);
		}else {
			pg_no=x;
		}
	 }
	
	int getPg_no() {
		return pg_no;
	}

	
}
public class Encapusulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b=new Book();
		b.setPg_no(100);
		System.out.println(b.getPg_no());
	}

}
