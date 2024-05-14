# Spring Boot RESTful Web Services

This project demonstrates the implementation of basic CRUD (Create, Read, Update, Delete) operations using Spring Boot for building RESTful web services.

## Technologies Used

- Spring Boot
- Spring Data JPA
- MySQL Database
- Maven

## Project Structure

The project follows a standard Maven directory structure:

- `src/main/java`: Contains the Java source code.
- `src/main/resources`: Contains application properties and configuration files.
- `src/test`: Contains test cases.

## Dependencies

- **Spring Boot Starter Data JPA**: Provides support for Spring Data JPA and Hibernate.
- **Spring Boot Starter Web**: Starter for building web, including RESTful, applications using Spring MVC.
- **MySQL Connector/J**: MySQL JDBC driver for connecting to MySQL database.
- **Project Lombok**: Provides annotations to reduce boilerplate code in model classes.
- **Spring Boot Starter Test**: Starter for testing Spring Boot applications with libraries including JUnit, Hamcrest, and Mockito.

## Configuration

### `application.properties`

- Configures the application properties such as:
    - `spring.application.name`: Name of the Spring Boot application.
    - `spring.datasource.url`: URL of the MySQL database.
    - `spring.datasource.username`: Username for connecting to the database.
    - `spring.datasource.password`: Password for connecting to the database.
    - `spring.jpa.properties.hibernate.dialect`: Hibernate dialect for MySQL.
    - `spring.jpa.hibernate.ddl-auto`: Hibernate DDL auto mode.

### `pom.xml`

- Maven Project Object Model (POM) file containing project configuration.
- Specifies project dependencies, plugins, and build configurations.

## Entity

### `User.java`

- Represents the User entity with attributes `id`, `firstName`, `lastName`, and `email`.
- Annotated with JPA annotations for mapping to the database table.

## Repository

### `UserRepository.java`

- Extends `JpaRepository` for CRUD operations on the `User` entity.

## Service

### `UserService.java`

- Defines service methods for CRUD operations on users.

### `UserServiceImpl.java`

- Implements the `UserService` interface.
- Provides methods for creating, retrieving, updating, and deleting users.

## Controller

### `UserController.java`

- REST controller for handling HTTP requests related to user operations.
- Defines endpoints for CRUD operations on users.

## Endpoints

- `POST /api/users`: Create a new user.
- `GET /api/users/{id}`: Get user by ID.
- `GET /api/users`: Get all users.
- `PUT /api/users/{id}`: Update user by ID.
- `DELETE /api/users/{id}`: Delete user by ID.

## Running the Application

1. Ensure MySQL is running locally with the configuration specified in `application.properties`.
2. Build the project using Maven: `mvn clean install`.
3. Run the application: `mvn spring-boot:run`.

## Usage

- Use tools like Postman or curl to interact with the RESTful APIs exposed by the application.
- Send HTTP requests to the defined endpoints to perform CRUD operations on users.

## Conclusion

This project demonstrates the implementation of a basic RESTful web service using Spring Boot, Spring Data JPA, and MySQL. It provides a foundation for building more complex applications with additional features and functionalities.
