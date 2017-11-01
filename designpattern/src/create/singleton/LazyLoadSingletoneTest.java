package create.singleton;
/**
 * 线程安全的懒加载方式的单例
 * @author zhang_jin[zhang_jin@suixingpay.com]
 *
 */
public class LazyLoadSingletoneTest {
	public static void main(String[] args) {
		LazyLoadSingletone instance1 = LazyLoadSingletone.getInstance();
		LazyLoadSingletone instance2 = LazyLoadSingletone.getInstance();
		System.out.println(instance1 == instance2); 
	}

}
