# javaBatch

This is for practice the Java Batch for handling 1000 records of People using the Java Batch, it will process the 1000 records and save it in the DB.

# Steps for launcing the Kafka server on Windows:
You should have Java (JDK) installed on your windows machine.

Apache Kafka official website: https://kafka.apache.org/downloads

## Required Commands:
In the .\bin\config -- folder update the path for zookeeper.properties with dataDir=C:/kafka/zookeeper-data
In the .\bin\config -- folder update the path for server.properties with log.dirs=C:/kafka/kafka-logs

NOTE: clear the Logs Folder if required in starting if facing any issues in running all the below steps:
1. run in terminal:
.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties
2. run in new terminal:
.\bin\windows\kafka-server-start.bat .\config\server.properties
3. run the Java Application


.\bin\windows\kafka-topics.bat --create --bootstrap-server localhost:9092 --replication-factor 1 --partition 1 --topic test

.\bin\windows\kafka-console-producer.bat --broker-list localhost:9092 --topic test
-------------------------------------------------------------------------------------------------------
Sample Data:

{"Name: "John", "Age":"31", "Gender":"Male"}
{"Name: "Emma", "Age":"27", "Gender":"Female"}
{"Name: "Ronald", "Age":"17", "Gender":"Male"}
---------------------------------------------------------------------------------------------------------

.\bin\windows\kafka-console-consumer.bat --topic test --bootstrap-server localhost:9092 --from-beginning

.\bin\windows\zookeeper-server-stop.bat .\config\zookeeper.properties

.\bin\windows\kafka-server-stop.bat .\config\server.properties
