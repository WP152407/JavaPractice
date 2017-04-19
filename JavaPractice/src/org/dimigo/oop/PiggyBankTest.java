package org.dimigo.oop;

public class PiggyBankTest {

	public static void main(String[] args) {
		FamilyMember Fa=new FamilyMember("아빠");
		FamilyMember Ma=new FamilyMember("엄마");
		FamilyMember Me=new FamilyMember("나");
		FamilyMember Br=new FamilyMember("남동생");
		
		FamilyMember.printMemberCnt();
		PiggyBank.putMoney(Fa, 10000);
		PiggyBank.putMoney(Ma, 5000);
		PiggyBank.putMoney(Me, 2000);
		PiggyBank.putMoney(Br, 1000);
		
		PiggyBank.printBalance();
		PiggyBank.putMoney(Me, 1000);
		PiggyBank.printBalance();
	}

}
