/**
 * @author Stanislav Rakitov
 */
public class CarBuyer implements Runnable{

  private final CarDealer dealer;

  public CarBuyer(CarDealer dealer) {
    this.dealer = dealer;
  }

  @Override
  public void run() {
    System.out.printf("Покупатель %s пришел за автомобилем\n", Thread.currentThread().getName());
    dealer.sellCar();
  }
}
