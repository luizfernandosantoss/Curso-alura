package org.casadocodigo.conf;


import org.casadocodigo.controllers.HomeController;
import org.casadocodigo.controllers.ProdutosController;
import org.casadocodigo.daos.ProdutoDao;
import org.casadocodigo.infra.FileSaver;
import org.casadocodigo.models.CarrinhoCompras;
import org.casadocodigo.models.CarrinhoItem;
import org.hibernate.loader.custom.Return;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.format.datetime.DateFormatterRegistrar;
import org.springframework.format.support.DefaultFormattingConversionService;
import org.springframework.format.support.FormattingConversionService;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc
@ComponentScan(basePackageClasses = {HomeController.class, ProdutoDao.class, FileSaver.class, CarrinhoCompras.class, CarrinhoItem.class})
public class AppWebConfiguration extends WebMvcConfigurerAdapter {
    @Bean
    public InternalResourceViewResolver internalResourceViewResolver(){
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");

        //deixar todos os atribuidos disponivel para JSP, isso coloca em risco a aplicação
        //resolver.setExposeContextBeansAsAttributes(true);

        resolver.setExposedContextBeanNames("carrinhoCompras");
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

    @Bean
    public FormattingConversionService mvcConversionService(){
        DefaultFormattingConversionService conversionService= new DefaultFormattingConversionService();
        DateFormatterRegistrar registrar = new DateFormatterRegistrar();
        registrar.setFormatter(new DateFormatter("dd/MM/yyyy"));
        registrar.registerFormatters(conversionService);

        return  conversionService;
    }

    @Bean
    public MultipartResolver multipartResolver(){
        return new StandardServletMultipartResolver();
    }

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }


}


