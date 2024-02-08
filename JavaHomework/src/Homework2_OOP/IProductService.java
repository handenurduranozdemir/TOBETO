package Homework2_OOP;

import java.math.BigDecimal;

//import Homework2_OOP.Program.Customer;
//import Homework2_OOP.Program.Product;

public interface IProductService {

	void Sell(Product product, Customer c);
}



class CurrencyRate {
    private double price;
    private int currency;

    public CurrencyRate(int currency, double price) {
        this.currency = currency;
        this.price = price;
    }

    public CurrencyRate(float price2, int price3) {
		// TODO Auto-generated constructor stub
	}

	public double getPrice() {
        return price;
    }

    public int getCurrency() {
        return currency;
    }
}
