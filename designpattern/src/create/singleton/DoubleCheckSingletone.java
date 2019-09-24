package create.singleton;
/**
 * 双重校验锁,jdk1.6及以上版本有效。
 * @author zhang_jin
 *
 */
public class DoubleCheckSingletone {
	private static volatile DoubleCheckSingletone instance;
	private DoubleCheckSingletone(){
		
	}
	public static DoubleCheckSingletone getInstance(){
		DoubleCheckSingletone result = instance;
		if (result == null) {
			synchronized (DoubleCheckSingletone.class) {
				result = instance;
				if (result == null) {
					instance = result = new DoubleCheckSingletone();
				}
			}
		}
		return result;
	}

}
