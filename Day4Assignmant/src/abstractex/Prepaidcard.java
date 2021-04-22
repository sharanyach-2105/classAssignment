package abstractex;

public abstract class Prepaidcard {
	int CardNo;
	 double availableBalance;
	 double swipeLimit;
	 abstract boolean swipeCard(double amount);
  
   public void rechargecard(double amount) {
		availableBalance=availableBalance+amount;
		
	}
   
   public int getCardNo() {
		return CardNo;
	}

	public void setCardNo(int cardNo) {
		CardNo = cardNo;
	}

	public double getAvailableBalance() {
		return availableBalance;
	}

	public void setAvailableBalance(double availableBalance) {
		this.availableBalance = availableBalance;
	}

	public double getSwipeLimit() {
		return swipeLimit;
	}

	public void setSwipeLimit(double swipeLimit) {
		this.swipeLimit = swipeLimit;
	}

	public String toString() {
   	return "prepaidcard[cardno="+CardNo+",availableBalance="+availableBalance+",swipelimit="+swipeLimit+"]";
   	
   }
}
