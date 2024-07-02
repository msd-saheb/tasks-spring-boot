# Alice and her Bakery

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