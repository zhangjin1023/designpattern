/**  
 * All rights Reserved, Designed By Suixingpay.
 * @author: zhangjin
 * @date: 2017年6月26日 下午1:36:38   
 * @Copyright ©2017 Suixingpay. All rights reserved. 
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理类，实现InvocationHandler接口
 * 
 * @author: zhangjin
 * @date: 2017年6月26日 下午1:36:38
 * @version: V1.0
 */
public class Invoker implements InvocationHandler {

    DynInterface dynInterface;

    public Invoker(DynInterface abstractClass) {
        this.dynInterface = abstractClass;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //调用之前可以进行处理
        System.out.println("do before");
        
        method.invoke(dynInterface, args);
        
        //调用之后可以进行处理
        System.out.println("do after");
        
        return null;
    }

}
