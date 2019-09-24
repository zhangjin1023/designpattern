/**  
 * All rights Reserved, Designed By Suixingpay.
 * @author: zhangjin
 * @date: 2017年7月17日 下午2:15:49   
 * @Copyright ©2017 Suixingpay. All rights reserved. 
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package behavior.chain;

/**
 * TODO
 * 
 * @author: zhangjin
 * @date: 2017年7月17日 下午2:15:49
 * @version: V1.0
 * @review: zhangjin/2017年7月17日 下午2:15:49
 */
public abstract class AbstractLogger {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    protected int level;

    // 责任链中的下一个元素
    protected AbstractLogger nextLogger;

    /**
     * @param nextLogger the nextLogger to set
     */
    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level, String message) {
        if (this.level <= level) {//每个具体的日志类，只会打印比自己定义的级别高或相同级别的日志信息
            write(message);
        }
        if (nextLogger != null) {
            nextLogger.logMessage(level, message);
        }

    }

    /**
     * TODO
     * 
     * @param message
     */
    abstract protected void write(String message);

}
