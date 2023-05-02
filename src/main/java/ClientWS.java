import proxy.BanqueService;
import proxy.BanqueWS;

public class ClientWS
{
    public static void main(String[] args) {
        BanqueService stub= new BanqueWS().getBanqueServicePort();
        System.out.println(stub.convert(3500 ));
        System.out.println();
    }
}
