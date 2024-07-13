# selenide-basic-example
This project comes to help other new QAs in web automation, bringing examples of how to use [Selenide](https://selenide.org/)

## How to use:

- [Installation](#installation)
- [Examples](#examples)
- [Technologies](#technologies)
- [Patterns](#patterns)
- [Dependencies](#dependencies)

---

## Installation
### Clone

- Clone this repository to your local machine using the command below:
```
	$ git clone https://github.com/willysalazar/selenide-basic-example.git
```

---

### Execution

> Access project root

```
	$ cd /your_directory/selenium-webdriver-java-example
```
> Execute the command to run all tests in the project

```
	$ mvn clean test
```
> Execute the command to run only one test class in the project

```
	$ mvn clean test -Dtest=<LoginTest>
```

---

### Reports

> Generate Allure reports

```
	$ mvn test allure:serve
```

---


## Examples
### SauceDemo Example List
> Example project developed to perform automated tests on the website [SauceDemo](https://www.saucedemo.com/)
- Login
- LoginParameterized
- AddItemCart 
- CheckoutCompleteTest

---

## Technologies:
- Selenide
- Java
- Maven

## Patterns
- Page Object

---

### Dependencies
* *[selenide](https://selenide.org/)*
* *[junit5](https://junit.org/junit5/)*
* *[lombok](https://projectlombok.org/)*
* *[owner](https://matteobaccan.github.io/owner/)*
* *[allure](https://docs.qameta.io/allure/)*



---

