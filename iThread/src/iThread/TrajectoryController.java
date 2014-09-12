package iThread;

public class TrajectoryController implements Runnable {

	Thread thrd;
	public void init(){
		thrd = new Thread(this);
		thrd.setPriority(10);
		thrd.run();
	}

	@Override
	public void run() {
		while(true){
			try {
				computeTrajecotry();
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	private void computeTrajecotry() {
		//computes trajectory
	}
}
