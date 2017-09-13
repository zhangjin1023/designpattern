/**  
 * All rights Reserved, Designed By Suixingpay.
 * @author: zhangjin[zhang_jin@suixingpay.com] 
 * @date: 2017年7月17日 下午2:29:09   
 * @Copyright ©2017 Suixingpay. All rights reserved. 
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package behavior.chain;

/**
 * 职责链模式
 * 
 * @author: zhangjin[zhang_jin@suixingpay.com]
 * @date: 2017年7月17日 下午2:29:09
 * @version: V1.0
 * @review: zhangjin[zhang_jin@suixingpay.com]/2017年7月17日 下午2:29:09
 */
public class ChainDemo {
    private static AbstractLogger getChainOfLoggers() {
        //组装职责链
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(AbstractLogger.INFO, "This is an information.");

        loggerChain.logMessage(AbstractLogger.DEBUG, "This is an debug level information.");

        loggerChain.logMessage(AbstractLogger.ERROR, "This is an error information.");
    }

}
