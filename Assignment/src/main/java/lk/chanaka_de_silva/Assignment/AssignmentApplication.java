package lk.chanaka_de_silva.Assignment;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import lk.chanaka_de_silva.Assignment.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

@SpringBootApplication
public class AssignmentApplication {

    @Autowired
    ProductRepository productRepository;

    public static void main(String[] args) {
        SpringApplication.run(AssignmentApplication.class, args);
    }

    @Bean
    public MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        MappingJackson2HttpMessageConverter converter
                = new MappingJackson2HttpMessageConverter(mapper);
        return converter;
    }

//    @Override
//    public void run(String... args) {
//
//        Product product = new Product();
//        product.setName("Product 1");
//        product.setDescription("Description");
//        product.setPrice(new BigDecimal("100"));
//
//        Category category1 = new Category();
//        category1.setName("Category 1");
//        category1.setDescription("Description");
//
//        Category category2 = new Category();
//        category2.setName("Category 2");
//        category2.setDescription("Description");
//
//        List<Category> categorys = new ArrayList<>();
//        categorys.add(category1);
//        categorys.add(category2);
//        
//        product.setCategories(categorys);
//        productRepository.save(product);
//    }
}
