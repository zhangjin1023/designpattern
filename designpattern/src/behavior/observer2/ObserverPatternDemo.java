/**  
 * All rights Reserved, Designed By Suixingpay.
 * @author: zhangjin
 * @date: 2017年7月20日 下午3:05:50   
 * @Copyright ©2017 Suixingpay. All rights reserved. 
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package behavior.observer2;

/**  
 * TODO
 * @author: zhangjin
 * @date: 2017年7月20日 下午3:05:50
 * @version: V1.0
 * @review: zhangjin/2017年7月20日 下午3:05:50
 */
public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();
        
        new BinaryObserver(subject);
        new OctalObserver(subject);
        new HexaObserver(subject);
        
        System.out.println("First state change: 15");   
        subject.setState(15);
        System.out.println("Second state change: 10");    
        subject.setState(10);
    }

}
