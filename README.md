# selenide-basic-example
This project comes to help other new QAs in web automation, bringing examples of how to use Selenide.

> Example project developed to perform automated tests on the website 
>> To collaborate with The Internet: https://github.com/saucelabs/the-internet

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
	$ mvn clean test -Dtest=<WelcomeTest>
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
- Login (:white_check_mark:)
- AddItemCart (:white_check_mark:)


### The-Internet Example List
> Example project developed to perform automated tests on the website [The-Internet](https://the-internet.herokuapp.com/)
- [A/B Testing](https://the-internet.herokuapp.com/abtest) (:white_check_mark:)
- [Add/Remove Elements](https://the-internet.herokuapp.com/add_remove_elements) (:white_check_mark:)
- [Basic Auth](https://the-internet.herokuapp.com/basic_auth) (:white_check_mark:)
- Broken Images (:warning:)
- Challenging DOM (:warning:)
- Checkboxes (:warning:)
- Context Menu (:warning:)
- Digest Authentication (user and pass: admin) (:warning:)
- Disappearing Elements (:warning:)
- Drag and Drop (:warning:)
- Dropdown (:warning:)
- Dynamic Content (:warning:)
- Dynamic Controls (:warning:)
- Dynamic Loading (:warning:)
- Entry Ad (:warning:)
- Exit Intent (:warning:)
- File Download (:warning:)
- File Upload (:warning:)
- Floating Menu (:warning:)
- Forgot Password (:warning:)
- Form Authentication (:warning:)
- Frames (:warning:)
- Geolocation (:warning:)
- Horizontal Slider (:warning:)
- Hovers (:warning:)
- Infinite Scroll (:warning:)
- Inputs (:warning:)
- JQuery UI Menus (:warning:)
- JavaScript Alerts (:warning:)
- JavaScript onload event error (:warning:)
- Key Presses (:warning:)
- Large & Deep DOM (:warning:)
- Multiple Windows (:warning:)
- Nested Frames (:warning:)
- Notification Messages (:warning:)
- Redirect Link (:warning:)
- Secure File Download (:warning:)
- Shadow DOM (:warning:)
- Shifting Content (:warning:)
- Slow Resources (:warning:)
- Sortable Data Tables (:warning:)
- Status Codes (:warning:)
- Typos (:warning:)
- WYSIWYG Editor (:warning:)

---
## Technologies:
- Selenide
- Java
- Maven

## Patterns
- Page Object

---

### Dependencies
* *[selenide](https://www.selenium.dev/)*
* *[testng](https://testng.org/)*
* *[lombok](https://projectlombok.org/)*

---

