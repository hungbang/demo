Go to https://sleepy-dawn-20571.herokuapp.com/getBook/1 to test.

Go to http://localhost:8080/home to test view.


Heroku wants you to use a certain port.

Add this to your Procfile to get that port:

-Dserver.port=$PORT
So yours would look like this: Procfile

web: java $JAVA_OPTS -Dserver.port=$PORT -cp target/classes/:target/dependency