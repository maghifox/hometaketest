# hometaketest

1.
a.) 
```SELECT emp_name, emp_status 
FROM tbl_employee
```

B.) 
```SELECT a.emp_name, a.emp_status, b.emp_income 
FROM tbl_employee a 
JOIN tbl_income b ON a.emp_code = b.emp_code 
WHERE a.emp_status = 'R'
```

C.)
```SELECT a.emp_code, a.emp_name, a.emp_status, b.emp_income
FROM tbl_employee a 
JOIN tbl_income b ON a.emp_code = b.emp_code
ORDER BY b.emp_income desc
```

2. Automation with Selenium TestNG in Java and Cucumber
![VideoSoal2__online-video-cutter_com__AdobeExpress](https://github.com/maghifox/hometaketest/assets/48327678/bc87526b-8ae1-416a-acd8-afd833eb3ea6)

3. API testing with KarateLabs
![image](https://github.com/maghifox/hometaketest/assets/48327678/70277943-d29e-40d9-9799-a0e86870bf28)

