/**  
 * All rights Reserved, Designed By Suixingpay.
 * @author: zhangjin[zhang_jin@suixingpay.com] 
 * @date: 2017年7月10日 下午3:16:47   
 * @Copyright ©2017 Suixingpay. All rights reserved. 
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package create.builder;

/**
 * TODO
 * 
 * @author: zhangjin[zhang_jin@suixingpay.com]
 * @date: 2017年7月10日 下午3:16:47
 * @version: V1.0
 * @review: zhangjin[zhang_jin@suixingpay.com]/2017年7月10日 下午3:16:47
 */
public class ManBuilder implements PersonBuilder {

    Person person;

    /**
     * TODO
     */
    public ManBuilder() {
        person = new Person();
    }

    /**
     * TODO
     * 
     * @see create.builder.PersonBuilder#buildBody()
     */
    @Override
    public void buildBody() {
        person.setBody("男人的身体");

    }

    /**
     * TODO
     * 
     * @see create.builder.PersonBuilder#buildHead()
     */
    @Override
    public void buildHead() {
        person.setHead("男人的头");

    }

    /**
     * TODO
     * 
     * @see create.builder.PersonBuilder#buildFoot()
     */
    @Override
    public void buildFoot() {
        person.setFoot("男人的脚");

    }

    /**
     * TODO
     * 
     * @return
     * @see create.builder.PersonBuilder#buildPerson()
     */
    @Override
    public Person buildPerson() {
        return person;
    }

}
