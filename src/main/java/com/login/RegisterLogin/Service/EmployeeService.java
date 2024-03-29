package com.login.RegisterLogin.Service;

import com.login.RegisterLogin.DTO.EmployeeDTO;
import com.login.RegisterLogin.DTO.LoginDTO;
import com.login.RegisterLogin.response.LoginResponse;
import org.springframework.stereotype.Service;


public interface EmployeeService {
    String addEmployee(EmployeeDTO employeeDTO);

    LoginResponse loginEmployee(LoginDTO loginDTO);
}
