package com.tharindi.Hotel_Vista.model;

import jakarta.persistence.*;

import java.util.Date;
@Entity
public class Payroll {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false,updatable = false)
    private Long id;

    private Double basicSalary;
    private Double allowance;
    private Double deduction;
    private Double netPay;
    private Date paymentDate;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "employeeId")
    private Employee employee;

    public Payroll() {
    }

    public Payroll(Long id, Double basicSalary, Double allowance, Double deduction, Double netPay, Date paymentDate, Employee employee) {
        this.id = id;
        this.basicSalary = basicSalary;
        this.allowance = allowance;
        this.deduction = deduction;
        this.netPay = netPay;
        this.paymentDate = paymentDate;
        this.employee = employee;
    }

    public Payroll(Double basicSalary, Double allowance, Double deduction, Double netPay, Date paymentDate, Employee employee) {
        this.basicSalary = basicSalary;
        this.allowance = allowance;
        this.deduction = deduction;
        this.netPay = netPay;
        this.paymentDate = paymentDate;
        this.employee = employee;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(Double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public Double getAllowance() {
        return allowance;
    }

    public void setAllowance(Double allowance) {
        this.allowance = allowance;
    }

    public Double getDeduction() {
        return deduction;
    }

    public void setDeduction(Double deduction) {
        this.deduction = deduction;
    }

    public Double getNetPay() {
        return netPay;
    }

    public void setNetPay(Double netPay) {
        this.netPay = netPay;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Payroll{" +
                "payrollId=" + id +
                ", basicSalary=" + basicSalary +
                ", allowance=" + allowance +
                ", deduction=" + deduction +
                ", netPay=" + netPay +
                ", paymentDate=" + paymentDate +
                ", employee=" + employee +
                '}';
    }
}
