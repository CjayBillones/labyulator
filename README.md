# LabyuLator

LabyuLator is a person compatibility calculator which uses TRUE LOVE or FLAMES's love prediction algorithms. Anyone who uses the app will be able to view the results of the calculations and will help him/her decide if he/she should love you now, or love you later, hence the app name, LabyuLator.

# System Requirements
1. Java Version: 1.7.0_101 (Runtime Environment)
2. Javac Version: 1.7.0_101 (Compiler)
3. JUnit Version: Default JUnit package from Linux or JUnit-3.8.2
4. Highly preferred to run on Linux environment.

# Instructions

###### For Linux
1. Go inside the project directory named **labyulator**.
2. Compile the project by typing `./compile.sh` in the terminal.
3. Run the server by typing `./run-server.sh` in the terminal.
4. Run the client by typing `./run-client.sh` in the terminal.

###### Manual Compilation and Running
1. Go inside the project directory named **labyulator**.
2. Compile the project by typing the following code in the terminal:

    ```shell
    javac app/src/calculator/*.java
    javac app/src/network/*.java
    javac app/src/util/*.java
    javac app/src/server/*.java
    javac app/src/client/*.java
    ```

3. Run the server by typing `java app.src.server.Server` in the terminal
4. Run the client by typing `java app.src.client.Client` in the terminal

# Testing

###### For Linux
1. Go inside the project directory named **labyulator**
2. Run the tests by typing `./run-test.sh` in the terminal.

###### Manual Compilation and Running of Tests
1. Go inside the project directory named **labyulator**
2. Compile and run the tests by typing the following code in the terminal:

    ```shell
    javac -cp /usr/share/java/junit.jar app/src/util/InputValidator.java app/tests/InputValidatorTest.java
    java -cp /usr/share/java/junit.jar:. junit.textui.TestRunner app.tests.InputValidatorTest
    javac -cp /usr/share/java/junit.jar app/src/calculator/FLAMESCalculator.java app/src/calculator/LoveCalculator.java app/tests/FLAMESCalculatorTest.java
    java -cp /usr/share/java/junit.jar:. junit.textui.TestRunner app.tests.FLAMESCalculatorTest
    javac -cp /usr/share/java/junit.jar app/src/calculator/TRUELOVECalculator.java app/src/calculator/LoveCalculator.java app/tests/TRUELOVECalculatorTest.java
    java -cp /usr/share/java/junit.jar:. junit.textui.TestRunner app.tests.TRUELOVECalculatorTest
    ```