import java.util.Scanner;

public class Bharathamata {
	public static void main(String[] args) {
		System.out.println("ENTER THE SIZE");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(j==0||i==0&&j<=((3*n)/4)||j==((3*n)/4)&&i<=(n/2)
						||i==(n/2)&&j<=((3*n)/4)||j==((3*n)/4)&&i>=(n/2)||i==(n-1)&&j<=((3*n)/4)){
			System.out.print("* ");
		}
		        else {
			       System.out.print("  ");
		        }
			}
			for(int j=0; j<n; j++) {
				if(j==0||j==((3*n)/4)||i==(n/2)&&j<=((3*n)/4)){
			System.out.print("* ");
		}
		        else {
			       System.out.print("  ");
		        }
			}
			for(int j=0; j<n; j++) {
				if(j==0 && i>=(n/2)||i+j==(n/2)||j-i==(n/2)
						||j==(n-1)&&i>=5||i==(n/2)){
			System.out.print("* ");
		}
		        else {
			       System.out.print("  ");
		        }
			}
			for(int j=0; j<n; j++) {
				if(j==0||i==0||i+j==(n-1)&&i<=(n/2)||i==j&&i>=(n/2)||i==(n/2)&&j<=(n/2)){
			System.out.print("* ");
		}
		        else {
			       System.out.print("  ");
		        }
			}
			for(int j=0; j<n; j++) {
				if(j==0 && i>=(n/2)||i+j==(n/2)||j-i==(n/2)
						||j==(n-1)&&i>=5||i==(n/2)){
			System.out.print("* ");
		}
		        else {
			       System.out.print("  ");
		        }
			}
			for(int j=0; j<n; j++) {
				if(i==0||j==(n/2)){
			System.out.print("* ");
		}
		        else {
			       System.out.print("  ");
		        }
			}
			for(int j=0; j<n; j++) {
				if(j==0 && i>=(n/2)||i+j==(n/2)||j-i==(n/2)
						||j==(n-1)&&i>=5||i==(n/2)){
			System.out.print("* ");
		}
		        else {
			       System.out.print("  ");
		        }
			}
			for(int j=0; j<n; j++) {
				if(j==0||i==j&&i<=(n/2)||i+j==(n-1)&&i<=(n/2)
						||j==(n-1))  {
			System.out.print("* ");
		}
		        else {
			       System.out.print("  ");
		        }
			}
			for(int j=0; j<n; j++) {
				if(j==0 && i>=(n/2)||i+j==(n/2)||j-i==(n/2)
						||j==(n-1)&&i>=5||i==(n/2)){
			System.out.print("* ");
		}
		        else {
			       System.out.print("  ");
		        }
			}
			for(int j=0; j<n; j++) {
				if(i==0||j==(n/2)){
			System.out.print("* ");
		}
		        else {
			       System.out.print("  ");
		        }
			}
			for(int j=0; j<n; j++) {
				if(j==0 && i>=(n/2)||i+j==(n/2)||j-i==(n/2)
						||j==(n-1)&&i>=5||i==(n/2)){
			System.out.print("* ");
		}
		        else {
			       System.out.print("  ");
		        }
			}
			
			
			System.out.println(); 
			

}
	}
}
