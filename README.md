
## Description
This project is a simple Spring Boot RESTful API for managing items (like ecommerce products).
It supports adding items and fetching items by ID using in-memory storage.

## Technologies Used
- Java 17
- Spring Boot
- REST API
- Swagger UI
- Maven



## Features
- Add item
- Get item by ID
- Input validation
- Global exception handling
- Swagger documentation
- In-memory storage (ArrayList)

## How to Run
1. Clone project
2. Open in Eclipse/IntelliJ
3. Run DemoApplication.java
4. Server starts on: http://localhost:8080

## Swagger Documentation
Open:
http://localhost:8080/swagger-ui/index.html

## API Endpoints

  Add Item
POST /api/items


   Get Item by id
GET /api/items/{id}

## Sample JSON
{
"id":1,
"name":"iPhone",
"description":"Apple phone",
"price":75000,
"category":"Electronics",
"brand":"Apple"
}
