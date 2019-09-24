/**  
 * All rights Reserved, Designed By Suixingpay.
 * @author: zhangjin
 * @date: 2017年7月10日 下午2:46:48   
 * @Copyright ©2017 Suixingpay. All rights reserved. 
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package create.singleton;

import java.io.Serializable;

/**
 * TODO
 * 
 * @author: zhangjin
 * @date: 2017年7月10日 下午2:46:48
 * @version: V1.0
 */
public class Singletone implements Serializable{
    private static final long serialVersionUID = 1L;

    // 1.私有化构造器
    private Singletone() {
    }

    // 2.内部创建私有的，静态的一个实例
    private static Singletone instance = new Singletone();

    // 3.提供公开的，静态的取值方法，供外部调用
    public static Singletone getInstance() {
        return instance;
    }

}
