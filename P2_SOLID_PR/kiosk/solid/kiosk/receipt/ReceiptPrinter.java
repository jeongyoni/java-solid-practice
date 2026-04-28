package solid.kiosk.receipt;

import solid.kiosk.model.Order;

public class ReceiptPrinter {

    public void print(Order order) {
        System.out.println("==============================");
        System.out.println("        윤차 영수증         ");
        System.out.println("==============================");

        System.out.println("[주문메뉴]");
        for (String item : order.getItems()) {
            System.out.println("  " + item);
        }

        if (!order.getToppings().isEmpty()) {
            System.out.println("[토핑]");
            for (String topping : order.getToppings()) {
                System.out.println("  " + topping);
            }
        }

        System.out.println("------------------------------");
        System.out.println("합계: " + order.getTotalPrice() + "원");
        System.out.println("==============================");

    }
}