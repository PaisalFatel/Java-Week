class Number{
	public String digits(int a){
		String word = "";
		switch(a){
			case 1: return("one");
			case 2: return("two"); 
			case 3: return("three");
			case 4: return("four");
			case 5: return("five");
			case 6: return("six");
			case 7: return("seven");
			case 8: return("eight");
			case 9: return("nine");
			case 10: return("ten");
			case 11: return("eleven");
			case 12: return("twelve");
			case 13: return("thirteen");
			case 14: return("fourteen");
			case 15: return("fifteen");
			case 16: return("sixteen");
			case 17: return("seventeen");
			case 18: return("eighteen");
			case 19: return("nineteen"); 
		}
	return word;
	}


	public String doubledigs(int a){
		String word ="";
		switch(a){
			case 20: return("twenty "); 
			case 30: return("thirty "); 
			case 40: return("fourty "); 
			case 50: return("fifty "); 
			case 60: return("sixty "); 
			case 70: return("seventy "); 
			case 80: return("eighty "); 
			case 90: return("ninety "); 
		}
	return word;
	}

	public String tripledigs(int a){
		String result="";
		int x;
		x=a;
		if (x>=1000 && x<=9999){
			result = result + (digits(x/1000) + (" thousand ")) ;
			x%=1000;
		}
		if (x>=100){
			result += digits(x/100) + " hundred ";
			x%=100;
		}

		if (x>=20) {
			result += doubledigs(x/10*10);
			x%=10;
		}

		if (x<=19){
			result+= digits(x);
		}
	return result;
		
	}
}

class Digits{
	public static void main(String xyz[]){

		Number n ;
		n = new Number();

		System.out.println(n.tripledigs(7777));

	}
}