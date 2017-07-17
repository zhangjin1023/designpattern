/**  
 * All rights Reserved, Designed By Suixingpay.
 * @author: zhangjin[zhang_jin@suixingpay.com] 
 * @date: 2017年7月17日 下午3:44:13   
 * @Copyright ©2017 Suixingpay. All rights reserved. 
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package behavior.iterator;

/**  
 * TODO
 * @author: zhangjin[zhang_jin@suixingpay.com]
 * @date: 2017年7月17日 下午3:44:13
 * @version: V1.0
 * @review: zhangjin[zhang_jin@suixingpay.com]/2017年7月17日 下午3:44:13
 */
public class IteratorDemo {

    /**   
     * TODO
     * @param args 
     */
    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();
        
        Iterator it = namesRepository.getIterator();
        while (it.hasNext()) {
            String name = (String) it.next();
            System.out.println(name);
            
        }
        

    }

}
