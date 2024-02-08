package Homework2_OOP;

import java.math.BigDecimal;

//import Homework2_OOP.Program.Customer;
//import Homework2_OOP.Program.Product;

public abstract class ProductManager implements IProductService {

	private float convertRate;
	private IBankService _bankService;

	public ProductManager(IBankService bankService)
	{
		_bankService=bankService;
	}	
	public ProductManager(FakeBankService fakeBankService) {
	
	}


	
	public void Sell(float product, Customer customer)
	{
		float price = Product.Price;
		/*if(customer.isStudent)
		{
			price = Product.Price * ((float)0.90));
		}
		
		if(customer.isOfficer)
		{
			price = Product.Price.multiply(BigDecimal.valueOf(0.80));
		}*/
		
		price=customer.GetPrice(price);
		
	    price= ((IBankService) _bankService).ConvertRate(new CurrencyRate(price,1));
	    
	    System.out.printf("ürün adı:%s, ürün fiyat:%f",product.getName(),price);
		
		CentralBankService centralBankService = new CentralBankService();
		price = _bankService.ConvertRate(new CurrencyRate(price,1));
	}
	

		
	}

}