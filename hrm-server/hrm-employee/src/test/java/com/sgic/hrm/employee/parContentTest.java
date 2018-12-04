package com.sgic.hrm.employee;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sgic.hrm.commons.entity.ParContent;
import com.sgic.hrm.employee.service.ParContentService;



@RunWith(SpringRunner.class)
@SpringBootTest
public class parContentTest {
	
	@Autowired
	ParContentService parContentService;
	
	@Test
	public void saveParContentTest() {
		parContentService.createParContent(new ParContent(1,"Content1"));
	}

}