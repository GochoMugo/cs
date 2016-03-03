
# monte-carlo simulation

> Run a Monte-Carlo simulation


## building:

To build the executable JAR file:

```bash
$ mvn package
```

**Note**: maven will try download and install dependencies, if not installed
locally


## running:

To run the simulation, you need to specify the model to use. For example, using
`sin(x)` model:

```bash
$ java -jar target/application-0.0.0.jar --sin
```

To show description, models, help information:

```bash
$ java -jar target/application-0.0.0.jar --help
```

