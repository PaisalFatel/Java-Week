class For{
	public static void main(String xyz[]) {
		int A, B, C;
		for(A=1,B=10,C=100; A<=10 && B<=100 && C<=1000;){
			System.out.println(A+"-"+B+"-"+C);
			A++;
			B+=10;
			C+=100;
		}
		
	}
}