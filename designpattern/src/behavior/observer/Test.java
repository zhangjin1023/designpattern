/**  
 * All rights Reserved, Designed By Suixingpay.
 * @author: zhangjin[zhang_jin@suixingpay.com] 
 * @date: 2017年7月20日 下午3:20:04   
 * @Copyright ©2017 Suixingpay. All rights reserved. 
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package behavior.observer;

/**
 * TODO
 * 
 * @author: zhangjin[zhang_jin@suixingpay.com]
 * @date: 2017年7月20日 下午3:20:04
 * @version: V1.0
 * @review: zhangjin[zhang_jin@suixingpay.com]/2017年7月20日 下午3:20:04
 */
public class Test {

    /**
     * TODO
     * 
     * @param args
     */
    public static void main(String[] args) {
        Watched girl = new ConcreteWatched();

        Watcher watcher1 = new ConcreteWatcher();
        Watcher watcher2 = new ConcreteWatcher();
        Watcher watcher3 = new ConcreteWatcher();
        
        girl.addWatcher(watcher1);
        girl.addWatcher(watcher2);
        girl.addWatcher(watcher3);
        
        girl.notifyWatchers("开心");

    }

}
