package polymorphism;

public enum OrderStatusEnum {
  Completed,
  Shipped,
  Submitted,
  Paid;

  public int getValue() {
    switch (this) {
      case Completed:
        return 100;
      case Shipped:
        return 200;
      case Submitted:
        return 300;
      case Paid:
        return 400;
      default:
        return 0;
    }
  }

}
