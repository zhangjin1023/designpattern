package create.singleton;
/**
 * 双重校验锁,jdk1.5及以上版本有效。
 * @author zhang_jin[zhang_jin@suixingpay.com]
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
