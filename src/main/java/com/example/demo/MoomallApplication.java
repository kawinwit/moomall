package com.example.demo;

import com.example.demo.model.CustomerEntity;
import com.example.demo.model.ProductEitity;
import com.example.demo.repository.CustomerProductRepository;
import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@EnableJpaRepositories
public class MoomallApplication {
	
	@Autowired
	ProductRepository productRepository;
	@Autowired
	CustomerProductRepository customerProductRepository;

	public static void main(String[] args) {
		SpringApplication.run(MoomallApplication.class, args);
	}


	@PostConstruct
	private void initDb() {
		List<ProductEitity> productList = new ArrayList<>();
		ProductEitity product1 = new ProductEitity(
					"product-1",
					"product1",
					"test.png"
			);

		ProductEitity product2 = new ProductEitity(
					"product-2",
					"product2",
					"test.png"

			);
		ProductEitity product3 = new ProductEitity(
					"product-3",
					"product3",
					"test.png"
					);

		ProductEitity product4 = new ProductEitity(
					"product-4",
					"product4",
					"test.png"
				);


		productList.add(product1);
		productList.add(product2);
		productList.add(product3);
		productList.add(product4);
		productRepository.saveAll(productList);

		CustomerEntity customerEntity = new CustomerEntity();
		customerEntity.setCustomerId("1-customer-test");
		customerProductRepository.save(customerEntity);
	}
}
