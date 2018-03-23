# RMI_Java
Práctica RMI CD

## Ejecutar RMI en UBUNTU

> Todos los pasos son posicionandose dentro de la carpeta RMI_Java

### 1. compilamos:
	javac engine/*.java
	javac compute/*.java
	javac client/*.java

Si se va compilar en windows se cambia el / por el \

### 2. Levantamos el servicio:
	rmiregistry &

En windows sería:
	start rmiregistry

> El servicio solo se ejecuta una vez. 

### 3. Ejecutar el Servidor

	java -Djava.rmi.server.hostname=IP -Djava.security.manager -Djava.security.policy=engine/server.policy engine/ComputeEngine

Si se va compilar en windows se cambia el / por el \

> IP es la ip del servidor o en su defecto se pone localhost 

### 4. Ejecutar el Cliente

	java -Djava.security.manager -Djava.security.policy=client/client.policy client/ComputePi IP Numero_de_Digitos

Si se va compilar en windows se cambia el / por el \

> IP es la ip del servidor al que se va a conectar y Numero_de_Digitos es el total de decimales que mostrara
