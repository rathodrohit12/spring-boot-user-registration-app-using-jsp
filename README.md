# SpringBootUserRegistrationApp
# Spring Boot User Login and Registration

This is a **Spring Boot** project for user **login** and **registration** functionality, following the **MVC (Model-View-Controller) architecture**. The application supports dynamic JSP rendering using **JasperReports** for generating reports and managing user sessions securely.

## Features
- **User Registration**: Users can sign up with an email, username, and password (passwords are hashed for security).
- **User Login**: Users can log in with email/username and password authentication.
- **Session Management**: After logging in, users are redirected to a dashboard and remain logged in until they log out.
- **Dynamic JSPs**: Uses **JasperReports** to generate dynamic content and reports in JSP format.
- **Form Validation**: Input validation for both registration and login forms (e.g., password length, valid email format).
- **Error Handling**: Provides clear feedback for failed login or registration attempts (e.g., incorrect credentials, existing user).
- **Secure Authentication**: Passwords are securely hashed and stored using **BCrypt**.

## Technologies Used
- **Spring Boot** (Backend)
  - Spring MVC for **Controller, Service, and Repository layers**.
  - **Spring Security** for handling authentication and session management.
- **JasperReports** for generating dynamic reports and integrating them into JSP pages.
- **Thymeleaf/JSP** for rendering the front-end pages.
- **H2 Database** for demo purposes (can be replaced with MySQL or any other database).
- **BCrypt** for password hashing and security.

## Project Structure
- **Model**: Represents the entities, such as User, Role, etc.
- **Controller**: Handles HTTP requests, processes user input, and returns appropriate views.
- **Service**: Contains the business logic (e.g., registering users, authenticating users).
- **Repository**: Interacts with the database to fetch and persist data (e.g., User repository).
- **JasperReports**: Used to generate dynamic reports rendered in JSP views.

### Project Folder Structure
com.example.project
├── config         (Configuration classes)
├── controller     (Controllers for handling HTTP requests)
├── model          (Domain objects, e.g., entities, DTOs)
│   ├── dto        (Data Transfer Objects)
│   └── entity     (JPA entities)
├── service        (Business logic classes)
├── repository     (Database interaction classes)
└── util           (Utility/helper classes)



## Setup and Installation

### Prerequisites
- **Java 8 or higher** installed on your machine.
- **Maven** for building the project.
- **JDK** for running the Spring Boot application.

### Steps to Run Locally
1. **Clone the repository:**
   ```bash
   git clone https://github.com/your-username/your-repo-name.git
   cd your-repo-name

2. **Setup application.properties**
spring.application.name=SpringBootDemo
server.port=8080
spring.mvc.view.prefix=/WEB-INF/views/
spring.mvc.view.suffix=.jsp
spring.datasource.driver-class-name =com.mysql.cj.jdbc.Driver
spring.datasource.url=jdbc:mysql://localhost:3306/database-name
spring.datasource.username=root
spring.datasource.password=root
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql = true

3. **Access the application: Open a browser and go to**
   http://localhost:8080

