### Check out the sample projects

```bash
git clone https://github.com/pboisver/simple.git
cd simple

```
### Build and run the `pojo` application

```
cd pojo
mvn clean package
java -jar target/simple-pojo-0.0.1-SNAPSHOT.jar 'Bob'
```

output:
```
Starting up simple POJO application
Hey there, Bob
```

### Build and run the `spring` application

```
cd spring
mvn clean package
java -jar target/simple-spring-0.0.1-SNAPSHOT.jar 'Ralph'
```

output:
```
Starting up simple Spring application  
  
[...Spring application log output]   
  
Hey there, Ralph   
  
[...Spring application log output]
```

### Build and run the `rest` application

```
cd rest
mvn clean package
java -jar target/simple-rest-0.0.1-SNAPSHOT.jar 'Bob'
```

Open a browser and navigate to `localhost:8080/bears`

Output:

```json
{
  "1": {
    "name": "Pooh",
    "color": "Pooh"
  },
  "2": {
    "name": "Dave",
    "color": "Orange"
  },
  "3": {
    "name": "Grum",
    "color": "Green"
  }
}
```
try `localhost:8080/bears/2`

Output: 

```json
{
  "name": "Dave",
  "color": "Orange"
}
```

### Running the samples in Intellij

Any of the sample apps should run with a right-click on the particular main application class and selecting `Run`. The `rest` app will start up an embedded servlet container, the command line apps will run but won't say output a greeting since no input is provided.
