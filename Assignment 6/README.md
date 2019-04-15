# Assignment 6

## [Tutorial Link](https://www.youtube.com/watch?v=pHg9CtupkZI)

If you prefer Eclipse, follow the above tutorial. Else here are the steps:

1. Download active mq from [here](https://activemq.apache.org/activemq-5158-release) and extract it.
2. Copy the jar file from activemq directory to the folder where the codes are present.
3. Open terminal and go to `bin` subdirectory where you'll see **activemq** script.
4. Type `sudo sh activemq start` to run the activemq script.
5. Open a terminal and first compile the Subscriber using `javac -cp activemq-all-5.15.8.jar Subscriber.java`
6. Open another terminal and compile the Publisher using `javac -cp activemq-all-5.15.8.jar Publisher.java`
7. Execute Subscriber by `java -cp .:activemq-all-5.15.8.jar Subscriber`
8. Execute Publisher by `java -cp .:activemq-all-5.15.8.jar Publisher`
