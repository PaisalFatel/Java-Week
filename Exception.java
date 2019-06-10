class Exception{
	public static void main(String[] args) {
		int a,b,c = 0 ;

		try {
			a = 4 ;
			b = 0 ;
			c = a/b ;

			System.out.println("The result is: "+ c) ;

		}
			catch(ArithmeticException ref1){
				System.out.println("Can't divide by Zero");
			}

	}
}