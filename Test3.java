class Second{
	public Second(){
		System.out.println(7);
	}
}

class First extends Second{
	public First(){
		super();
		System.out.println(6);
	}
}

class One extends First{
	public One(){
		super();
		System.out.println(1);
	}
}

class Two extends One{
	public Two(int A){
		super(7);
		System.out.println(2);
	}

	public Two(){
		super(7);
		System.out.println(3);

	}
}

class Test3{
	public static void main(String[] args) {
		Two X = new Two();
	}
}