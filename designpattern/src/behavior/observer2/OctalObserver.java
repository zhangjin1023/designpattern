/**  
 * All rights Reserved, Designed By Suixingpay.
 * @author: zhangjin
 * @date: 2017年7月20日 下午3:04:02   
 * @Copyright ©2017 Suixingpay. All rights reserved. 
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package behavior.observer2;

/**
 * TODO
 * 
 * @author: zhangjin
 * @date: 2017年7月20日 下午3:04:02
 * @version: V1.0
 * @review: zhangjin/2017年7月20日 下午3:04:02
 */
public class OctalObserver extends Observer {

    /**
     * TODO
     */
    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    /**
     * TODO
     * 
     * @see behavior.observer2.Observer#update()
     */
    @Override
    public void update() {
        System.out.println("Octal String: " + Integer.toOctalString(subject.getState()));
    }

}
