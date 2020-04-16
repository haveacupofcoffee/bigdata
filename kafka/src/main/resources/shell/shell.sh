#!/bin/bash

case $1 in
"start"){
	for i in VM001 VM002 VM003
	do
		echo "************$1*************"
		ssh $i "/opt/softwares/kafka/bin/kafka-server-start.sh -daemon /opt/softwares/kafka/config/server.properties"
	done
};;

"stop"){
	for i in VM001 VM002 VM003
	do
		echo "************$1*************"
		ssh $i "/opt/softwares/kafka/bin/kafka-server-stop.sh"
	done
};;

esac