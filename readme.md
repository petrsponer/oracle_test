There are prerequisites for the Mercury Tours test suit. Some SW needs to be installed:
- Java 8
- Maven 3.x
- Firefox installed
- Gecko Driver: https://github.com/mozilla/geckodriver/releases

Setup:
- Setup path to Gecko Driver and Firefox binaries in AbstractTest class constructor. 
This is a TODO point - move the variables to a property file.    

Steps to run:
- clone the repo from gitHub: https://github.com/petrsponer/oracle_test
- >cd project_path/newtours
- >mvn test

See project_path/newtours/target/surefire-reports/index.html for report