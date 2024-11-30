**Project**: tendable Automation Project

**Description** :
This project is an automation framework using Selenium WebDriver, Java, and Maven. The framework leverages Object-Oriented Programming (OOP) concepts to improve code maintainability, modularity, and security. It demonstrates how to interact with web pages, handle iframes, and use various Selenium WebDriver properties for effective test automation.

 **Explanation**:
- **Project Structure**: The framework follows best practices using Maven for dependency management, Java for the automation scripts, and Selenium WebDriver for browser automation.
- **Security**: The `SecurityUtil` class handles encryption of sensitive data, demonstrating how to secure credentials.
- **Iframe Handling**: The example demonstrates how to switch between iframes using Selenium’s `switchTo().frame()` method.
- 
**Features**
1. Selenium WebDriver:
WebDriver instances are created dynamically using the factory design pattern.
Supports Chrome, Firefox, and Edge browsers.
2. Handling Iframes
3.  OOP Design:
Page Object Model (POM): Each page has its own class to encapsulate the functionality.
Data Encapsulation: Sensitive data like credentials are encrypted.
Test Case Inheritance: Base test class contains common setup and teardown methods.
4. Security:
The SecurityUtil class handles encryption and decryption for storing passwords securely in the configuration files.
Sensitive data is not stored in plain text but encrypted with AES.
