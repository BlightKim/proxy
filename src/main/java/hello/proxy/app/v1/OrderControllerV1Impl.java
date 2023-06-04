package hello.proxy.app.v1;

public class OrderControllerV1Impl implements OrderController{
    private final OrderServiceV1 orderServiceV1;

    public OrderControllerV1Impl(OrderServiceV1 orderServiceV1) {
        this.orderServiceV1 = orderServiceV1;
    }

    @Override
    public String request(String itemId) {
        orderServiceV1.orderItem(itemId);
        return "수진아 사랑해";
    }

    @Override
    public String noLog() {
        return "ok";
    }
}
