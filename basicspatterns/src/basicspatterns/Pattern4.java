package basicspatterns;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<=3;i++) {
			for(int j=i;j<3;j++) {
				System.out.print("-");
			}
			for(int k=1;k<=2*i+1;k++) {
					System.out.print("*");
			}
			for(int j=i;j<=3;j++) {
				System.out.print("-");
			}
			
			for(int j=i;j<3;j++) 
			{
				System.out.print("-");
			}
			for(int k=1;k<=2*i+1;k++) 
			{
					System.out.print("*");
			}
			for(int j=i;j<3;j++) 
			{
				System.out.print("-");
			}
			System.out.println();
			
			
		}
	}

}
