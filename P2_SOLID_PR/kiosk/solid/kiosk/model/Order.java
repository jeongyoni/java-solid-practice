package solid.kiosk.model;

import java.util.ArrayList;
import java.util.List;

public class Order {
	
	 private List<String> items = new ArrayList<>();//주문메뉴 목록//
	 private List<String> toppings =new ArrayList<>(); //토핑 목록 //
	 private int totalPrice = 0; //총 금액 //

	 // 메뉴추가( 메뉴명, 사이즈, 가격)//
	 public void addItem(String item,String size, int price) {
	     items.add("["+size+"]"+item+ "-"+price +"원");
	     totalPrice += price;
	 }
	 //토핑 추가//
	 public void addTopping(String toppingName, int price){
		 toppings.add("  +  " +toppingName + " - " +price + "원");
		 totalPrice += price;
	 }

	public List<String> getItems()    { return items; }
	public List<String> getToppings() { return toppings; }
	public int getTotalPrice()        { return totalPrice; }

	
	 // 결제 처리
	 public void processPayment(String paymentType) {
	     if (paymentType.equals("CARD")) {
	         System.out.println("카드 결제 처리 중... " + totalPrice + "원");
	         // 카드 결제 API 호출
	     } else if (paymentType.equals("CASH")) {
	         System.out.println("현금 결제 처리 중... " + totalPrice + "원");
	         // 현금 결제 처리
	     }
	 }
	
	 // DB 저장
	 public void saveToDatabase() {
	     System.out.println("주문 정보를 DB에 저장 중...");
	     // DB 연결 및 저장 로직
	 }
	 
	 // 영수증 출력
	 public void printReceipt() {
	     System.out.println("===== 영수증 =====");
	     for (String item : items) {
	         System.out.println("- " + item);
	     }
	     System.out.println("합계: " + totalPrice + "원");
	     System.out.println("=================");
	 }

}