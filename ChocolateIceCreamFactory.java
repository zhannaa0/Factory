package IceCreamFactory;

public class ChocolateIceCreamFactory implements IceCreamFactory {
    @Override
    public IceCream createIceCream() {
        return new ChocolateIceCream();
    }
}
