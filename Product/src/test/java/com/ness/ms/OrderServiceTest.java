package com.ness.ms;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ness.ms.domain.Item;
import com.ness.ms.domain.Order;
import com.ness.ms.repo.ProductRepository;
import com.ness.ms.service.ProductService;

import jakarta.transaction.Transactional;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
public class OrderServiceTest {
	
	
	
}
