/**  
 * All rights Reserved, Designed By Suixingpay.
 * @author: zhangjin[zhang_jin@suixingpay.com] 
 * @date: 2017年7月25日 下午4:06:20   
 * @Copyright ©2017 Suixingpay. All rights reserved. 
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package behavior.command;

/**  
 * TODO
 * @author: zhangjin[zhang_jin@suixingpay.com]
 * @date: 2017年7月25日 下午4:06:20
 * @version: V1.0
 * @review: zhangjin[zhang_jin@suixingpay.com]/2017年7月25日 下午4:06:20
 */
public class CommandDemo {
    public static void main(String[] args) {
        Stock abcStock = new Stock();
        
        BuyStock buyStock = new BuyStock(abcStock);
        SellStock sellStock = new SellStock(abcStock);
        
        Broker broker = new Broker();
        broker.takeOrder(buyStock);
        broker.takeOrder(sellStock);
        
        broker.placeOrders();
        
    }

}
