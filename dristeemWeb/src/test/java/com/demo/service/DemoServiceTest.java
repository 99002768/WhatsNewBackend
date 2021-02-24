package com.demo.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import com.demo.dao.DricalcRepository;
import com.demo.model.Dristeem;

@SpringBootTest
@RunWith(MockitoJUnitRunner.class)
public class DemoServiceTest {
	@InjectMocks
	DricalcServiceImpl driservice;
	 
	@Mock
	DricalcRepository dridao;
	
	
	 @Test
	 public void CreateTest() {
		 Dristeem emp=new Dristeem(
				 62,	"20",	"NEW FEATURE - Psychrometric Chart A Psychrometric chart is now available in DriCalc under the tools tab in the banner across the top of each page.",
				 	1,	1	,1	,1	,"http://www.dristeem.com/RenderPublicFile/781563",	null,	954,	null,	954);
		 when(dridao.save(emp)).thenReturn(emp);
		 assertEquals(emp, driservice.post(emp));
	 }
	 
	 
	 @Test
	 public void readAllDetails() {
		 List<Dristeem> emp=driservice.getdetails();
		 assertThat(emp).size().isGreaterThan(-1);
	 }
	
	 
	@Test
	 public void updateTest(){
		 Dristeem emp=new Dristeem(
				 62,	"20",	"NEW FEATURE - Psychrometric Chart A Psychrometric chart is now available in DriCalc under the tools tab in the banner across the top of each page.",
				 	1,	1	,1	,1	,"http://www.dristeem.com/RenderPublicFile/781563",	null,	954,	null,	954);
		 when(dridao.save(emp)).thenReturn(emp);
		 assertEquals(emp, driservice.change(emp));
	 }
	
	@Test
	void DeleteTest() {
	String str=driservice.delete(40010);
	String b="Successfully deleted";
	assertEquals(str,b);
	}
	
}
