/**  
 * All rights Reserved, Designed By Suixingpay.
 * @author: zhangjin[zhang_jin@suixingpay.com] 
 * @date: 2017年7月6日 下午3:22:18   
 * @Copyright ©2017 Suixingpay. All rights reserved. 
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package create.factory.simplefactory;

import create.factory.MyClassOne;
import create.factory.MyClassTwo;
import create.factory.MyInterface;

/**
 * TODO
 * 
 * @author: zhangjin[zhang_jin@suixingpay.com]
 * @date: 2017年7月6日 下午3:22:18
 * @version: V1.0
 * @review: zhangjin[zhang_jin@suixingpay.com]/2017年7月6日 下午3:22:18
 */
public class MyFactory {

    public MyInterface produce(String type) {
        if ("one".equals(type)) {
            return new MyClassOne();
        }
        if ("two".equals(type)) {
            return new MyClassTwo();
        }
        throw new IllegalArgumentException("没有对应的类型");
    }

}
