# Kafak

# 1. Delpoyment Environment

VM: VMware Workstaton 15

Linux: CentOS7

HostName | Title | Comment
:------: | :------: | :------:
VM001 | Zookeeper | Kafka
VM002 | Zookeeper | Kafka
VM003 | Zookeeper | Kafka

# 2. Shell Script to start kafka cluster
A shell script to start all kafka cluter in 3 nodes, need to change hostnames according to your own settings. 
it's convinent to set ssh login withou password before use this script. 

[shell](https://github.com/haveacupofcoffee/bigdata/blob/master/kafka/src/main/resources/shell/shell.sh)

# 3. Kafka API 
## 3.1 Producer without Callback function 

[source code](https://github.com/haveacupofcoffee/bigdata/blob/master/kafka/src/main/java/com/codingforfun/producer/CustomProducer.java)

![Result](https://github.com/haveacupofcoffee/bigdata/blob/master/kafka/src/main/resources/images/customproducer.PNG)
