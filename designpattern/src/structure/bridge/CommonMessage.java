/**  
 * All rights Reserved, Designed By Suixingpay.
 * @author: zhangjin
 * @date: 2017年7月11日 下午6:26:33   
 * @Copyright ©2017 Suixingpay. All rights reserved. 
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package structure.bridge;

/**
 * 普通消息
 * 
 * @author: zhangjin
 * @date: 2017年7月11日 下午6:26:33
 * @version: V1.0
 */
public class CommonMessage extends AbstractMessage {

    public CommonMessage(MessageImplementor impl) {
        super(impl);
    }

    public void sendMsg(String message, String toUser) {
        super.sendMsg(message, toUser);
    }

}
