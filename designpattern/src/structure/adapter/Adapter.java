/**  
 * All rights Reserved, Designed By Suixingpay.
 * @author: zhangjin[zhang_jin@suixingpay.com] 
 * @date: 2017年7月11日 下午1:50:57   
 * @Copyright ©2017 Suixingpay. All rights reserved. 
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package structure.adapter;

/**
 * TODO
 * 
 * @author: zhangjin[zhang_jin@suixingpay.com]
 * @date: 2017年7月11日 下午1:50:57
 * @version: V1.0
 * @review: zhangjin[zhang_jin@suixingpay.com]/2017年7月11日 下午1:50:57
 */
public class Adapter extends Source implements Targetable {

    /**
     * TODO
     * 
     * @see structure.adapter.Targetable#method2()
     */
    @Override
    public void method2() {
        System.out.println("this is the targetbal method");
    }

}
