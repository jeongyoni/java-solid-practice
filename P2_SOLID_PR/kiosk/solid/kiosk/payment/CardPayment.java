package solid.kiosk.payment;

public class CardPayment implements PaymentService {

    @Override
    public void pay(int totalPrice){
        System.out.println("카드결제] 처리중 " +totalPrice + "원");
    }
}
