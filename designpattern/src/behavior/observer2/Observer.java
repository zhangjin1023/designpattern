/**  
 * All rights Reserved, Designed By Suixingpay.
 * @author: zhangjin[zhang_jin@suixingpay.com] 
 * @date: 2017年7月20日 下午2:38:25   
 * @Copyright ©2017 Suixingpay. All rights reserved. 
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package behavior.observer2;

/**  
 * TODO
 * @author: zhangjin[zhang_jin@suixingpay.com]
 * @date: 2017年7月20日 下午2:38:25
 * @version: V1.0
 * @review: zhangjin[zhang_jin@suixingpay.com]/2017年7月20日 下午2:38:25
 */
public abstract class Observer {
    protected Subject subject;
    
    public abstract void update();

}
