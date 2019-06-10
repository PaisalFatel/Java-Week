class Results{
	private int phy,che,mat;

	public void physics(int p){
		if (p>=0 && p<=150){
			phy=p;

		}
		else{
			phy=-1;
			System.out.println("invalid physics marks");
		}
	}
	public void chemistry(int c){
		if (c>=0 && c<=150){
			che=c;

		}
		else{
			che=-1;
			System.out.println("invalid chemistry marks");
		}
	}
	public void math(int m){
		if (m>=0 && m<=150){
			mat=m;

		}
		else{
			mat=-1;
			System.out.println("invalid maths marks");
		}

	}
	public void showResults(){
		int total = phy + che + mat;
		float per = total*100/450;

		if (phy==-1 || che==-1 || mat==-1){
			System.out.println("No result");
		}

		else{
		System.out.println("The total is: "+total);
		System.out.println("The percentage is: "+per+"%");
	}
	}
}

class School2{
	public static void main(String xyz[]){
		Results peter, james;
		peter= new Results();
		peter.physics(100000000);
		peter.chemistry(100);
		peter.math(90);
		peter.showResults();

		james= new Results();
		james.physics(110);
		james.chemistry(90);
		james.math(120);
		james.showResults();

	}
}