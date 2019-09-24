/**  
 * All rights Reserved, Designed By Suixingpay.
 * @author: zhangjin
 * @date: 2017年6月26日 下午1:41:43   
 * @Copyright ©2017 Suixingpay. All rights reserved. 
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package dynamicproxy;

import java.lang.reflect.Proxy;

/**  
 * 动态代理测试类
 * @author: zhangjin
 * @date: 2017年6月26日 下午1:41:43
 * @version: V1.0
 */
public class DynamicProxyTest {
    
    public static void main(String[] args) {
        //创建具体类A的处理对象
        Invoker invoker1 = new Invoker(new ClassA());
        //获得具体类A的代理
        DynInterface ac1 = (DynInterface) Proxy.newProxyInstance(DynInterface.class.getClassLoader(),new Class[]{DynInterface.class} , invoker1);
        //调用被代理类的方法
        ac1.show();
        
        //创建具体类B的处理对象
        Invoker invoker2 = new Invoker(new ClassB());
        //获得具体类B的代理
        DynInterface ac2 = (DynInterface) Proxy.newProxyInstance(DynInterface.class.getClassLoader(),new Class[]{DynInterface.class} , invoker2);
        //调用被代理类的方法
        ac2.show();
        
    }

}
