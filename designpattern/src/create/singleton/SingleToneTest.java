/**
 * All rights Reserved, Designed By Suixingpay.
 * @author: zhangjin
 * @date: 2017年7月10日 下午2:49:52   
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
 * @author: zhangjin
 * @date: 2017年7月10日 下午2:49:52
 * @version: V1.0
 * @review: zhangjin/2017年7月10日 下午2:49:52
 */
public class SingleToneTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Singletone s1 = Singletone.getInstance();
        Singletone s2 = Singletone.getInstance();
        System.out.println(s1 == s2);

        //序列化之后，不能保证单例
        Singletone s3 = (Singletone) deepClone(s1);
        System.out.println(s1 == s3);
    }

    public static Object deepClone(Singletone s1) throws IOException, ClassNotFoundException {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(s1);

        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(outputStream.toByteArray());
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
        return objectInputStream.readObject();
    }

}
