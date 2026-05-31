# README.md

# QA Automation Assignment – Safora Contact Form

This project contains a basic UI automation test for the Safora Contact Us form using:

* Selenium WebDriver
* Java
* TestNG
* Maven

## Target Website

[Safora](https://safora.se/en/?utm_source=chatgpt.com)

Contact Page:
https://safora.se/en/contact.html

---

# Project Structure

```text id="qkg8f7"
QA_Assignment_IroshaGeethanjalie
│
├── pom.xml
│
└── src
    ├── main
    │   └── java
    │       └── org.example
    │           └── Main.java
    │
    └── test
        └── java
            └── ContactFormTest.java
```

---

# Test Scenarios Covered

## Positive Test Case

* Open Contact Us page
* Fill required form fields
* Manually complete CAPTCHA
* Submit the form
* Verify successful behavior

## Negative Test Case

* Verify validation behavior when required fields are left blank

---

# Technologies Used

* Java
* Selenium WebDriver
* TestNG
* Maven
* ChromeDriver
* WebDriverManager

---

# Prerequisites

Install the following before running the project:

* Java JDK 17+
* Maven
* Google Chrome
* IntelliJ IDEA / Eclipse

---

# How to Run the Project

## 1. Clone Repository

```bash id="5hqv4y"
git clone <https://github.com/IroshaGeethanjalie/QA_Assignment_IroshaGeethanjalie.git>
```

---

## 2. Open Project

Open the project using IntelliJ IDEA or Eclipse.

---

## 3. Install Dependencies

Maven will automatically download required dependencies from `pom.xml`.

---

## 4. Run the Tests

### Using IntelliJ IDEA

* Right-click `ContactFormTest`
* Click `Run`

### Using Maven

```bash id="5d7mby"
mvn test
```

---

# CAPTCHA Note

The Safora contact form uses Google reCAPTCHA verification.

Since CAPTCHA is intentionally designed to block automated interactions, manual verification is required during the positive test execution.

For the negative test scenario, validation behavior was verified using required field validation checks instead of interacting with the CAPTCHA-protected submission flow.

---

# Expected Results

```text id="1q4eej"
Total tests run: 2
Passes: 2
Failures: 0
```

---

# Author

Irosha Geethanjalie
