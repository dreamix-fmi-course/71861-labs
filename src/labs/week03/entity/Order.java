package labs.week03.entity;

import labs.week03.vo.OrderStatus;

import java.util.List;

public class Order {
    int id;
    OrderStatus status;
    List<OrderLine> orderLines;
    String creationDate;

}
