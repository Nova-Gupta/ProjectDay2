# EmployeePostman

A Spring Boot REST API application for managing employees using **H2 Database**, **Spring Data JPA**, and **Hibernate**.

This project demonstrates CRUD operations, validation, exception handling, automatic salary assignment based on employee designation, salary increment, and application termination using REST APIs tested with Postman.

---

## Technologies Used

- Java 21
- Spring Boot
- Spring Web
- Spring Data JPA
- Hibernate
- H2 Database
- Maven
- Postman

---

## Features

- Create Employee
- Display All Employees
- Raise Employee Salary
- Automatic Salary Assignment
- Exit Application
- Input Validation
- Global Exception Handling
- H2 Database Integration

---

## Salary Structure

| Designation | Salary |
|-------------|--------|
| Programmer | ₹25,000 |
| Manager | ₹30,000 |
| Tester | ₹20,000 |

The salary is assigned automatically based on the selected designation.

---

## Validation Rules

### Name

- Only alphabets allowed
- Maximum 2 spaces (maximum 3 words)

Examples

```
Nova
Nova Gupta
Nova Kumar Gupta
```

---

### Age

18 – 60

---

### Salary Increment

1% – 10%

---

## REST APIs

### Create Employee

```
POST /employee
```

Request Body

```json
{
    "name":"Nova Gupta",
    "age":21,
    "salary":0,
    "designation":"Programmer"
}
```

---

### Display Employees

```
GET /employee
```

---

### Raise Salary

```
PUT /employee/raise?name=Nova Gupta&percentage=5
```

---

### Exit Application

```
GET /employee/exit
```

This endpoint terminates the Spring Boot application using `System.exit(0)`.

---

## H2 Database

Console URL

```
http://localhost:8080/h2-console
```

JDBC URL

```
jdbc:h2:mem:employeedb
```

Username

```
sa
```

Password

```
Leave Blank
```

---

## Project Structure

```
EmployeePostman
│
├── controller
├── entity
├── repository
├── service
├── exception
├── resources
│     └── application.properties
└── EmployeePostmanApplication.java
```

---

## Learning Outcomes

- Spring Boot REST APIs
- CRUD Operations
- Spring Data JPA
- Hibernate ORM
- H2 Database
- Bean Validation
- Exception Handling
- Postman API Testing

---

## Author

**Nova Gupta**