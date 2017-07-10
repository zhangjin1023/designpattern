/**  
 * All rights Reserved, Designed By Suixingpay.
 * @author: zhangjin[zhang_jin@suixingpay.com] 
 * @date: 2017年7月6日 下午3:26:13   
 * @Copyright ©2017 Suixingpay. All rights reserved. 
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package create.factory.simplefactory;

import create.factory.MyInterface;

/**  
 * TODO
 * @author: zhangjin[zhang_jin@suixingpay.com]
 * @date: 2017年7月6日 下午3:26:13
 * @version: V1.0
 * @review: zhangjin[zhang_jin@suixingpay.com]/2017年7月6日 下午3:26:13
 */
public class MyFactoryTest {

    public static void main(String[] args) {
        MyFactory factory = new MyFactory();
        
//        MyInterface one = factory.produce("one");
//        one.print();
        
//        MyInterface two = factory.produce("two");
//        two.print();
        
        MyInterface error = factory.produce("error");
        error.print();
        
    }
}
