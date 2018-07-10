package COALANDCHashMap;

import java.util.Iterator;
import java.util.concurrent.ConcurrentMap;

public class TraverseElement implements Runnable {
	private ConcurrentMap<String, Long> dataMap;

	public TraverseElement(ConcurrentMap<String, Long> dataMap) {
		this.dataMap = dataMap;
	}

	public void run() {
		Iterator<String> iterator = dataMap.keySet().iterator();
		while (iterator.hasNext()) {
			String cname = iterator.next();
			System.out.println(cname + "  has population of " + dataMap.get(cname));
			try {
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
