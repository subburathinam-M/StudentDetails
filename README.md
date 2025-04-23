# 🧑‍💻 Student Details API
🎓 Student Details Management API is a Spring Boot-based RESTful service that manages student and college data using MongoDB. 


## 🚀 Table of Contents

1. [Project Overview](#project-overview)
2. [Technologies Used](#technologies-used)
3. [Project Structure](#project-structure)
4. [API Endpoints](#api-endpoints)
5. [Running the Project](#running-the-project)
6. [Security Configuration](#security-configuration)
7. [Swagger Documentation](#swagger-documentation)
8. [Contributing](#contributing)
9. [License](#license)

## 1. 📌 Project Overview

A Spring Boot-based RESTful API for managing student and college details using MongoDB. This project supports full CRUD operations, gender-based filtering, and includes Swagger integration for testing the endpoints.

This project allows you to manage students and colleges with MongoDB as the database. It supports:

- CRUD operations for Students and Colleges
- Department and gender-based filtering
- Swagger UI for API testing
- Global exception handling
- Basic Spring Security setup

--


## 2. 🚀 Features

- 🔍 CRUD operations for **Students** and **Colleges**
- 🏫 College and Department Management
- 🎓 Gender-based filtering for students per department
- 💾 MongoDB for data persistence
- 🔒 Global Exception Handling
- 📘 Swagger UI for interactive API documentation

---

## 3. 🛠️ Technologies Used

- Java 17+
- Spring Boot 3.x
- Spring Data MongoDB
- Spring Security (Basic setup)
- Lombok
- Maven
- Swagger 3

## 🧰 Explain - Technologies Used

- **🚀 Spring Boot**: Framework to build the REST API quickly and efficiently with minimal configuration.
- **🍃 MongoDB**: NoSQL database used to store student and college data in a flexible, document-oriented format.
- **📘 Swagger**: Automatically generates API documentation and provides an interactive UI to test endpoints.
- **🔐 Spring Security**:Adds basic security and access control for API endpoints.
- **✨ Lombok**: Reduces boilerplate code by auto-generating getters, setters, constructors, etc.
- **☕ Java**:The core programming language used. Requires version 17 or higher for compatibility with Spring Boot 3.x.

---



## 4. 📁 Project Structure
```
student-details/
├── 📂 src/
│   └── 📂 main/
│       ├── 📂 java/
│       │   └── 📂 com/studentsdetails/studentdetails/
│       │       ├── 📂 config/
│       │       │   ├── 🔐 SecurityConfig.java
│       │       │   └── 📜 SwaggerConfig.java
│       │       ├── 📂 controller/
│       │       │   ├── 🎓 StudentController.java
│       │       │   └── 🏫 CollageController.java
│       │       ├── 📂 dto/
│       │       │   ├── 📦 StudentResponse.java
│       │       │   ├── 📦 StudentListResponse.java
│       │       │   ├── 📦 CollegeResponse.java
│       │       │   └── 📦 CollegeListResponse.java
│       │       ├── 📂 entity/
│       │       │   ├── 👨‍🎓 Students.java
│       │       │   └── 🏢 College.java
│       │       ├── 📂 repository/
│       │       │   ├── 💾 StudentRepository.java
│       │       │   └── 💾 CollegeRepository.java
│       │       ├── 📂 service/
│       │       │   ├── ⚙️ StudentService.java
│       │       │   ├── ⚙️ CollageService.java
│       │       │   └── 📂 impl/
│       │       │       ├── 🛠️ StudentServiceImpl.java
│       │       │       └── 🛠️ CollageServiceImpl.java
│       │       └── 🚀 StudentDetailsApplication.java
│       └── 📂 resources/
│           ├── ⚙️ application.properties
│           └── 📂 static/
├── 📄 .gitignore
├── 📄 README.md
├── 📄 pom.xml
└── ▶️ mvnw / mvnw.cmd
```

## 🔗 API Endpoints

### Student Endpoints

| Method | Endpoint                         | Description                  |
|--------|----------------------------------|------------------------------|
| POST   | `/api/student/add`              | Add a new student            |
| GET    | `/api/student/getstudents`      | Get all students             |
| GET    | `/api/student/getstudents/{id}` | Get student by ID            |
| PUT    | `/api/student/updateStudent/{id}` | Update student by ID         |
| DELETE | `/api/student/deleteStudent/{id}` | Delete student by ID         |

### College Endpoints

| Method | Endpoint                      | Description                  |
|--------|-------------------------------|------------------------------|
| POST   | `/api/college/add`           | Add a new college            |
| GET    | `/api/college/getColleges`   | Get all colleges             |
| GET    | `/api/college/getColleges/{id}` | Get college by ID         |
| PUT    | `/api/college/updateCollege/{id}` | Update college by ID      |
| DELETE | `/api/college/deleteCollege/{id}` | Delete college by ID      |

---

## 📥 Prerequisites

Before running the project, ensure you have:

- Java 17 or higher
- Maven
- MongoDB (Local or MongoDB Atlas)

---

## 5. 🏃 Running the Project

### 🔧 Setup

1. **Clone the repo**  
```bash
git clone https://github.com/yourusername/studentdetails.git
cd studentdetails
```

2. **Configure MongoDB**  
Update `application.properties`:

```properties
spring.data.mongodb.uri=mongodb://localhost:27017/studentdetails
```

3. **Run the application**

```bash
# Option 1: Run with Maven
mvn spring-boot:run

# Option 2: Build & Run JAR
mvn clean package
java -jar target/studentdetails-0.0.1-SNAPSHOT.jar
```

---

## 6. 🔐 Security Configuration

Basic Spring Security setup is included.  
You can access unsecured endpoints or customize security via `SecurityConfig.java`.  
For now, Swagger and APIs are publicly accessible for development/testing.

---

## 7. 📘 Swagger Documentation

Swagger UI allows you to test endpoints interactively.

- URL: [http://localhost:8080/swagger-ui/](http://localhost:8080/swagger-ui/)

### ❗ If Swagger is not loading:
- Ensure the app is running on port 8080
- Clear browser cache or try incognito
- Confirm Swagger dependency is included in `pom.xml`

---



## 8. 🤝 Contributing

Contributions are welcome!

- Fork the repository
- Create a new feature branch (`git checkout -b feature-name`)
- Commit your changes
- Push to your branch (`git push origin feature-name`)
- Create a Pull Request

---

This project provides a Spring Boot REST API for managing student details, with Swagger (OpenAPI) documentation.

## 📝 Problem (this problem facing this project)

When visiting the Swagger UI at `http://localhost:8080/swagger-ui/index.html` (or fetching `/v3/api-docs`), the app returned a **500 Internal Server Error**:

```
Failed to load API definition.
Fetch error
response status is 500 /v3/api-docs
```

Additionally, if Spring Security was enabled, navigating to `/swagger-ui/index.html` redirected to the default login page at `/login`.

## 🔍 Root Cause

1. **Global Exception Handler**
   - A `@RestControllerAdvice`-annotated class (e.g. `GlobalExceptionHandler`) was applied to **all** controllers, including Swagger's internal error endpoints.
   - Swagger’s `/v3/api-docs` is generated via internal controllers; the exception handler caught and formatted those internal errors, leading to malformed JSON and a 500.

2. **Spring Security Interception** (optional)
   - If Spring Security was on, without whitelisting the OpenAPI and Swagger UI paths, requests were redirected to `/login`.

## ✅ Solution

### 1. Exclude the Exception Handler from Swagger

Add the `@Hidden` annotation (from `io.swagger.v3.oas.annotations.Hidden`) to your global exception handler to tell Swagger to ignore it when generating docs:

```java
import io.swagger.v3.oas.annotations.Hidden;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

@Hidden
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<String> handleRuntime(RuntimeException ex) {
        return ResponseEntity
            .status(HttpStatus.INTERNAL_SERVER_ERROR)
            .body("Runtime error: " + ex.getMessage());
    }
}
```

This ensures Swagger’s JSON generator will skip your handler and produce valid OpenAPI JSON.

### 2. Whitelist Swagger Endpoints in Security (if using Spring Security)

In your `SecurityConfig`, permit the OpenAPI and Swagger UI paths:

```java
@Bean
public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
    http
        .csrf(csrf -> csrf.disable())
        .authorizeHttpRequests(auth -> auth
            .requestMatchers(
                "/v3/api-docs/**",
                "/swagger-ui/**",
                "/swagger-ui.html"
            ).permitAll()
            .anyRequest().authenticated()
        )
        .formLogin().disable()
        .httpBasic().disable();
    return http.build();
}
```

### 3. Basic Swagger Configuration

Include the Springdoc OpenAPI starter in your `pom.xml`:

```xml
<dependency>
  <groupId>org.springdoc</groupId>
  <artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
  <version>2.2.0</version>
</dependency>
```

And register the `OpenAPI` bean:

```java
@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
            .info(new Info()
                .title("Student Details API")
                .version("1.0")
                .description("API documentation for managing student details")
            );
    }
}
```

## 🚀 Verify

1. **Rebuild and run** your application:
   ```bash
   mvn clean install
   mvn spring-boot:run
   ```
2. **OpenAPI JSON**: `http://localhost:8080/v3/api-docs`
3. **Swagger UI**: `http://localhost:8080/swagger-ui/index.html`

You should now see the interactive API documentation without errors or login redirects.

---


## 9. 📄 License

This project is licensed under the **MIT License**. See the `LICENSE` file for more details.
