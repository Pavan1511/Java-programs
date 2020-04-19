package com.abc.inhertance;

public class You {
	 int ac=111;
	 int pd=2222;
}
class friend extends You{
	void changeData() {
		ac=3333;
		pd=4444;
	}
	void display() {
		System.out.println(ac);
		System.out.println(pd);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		friend f=new friend();
		f.changeData();
		f.display();
	}

}
