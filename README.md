# A golden crown
## Tame of Thrones Maven Application
> Note: `JDK, Maven` is required for running the application.

## Steps to run the Application as follows
Enter the commands given in the terminal

```sh
1. For runnning the application use 
* mvn clean install *
```

```sh
2. For runnning the test cases use
* mvn test *
```
when you will run the application using mvn command, it will generate a JAR file inside the target folder, now using the same JAR file we can execute the requirements.

# run the following commands to run the JAR file with given input

following command is the sample command, if user want to change the inputs provided,
make changes to the InputFile.txt file and run the command to see the result

```sh
java -jar target/geektrust.jar src/main/resources/InputFile.txt
```