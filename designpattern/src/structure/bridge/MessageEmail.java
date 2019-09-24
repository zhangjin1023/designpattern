/**  
 * All rights Reserved, Designed By Suixingpay.
 * @author: zhangjin
 * @date: 2017年7月11日 下午6:24:07   
 * @Copyright ©2017 Suixingpay. All rights reserved. 
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package structure.bridge;

/**
 * 邮件消息
 * 
 * @author: zhangjin
 * @date: 2017年7月11日 下午6:24:07
 * @version: V1.0
 */
public class MessageEmail implements MessageImplementor {

    /**
     * 以Email的方式发送消息
     * 
     * @param message
     * @param toUser
     * @see structure.bridge.MessageImplementor#send(java.lang.String,
     *      java.lang.String)
     */
    @Override
    public void send(String message, String toUser) {
        System.out.println("使用Email的方式，发送消息'" + message + "'给" + toUser);
    }

}
