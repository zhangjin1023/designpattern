/**  
 * All rights Reserved, Designed By Suixingpay.
 * @author: zhangjin
 * @date: 2017年7月25日 下午4:02:57   
 * @Copyright ©2017 Suixingpay. All rights reserved. 
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package behavior.command;

import java.util.ArrayList;
import java.util.List;

/**  
 * TODO
 * @author: zhangjin
 * @date: 2017年7月25日 下午4:02:57
 * @version: V1.0
 * @review: zhangjin/2017年7月25日 下午4:02:57
 */
public class Broker {
    
    private List<Order> orderList = new ArrayList<>();
    
    public void takeOrder(Order order){
        orderList.add(order);
    }

    
    public void placeOrders(){
        for(Order order:orderList){
            order.execute();
        }
        orderList.clear();
    }
}
