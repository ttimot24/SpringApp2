/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package springapp.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

//https://www.javacodegeeks.com/2014/06/spring-boot-fast-mvc-start.html

@Configuration
@EnableWebMvc
@EnableTransactionManagement
@ComponentScan(basePackages = "springapp")
public class WebMvcConfig extends WebMvcConfigurerAdapter{
 

  @Override
  public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
      configurer.enable();
  }



  @Bean
  public InternalResourceViewResolver viewResolver() {

      InternalResourceViewResolver resolver = new InternalResourceViewResolver();
      resolver.setViewClass(JstlView.class);
      resolver.setPrefix("/pages/");
      //resolver.setViewNames("*jsp");
      resolver.setSuffix(".jsp");

      return resolver;

  }
 

}



