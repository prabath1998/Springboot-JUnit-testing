package com.test.jpatesting;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class EmployeeRepositoryTests {
    @Autowired
    private EmployeeRepository employeeRepository;

    //junit tests for save employee
    @Test
    public void saveEmployeeTest(){
        Employee employee = Employee.builder()
                .firstName("Prabath")
                .lastName("Udayanga")
                .email("prabath@gmail.com")
                .build();

        employeeRepository.save(employee);
        Assertions.assertThat(employee.getId()).isGreaterThan(0);
    }
}
