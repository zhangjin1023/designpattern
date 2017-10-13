/**  
 * All rights Reserved, Designed By Suixingpay.
 * @author: zhangjin[zhang_jin@suixingpay.com] 
 * @date: 2017年7月20日 下午2:16:00   
 * @Copyright ©2017 Suixingpay. All rights reserved. 
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package behavior.observer;

/**
 * 主题角色（被观察的）
 * 
 * @author: zhangjin[zhang_jin@suixingpay.com]
 * @date: 2017年7月20日 下午2:16:00
 * @version: V1.0
 * @review: zhangjin[zhang_jin@suixingpay.com]/2017年7月20日 下午2:16:00
 */
public interface Watched {
    void addWatcher(Watcher watcher);

    void removeWatcher(Watcher watcher);

    void notifyWatchers(String str);

}
