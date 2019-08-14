package com.example.demo.controller;

import com.example.demo.dto.EmiDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FormulaController {
    @PostMapping("/emi")
    public EmiDto operation1(@RequestBody EmiDto emiDto) {
        long l = emiDto.getLoan();
        double rate = emiDto.getRateOfInterest();
        double r = (rate / 12) / 100;
        int n = emiDto.getTenure();
        emiDto.setResult(emi(l, r, n));
        return emiDto;
    }

    @PostMapping("/emi2")
    public EmiDto operation2(@RequestBody EmiDto emiDto) {
        int remainingMonths = emiDto.getRemainingMonths();
        long closureCharges = emiDto.getClosureCharges();
        long l = emiDto.getLoan();
        double rate = emiDto.getRateOfInterest();
        double r = (rate / 12) / 100;
        int n = emiDto.getTenure();


        emiDto.setResult(closureCharges + remainingMonths * emi(l, r, n));
        return emiDto;
    }



    private double emi(long l, double r, int n) {
        return l * ((r * (Math.pow((1 + r), n))) / (Math.pow((1 + r), n) - 1));
    }
}
