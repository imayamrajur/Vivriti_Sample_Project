package com.raju.vivriti.average;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AverageInteger {
	
	List<Integer> list = Arrays.asList(25,64,78,25,10,67,24,89);
	int avg=0;
	int sum=0;
	@Bean
	public int getAverageValue() {
		int size=list.size();
		for(int a : list) {
			sum=sum+a;
		}
		avg=sum/size;
		return avg;
	}

}
