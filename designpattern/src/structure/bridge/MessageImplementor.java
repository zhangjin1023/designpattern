/**  
 * All rights Reserved, Designed By Suixingpay.
 * @author: zhangjin[zhang_jin@suixingpay.com] 
 * @date: 2017年7月11日 下午6:15:14   
 * @Copyright ©2017 Suixingpay. All rights reserved. 
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package structure.bridge;

/**
 * 实现发送消息的统一接口
 * 
 * @author: zhangjin[zhang_jin@suixingpay.com]
 * @date: 2017年7月11日 下午6:15:14
 * @version: V1.0
 * @review: zhangjin[zhang_jin@suixingpay.com]/2017年7月11日 下午6:15:14
 */
public interface MessageImplementor {
    /**
     * 发送消息
     * 
     * @param message 要发送的消息内容
     * @param toUser 消息发送的目的人员
     */
    public void send(String message, String toUser);

}
