# RMI_Java
Práctica RMI CD

## Ejecutar RMI en UBUNTU

> Todos los pasos son posicionandose dentro de la carpeta RMI_Java

Primero compilamos: javac

### Ubuntu:
	rmiregistry &

## Ejecutar el Servidor

	java -Djava.rmi.server.hostname=<IP> -Djava.security.manager -Djava.security.policy=engine/server.policy engine/ComputeEngine

## Ejecutar el Cliente

	java -Djava.security.manager -Djava.security.policy=client/client.policy client/ComputePi <IP> <Numero de Digitos>

