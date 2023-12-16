package com.techacademy;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KadaiFirstController {

	@GetMapping("/dayofweek/{date}")
	public String dispDayOfWeek(@PathVariable String date ) {
		DateTimeFormatter format=DateTimeFormatter.ofPattern("yyyyMMdd");
		LocalDate localdate=LocalDate.parse(date,format);
		DayOfWeek dayofweek=localdate.getDayOfWeek();
		String result=dayofweek.toString();

		return result ;
		}


	@GetMapping("/plus/{val1}/{val2}")
	public int calcPlus(@PathVariable int val1, @PathVariable int val2) {
	int plus=val1+val2;
	return plus;

	}

	@GetMapping("/minus/{val1}/{val2}")
	public int calcMinus(@PathVariable int val1,@PathVariable int val2) {
	int minus=val1-val2;
	return minus;
	}


	@GetMapping("/times/{val1}/{val2}")
	public int clacTimes(@PathVariable int val1,@PathVariable int val2) {
	int times=val1*val2;
	return times;
	}

	@GetMapping("/divide/{val1}/{val2}")
	public int clacDivide(@PathVariable int val1,@PathVariable int val2) {
    int divide=val1/val2;
    return divide;
	}





}

