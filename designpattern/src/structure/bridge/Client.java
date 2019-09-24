/**
 * All rights Reserved, Designed By Suixingpay.
 * @author: zhangjin
 * @date: 2017年7月11日 下午6:33:43   
 * @Copyright ©2017 Suixingpay. All rights reserved. 
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package structure.bridge;

/**
 * 测试类
 * @author: zhangjin
 * @date: 2017年7月11日 下午6:33:43
 * @version: V1.0
 */
public class Client {

    public static void main(String[] args) {
        //创建具体的实现对象
        MessageImplementor impl = new MessageSms();
        //创建一个普通消息对象
        AbstractMessage common = new CommonMessage(impl);
        //以短信的方式发送普通消息
        common.sendMsg("张hello ", "zhang");

        //创建具体的实现对象
        MessageImplementor implSms = new MessageSms();
        //创建一个加急消息对象
        AbstractMessage urgencySms = new UrgencyMessage(implSms);
        //以短信的方式发送加急消息
        urgencySms.sendMsg("张hello ", "zhang");

        //创建具体的实现对象
        MessageImplementor implEmail = new MessageEmail();
        //创建一个加急消息对象
        AbstractMessage urgencyEmail = new UrgencyMessage(implEmail);
        //以邮件的方式发送加急消息
        urgencyEmail.sendMsg("张hello ", "zhang");

    }

}
