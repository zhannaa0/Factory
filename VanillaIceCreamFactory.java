package IceCreamFactory;

public class VanillaIceCreamFactory implements IceCreamFactory {
    @Override
    public IceCream createIceCream() {
        return new VanillaIceCream();
    }
}
