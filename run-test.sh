echo "Running tests for InputValidator. . ."
javac -cp /usr/share/java/junit.jar app/src/util/InputValidator.java app/tests/InputValidatorTest.java
java -cp /usr/share/java/junit.jar:. junit.textui.TestRunner app.tests.InputValidatorTest
echo "InputValidator tests done. . ."

echo "Running tests for FLAMESCalculator. . ."
javac -cp /usr/share/java/junit.jar app/src/calculator/FLAMESCalculator.java app/src/calculator/LoveCalculator.java app/tests/FLAMESCalculatorTest.java
java -cp /usr/share/java/junit.jar:. junit.textui.TestRunner app.tests.FLAMESCalculatorTest
echo "FLAMESCalculator tests done. . ."