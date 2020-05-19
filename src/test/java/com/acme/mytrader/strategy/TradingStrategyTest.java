package com.acme.mytrader.strategy;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.junit.Test;

public class TradingStrategyTest{
    @Test
    public void testNothing() {
 
    }

	@Test
	public void testThread(){
	    final ExecutorService executorService = Executors.newSingleThreadExecutor();
	    executorService.execute((Runnable) new TradingStrategy());
	    System.out.println("started the job");
	}
}
