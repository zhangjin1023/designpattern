/**  
 * All rights Reserved, Designed By Suixingpay.
 * @author: zhangjin[zhang_jin@suixingpay.com] 
 * @date: 2017年7月26日 上午10:13:31   
 * @Copyright ©2017 Suixingpay. All rights reserved. 
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package create.singleton;

import java.text.NumberFormat;
import java.util.Collections;
import java.util.concurrent.ThreadPoolExecutor;

/**  
 * jdk中的单例模式实例
 * @author: zhangjin[zhang_jin@suixingpay.com]
 * @date: 2017年7月26日 上午10:13:31
 * @version: V1.0
 * @review: zhangjin[zhang_jin@suixingpay.com]/2017年7月26日 上午10:13:31
 */
public class SingletonJDK {
    public static void main(String[] args) {
        //1.Runtime
        Runtime.getRuntime();
        
        //2.NumberFomart
        NumberFormat.getInstance();
        
        StringBuilder sb = new StringBuilder();
        sb.append(2);
        sb.append(562L);
        sb.insert(1, 1);
        System.out.println(sb.toString());
        
    }
    
    
    

}
