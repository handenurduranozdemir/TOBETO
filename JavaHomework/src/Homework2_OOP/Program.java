package Homework2_OOP;

import java.math.BigDecimal;

public class Program {
	public static void main(String[] args)
	{
		IProductService productService = new ProductManager(new FakeBankService());
		productService.Sell(new Product(1, "engin", 1000, true, false), new Customer(1, "engin", 1000, true, false));
	}
}

class Customer implements IEntity {
	public int id;
	public String name;
	public float price;
	public boolean isStudent;
	public boolean isOfficer;
	
	//constructor
	public Customer() {
		
	}
	
	//constructor with parameter
	public Customer(int id, String name, float i, boolean isStudent, boolean isOfficer) {
		super();
		this.id = id;
		this.name = name;
		this.price = i;
		this.isStudent = isStudent;
		this.isOfficer = isOfficer;
	}



	//getters and setters
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name  = name;
	}
	
	public float getPrice() {
		return price;
	}
	
	public void setPrice(float price) {
		this.price = price;
	}
	public boolean getStudent() {
		return isStudent;
	}
	
	public void setStudent(boolean isStudent) {
		this.isStudent  = isStudent;
	}
	
	public boolean getOfficer() {
		return isOfficer;
	}
	
	public void setOfficer(boolean isOfficer) {
		this.isOfficer  = isOfficer;
	}

	public float GetPrice(float price2) {
		// TODO Auto-generated method stub
		return 0;
	}
	}
	

class Product {

	public Product(int i, String string, int j, boolean b, boolean c) {
		// TODO Auto-generated constructor stub
	}

	public static final float Price = (Float) null;
	
}

class CentralBankServiceAdapter implements IBankService
{
	public float ConvertRate(CurrencyRate currencyRate) {
		CentralBankService centralBankService = new CentralBankService();
		return centralBankService.convertCurrency(currencyRate);
		
	}
}

class CentralBankService {
	public float convertCurrency(CurrencyRate currencyRate) {
        return (float) (currencyRate.getPrice() / 37.5);
    }
	
	
}
