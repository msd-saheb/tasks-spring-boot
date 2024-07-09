# Task 1 : Alice and her Bakery

Alice loves baking cakes and wants to create a program that helps her manage different types of cakes. In this program, we'll create a class called `CakeBaker` that relies on two other classes, `Frosting` and `Syrup`. We'll also use dependency injection to ensure the `CakeBaker` class can easily get the types of frosting and syrup it needs.

## Classes and Interfaces

### CakeBaker
The `CakeBaker` class will be dependent on two other classes: `Frosting` and `Syrup`. It will have a function called `bakeCake()` which uses the injected dependencies to bake a cake.

### Interfaces
We will create two interfaces:
1. `Frosting` with a function `getFrostingType()`.
2. `Syrup` with a function `getSyrupType()`.

### Implementations
We will create two implementations for each interface:
1. `ChocolateFrosting` implementing the `Frosting` interface.
2. `StrawberryFrosting` implementing the `Frosting` interface.
3. `ChocolateSyrup` implementing the `Syrup` interface.
4. `StrawberrySyrup` implementing the `Syrup` interface.

# Task 2 : Department REST API

This project demonstrates a simple REST API for managing `Department` entities using Spring Boot.

## Department Entity

The `Department` entity has the following fields:
- `id`: The unique identifier for the department.
- `title`: The title of the department.
- `isActive`: A boolean indicating if the department is active.
- `createdAt`: The date and time when the department was created.
- `numberOfEmployees`: The number of employees in the department.
- `password`: The password for the department.

## REST Endpoints

### Get All Departments

**URL:** `/departments`  
**Method:** `GET`  
**Description:** Retrieves a list of all departments.

**Response:**
```json
{
    "data": [
        {
            "id": 1,
            "title": "HR",
            "createdAt": "2023-07-09T10:00:00",
            "numberOfEmployees": 25,
            "password": "ExamplePass1$",
            "isActive": true
        },
        {
            "id": 2,
            "title": "Finance",
            "createdAt": "2023-07-09T10:00:00",
            "numberOfEmployees": 15,
            "password": "ExamplePass2$",
            "isActive": true
        }
    ],
    "timeStamps": "2024-07-09T11:39:00.505628",
    "error": null
}

