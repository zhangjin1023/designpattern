/**  
 * All rights Reserved, Designed By Suixingpay.
 * @author: zhangjin[zhang_jin@suixingpay.com] 
 * @date: 2017年7月25日 下午4:00:23   
 * @Copyright ©2017 Suixingpay. All rights reserved. 
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package behavior.command;

/**
 * TODO
 * 
 * @author: zhangjin[zhang_jin@suixingpay.com]
 * @date: 2017年7月25日 下午4:00:23
 * @version: V1.0
 * @review: zhangjin[zhang_jin@suixingpay.com]/2017年7月25日 下午4:00:23
 */
public class SellStock implements Order {
    private Stock abcStock;

    /**
     * TODO
     */
    public SellStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    /**
     * TODO
     * 
     * @see behavior.command.Order#execute()
     */
    @Override
    public void execute() {
        abcStock.sell();

    }

}
