package org.casadocodigo.conf;


import org.casadocodigo.controllers.HomeController;
import org.casadocodigo.controllers.ProdutosController;
import org.casadocodigo.daos.ProdutoDao;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc
@ComponentScan(basePackageClasses = {HomeController.class, ProdutoDao.class})
public class AppWebConfiguration {
    @Bean
    public InternalResourceViewResolver internalResourceViewResolver(){
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");
        return resolver;
    }

    @Bean
    public MessageSource messageSource(){
        ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
        messageSource.setBasename("/WEB-INF/messages");
        messageSource.setDefaultEncoding("UTF-8");
        messageSource.setCacheSeconds(1);
        return messageSource;
    }

}


