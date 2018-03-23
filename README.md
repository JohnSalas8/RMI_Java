# RMI_Java
Práctica RMI CD

## Ejecutar RMI en UBUNTU

### Ubuntu:
	rmiregistry &

## Ejecutar el Cliente

	java -Djava.security.manager -Djava.security.policy=client/client.policy client/ComputePi *<IP>*

## Ejecutar el Servidor

	java -Djava.rmi.server.hostname=*<IP>* -Djava.security.manager -Djava.security.policy=engine/server.policy engine/ComputeEngine
