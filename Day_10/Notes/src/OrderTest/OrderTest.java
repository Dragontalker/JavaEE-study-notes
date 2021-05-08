package OrderTest;

import com.dragontalker.Order;

public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order();
        //order.orderDefault = 1; 除了Order所属的包之后, 私有的结构, 缺省的都不可调用
        order.orderPublic = 2;
        //order.orderPrivate = 3; 出了Order类之后, 私有的结构就不可调用了

        order.methodPublic();
        //order.methodDefault();
        //order.methodPrivate();
    }
}
