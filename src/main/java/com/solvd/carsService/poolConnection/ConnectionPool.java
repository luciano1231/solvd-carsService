package com.solvd.carsService.poolConnection;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class ConnectionPool {

	private BlockingQueue<Connection> connectionsQueue;
	private static ConnectionPool cnP;
	private AtomicInteger cnCount = new AtomicInteger(0);
	private int cnSize;

	private ConnectionPool(int size) {
		connectionsQueue = new LinkedBlockingQueue<Connection>(size);
		cnSize = size;
	}

	public static ConnectionPool getInstance(int size) {

		if (cnP == null) {
			synchronized (ConnectionPool.class) {
				if (cnP == null) {

					cnP = new ConnectionPool(size);
				}
			}
		}
		return cnP;

	}

	public Connection get() {
		Connection connection = null;

		try {
			synchronized (ConnectionPool.class) {
				if (cnCount.get() < cnSize && connectionsQueue.peek() == null) {

					
					connectionsQueue.add(ConnectionImp.getInstance());
					cnCount.incrementAndGet();
					System.out.println(cnCount.get());	
					connection = connectionsQueue.take();
					return connection;
					
				}
			}
			connection = connectionsQueue.take();
		} catch (InterruptedException ie) {
			Thread.currentThread().interrupt();

		}

		return connection;
	}

	public void ReleaseConnection(Connection releasedConnection) {
		try {
			connectionsQueue.put(releasedConnection);
		} catch (InterruptedException ie) {
			Thread.currentThread().interrupt();
		}
	}

}
