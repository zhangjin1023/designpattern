/**  
 * All rights Reserved, Designed By Suixingpay.
 * @author: zhangjin[zhang_jin@suixingpay.com] 
 * @date: 2017年7月20日 下午2:19:45   
 * @Copyright ©2017 Suixingpay. All rights reserved. 
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package behavior.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体的主题角色
 * 
 * @author: zhangjin[zhang_jin@suixingpay.com]
 * @date: 2017年7月20日 下午2:19:45
 * @version: V1.0
 * @review: zhangjin[zhang_jin@suixingpay.com]/2017年7月20日 下午2:19:45
 */
public class ConcreteWatched implements Watched {

    // 存放观察者
    private List<Watcher> watchers = new ArrayList<>();

    /**
     * TODO
     * 
     * @param watcher
     * @see behavior.observer.Watched#addWatcher(behavior.observer.Watcher)
     */
    @Override
    public void addWatcher(Watcher watcher) {
        watchers.add(watcher);
    }

    /**
     * TODO
     * 
     * @param watcher
     * @see behavior.observer.Watched#removeWatcher(behavior.observer.Watcher)
     */
    @Override
    public void removeWatcher(Watcher watcher) {
        watchers.remove(watcher);
    }

    /**
     * TODO
     * 
     * @param str
     * @see behavior.observer.Watched#notifyWatchers(java.lang.String)
     */
    @Override
    public void notifyWatchers(String str) {
        for (Watcher watcher : watchers) {
            watcher.update(str);
        }

    }

}
