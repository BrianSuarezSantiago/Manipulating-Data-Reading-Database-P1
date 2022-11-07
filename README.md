<a href="https://www.sqlite.org/index.html">
    <img align="right" src ="https://img.shields.io/badge/SQLite-07405e.svg?logo=sqlite&logoColor=white" alt="SQLite">
</a>

<a href="https://www.oracle.com/es/database/technologies/appdev/sql.html">
    <img align="right" src="https://custom-icon-badges.herokuapp.com/badge/SQL-025E8C.svg?logo=database&logoColor=white" alt="SQL">
</a>

<a href="https://www.java.com/">
    <img align="right" src="https://custom-icon-badges.herokuapp.com/badge/Java-E8E8E8.svg?logo=Java" alt="Java">
</a>

<h1 align="center">🗄 Manipulating Data Reading Database 📚</h1>


<p align="center">
    <img src="./assets/Execution of Query.gif" alt="Execution of Query">
    <sub>· Execution of a query to the database ·</sub>
</p>


## 📚 Fundamentals

The software available in this repository allows the display of a simple table with the information of certain persons and also shows the principal e-mail domains most used in the world, reading the set of e-mail addresses from a file and storing it in a local database specified by an URL.


## 👨🏻‍💻 Implementation

The development of this practice consists of the creation of a simple table with an id, name and job position for certain famous persons and insert into a table information of existing domains from an e-mail provider, representing it by using a simple table. The software consists of three versions where the Java *SQL* library are used to read the data from a database.

### 1️⃣ <ins>First version:</ins>

The first version of this software introduces the connection with a local database through the file named *Kata5.db*, that represents the local database. After the connection to this mentioned database, a query of all the data stored in it, is performed.

<img src="./diagrams/Kata 5. Version 1.png" alt="Kata 5. Version 1 Class Diagram" width="200px" height="200px">

### 2️⃣ <ins>Second Version:</ins>

The second version of this software takes advantage of the implementation of the connection to a local database made in the first version, and adds the possibility of creating a table with a specified name and fields in the specified database using the SQL language.

⚠️ <ins>Notice:</ins> The table will be created empty, with no contained data.

<img src="./diagrams/Kata 5. Version 2.png" alt="Kata 5. Versión 2 Class Diagram" width="400px" height="200px">

### 3️⃣ <ins>Third Version:</ins>

The third version of this software takes advantage of the implementations developed in the first and second versions and introduces the ability to insert data into the specified table using SQL statements.

<img src="./diagrams/Kata 5. Version 3.png" alt="Kata 5. Version 3 Class Diagram" width="700px" height="400px">


## 💾 Expected Outputs

The results of running each of the implemented versions can be found [here.](./docs/)


## 🚀 Build the project

1. Clone the repository using git with `git clone https://github.com/BrianSuarezSantiago/Manipulating-Data-Reading-Database-P1.git` command or download from [Source Code.](https://github.com/BrianSuarezSantiago/Manipulating-Data-Reading-Database-P1/archive/refs/heads/master.zip)

2. Move to the directory where you have the code.

3. Compile using `javac -d . *.java` command followed by the `java database.Main` command to run and use the available software.

<hr>
<p align="center">
Made with ♥️ in Spain
</p>
