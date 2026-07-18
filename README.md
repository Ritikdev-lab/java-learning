# Practice Project

A personal Java practice project for learning, experimenting with language features, and improving software development skills.

---

## Overview

This repository contains Java practice programs, language feature demonstrations, and small experiments created while learning Core Java and modern Java development.

The purpose of this project is to:

- Strengthen problem-solving skills
- Practice core Java concepts
- Explore modern Java language features
- Improve code organization and readability
- Build consistent hands-on programming experience
- Maintain a reference collection of examples for future learning

---

## Technologies Used

- Java
- Maven
- Git & GitHub
- JUnit (for testing)
- Command Line / Terminal

---

## Project Structure

```text
practice-project/
├── .mvn/                  # Maven Wrapper configuration
├── src/
│   ├── main/
│   │   ├── java/          # Application source code
│   │   └── resources/     # Application resources
│   └── test/
│       ├── java/          # Unit tests
│       └── resources/     # Test resources
├── target/                # Generated build files (ignored by Git)
├── mvnw                   # Maven Wrapper (Linux/macOS)
├── mvnw.cmd               # Maven Wrapper (Windows)
├── pom.xml                # Maven project configuration
├── .gitignore
├── LICENSE
└── README.md
```

---

## Features

This repository includes examples and practice code covering topics such as:

- Java syntax and fundamentals
- Object-Oriented Programming (OOP)
- Classes and Objects
- Constructors
- Methods and Parameters
- Static members
- Packages
- Inheritance
- Polymorphism
- Interfaces
- Abstract classes
- Enums
- Records
- Sealed classes
- Pattern Matching
- Exception Handling
- Collections Framework
- Generics
- File I/O
- Modern Java features
- Small programming exercises and experiments

More topics will be added as learning progresses.

---

## Prerequisites

Before building the project, ensure you have one of the following:

- JDK installed

or

- Use the included Maven Wrapper (`mvnw` / `mvnw.cmd`), which automatically downloads the required Maven version.

---

## Getting Started

### Clone the Repository

```bash
git clone https://github.com/<your-username>/<repository-name>.git
cd <repository-name>
```

Replace the URL with your actual GitHub repository.

---

## Build the Project

Using the Maven Wrapper (recommended):

### Linux/macOS

```bash
./mvnw clean compile
```

### Windows

```cmd
mvnw.cmd clean compile
```

Or, if Maven is installed:

```bash
mvn clean compile
```

---

## Run the Tests

```bash
mvn test
```

---

## Package the Project

```bash
mvn package
```

The generated artifacts will be placed inside the `target/` directory.

---

## Learning Goals

This repository is intended to help develop a strong understanding of:

- Core Java
- Clean code practices
- Object-Oriented Programming
- Modern Java language features
- Problem-solving techniques
- Build automation with Maven
- Version control using Git and GitHub

---

## Notes

This repository is maintained primarily for educational purposes.

Some code may include:

- Learning exercises
- Experimental implementations
- Practice programs
- Work-in-progress examples

Not every example is intended for production use.

---

## Future Improvements

Planned improvements include:

- Add more Java practice examples
- Expand unit test coverage
- Improve project organization
- Add documentation for each package
- Create small console applications
- Explore design patterns
- Add database examples using JDBC
- Learn build profiles and plugins in Maven

---

## License

This project is licensed under the Apache License 2.0.

You may use, modify, and distribute this project in accordance with the terms of the Apache License 2.0.

See the `LICENSE` file for complete details.

---

## Author

Created and maintained as part of a personal Java learning journey.
