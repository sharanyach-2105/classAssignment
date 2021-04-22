package abstractex;

public class TestCard {
	public static void main(String[] args) {
		TravelCard tc=new TravelCard();
		tc.setAvailableBalance(10000);
		tc.setSwipeLimit(4);
		tc.setCardNo(8686021);
		tc.rechargecard(5000);
		tc.swipeCard(4000);
		System.out.print(tc.toString());
	}

}