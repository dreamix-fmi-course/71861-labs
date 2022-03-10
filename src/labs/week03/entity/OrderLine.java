package labs.week03.entity;


import labs.week03.vo.OrderLineStatus;

/**
 * Create OrderLine which holds information for:
 * Item, enum for status, boolean specialOffer and count
 * Implement setters/getters/constructor
 */

public class OrderLine {
    Item item;
    OrderLineStatus status;
    boolean SpecialOffer;

    public OrderLine(Item item, OrderLineStatus status, boolean specialOffer) {
        this.item = item;
        this.status = status;
        SpecialOffer = specialOffer;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public OrderLineStatus getStatus() {
        return status;
    }

    public void setStatus(OrderLineStatus status) {
        this.status = status;
    }

    public boolean isSpecialOffer() {
        return SpecialOffer;
    }

    public void setSpecialOffer(boolean specialOffer) {
        SpecialOffer = specialOffer;
    }
}
