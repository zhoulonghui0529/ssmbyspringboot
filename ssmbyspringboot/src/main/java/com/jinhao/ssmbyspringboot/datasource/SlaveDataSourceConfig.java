/**
 * @description:
 * @author: Andy
 * @time: 2020/6/16 10:38
 */

package com.jinhao.ssmbyspringboot.datasource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @title: SlaveDataSourceConfig
 * @projectName ssmbyspringboot
 * @description: TODO
 * @author zlh
 * @date 2020/6/1610:38
 */
@Configuration
@MapperScan(basePackages = "com.jinhao.ssmbyspringboot.read.mapper",sqlSessionFactoryRef = "slaveSqlSessionFactory")
public class SlaveDataSourceConfig {
    @Bean("slaveDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.slave")
    public DataSource getSlaveDataSource(){
        return DataSourceBuilder.create().build();
    }

    @Bean("slaveSqlSessionFactory")
    public SqlSessionFactory getSlaveSqlSessionFactory(@Qualifier("slaveDataSource") DataSource dataSource) throws Exception{
        SqlSessionFactoryBean sqlSessionFactoryBean=new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        return sqlSessionFactoryBean.getObject();
    }

    @Bean("slaveSqlSessionTemplate")
    public SqlSessionTemplate getSlaveSqlSessionTemplate(@Qualifier("slaveSqlSessionFactory") SqlSessionFactory sessionFactory){
        return new SqlSessionTemplate(sessionFactory);
    }
}