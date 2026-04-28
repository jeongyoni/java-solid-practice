package solid.kiosk.payment;

public class CashPayment implements PaymentService {

    @Override
    public void pay(int totalPrice){
        System.out.println("[현금 결제] 처리중 " +totalPrice + "원");
    }
}

