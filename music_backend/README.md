# Music Project Backend

This is the backend for the Music Project, a music management system.

## Features

- JPA entities for Persona, Musico, Productor, Discografica, Cancion
- Repositories extending JpaRepository
- DTOs for requests and responses
- MapStruct mappers for entity-DTO conversion
- Services with business logic and custom exception handling
- Standardized error responses
- CommandLineRunner for integration simulation

## Technologies

- Spring Boot 3.2.0
- JPA/Hibernate
- H2 Database
- MapStruct
- Lombok

## Running

```bash
mvn spring-boot:run
```

The application will start, simulate saving data through services, and print the resulting DTOs to the console.

## Project Structure

- `model/`: JPA entities
- `repository/`: Data access layer
- `dto/`: Data transfer objects
- `mapper/`: MapStruct mappers
- `service/`: Business logic layer
- `exception/`: Custom exceptions