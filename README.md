# Full-Stack-Application

## Overview

This repository hosts a Full Stack Application, featuring a React-based frontend, a Spring Boot backend, and a PostgreSQL database running in Docker.

## Frontend

The frontend is crafted using React, offering an interactive user experience and a polished UI.

### Getting Started with the Frontend

To run the frontend locally:

1. Clone this repository.
2. Navigate to the frontend directory: `cd frontend`.
3. Install the dependencies: `npm install`.
4. Start the development server: `npm start`.

The application will be accessible at `localhost:3000`.

## Backend

The backend is powered by Spring Boot, providing a robust platform for scalable web applications.

### Setting Up the Backend

To set up and run the backend:

1. Navigate to the backend directory: `cd backend`.
2. Build the project: `./mvnw package`.
3. Run the Spring Boot application: `./mvnw spring-boot:run`.

## Database

The application uses PostgreSQL as its data storage solution, running inside a Docker container for consistent development and deployment environments.

### Running PostgreSQL in Docker

To run the PostgreSQL database:

1. Ensure Docker is installed on your machine.
2. Execute the command: `docker run --name postgres -e POSTGRES_PASSWORD=mysecretpassword -d postgres`.

Replace `mysecretpassword` with a secure password of your choosing.
