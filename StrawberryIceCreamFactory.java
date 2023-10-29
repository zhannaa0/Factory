package IceCreamFactory;

public class StrawberryIceCreamFactory implements IceCreamFactory {
    @Override
    public IceCream createIceCream() {
        return new StrawberryIceCream();
    }
}
