package Practice;
class Account{
	String accountNumber;
	int balance;
	
	Account(String accountNumber, int balance){
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public String toString() {
		return "￥￥" + this.balance + "（口座番号：" + this.accountNumber + "）";
	}
}

public class test4 {

	public static void main(String[] args) {
		Account a = new Account("4649", 1592);
		System.out.println(a);
	}

}
