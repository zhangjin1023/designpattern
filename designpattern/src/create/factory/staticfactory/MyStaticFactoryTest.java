/**  
 * All rights Reserved, Designed By Suixingpay.
 * @author: zhangjin[zhang_jin@suixingpay.com] 
 * @date: 2017年7月6日 下午3:46:59   
 * @Copyright ©2017 Suixingpay. All rights reserved. 
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package create.factory.staticfactory;

/**  
 * TODO
 * @author: zhangjin[zhang_jin@suixingpay.com]
 * @date: 2017年7月6日 下午3:46:59
 * @version: V1.0
 * @review: zhangjin[zhang_jin@suixingpay.com]/2017年7月6日 下午3:46:59
 */
public class MyStaticFactoryTest {
    
    public static void main(String[] args) {
        MyStaticFactory.produceOne().print();
        MyStaticFactory.produceTwo().print();
        
    }

}
