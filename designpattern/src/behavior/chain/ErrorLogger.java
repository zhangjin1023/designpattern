/**  
 * All rights Reserved, Designed By Suixingpay.
 * @author: zhangjin
 * @date: 2017年7月17日 下午2:26:20   
 * @Copyright ©2017 Suixingpay. All rights reserved. 
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package behavior.chain;

/**
 * TODO
 * 
 * @author: zhangjin
 * @date: 2017年7月17日 下午2:26:20
 * @version: V1.0
 * @review: zhangjin/2017年7月17日 下午2:26:20
 */
public class ErrorLogger extends AbstractLogger {

    /**
     * TODO
     */
    public ErrorLogger(int level) {
        this.level = level;
    }

    /**
     * TODO
     * 
     * @param message
     * @see behavior.chain.AbstractLogger#write(java.lang.String)
     */
    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }

}
