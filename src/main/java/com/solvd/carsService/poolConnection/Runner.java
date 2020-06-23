package com.solvd.carsService.poolConnection;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;



public class Runner 
{	
	
    public static void main( String[] args )
    {
    	ConnectionPool connectionPool = ConnectionPool.getInstance(10);
    	ExecutorService threadPool = Executors.newFixedThreadPool(20);
        for(int i = 0; i < 20; i++) {
        	ConnectionTask task = ConnectionTask.getInstance(connectionPool);// 
        	threadPool.execute(task);
        }
    }
}
