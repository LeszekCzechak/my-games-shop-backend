package pl.czechak.leszek.mygamesshopbackend.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import pl.czechak.leszek.mygamesshopbackend.model.Product;
import pl.czechak.leszek.mygamesshopbackend.model.ProductCategory;

@Configuration
public class MyDataRestConfig implements RepositoryRestConfigurer {

//    @Override
//    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
//
//        HttpMethod[] theUnsuportedActions = {HttpMethod.PUT, HttpMethod.POST, HttpMethod.DELETE};
//
//        config.getExposureConfiguration()
//                .forDomainType(Product.class)
//                .withItemExposure((metdata, httpMethods) -> httpMethods.disable(theUnsuportedActions))
//                .withCollectionExposure((metdata, httpMethods) -> httpMethods.disable(theUnsuportedActions));
//
//        config.getExposureConfiguration()
//                .forDomainType(ProductCategory.class)
//                .withItemExposure((metdata, httpMethods) -> httpMethods.disable(theUnsuportedActions))
//            .withCollectionExposure((metdata, httpMethods) -> httpMethods.disable(theUnsuportedActions));
//    }

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
        HttpMethod[] theUnsuportedActions = {HttpMethod.PUT, HttpMethod.POST, HttpMethod.DELETE};


        config.getExposureConfiguration()
                .forDomainType(Product.class)
                .withItemExposure((metdata, httpMethods) -> httpMethods.disable(theUnsuportedActions))
                .withCollectionExposure((metdata, httpMethods) -> httpMethods.disable(theUnsuportedActions));

        config.getExposureConfiguration()
                .forDomainType(ProductCategory.class)
                .withItemExposure((metdata, httpMethods) -> httpMethods.disable(theUnsuportedActions))
                .withCollectionExposure((metdata, httpMethods) -> httpMethods.disable(theUnsuportedActions));
    }
}

