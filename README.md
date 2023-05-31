# hometaketest

1.
a.) 
```
SELECT emp_name, emp_status 
FROM tbl_employee
```

B.) 
```
SELECT a.emp_name, a.emp_status, b.emp_income 
FROM tbl_employee a 
JOIN tbl_income b ON a.emp_code = b.emp_code 
WHERE a.emp_status = 'R'
```

C.)
```
SELECT a.emp_code, a.emp_name, a.emp_status, b.emp_income
FROM tbl_employee a 
JOIN tbl_income b ON a.emp_code = b.emp_code
ORDER BY b.emp_income desc
```

2. Automation with Selenium TestNG in Java and Cucumber
![image](https://github.com/maghifox/hometaketest/assets/48327678/cada2b26-b020-4624-b24c-9e180fa93294)


3. API testing with KarateLabs
![image](https://github.com/maghifox/hometaketest/assets/48327678/54718b15-6940-4645-a1e6-a9e30625b2ec)


