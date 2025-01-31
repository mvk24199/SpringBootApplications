# ToDoList Application

This repository contains a comprehensive Spring Boot application designed for managing tasks. The ToDoList application includes features like CRUD operations, date management, and more, with plans for future enhancements.

## Features Overview

- **Basic Features**:
  - Add, update, delete, and fetch tasks.
  - Each task includes fields such as:
    - Title
    - Description
    - Completion status
    - Due date

- **Planned Enhancements**:
  - Validation using annotations like `@Valid`.
  - Authentication and authorization using Spring Security.
  - Integration with a persistent database like MySQL or PostgreSQL.

---

## Repository Structure

```
ToDoList Application
├── TODOLIST/src/java/com/vamsi/ToDoList
│   ├── controller
│   │   └── TaskController.java
│   ├── entity
│   │   └── Task.java
│   ├── repository
│   │   └── TaskRepository.java
│   ├── service
│   │   └── TaskService.java
│   ├── resources
│   │   ├── application.properties
│   │   └── static
│   ├── Main Application
│   │   └── ToDoListApplication.java
│   └── Test Files
│       └── ToDoListApplicationTests.java
├── README.md
└── .gitignore
```

---

## API Endpoints

### Base URL
`http://localhost:8080/api/tasks`

### Endpoints

#### 1. Get All Tasks
**GET** `/api/tasks`
- Fetch all tasks from the database.

#### 2. Get Task by ID
**GET** `/api/tasks/{id}`
- Fetch a specific task by its ID.

#### 3. Create a Task
**POST** `/api/tasks`
- **Request Body**:
  ```json
  {
      "title": "Complete project",
      "description": "Finish building the ToDoList application",
      "completed": false,
      "dueDate": "2025-02-15"
  }
  ```

#### 4. Update a Task
**PUT** `/api/tasks/{id}`
- **Request Body**:
  ```json
  {
      "title": "Update project",
      "description": "Enhance the ToDoList application",
      "completed": true,
      "dueDate": "2025-02-20"
  }
  ```

#### 5. Delete a Task
**DELETE** `/api/tasks/{id}`
- Delete a task by its ID.

---

## Configuration

### Application Properties
The application uses an **H2 in-memory database** for development:

```properties
spring.datasource.url=jdbc:h2:mem:tasksdb
spring.datasource.driver-class-name=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.h2.console.enabled=true
```

### H2 Console
Access the H2 database console at `http://localhost:8080/h2-console`.
- **JDBC URL**: `jdbc:h2:mem:tasksdb`
- **Username**: `sa`
- **Password**: (leave blank)

---

## How to Run

### Prerequisites
1. Install [Java JDK](https://www.oracle.com/java/technologies/javase-downloads.html) (version 17 or higher).
2. Install [Maven](https://maven.apache.org/install.html).

### Steps
1. Clone the repository:
   ```bash
   git clone https://github.com/<your-username>/ToDoList.git
   cd ToDoList
   ```
2. Build the project:
   ```bash
   ./mvnw clean install
   ```
3. Run the application:
   ```bash
   ./mvnw spring-boot:run
   ```

---

## Future Enhancements
- **Validation**: Add input validation using annotations like `@NotBlank`, `@Size`, and `@Future`.
- **Security**: Implement user authentication and role-based authorization using Spring Security.
- **Swagger**: Integrate Swagger for API documentation.
- **Database**: Replace the H2 database with MySQL/PostgreSQL for production environments.
- **Frontend**: Build a React or Angular frontend for the application.

---

## License
This project is licensed under the [MIT License](LICENSE).

---

## Contribution Guidelines
We welcome contributions! Please follow these steps:
1. Fork the repository.
2. Create a new branch for your feature:
   ```bash
   git checkout -b feature/your-feature-name
   ```
3. Commit your changes:
   ```bash
   git commit -m "Add your commit message"
   ```
4. Push to your branch:
   ```bash
   git push origin feature/your-feature-name
   ```
5. Create a pull request.

---

## Author
Developed by Vamsi Krishna Madavarapu.
