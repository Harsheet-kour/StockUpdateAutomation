package com.acme.mytrader.price;

public class PriceSourceImpl implements PriceSource {

	@Override
	public void addPriceListener(PriceListener listener) {
		listener = new PriceListenerImpl();
		listener.priceUpdate("IBM", 90);
	}

	@Override
	public void removePriceListener(PriceListener listener) {
		listener =null;
	}

}
