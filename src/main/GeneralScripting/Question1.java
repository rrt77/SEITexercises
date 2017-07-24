
public class Question1 {

	public void reverseEverything(String s) {

		int size = s.length();
		char[] a = new char[size];
		s.getChars(0, size, a, 0);

		
		for (char temp : a) {

			System.out.print(temp);

		}
		
		System.out.println(" ");
		
		for(int i=size-1;i>=0; i--){
			
			System.out.print(a[i]);
			
		}

	}

	public static void main(String[] args) {
		
		Question1 qes = new Question1();
		
		qes.reverseEverything("hope you are doing well");

	}

}
