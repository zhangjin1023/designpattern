/**  
 * All rights Reserved, Designed By Suixingpay.
 * @author: zhangjin[zhang_jin@suixingpay.com] 
 * @date: 2017年7月10日 下午5:52:03   
 * @Copyright ©2017 Suixingpay. All rights reserved. 
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package structure.flyweight;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Vector;

/**
 * 享元模式的应用：数据库连接池
 * 
 * @author: zhangjin[zhang_jin@suixingpay.com]
 * @date: 2017年7月10日 下午5:52:03
 * @version: V1.0
 * @review: zhangjin[zhang_jin@suixingpay.com]/2017年7月10日 下午5:52:03
 */
public class ConnectionPool {

    private Vector<Connection> pool;

    /* 公有属性 */
    private String url = "jdbc:mysql://localhost:3306/test";
    private String username = "root";
    private String password = "root";
    private String driverClassName = "com.mysql.jdbc.Driver";

    private int poolSize = 100;
    private static ConnectionPool instance = null;
    Connection conn = null;

    /**
     * TODO
     * 
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    private ConnectionPool() throws ClassNotFoundException, SQLException {
        pool = new Vector<>(poolSize);

        for (int i = 0; i < poolSize; i++) {
            Class.forName(driverClassName);
            conn = DriverManager.getConnection(url, username, password);
            pool.add(conn);
        }
    }

    public synchronized void release() {
        pool.add(conn);
    }

    public synchronized Connection getConnection() {
        if (pool.size() > 0) {
            Connection conn = pool.get(0);
            pool.remove(0);
            return conn;
        } else {
            return null;
        }
    }

}
