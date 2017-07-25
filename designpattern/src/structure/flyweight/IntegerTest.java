/**  
 * All rights Reserved, Designed By Suixingpay.
 * @author: zhangjin[zhang_jin@suixingpay.com] 
 * @date: 2017年7月25日 下午4:39:18   
 * @Copyright ©2017 Suixingpay. All rights reserved. 
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package structure.flyweight;

/**  
 * jdk中享元模式的实例：Integer.valueOf()方法，缓存
 * @author: zhangjin[zhang_jin@suixingpay.com]
 * @date: 2017年7月25日 下午4:39:18
 * @version: V1.0
 * @review: zhangjin[zhang_jin@suixingpay.com]/2017年7月25日 下午4:39:18
 */
public class IntegerTest {
    public static void main(String[] args) {
        Integer it1 =  Integer.valueOf(22);
        Integer it2 = Integer.valueOf(22);
        System.out.println(it1 == it2);
        
        Integer it3 =  Integer.valueOf(128);
        Integer it4 = Integer.valueOf(128);
        System.out.println(it3 == it4);
        
    }

}
