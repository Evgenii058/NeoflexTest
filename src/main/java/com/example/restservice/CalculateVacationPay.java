package com.example.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculateVacationPay {

//	private static final String template = "Hello, %s!";
	private static final double averageMonthDAY = 29.3;
	//private final AtomicLong counter = new AtomicLong();

	@GetMapping("/Calculate")
//	public Calculate greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		public CalculateResult greeting(@RequestParam(value = "averageSalary", defaultValue = "null") String averageSalary, Integer vacationDay) {
//		return new Greeting(counter.incrementAndGet(), String.format(template, name));
//		return new Calculate(name+1);
		return new CalculateResult(String.format("%.2f",(Double.parseDouble(averageSalary)/averageMonthDAY)*vacationDay));
	}
}
