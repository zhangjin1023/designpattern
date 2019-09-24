/**  
 * All rights Reserved, Designed By Suixingpay.
 * @author: zhangjin
 * @date: 2017年7月10日 下午3:46:04   
 * @Copyright ©2017 Suixingpay. All rights reserved. 
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package create.prototype;

import java.io.IOException;

/**  
 * TODO
 * @author: zhangjin
 * @date: 2017年7月10日 下午3:46:04
 * @version: V1.0
 */
public class PrototypeTest {
    public static void main(String[] args) throws CloneNotSupportedException, ClassNotFoundException, IOException {
        Prototype proto = new Prototype();
        proto.setBase(1);
        proto.setObj(new Integer(2));
        
        Prototype proto1 = (Prototype) proto.clone();
        Prototype proto2 = (Prototype) proto.deepClone();
        
        System.out.println(proto.getObj() == proto1.getObj());//浅复制，引用类型指向不变
        System.out.println(proto.getObj() == proto2.getObj());//深复制，引用类型指向改变
    }

}
