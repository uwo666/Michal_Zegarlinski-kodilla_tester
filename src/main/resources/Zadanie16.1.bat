del build/libs/*.jar
call gradlew build
if EXISTS build/libs/*.jar copy build/libs/*.jar project
ELSE echo compile error please try again
