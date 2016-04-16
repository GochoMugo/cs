
# binary search vs linear search

This is a simple application geared towards testing the complexities of the
binary and linear search algorithms.


## running the application:

### test data:

Source the `contacts.sql` file into a table of your choice in a SQL database:

```bash
mysql> source contacts.sql
```

**Note**: this should run in your MySql console.

### test configuration:

Configure the test runners using a `settings.json` file in your working
directory (directory holding this README.md). A sample settings file:

```json
{
 "db_url": "jdbc:mysql://localhost:3306/databaseName",
 "db_table": "tableName",
 "db_user": "username",
 "db_pass": "password",
 "algo_rounds": 1
}
```

**Note:** `algo_rounds` is used to re-run an algorithm for the number of
times specified.


### test building:

You need to build an executable jar file using maven:

```bash
$ mvn package
```

### test running:

Run the jar file passing a single command-line argument that will be used
as the search term:

```bash
$ java -jar target/application-x.x.x.jar 'first_name'
```

**Note:** this command should be run in the same directory with your
`settings.json`

You will see debug output, plus the test results, on a successful run.

