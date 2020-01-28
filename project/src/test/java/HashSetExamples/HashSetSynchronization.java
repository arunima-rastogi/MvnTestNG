package HashSetExamples;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class HashSetSynchronization implements Runnable {
	private Set<String> numSet;

	public HashSetSynchronization(Set<String> numSet){
        this.numSet = numSet;
    }

	public static void main(String[] args) {
		// Synchronized Set
		Set<String> numSet = Collections.synchronizedSet(new HashSet<String>());
		/// 4 threads
		Thread t1 = new Thread(new HashSetSynchronization(numSet));
		Thread t2 = new Thread(new HashSetSynchronization(numSet));
		Thread t3 = new Thread(new HashSetSynchronization(numSet));
		Thread t4 = new Thread(new HashSetSynchronization(numSet));

		t1.start();
		t2.start();
		t3.start();
		t4.start();

		try {
			t1.join();
			t2.join();
			t3.join();
			t4.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Size of Set is " + numSet.size());
	}

	@Override
	public void run() {
		System.out.println("in run method" + Thread.currentThread().getName());
		String str = Thread.currentThread().getName();
		for (int i = 0; i < 5; i++) {
			// adding thread name to make element unique
			numSet.add(i + str);
			try {
				// delay to verify thread interference
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}