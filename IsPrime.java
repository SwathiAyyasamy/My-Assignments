package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int n= 29;
 for(int i=2; i<=n-1; i++) {
if (n%i ==0) {
	System.out.println(n +"Is a prime number");
	break;
}
else if (n%i!=0){
	System.out.println(n +"Is not aprime number");
	break;
}

	}
}
}

