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
			 System.out.println(a+"��������"+name+"ʹ�õ��̳߳أ��߳����ƣ�" + Thread.currentThread().getName());
			 a=Queue.linkedBlockingQueue.poll();
		}
	}

}
