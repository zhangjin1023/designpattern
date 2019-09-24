/**  
 * All rights Reserved, Designed By Suixingpay.
 * @author: zhangjin
 * @date: 2017年7月11日 下午3:35:08   
 * @Copyright ©2017 Suixingpay. All rights reserved. 
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package structure.adapter;

/**  
 * TODO
 * @author: zhangjin
 * @date: 2017年7月11日 下午3:35:08
 * @version: V1.0
 */
public class AdapterTest {
    public static void main(String[] args) {
        Targetable target = new Adapter();
        target.method1();
        target.method2();
    }

}
