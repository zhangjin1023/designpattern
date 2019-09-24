/**  
 * All rights Reserved, Designed By Suixingpay.
 * @author: zhangjin
 * @date: 2017年7月20日 下午2:18:36   
 * @Copyright ©2017 Suixingpay. All rights reserved. 
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package behavior.observer;

/**
 * 具体的观察者角色
 * 
 * @author: zhangjin
 * @date: 2017年7月20日 下午2:18:36
 * @version: V1.0
 * @review: zhangjin/2017年7月20日 下午2:18:36
 */
public class ConcreteWatcher implements Watcher {

    /**
     * TODO
     * 
     * @param str
     * @see behavior.observer.Watcher#update(java.lang.String)
     */
    @Override
    public void update(String str) {
        System.out.println(str);

    }

}
