package pl.patryk.apka.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import javax.sql.DataSource;


@Configuration
public class PresistanceConfig {


    //poloczenie z baza danych
    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        driverManagerDataSource.setDriverClassName(org.postgresql.Driver.class.getName());
        //driver manager wpisuje login i haselko
        driverManagerDataSource.setUsername("postgres");
        driverManagerDataSource.setPassword("root");
        driverManagerDataSource.setUrl(
                "jdbc:postgresql://localhost:5432/praca_domowa"
        );
        return driverManagerDataSource;
    }
}
