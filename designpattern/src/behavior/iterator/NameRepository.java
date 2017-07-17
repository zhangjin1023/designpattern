/**  
 * All rights Reserved, Designed By Suixingpay.
 * @author: zhangjin[zhang_jin@suixingpay.com] 
 * @date: 2017年7月17日 下午3:39:35   
 * @Copyright ©2017 Suixingpay. All rights reserved. 
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package behavior.iterator;

/**
 * TODO
 * 
 * @author: zhangjin[zhang_jin@suixingpay.com]
 * @date: 2017年7月17日 下午3:39:35
 * @version: V1.0
 * @review: zhangjin[zhang_jin@suixingpay.com]/2017年7月17日 下午3:39:35
 */
public class NameRepository implements Containner {
    public String names[] = { "Robert", "John", "Julie", "Lora" };

    /**
     * TODO
     * 
     * @return
     * @see behavior.iterator.Containner#getIterator()
     */
    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {
        int index;

        /**
         * TODO
         * 
         * @return
         * @see behavior.iterator.Iterator#hasNext()
         */
        @Override
        public boolean hasNext() {
            if (index < names.length) {
                return true;
            }
            return false;
        }

        /**
         * TODO
         * 
         * @return
         * @see behavior.iterator.Iterator#next()
         */
        @Override
        public Object next() {
            if (this.hasNext()) {
                return names[index++];
            }
            return null;
        }

    }

}
