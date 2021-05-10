import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Entities.Customer;
import Concrete.CustomerCheckManager;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Customer customer = new Customer(1,"burak","genc",1999,1,22,"23104176999");
		//System.out.println(customer.getFirstName());
	
		BaseCustomerManager a = new StarbucksCustomerManager(new MernisServiceAdapter());
		a.Save(customer);
	}
}
