/**  
 * All rights Reserved, Designed By Suixingpay.
 * @author: zhangjin
 * @date: 2017年7月25日 下午3:58:21   
 * @Copyright ©2017 Suixingpay. All rights reserved. 
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package behavior.command;

/**  
 * TODO
 * @author: zhangjin
 * @date: 2017年7月25日 下午3:58:21
 * @version: V1.0
 * @review: zhangjin/2017年7月25日 下午3:58:21
 */
public class BuyStock implements Order {
    private Stock abcStock;
    
    /**   
     * TODO     
     */
    public BuyStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    /**      
     * TODO 
     * @see behavior.command.Order#execute()
     */
    @Override
    public void execute() {
        abcStock.buy();
    }

}
