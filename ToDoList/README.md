# ToDoList Application

The **ToDoList Application** is a simple task management system built using **Java Spring Boot**. It allows users to create, update, view, and delete tasks, with proper input validations and exception handling.

---

## Features

1. **Task Management**:
   - Create tasks with attributes like title, description, and due date.
   - Update existing tasks.
   - Mark tasks as completed or delete them.
   - View all tasks or specific tasks by ID.

2. **Validation**:
   - Task title and description have mandatory and size constraints.
   - Due date must not be in the past.

3. **Global Exception Handling**:
   - Centralized error handling for invalid inputs, resource not found, and other exceptions.

4. **Database Integration**:
   - In-memory H2 database for quick testing.
   - Auto-creation of database tables based on JPA entities.

---

## Technologies Used

- **Java 21**
- **Spring Boot 3.4.2**
- **Spring Data JPA**
- **H2 Database**
- **Lombok** (for reducing boilerplate code)
- **Jakarta Validation API**

---

## Getting Started

### Prerequisites

- Java 17 or above installed.
- Maven installed.
- Git installed.

### Steps to Run the Application

1. Clone the repository:

   ```bash
   git clone <repository-url>
   cd ToDoList
   ```

2. Build the application:

   ```bash
   mvn clean install
   ```

3. Run the application:

   ```bash
   mvn spring-boot:run
   ```

4. Access the application at:

   ```
   http://localhost:8080
   ```

---

## API Endpoints

### Base URL: `/api/tasks`

1. **Create a Task**:
   - **POST** `/api/tasks`
   - Request Body:
     ```json
     {
       "title": "My Task",
       "description": "This is a test task",
       "dueDate": "2025-01-31"
     }
     ```

2. **Get All Tasks**:
   - **GET** `/api/tasks`

3. **Get Task by ID**:
   - **GET** `/api/tasks/{id}`

4. **Update Task**:
   - **PUT** `/api/tasks/{id}`
   - Request Body:
     ```json
     {
       "title": "Updated Task",
       "description": "Updated description",
       "dueDate": "2025-02-01"
     }
     ```

5. **Delete Task**:
   - **DELETE** `/api/tasks/{id}`

---

## Validation Rules

1. **Title**:
   - Must not be blank.
   - Length: 3-50 characters.

2. **Description**:
   - Must not be blank.
   - Length: 10-500 characters.

3. **Due Date**:
   - Must not be in the past.

---

## Global Exception Handling

The application includes a `GlobalExceptionHandler` to manage:

- **Validation Errors**:
  - Returns `400 Bad Request` with validation details.

- **Resource Not Found**:
  - Returns `404 Not Found` when a task ID does not exist.

- **Generic Errors**:
  - Returns `500 Internal Server Error` for any unhandled exceptions.

---

## H2 Database Console

- Access the H2 database console at:
  ```
  http://localhost:8080/h2-console
  ```

- JDBC URL: `jdbc:h2:mem:tasksdb`
- Username: `ADMIN`

---

## Future Enhancements

- Add user authentication and authorization.
- Integrate with an external database like MySQL or PostgreSQL.
- Add sorting and filtering capabilities to the task list.

---
