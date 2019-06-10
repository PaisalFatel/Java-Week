class ReverseLetter{
	public void wordcount(String msg){

		String word = "";
	
		int i = 0; 

		while (i<msg.length()){
			if (msg.substring(i,i+1).equals(" ")){
				System.out.println(word);
				word = "";

			}
		
			else {
				word = msg.substring(i,i+1) + word ;
			}

		i++;

		}

		System.out.println(word);

	}

	public static void main(String[] args) {
		ReverseLetter x = new ReverseLetter();
		x.wordcount("The shafeeq is back");
	}



}