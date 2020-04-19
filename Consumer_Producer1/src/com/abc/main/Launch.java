package com.abc.main;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

import com.abc.consumer.Consumer;
import com.abc.producer.Producer;

public class Launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final BlockingQueue<String> pbq =new PriorityBlockingQueue<String>();
		Producer p=new Producer(pbq);
		new Thread(p).start();
		Consumer c1=new Consumer(pbq);
		new Thread(c1).start();
		Consumer c2=new Consumer(pbq);
		new Thread(c2).start();

	}

}

