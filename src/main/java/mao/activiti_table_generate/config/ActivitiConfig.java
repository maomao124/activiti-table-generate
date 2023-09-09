package mao.activiti_table_generate.config;

import org.activiti.engine.impl.cfg.StandaloneProcessEngineConfiguration;
import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * Project name(项目名称)：activiti-table-generate
 * Package(包名): mao.activiti_table_generate.config
 * Class(类名): ActivitiConfig
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2023/9/9
 * Time(创建时间)： 20:52
 * Version(版本): 1.0
 * Description(描述)： 无
 */

@Configuration
public class ActivitiConfig
{
//
//    /**
//     * Data source data source.
//     *
//     * @return the data source
//     */
//    @Bean
//    public DataSource dataSource()
//    {
//        BasicDataSource basicDataSource = new BasicDataSource();
//        basicDataSource.setDriverClassName("com.mysql.jdbc.Driver");
//        basicDataSource.setUrl("jdbc:mysql:///activiti");
//        basicDataSource.setUsername("root");
//        basicDataSource.setPassword("123456");
//        return basicDataSource;
//    }
//
//
//    /**
//     * Activiti配置
//     * @param dataSource 数据源
//     * @return {@link StandaloneProcessEngineConfiguration}
//     */
//    @Bean
//    public StandaloneProcessEngineConfiguration processEngineConfiguration(@Autowired DataSource dataSource)
//    {
//        StandaloneProcessEngineConfiguration standaloneProcessEngineConfiguration = new StandaloneProcessEngineConfiguration();
//        standaloneProcessEngineConfiguration.setDataSource(dataSource);
//        return standaloneProcessEngineConfiguration;
//    }
}
