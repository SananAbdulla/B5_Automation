# B5 Automation

Selenium WebDriver and TestNG practice project for the Loopcamp B5 automation course.

## Open in VS Code

1. Clone the repository:
   ```bash
   git clone https://github.com/SananAbdulla/B5_Automation.git
   cd B5_Automation
   ```
2. Open the folder in VS Code:
   ```bash
   code .
   ```
3. Install the recommended extensions when VS Code prompts you.
4. Wait for Maven dependencies to finish downloading.

## Requirements

- Java 23
- Maven 3.9+
- Google Chrome (default browser)
- VS Code with the Extension Pack for Java

## Configuration

Update `configuration.properties` if needed:

```properties
browser=chrome
docuportBETA=https://beta.docuport.app/
google.url=https://www.google.com
loop.practice=https://loopcamp.vercel.app/
```

## Run Tests

From the terminal:

```bash
mvn test
```

Run a single test class:

```bash
mvn -Dtest=io.loop.test.day06.T1_radio_button test
```

In VS Code, open a test class and use the **Run Test** links above each `@Test` method.

## Project Structure

```
src/test/java/io/loop/
├── base/           # TestNG base setup
├── pages/          # Page Object Model classes
├── test/           # Daily practice tasks (day02-day10)
└── utilities/      # Driver, config, and helper utilities
```

## Practice Sites

- [Loopcamp practice app](https://loopcamp.vercel.app/index.html)
- [Docuport beta](https://beta.docuport.app/)
