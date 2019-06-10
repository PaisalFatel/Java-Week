class StringProcessing{
	public void wordcount(String msg){

		int count = 1;
		int i = 0; 

		while (i<msg.length()){
			if (msg.substring(i,i+1).equals(" ")){
				count+=1;
			}
		
		i++;

		}

		System.out.println("The count is: "+count);


	}

	public static void main(String[] args) {
		StringProcessing x = new StringProcessing();
		x.wordcount("The shafeeq is back");
	}



}