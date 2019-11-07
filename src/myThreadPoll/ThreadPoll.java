package myThreadPoll;

public class ThreadPoll implements Runnable {
	private String name;

	ThreadPoll() {

	}

	ThreadPoll(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		Integer a=Queue.linkedBlockingQueue.poll();
		while (a!=null){
			 System.out.println(a+"任务名称"+name+"使用的线程池，线程名称：" + Thread.currentThread().getName());
			 a=Queue.linkedBlockingQueue.poll();
		}
	}

}
