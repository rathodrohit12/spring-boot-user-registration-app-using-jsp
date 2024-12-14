# SpringBootUserRegistrationApp
# Spring Boot User Login and Registration

This is a **Spring Boot** project for user **login** and **registration** functionality. Jsp's are used as UI components for user interactions, following the **MVC (Model-View-Controller) architecture**.

## Features
- **User Registration**: Users can sign up with an email, username, and password (passwords are hashed for security).
- **User Login**: Users can log in with email/username and password authentication.


## Technologies Used
- **Spring Boot** (Backend)
  - Spring MVC for **Controller, Service, and Repository layers**.


## Project Structure
- **Model**: Represents the entities, such as User, Role, etc.
- **Controller**: Handles HTTP requests, processes user input, and returns appropriate views.
- **Service**: Contains the business logic (e.g., registering users, authenticating users).
- **Repository**: Interacts with the database to fetch and persist data (e.g., User repository).

### Project Folder Structure
```
com.rohit.springbootdemo
├── config         (Configuration classes)
├── controller     (Controllers for handling HTTP requests)
├── dto            (Data Transfer Objects)
|── entity         (JPA entities)
├── service        (Business logic classes)
├── repository     (Database interaction classes)
└── util           (Utility/helper classes)
```

## Setup and Installation

### Prerequisites
- **Java 8 or higher** installed on your machine.
- **Maven** for building the project.
- **JDK** for running the Spring Boot application.

### Steps to Run Locally
1. **Clone the repository:**
   ```bash
   git clone https://github.com/rathodrohit12/SpringBootUserRegistrationApp.git
   cd your-repo-name

2. **Setup application.properties**
Note: Below code of lines should be added in applications.properties file for working with jsp. Also add 'tomcat-embed-jasper' maven dependency
```properties
  
  spring.mvc.view.prefix=/WEB-INF/views/
  spring.mvc.view.suffix=.jsp
 
```
3. **Access the application: Open a browser and go to:**
   http://localhost:8080

