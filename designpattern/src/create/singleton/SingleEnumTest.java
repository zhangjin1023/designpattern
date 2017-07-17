/**  
 * All rights Reserved, Designed By Suixingpay.
 * @author: zhangjin[zhang_jin@suixingpay.com] 
 * @date: 2017年7月17日 下午3:16:05   
 * @Copyright ©2017 Suixingpay. All rights reserved. 
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package create.singleton;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**  
 * TODO
 * @author: zhangjin[zhang_jin@suixingpay.com]
 * @date: 2017年7月17日 下午3:16:05
 * @version: V1.0
 * @review: zhangjin[zhang_jin@suixingpay.com]/2017年7月17日 下午3:16:05
 */
public class SingleEnumTest {
    public static void main(String[] args) throws ClassNotFoundException, IOException {
        SingleEnum s1 = SingleEnum.ZHANG_JIN;
        SingleEnum s2 = SingleEnum.ZHANG_JIN;
        System.out.println(s1 == s2);
        
        //序列化也能保证单例
        SingleEnum s3 = (SingleEnum) deepClone(s1);
        System.out.println(s1 == s3);
    }

    /**   
     * TODO
     * @param s1
     * @throws IOException
     * @throws ClassNotFoundException 
     */  
    public static Object deepClone(SingleEnum s1) throws IOException, ClassNotFoundException {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(s1);
        
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(outputStream.toByteArray());
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
        return objectInputStream.readObject();
    }

}
