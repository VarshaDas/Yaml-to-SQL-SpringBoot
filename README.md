# Yaml-to-SQL-SpringBoot


This project aims to provide a solution for parsing YAML files and saving the data to a SQL database using Spring Boot. The application utilizes the Spring Boot framework to create REST APIs that handle the parsing and data storage operations. The parsed data from the YAML files is persisted in a SQL database, enabling easy retrieval and management.

## Getting Started

To get started with the YAML-to-SQL-SpringBoot project, follow these steps:

### Prerequisites


### Installation

1. Clone the repository: 
   ```shell
   git clone https://github.com/your-username/YAML-to-SQL-SpringBoot.git
   ```

2. Navigate to the project directory:
   ```shell
   cd YAML-to-SQL-SpringBoot
   ```

3. Build the project using Maven:
   ```shell
   mvn clean install
   ```

4. Configure the MySQL database:
   - Create a new database in your MySQL server.
   - Update the database configuration in the `application.properties` file with your database URL, username, and password.

5. Run the application:
   ```shell
   mvn spring-boot:run
   ```

### Usage

1. Prepare your YAML file: Create a YAML file with the data you want to parse and store in the SQL database. Ensure the YAML file follows the appropriate structure and contains the required fields.

2. Access the REST APIs: Use tools like Postman or any HTTP client to send HTTP requests to the exposed REST APIs. The available endpoints include:

   - `POST /data`: Send a POST request to this endpoint with the YAML file content in the request body. The application will parse the YAML data and store it in the SQL database.

3. Verify the data: Check your MySQL database to verify that the parsed data from the YAML file has been successfully stored.

## Contributing

Contributions to the YAML-to-SQL-SpringBoot project are welcome. If you have any ideas, suggestions, or bug reports, please open an issue or submit a pull request on the GitHub repository.

## License

This project is licensed under the [MIT License](LICENSE).

## Contact

For any inquiries or questions, please contact 


