/**  
 * All rights Reserved, Designed By Suixingpay.
 * @author: zhangjin
 * @date: 2017年6月26日 下午1:31:24   
 * @Copyright ©2017 Suixingpay. All rights reserved. 
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package dynamicproxy;

/**  
 * 具体类A
 * @author: zhangjin
 * @date: 2017年6月26日 下午1:31:24
 * @version: V1.0
 */
public class ClassA implements DynInterface{

    @Override
    public void show() {
        System.out.println("我是类A");
    }

}
