package com.ness.ms.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ness.ms.domain.Order;
import com.ness.ms.domain.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

		

}
