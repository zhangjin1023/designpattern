/**  
 * All rights Reserved, Designed By Suixingpay.
 * @author: zhangjin
 * @date: 2017年7月14日 上午11:01:25   
 * @Copyright ©2017 Suixingpay. All rights reserved. 
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package create;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO
 * 
 * @author: zhangjin
 * @date: 2017年7月14日 上午11:01:25
 * @version: V1.0
 * @review: zhangjin/2017年7月14日 上午11:01:25
 */
public class Test {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        for (int i = 0; i <= 100; i++) {
            list.add("" + i);
        }
        int size = list.size();
        int num = (size) % 30 == 0 ? (size / 30) : (size / 30 + 1);// 按每30条记录查询
        int start = 0;
        int end = 0;
        List<String> a = new ArrayList<String>();
        // 方法1
        for (int i = 1; i <= num; i++) {
            end = (i * 30) > size ? size : (i * 30);
            start = (i - 1) * 30;
            for (; start < end; start++) {
                a.add(list.get(start));
            }
            System.out.println("输出数据---" + a.toString());
            // 此处可以进行处理数据 插入 修改删除 都可以进行操作 避免同时操作大集合数据
            a.clear();
        }
        // 方法2
        end = 0;
        start = 0;
        for (int i = 1; i <= num; i++) {
            end = (i * 30) > size ? size : (i * 30);
            start = (i - 1) * 30;
            System.out.println(end + "--" + start);
            a = list.subList(start, end);
            System.out.println("输出数据-bbb--" + a.toString());
        }
    }

}
