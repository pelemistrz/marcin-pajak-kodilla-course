package com.kodilla.patterns2.adapter.company.newhrsystem;

import java.math.BigDecimal;
import java.util.List;

public class CompanySalaryProcessor implements SalaryProcessor {
    @Override
    public BigDecimal calculateSalaries(List<Employee> employeeList) {
        BigDecimal sum = BigDecimal.ZERO;
        sum = employeeList.stream()
                .map(e->e.getBaseSalary())
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        return sum;
    }
}
