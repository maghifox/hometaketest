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


3. API testing with KarateLabs


