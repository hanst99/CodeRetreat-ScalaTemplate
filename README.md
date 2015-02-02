Code Retreat - Scala Template
=============================

Preparation
------------

Get [gradle](http://gradle.org) if you don't have it already.

Programming
-----------

Put your code under src/main/scala. The main class is coderetreat.GameOfLife,
if you want to change that you can by changing the mainClassName in build.gradle

Run the application with

```
gradle run
```

Testing
--------

Tests go under src/main/scala, out of the box only ScalaTest and JUnit are
supported. Run the tests with

```
gradle test
```
