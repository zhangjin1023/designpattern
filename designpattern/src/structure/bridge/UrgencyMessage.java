/**  
 * All rights Reserved, Designed By Suixingpay.
 * @author: zhangjin[zhang_jin@suixingpay.com] 
 * @date: 2017年7月11日 下午6:30:24   
 * @Copyright ©2017 Suixingpay. All rights reserved. 
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package structure.bridge;

/**
 * 加急消息
 * 
 * @author: zhangjin[zhang_jin@suixingpay.com]
 * @date: 2017年7月11日 下午6:30:24
 * @version: V1.0
 * @review: zhangjin[zhang_jin@suixingpay.com]/2017年7月11日 下午6:30:24
 */
public class UrgencyMessage extends AbstractMessage {

    /**
     * TODO
     * 
     * @param impl
     */
    public UrgencyMessage(MessageImplementor impl) {
        super(impl);
    }

    /**
     * TODO
     * 
     * @param message
     * @param toUser
     * @see structure.bridge.AbstractMessage#sendMsg(java.lang.String,
     *      java.lang.String)
     */
    @Override
    public void sendMsg(String message, String toUser) {
        message = "加急：" + message;
        super.sendMsg(message, toUser);
    }

    /**
     * 扩展功能，监控
     * 
     * @param msgId
     * @return
     */
    public Object watch(String msgId) {
        return null;
    }

}
