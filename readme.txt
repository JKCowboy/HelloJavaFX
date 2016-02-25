Purpose:
This small project creates a basic MVC (Model, View, Controller) JavaFX App that uses a fxml file created with Scenebuilder (2.0). This project uses Gradle for its build.

Requirements:
[ ] Java 1.8+
[ ] Gradle 2.0+ (On mac use brew install graddle)

Create Jar:
gradle build

Run Jar:
java -jar ./build/libs/HelloJavaFX.jar


#Gotchas
- Rember that your GUI elements must have a fx:id set that matches the name of the GUI elment in your controller (i.e labelHelloResponse).


REFERENCES:
http://www.petrikainulainen.net/programming/gradle/getting-started-with-gradle-our-first-java-project/



