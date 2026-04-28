//package com.example.ReactiveDemo1;
//
//import com.example.ReactiveDemo1.Entity.product;
//import com.example.ReactiveDemo1.Repository.ProductRepo;
//import com.example.ReactiveDemo1.Service.productService;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import reactor.test.StepVerifier;
//
//import java.util.Arrays;
//
//@SpringBootTest
//class ReactiveDemo1ApplicationTests {
//
//	@Autowired
//	productService productRepo;
//
//	@Test
//	void testProduct() {
//		// Pre-populate the data before the test runs
////		productRepo.saveAll(Arrays.asList(
////				new product(1, "laptop", "John Doe"),
////				new product(2, "key", "Alice Smith"),
////				new product(3, "phone", "Charlie Brown")
////		)).blockLast(); // Block to wait for the save operation to complete
//
//		// Now, execute your test
//		this.productRepo.productFlux()
//				.as(StepVerifier::create)
//				.expectNextCount(3)  // Expecting 3 products, based on the data you inserted
//				.expectComplete()    // Ensures the sequence completes
//				.verify();
//	}
//
//	@Test
//	void monodataid()
//	{
//		this.productRepo.getById(1)
//				.as(StepVerifier::create)
//				.assertNext(p-> Assertions.assertEquals("laptop",p.getType()))
//				.expectComplete()
//				.verify();
//	}
//
//	void
//}
