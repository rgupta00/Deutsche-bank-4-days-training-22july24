package com.bookapp.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.bookapp.dao.BookDao;
@ExtendWith(MockitoExtension.class)
class BookServiceImplTest {

	@InjectMocks
	private BookServiceImpl bookServiceImpl;
	
	@Mock
	private BookDao bookDao;
	
	@BeforeEach
	void setUp() throws Exception {
		List<String> allBooks=Arrays.asList("java","rich dad poor dad","java adv");
		when(bookDao.getBooks()).thenReturn(allBooks);
		
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		List<String> books=bookServiceImpl.getBooks("java");
		assertEquals(2, books.size());
	}

}
