
public class FreqCount {
	
	final private int a_ASCII = 97,z_ASCII = 97+25, ALPHABET_LENGTH = 26;
	private char alphabet[];
	private int letterCount[];
	private double percentCount[];
	
	public static void main(String[] args) {
        FreqCount x = new FreqCount();
		x.analyse("Hello DARKNESS");	
	}
	
	//Runs through all the methods
	public void analyse(String s) {
		alphabet = buildAlphabet();
		letterCount = freqCount(s);
		percentCount = percentageCount(s, letterCount);
		sortArrays();
		printArr(letterCount, percentCount);
	}
	
	
	//Sorts the three main arrays in descending order
	private void sortArrays() {
		
		int lowest = 0, currentIndex = 0;
		for(int i = 0; i<ALPHABET_LENGTH; i++){
			
			for(int j = currentIndex; j<ALPHABET_LENGTH; j++) {
				if(letterCount[lowest] <letterCount[j])
					lowest = j;	
			}
			
			swap(lowest, currentIndex);
			currentIndex++;
			lowest = currentIndex;
			
		}
	}
	
	//Helper method to above, does the swapping
	private void swap(int lowest, int currentIndex) {
		//Make temp
		char x = alphabet[lowest];
		int y = letterCount[lowest];
		double z = percentCount[lowest];
		
		//Swap half the stuff
		alphabet[lowest] = alphabet[currentIndex];
		letterCount[lowest] = letterCount[currentIndex];
		percentCount[lowest] = percentCount[currentIndex];
		
		//Swap the other half
		alphabet[currentIndex] = x;
		letterCount[currentIndex] = y;
		percentCount[currentIndex] = z;
		
	}
	
	//counts the number of times each letter appears
	private int[] freqCount(String s) {
		
		 int count[] = new int[ALPHABET_LENGTH];
		 s = s.toLowerCase();
		 
		 
		 for(int i = 0; i<s.length();i++) {
			 
			 char current = s.charAt(i);
			 
			 if(current >= a_ASCII && current <=z_ASCII) {
				 count[current - a_ASCII] +=1;
			 }
		 }
		 
		 return count; 		
	 }
	
	
	//Takes the previous methods return value and calculates the percentage of each letter
	private double[] percentageCount(String s, int n[]) {
		
		double stringLength = s.length() - countSpaces(s);
		double freq[] = new double[26];
		
		for(int i = 0;i < n.length;i++) {
			freq[i] =(n[i]/stringLength)*100;
		}
		
		return freq;
	}
	
	//Helper method to the above method, counts the number of spaces 
	private int countSpaces(String s) {
		
		int count = 0;
		char char_arr[] = s.toCharArray();
		
		for(char c:char_arr) 
		 if(c == ' ')
		  count++;
		
		return count;
	}
	
	//Prints the three main arrays
	private void printArr(int n[], double n2[]) {
		System.out.println("Letter\tCount\tPercentage");
		for(int i = 0; i< ALPHABET_LENGTH; i++)
		{
			System.out.printf("%c\t%d\t%.2f\n", alphabet[i], n[i], n2[i]);
		}
	}
	
    //returns a char array of letters a-z
	private char[] buildAlphabet() {
		char n[] = new char[ALPHABET_LENGTH]; 
		char x = 96;
		for(int i = 0; i< n.length; i++) {
			x++;
			n[i] = x;
		}
		return n;
	}
}


