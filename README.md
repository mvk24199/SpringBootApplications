# SpringBootApplications Repository

This repository contains multiple Spring Boot applications designed to demonstrate various features and use cases of the Spring Boot framework. Each application is modular and focused on specific functionalities, making it easy for developers to explore and learn.

---

## Repository Structure

```
SpringBootApplications
├── ToDoList
│   ├── Backend
│   │   ├── Controllers
│   │   │   └── TaskController.java
│   │   ├── Entities
│   │   │   └── Task.java
│   │   ├── Repositories
│   │   │   └── TaskRepository.java
│   │   ├── Services
│   │   │   └── TaskService.java
│   │   ├── Resources
│   │   │   ├── application.properties
│   │   │   └── static
│   │   ├── Main Application
│   │   │   └── ToDoListApplication.java
│   │   └── Test Files
│   │       └── ToDoListApplicationTests.java
│   └── README.md
└── README.md
```

---

## Applications

### 1. **ToDoList Application**
**Description**: A task management application that provides CRUD operations for managing tasks. Users can create, update, delete, and fetch tasks along with their due dates.

#### Features:
- Add, update, delete, and fetch tasks.
- Task attributes:
  - Title
  - Description
  - Completion status
  - Due date

#### API Endpoints:
- **GET** `/api/tasks`: Fetch all tasks.
- **GET** `/api/tasks/{id}`: Fetch a task by ID.
- **POST** `/api/tasks`: Create a new task.
- **PUT** `/api/tasks/{id}`: Update an existing task.
- **DELETE** `/api/tasks/{id}`: Delete a task by ID.

#### Setup:
1. Navigate to the `ToDoList` directory.
2. Build and run the application using Maven:
   ```bash
   ./mvnw clean install
   ./mvnw spring-boot:run
   ```
3. Access the application at `http://localhost:8080`.

For more details, check the [ToDoList README](ToDoList/README.md).

---

## How to Use

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/<your-username>/SpringBootApplications.git
   cd SpringBootApplications
   ```
2. **Navigate to a Specific Application**:
   Each application resides in its own folder. For example, navigate to `ToDoList` for the task management application.

3. **Run the Application**:
   Use Maven to build and run any application in the repository.
   ```bash
   ./mvnw clean install
   ./mvnw spring-boot:run
   ```

---

## Contribution Guidelines

We welcome contributions to this repository. To contribute:
1. Fork the repository.
2. Create a feature branch:
   ```bash
   git checkout -b feature/your-feature-name
   ```
3. Commit your changes:
   ```bash
   git commit -m "Add your feature description"
   ```
4. Push your branch:
   ```bash
   git push origin feature/your-feature-name
   ```
5. Create a pull request.

---

## Future Applications

This repository will be expanded to include additional Spring Boot applications, such as:
- User Authentication and Authorization.
- E-commerce application backend.
- RESTful API with pagination and sorting.

Stay tuned for updates!

---

## License
This repository is licensed under the [MIT License](LICENSE).

---

## Author
Developed by Vamsi Krishna Madavarapu