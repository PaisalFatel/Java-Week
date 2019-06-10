class Array{
	public static void main(String[] args) {
	
	int[] anArray;

	anArray = new int[11];

	anArray[0] = 100;
	anArray[1] = 200;
	anArray[2] = 300;
	anArray[3] = 400;
	anArray[4] = 500;
	anArray[5] = 600;
	anArray[6] = 700;
	anArray[7] = 800;
	anArray[8] = 900;
	anArray[9] = 1000;

	System.out.println("Element at index 0: "+ anArray[0]);
	System.out.println("Element at index 1: "+ anArray[1]);
	System.out.println("Element at index 2: "+ anArray[2]);
	System.out.println("Element at index 3: "+ anArray[3]);
	System.out.println("Element at index 4: "+ anArray[4]);
	System.out.println("Element at index 10: "+ anArray[10]);
	System.out.println("-----------------------------");
	for( int i=0;i<args.length;i++){
		System.out.println(args[i]);
	}

	}
}