/**  
 * All rights Reserved, Designed By Suixingpay.
 * @author: zhangjin[zhang_jin@suixingpay.com] 
 * @date: 2017年7月10日 下午3:34:29   
 * @Copyright ©2017 Suixingpay. All rights reserved. 
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package create.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * TODO
 * 
 * @author: zhangjin[zhang_jin@suixingpay.com]
 * @date: 2017年7月10日 下午3:34:29
 * @version: V1.0
 * @review: zhangjin[zhang_jin@suixingpay.com]/2017年7月10日 下午3:34:29
 */
public class Prototype implements Cloneable, Serializable {
    /**   
     * @Fields serialVersionUID: TODO
     */ 
    private static final long serialVersionUID = 1L;
    private int base;
    private Integer obj;

    /**
     * 浅复制
     * 
     * @return
     * @throws CloneNotSupportedException
     * @see java.lang.Object#clone()
     */
    public Object clone() throws CloneNotSupportedException {
        Prototype prototype = (Prototype) super.clone();
        return prototype;
    }

    /**
     * 深复制
     * 
     * @return
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public Object deepClone() throws IOException, ClassNotFoundException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(bos);
        out.writeObject(this);

        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream in = new ObjectInputStream(bis);
        return in.readObject();
    }

    /**
     * @return the base
     */
    public int getBase() {
        return base;
    }

    /**
     * @param base the base to set
     */
    public void setBase(int base) {
        this.base = base;
    }

    /**
     * @return the obj
     */
    public Integer getObj() {
        return obj;
    }

    /**
     * @param obj the obj to set
     */
    public void setObj(Integer obj) {
        this.obj = obj;
    }

}
