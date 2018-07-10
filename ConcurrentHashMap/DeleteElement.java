package COALANDCHashMap;

import java.util.Iterator;
import java.util.concurrent.ConcurrentMap;

public class DeleteElement implements Runnable {
	private ConcurrentMap<String, Long> dataMap;
	private String key;

	public DeleteElement(ConcurrentMap<String, Long> dataMap, String key) {
		this.dataMap = dataMap;
		this.key = key;
	}
	public void run() {
		Iterator<String> iterator = dataMap.keySet().iterator();
		while (iterator.hasNext()) {
			String next = iterator.next();
			if (next.equals(key)) {
				try {
					Thread.currentThread().sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				dataMap.remove(next);
				break;
			}
		}
	}
}
