# Nexo

**Nexo** is an eCommerce platform built using Spring Boot and Spring Cloud, featuring a microservices architecture. The application is designed to manage a single, exclusive shoe brand with a focus on scalability and performance.

## Microservices Architecture

### Services

- **Customer Service:** Manages user profiles and authentication.
- **Order Service:** Handles order processing and tracking.
- **Product Service:** Manages product catalog and inventory.
- **Payment Service:** Integrates with payment gateways for secure transactions.
- **Notification Service:** Sends order updates and promotional notifications.

### Configuration and Infrastructure

- **Configuration Server:** Centralized configuration management.
- **Discovery Server (Eureka):** Service registry and discovery.
- **API Gateway:** Routes requests to the appropriate service.
- **Asynchronous Communication:** Implemented with Kafka for event-driven communication.
- **Synchronous Communication:** Implemented with OpenFeign and RestTemplates for inter-service communication.
- **Distributed Tracing:** Enabled with Zipkin and Spring Actuator for monitoring and tracing requests.
- **Security:** Application security managed with Keycloak.
- **Containerization:** Infrastructure and required tools set up with Docker and Docker Compose.
