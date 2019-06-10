class ReverseWord{
	public void wordcount(String msg){

		String word = "";
	
		int i = msg.length()-1; 

		while (i>=0){
			if (msg.substring(i,i+1).equals(" ")){
				System.out.println(word);
				word = "";

			}
		
			else {
				word = msg.substring(i,i+1) + word;
			}

		i--;

		}

		System.out.println(word);

	}

	public static void main(String[] args) {
		ReverseWord y = new ReverseWord();
		y.wordcount("The shafeeq is back");
	}

}