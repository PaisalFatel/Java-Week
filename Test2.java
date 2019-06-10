class Second{
	int phy,che;
	public void message(){
		System.out.println("hello");
		System.out.println("my friends");
		System.out.println(phy);

	}
}

class Test2{
	public static void main(String xyz[]){
		Second X;
		X = new Second();
		X.phy=759;
		X.message();
	}
}