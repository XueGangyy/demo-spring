package com.example.demo;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

@SpringBootApplication
@MapperScan("com.example.demo.mapper")
public class DemoApplication {

//
	@Bean(name="dataSource")
	@Qualifier(value="dataSource")
	@Primary
	@ConfigurationProperties(prefix="c3p0")
	public DataSource dataSource()
	{
		return DataSourceBuilder.create().type(com.mchange.v2.c3p0.ComboPooledDataSource.class).build();
	}
//
	@Bean
	public SqlSessionFactory sqlSessionFactoryBean() throws Exception {

		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
		sqlSessionFactoryBean.setDataSource(dataSource());

//		PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
//
//		sqlSessionFactoryBean.setMapperLocations(resolver.getResources("classpath:/mybatis/*.xml"));

		return sqlSessionFactoryBean.getObject();
	}
////
//	@Bean
//	public PlatformTransactionManager transactionManager() {
//		return new DataSourceTransactionManager(dataSource());
//	}
//
//
//	@Bean
//	public HttpMessageConverters fastJsonConverters(){
//		FastJsonHttpMessageConverter fastJsonConverter = new FastJsonHttpMessageConverter();
//		FastJsonConfig fastConf = new FastJsonConfig();
//
//		fastConf.setSerializerFeatures(SerializerFeature.PrettyFormat);
//		fastJsonConverter.setFastJsonConfig(fastConf);
//
//		HttpMessageConverter<?> converter = fastJsonConverter;
//		return new HttpMessageConverters(converter);
//	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
