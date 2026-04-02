package com.example.basic;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
// import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
// import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import lombok.Data;
import com.example.basic.config.Car;


@SpringBootApplication
public class BasicApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(BasicApplication.class, args);
        
        // Car car1 = context.getBean(Car.class);
        // Car car2 = context.getBean(Car.class);
		// System.out.println("car1 == car2: " + (car1 == car2));

        // PaymentService paymentService = context.getBean(CreditCardPaymentService.class, PaymentService.class);
        // paymentService.processPayment(100.0);

        // ApplicationProperties properties = context.getBean(ApplicationProperties.class);
        // System.out.println("Application Name: " + properties.getAppName());

        Car car = context.getBean(Car.class);
        System.out.println("Car bean loaded: " + car);
    
    }
}

// @Component
// @Lazy
// @Scope("prototype") 
// class Car {
//     public Car() {
//         System.out.println("Car created");
//     }
// }
@Component
class FirstRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("FirstRunner is running");
    }
}


@Component
interface PaymentService{
    void processPayment(double amount);
}
@Component
@Primary
class UpiPaymentService implements PaymentService {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing UPI payment of amount: " + amount);
    }
}
@Component
class CreditCardPaymentService implements PaymentService {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Credit Card payment of amount: " + amount);
    }
}


@Component
@Data
class ApplicationProperties {
    @Value("${app.name}")
    private String appName;
}