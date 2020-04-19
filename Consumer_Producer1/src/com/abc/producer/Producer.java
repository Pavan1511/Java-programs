package com.abc.producer;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.BlockingQueue;


public class Producer implements Runnable {
	protected BlockingQueue<String>BlockingQueue;
	final Random random=new Random();
	public Producer(BlockingQueue<String>BlockingQueue) {
		this.BlockingQueue=BlockingQueue;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			//generate random uuid and convert it to string
			String data=UUID.randomUUID().toString();
			System.out.println("put:"+data);
			//put the uuid in the priority Blocking Queue
			BlockingQueue.put(data);
			Thread.sleep(5000);
		}
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

