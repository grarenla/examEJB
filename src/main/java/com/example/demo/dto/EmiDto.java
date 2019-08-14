package com.example.demo.dto;

public class EmiDto {
    private long loan;
    private long rateOfInterest;
    private int tenure;
    private long closureCharges;
    private int remainingMonths;
    private double result;

    public EmiDto() {
    }

    public long getLoan() {
        return loan;
    }

    public int getRemainingMonths() {
        return remainingMonths;
    }

    public void setRemainingMonths(int remainingMonths) {
        this.remainingMonths = remainingMonths;
    }

    public void setLoan(long loan) {
        this.loan = loan;
    }

    public long getRateOfInterest() {
        return rateOfInterest;
    }

    public long getClosureCharges() {
        return closureCharges;
    }

    public void setClosureCharges(long closureCharges) {
        this.closureCharges = closureCharges;
    }

    public void setRateOfInterest(long rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }

    public int getTenure() {
        return tenure;
    }

    public void setTenure(int tenure) {
        this.tenure = tenure;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
}
