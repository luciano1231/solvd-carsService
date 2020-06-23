package com.solvd.carsService.poolConnection;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ConnectionTask implements Runnable {

	private ConnectionPool connectionPool;
	private static final Logger LOG = LogManager.getLogger(ConnectionTask.class);

	private ConnectionTask(ConnectionPool connectionPool) {
		this.connectionPool = connectionPool;
	}

	static public ConnectionTask getInstance(ConnectionPool connectionPool) {
		return new ConnectionTask(connectionPool);
	}

	public void run() {
		try {
			Connection connection = connectionPool.get();
			connection.stablishConnection();
			connectionPool.ReleaseConnection(connection);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			LOG.error("something went wrong stablishing connection...");
		}
	}

}
