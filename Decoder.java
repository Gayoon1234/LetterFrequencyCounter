import java.util.Scanner;

public class Decoder {

	String code = "EFA OBE_HA FBK OA_D IBNGDN BHH JBM G_ EFA JGKEBDRA BDJ _ BP SDBOHA EC\r\n" + 
			"BKRAIEBGD LFAEFAI BDMEFGDN FBK OAAD NBGDAJ CI DCE. _ FCL G HCDN QCI EFGK LBI\r\n" + 
			"EC ADJ. FCL G HC_N QCI TABRA. FCL LG_H G FBGH EFA JBM LFAD G IAESID EC EFA OCKCP\r\n" + 
			"CQ PM QBPGHM. P_ JABI G FCTA EC KAA MCS.";
	
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
