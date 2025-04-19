package com.example.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculateVacationPay {

    private static final double averageMonthDAY = 29.3;

    @GetMapping("/Calculate")

    public CalculateResult calculate(@RequestParam(value = "averageSalary", defaultValue = "null") String averageSalary, Integer vacationDay) {

        return new CalculateResult(String.format("%.2f", (Double.parseDouble(averageSalary) / averageMonthDAY) * vacationDay));
    }
}
