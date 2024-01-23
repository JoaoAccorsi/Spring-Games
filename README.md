# Spring Games

Spring Games is a backend implementation of a Game Application which expose some games via endpoints.

The data is stored into H2 database for the development environment, and into PostgreSQL with Docker for the test one.

The program is a Spring Boot Application, developed based in the Spring Boot Training provided by teacher Nelio Alves, from YouTube channel DevSuperior.

## Domain Model:

![model](https://github.com/JoaoAccorsi/Spring-Games/assets/60155867/c5a4445b-ba53-4a22-a1e2-eddd4ad4b448)

## Functionalities:

The program exposes four endpoints:

> http://localhost:8080/games <br />
> Returns a list with all the games

> http://localhost:8080/games/4 <br />
> Returns one specific game by the numeric Id

> http://localhost:8080/lists <br />
> Returns the game lists (RPG, Sports, Platform...)

> http://localhost:8080/lists/2/games <br />
> Returns the list of the games which falls into a specific genre category (RPG, Sports, Platform...)

## Program:
![image](https://github.com/JoaoAccorsi/Spring-Games/assets/60155867/4dff02f4-3475-42e1-818a-66c7e6130c94)

![image](https://github.com/JoaoAccorsi/Spring-Games/assets/60155867/e7329d19-d955-4c6a-b030-839b46f53dad)

![image](https://github.com/JoaoAccorsi/Spring-Games/assets/60155867/d0200d59-ce77-4448-be53-2ed03d13a833)

![image](https://github.com/JoaoAccorsi/Spring-Games/assets/60155867/f9f3fd87-de44-4dda-aabb-cd39e908a454)

## How to run the Project?

# Project
Prerequisite: Java 21, Docker Desktop

```bash
# clone repository
git clone https://github.com/JoaoAccorsi/Spring-Games.git

# run the project
./mvnw spring-boot:run
```

# Docker

Navigate to the folder where script `docker-compose.yml` is located, and run the below command to initialize two containers Postgresql 12 e pgAdmin 4:

```bash
docker-compose up -d
```

![image](https://github.com/JoaoAccorsi/Spring-Games/assets/60155867/c474032d-a51b-4970-80f1-a8dbc6948220)

To see the endpoints via any API Platform, you may import file `Insomnia-Spring-Games.json` via Insomnia, Postman...

## Technologies 

- Java
- Spring Boot
- JPA / Hibernate
- Maven
- H2 Database

## Deploy

- Docker
- PostgreSQL Database
- pgAdmin
