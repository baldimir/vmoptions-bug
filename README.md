# vmoptions-bug

This small project shows, that when having Surefire VM options defined
in a pom.xml that you cannot change, you cannot override the options at all when running 
a JUnit test directly from IDEA (e.g. for debugging).  

When you check the executed command line, you can see that the arguments are appended in 
the wrong order. Currently it is like this: 

Custom VM args from Run configuration + Custom Surefire settings from project + Custom Surefire settings from parent

It should be the opposite way, because the latest one appended has the highest priority. 