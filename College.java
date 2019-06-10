class Test{
	private int phy, che, total; float per;
	
	private void calculation(){
		total = phy + che;
		per = total * 100/300;
	}


	public void physics(int p){
		if (p>=0 && p<=150){
			phy=p;
		}
		else {
			phy=-1;
			System.out.println("Invalid Physics results");
		}
	}


	public void chemistry(int c){
		if (c>=0 && c<=150){
			che=c;
		}
		else {
			che=-1;
			System.out.println("Invalid chemistry results");
		}
	}

	public void showResults(){
		if (che==-1 || phy==-1){
			System.out.println("No results");
		}
		else{
			calculation();
			System.out.println("Total marks: "+total);
			System.out.println("Percentage: "+per+"%");
		}
	}
}

class College {
	public static void main(String[] args) {
		Test abc;
		abc = new Test();
		abc.physics(70);
		abc.chemistry(50);
		abc.showResults();
	}
}