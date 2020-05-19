package com.acme.mytrader.strategy;

import com.acme.mytrader.price.PriceListener;
import com.acme.mytrader.price.PriceSource;
import com.acme.mytrader.price.PriceSourceImpl;
import java.util.concurrent.*;

/**
 * <pre>
 * User Story: As a trader I want to be able to monitor stock prices such
 * that when they breach a trigger level orders can be executed automatically
 * </pre>
 */

public class TradingStrategy {
	
	PriceSource priceSource;
	PriceListener listener;
	
	Runnable priceSourceRunnable = new Runnable() {
	    public void run() {
	    	priceSource = new PriceSourceImpl();
	    	priceSource.addPriceListener(listener);
	    	priceSource.removePriceListener(listener);
	    }
	};
	
	ScheduledExecutorService exec = Executors.newScheduledThreadPool(1);
	exec.scheduleAtFixedRate(priceSourceRunnable, 0, 1,TimeUnit.SECONDS);
	
	
	
}
