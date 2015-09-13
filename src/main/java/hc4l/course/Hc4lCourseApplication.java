package hc4l.course;

import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.repository.support.Repositories;

@SpringBootApplication
public class Hc4lCourseApplication {

    public static void main(String[] args) {
        SpringApplication.run(Hc4lCourseApplication.class, args);
    }
    
    @Bean
    public Repositories repositories(ListableBeanFactory factory) {
    	return new Repositories(factory);
    }
}