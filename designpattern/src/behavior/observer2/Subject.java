/**  
 * All rights Reserved, Designed By Suixingpay.
 * @author: zhangjin
 * @date: 2017年7月20日 下午2:35:57   
 * @Copyright ©2017 Suixingpay. All rights reserved. 
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package behavior.observer2;

import java.util.ArrayList;
import java.util.List;

/**  
 * TODO
 * @author: zhangjin
 * @date: 2017年7月20日 下午2:35:57
 * @version: V1.0
 * @review: zhangjin/2017年7月20日 下午2:35:57
 */
public class Subject {
    private List<Observer> observers = new ArrayList<>();
    
    private int state;

    /**
     * @return the state
     */
    public int getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(int state) {
        this.state = state;
        notifyAllObservers();//主题对象的状态改变的时候，“自动”通知所有观察者对象
    }
    
    public void attach(Observer observer){
        observers.add(observer);
    }
    
    public void notifyAllObservers(){
        for(Observer observer: observers){
            observer.update();
        }
    }

}
