package config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

/**
 * @author ：孙鹏云
 * @date ：Created in 2020-11-29 18:46
 * @description：
 * @modified By：
 * @version: $
 */
@Configuration
@ComponentScan("com.yonyou")
public class SpringConfiguration {

    @Bean(name="runner")
    @Scope("prototype")
    public QueryRunner createQueryRunner(DataSource dataSource) {
        return new QueryRunner(dataSource);
    }

    @Bean(name="dataSource")
    public DataSource createDataSource() {

        try {
            ComboPooledDataSource cpds = new ComboPooledDataSource();
            cpds.setDriverClass("com.mysql.jdbc.Driver");
            cpds.setJdbcUrl("jdbc:mysql://localhost:3306/db1");
            cpds.setUser("root");
            cpds.setPassword("root");
            return cpds;
        } catch (PropertyVetoException e) {
            throw new RuntimeException(e);
        }

    }

}
