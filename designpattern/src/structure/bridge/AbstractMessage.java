/**  
 * All rights Reserved, Designed By Suixingpay.
 * @author: zhangjin[zhang_jin@suixingpay.com] 
 * @date: 2017年7月11日 下午6:18:02   
 * @Copyright ©2017 Suixingpay. All rights reserved. 
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package structure.bridge;

/**
 * 抽象的消息对象
 * 
 * @author: zhangjin[zhang_jin@suixingpay.com]
 * @date: 2017年7月11日 下午6:18:02
 * @version: V1.0
 * @review: zhangjin[zhang_jin@suixingpay.com]/2017年7月11日 下午6:18:02
 */
public abstract class AbstractMessage {

    /**
     * 持有一个实现部分的对象
     */
    protected MessageImplementor impl;

    /**
     * 构造方法，传入实现部分的对象
     * 
     * @param impl 实现部分的对象
     */
    public AbstractMessage(MessageImplementor impl) {
        this.impl = impl;
    }

    /**
     * 发送消息，转调实现部分的方法
     * 
     * @param message
     * @param toUser
     */
    public void sendMsg(String message, String toUser) {
        impl.send(message, toUser);
    }

}
