/**  
 * All rights Reserved, Designed By Suixingpay.
 * @author: zhangjin[zhang_jin@suixingpay.com] 
 * @date: 2017年7月10日 下午2:36:30   
 * @Copyright ©2017 Suixingpay. All rights reserved. 
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package create.factory.abstractfactory;

import create.factory.MyClassOne;
import create.factory.MyInterface;

/**  
 * TODO
 * @author: zhangjin[zhang_jin@suixingpay.com]
 * @date: 2017年7月10日 下午2:36:30
 * @version: V1.0
 * @review: zhangjin[zhang_jin@suixingpay.com]/2017年7月10日 下午2:36:30
 */
public class MyFactoryOne implements Provider{

    /**      
     * TODO 
     * @return
     * @see create.factory.abstractfactory.Provider#produce()
     */ 
    @Override
    public MyInterface produce() {
        return new MyClassOne();
    }
    
}
