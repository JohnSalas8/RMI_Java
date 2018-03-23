# RMI_Java
Práctica RMI CD

## Ejecutar RMI en UBUNTU

> Todos los pasos son posicionandose dentro de la carpeta RMI_Java

### 1. compilamos:
	javac engine/*.java
	javac compute/*.java
	javac client/*.java

### 2. Levantamos el servicio:
	rmiregistry &

> El servicio solo se ejecuta una vez. Apagando la lap se cae el servicio o usando los comandos:
> 	pidof rmiregistry
>		El comando pidof te da el id del proceso(s) con ese nombre
>	sudo kill -9 <ID_Proceso>

### 3. Ejecutar el Servidor

	java -Djava.rmi.server.hostname=<IP> -Djava.security.manager -Djava.security.policy=engine/server.policy engine/ComputeEngine

### 4. Ejecutar el Cliente

	java -Djava.security.manager -Djava.security.policy=client/client.policy client/ComputePi <IP> <Numero de Digitos>

