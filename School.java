class Results{
	int phy,che,mat;

	public void ShowResults(){
		int Total;
		Total=phy+che+mat;
		System.out.println("Total score"+Total);
		if(Total>300){
			System.out.println("Passed");
		}
		else {
			System.out.println("Failed");
		}
	}
}

class School{
	public static void main(String xyz[]){
		Results Peter, James;
		Peter = new Results();
		James = new Results();

		Peter.mat=50;
		Peter.che=100;
		Peter.phy=100;

		James.phy=50;
		James.che=40;
		James.mat=60;

		Peter.ShowResults();
		James.ShowResults();
	}
}