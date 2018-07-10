package COALANDCHashMap;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ConcurrentHashMapExample {
	public static void main(String args[]) {
		ConcurrentMap<String, Long> cm = createDataMap();
		DeleteElement del = new DeleteElement(cm, "tibco");
		TraverseElement tra = new TraverseElement(cm);
		Thread traverse = new Thread(tra);
		Thread delete = new Thread(del);
		traverse.start();
		delete.start();
	}

	private static ConcurrentMap<String, Long> createDataMap() {
		ConcurrentMap<String, Long> dataMap = new ConcurrentHashMap<String, Long>();
		dataMap.putIfAbsent("NYC", new Long(20000789));
		dataMap.putIfAbsent("tibco", new Long(2256789));
		dataMap.putIfAbsent("NJ", new Long(200254889));
		dataMap.putIfAbsent("Texas", new Long(20845789));
		dataMap.putIfAbsent("NC", new Long(2562789));
		dataMap.putIfAbsent("Nebraska", new Long(2895789));
		dataMap.putIfAbsent("ohio", new Long(2634789));
		dataMap.putIfAbsent("Virgina", new Long(2857789));
		return dataMap;
	}
}
