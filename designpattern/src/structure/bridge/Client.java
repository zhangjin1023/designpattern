/**  
 * All rights Reserved, Designed By Suixingpay.
 * @author: zhangjin[zhang_jin@suixingpay.com] 
 * @date: 2017年7月11日 下午6:33:43   
 * @Copyright ©2017 Suixingpay. All rights reserved. 
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package structure.bridge;

/**  
 * TODO
 * @author: zhangjin[zhang_jin@suixingpay.com]
 * @date: 2017年7月11日 下午6:33:43
 * @version: V1.0
 * @review: zhangjin[zhang_jin@suixingpay.com]/2017年7月11日 下午6:33:43
 */
public class Client {
    
    public static void main(String[] args) {
        //创建具体的实现对象
        MessageImplementor impl = new MessageSms();
        //创建一个普通消息对象
        AbstractMessage common = new CommonMessage(impl);
        //
        common.sendMsg("张hello ", "zhang");
        
        //创建具体的实现对象
        MessageImplementor implSms = new MessageSms();
        //创建一个加急消息对象
        AbstractMessage urgencySms = new UrgencyMessage(implSms);
        //
        urgencySms.sendMsg("张hello ", "zhang");
        
        //创建具体的实现对象
        MessageImplementor implEmail = new MessageEmail();
        //创建一个加急消息对象
        AbstractMessage urgencyEmail = new UrgencyMessage(implEmail);
        //
        urgencyEmail.sendMsg("张hello ", "zhang");
        
    }

}
