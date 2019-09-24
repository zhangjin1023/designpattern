package create.singleton;
/**
 * 线程安全的懒加载方式的单例
 * @author zhang_jin
 *
 */
public class LazyLoadSingletone {
	private static LazyLoadSingletone instance;

	private LazyLoadSingletone() {
	}

	public static synchronized LazyLoadSingletone getInstance() {
		if (instance == null) {
			instance = new LazyLoadSingletone();
		}
		return instance;
	}

}
