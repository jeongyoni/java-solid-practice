package solid.kiosk;

import solid.kiosk.model.Order;
import solid.kiosk.payment.CardPayment;
import solid.kiosk.payment.PaymentService;


public class BubbleTeaApp {

	public static void main(String args[]) {
		
		// 주문: 메뉴 선택 -> 결제 -> 주문 내용 저장 -> 영수증 출력 
		Order order = new Order();
		
	    order.addItem("타로 밀크티","L",5000);
		order.addItem("타로 밀크티","J",5700);
	    order.addItem("우롱 밀크티","L",5300);
		order.addItem("우롱 밀크티","J",6000);
	    order.addItem("초코 밀크티", "L" ,6000);
		order.addItem("초코 밀크티", "J" ,6700);
		order.addTopping("펄(타피오카)", 500);
		order.addTopping("밀크폼", 500);
	
//	    order.processPayment("CARD"); 	// 결제
//	    order.saveToDatabase();       	// 저장
//	    order.printReceipt();           // 출력

		PaymentService payment =new CardPayment();

	}
}
