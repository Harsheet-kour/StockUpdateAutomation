package com.acme.mytrader.price;

import com.acme.mytrader.execution.ExecutionService;
import com.acme.mytrader.execution.ExecutionServiceImpl;

public class PriceListenerImpl implements PriceListener {

	ExecutionService executionService;
	
	@Override
	public void priceUpdate(String security, double price) {
		double basePrice = 55.0;
		String dummySecurity = "IBM";
		
		if(dummySecurity.equalsIgnoreCase(security)) {
			executionService = new ExecutionServiceImpl();
		if(price>basePrice) {
			executionService.sell(security, price, 100);
		}else {
			executionService.buy(security, price, 100);
		}
		}
	}

}
