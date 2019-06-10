class Bank{
	private int amount;

	public void deposit(int money){
		amount += money;
	}

	public void withdraw(int money){
		if (money<amount){
			amount-=money;
		}

		else{
			System.out.println("Not enough funds");
		}
	}

	public void balance(){
		System.out.println("Your balance is: "+amount);
	}

	public Bank(){
		System.out.println("Hello my friends");
	}
}

class Nbs{
	public static void main (String xyz[]){
		Bank ref;
		ref = new Bank();
	}
}