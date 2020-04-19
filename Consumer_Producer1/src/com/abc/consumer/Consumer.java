package com.abc.consumer;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
	protected BlockingQueue<String>BlockingQueue;
	public Consumer(BlockingQueue<String>BlockingQueue) {
		this.BlockingQueue=BlockingQueue;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			String data;
			try {
				data = BlockingQueue.take();
				System.out.println(Thread.currentThread().getName()+"Take():"+data);
				Thread.sleep(1000);
				} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}

	}

}
