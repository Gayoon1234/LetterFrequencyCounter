import java.util.Scanner;

public class Decoder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Decoder f = new Decoder();
		f.UserInput();
		
	}
	
	public void replace(char x, char y,  String z) {
		
		for(int i = 0; i<z.length(); i++) {
			if(z.charAt(i) == x)
				z = z.replace(x, y);
		}
		
		System.out.print(z + "\n");
		code = z;
		UserInput();
	}
	
	public void UserInput(){
		Scanner sc = new Scanner(System.in);
		
	    System.out.println("Letter to be removed: ");
	    char x = sc.next().charAt(0);
	    		
	    System.out.println("new Letter: ");
	    char y = sc.next().charAt(0);
	    
	    replace(x,y,code);

	}

}
