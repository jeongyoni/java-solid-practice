package solid.kiosk.repository;

import solid.kiosk.model.Order;

public class OrderRepository {

    public void save(Order order){
        System.out.println("[DB 저장] 주문 정보 저장중 ");
        System.out.println("  - 메뉴 수  : " + order.getItems().size() + "개");
        System.out.println("  - 토핑 수  : " + order.getToppings().size() + "개");
        System.out.println("  - 총 금액  : " + order.getTotalPrice() + "원");
    }
}
