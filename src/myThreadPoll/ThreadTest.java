package myThreadPoll;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadTest {
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			Queue.linkedBlockingQueue.add(i);
		}
		// 构造线程池
		ThreadPoolExecutor threadPool = new ThreadPoolExecutor(15, 15, 0L,
				TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(10));
		for (int i = 0; i < 15; i++) {
			threadPool.execute(new ThreadPoll("task" + i));
		}
		threadPool.shutdown();

	}

}
