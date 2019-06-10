class Maths {
	public void addition(int a, int b){
		int result;
		result = a+b;
		System.out.println("The result is: "+result);
	}

	public int subtraction(int a, int b){
		int answer;
		answer = a-b;
	return answer;
	}
}

class Func{
	public static void main(String xyz[]){
		Maths X;
		X=new Maths();
		X.addition(2,10);
		System.out.println("The result is: "+X.subtraction(10,5));
	}
}