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

Si se va ejeuctar en windows se cambia el / por el \

> IP es la ip del servidor o en su defecto se pone localhost 

### 4. Ejecutar el Cliente

	java -Djava.security.manager -Djava.security.policy=client/client.policy client/ComputePi IP Numero_de_Digitos

Si se va ejecutar en windows se cambia el / por el \

> IP es la ip del servidor al que se va a conectar y Numero_de_Digitos es el total de decimales que mostrara

### Matar el proceso de rmiregistry

Para matar el proceso con reiniciar o apagar el pc es suficiente pero en dado caso de que el servicio este activo aunque se haya hecho eso se pueden usar los comandos:

	pidof rmiregistry

pidof retorna el id de proceso(s) con el nombre.

Se puede usar el id del proceso y matarlo usando:

	sudo kill -9 id_proceso

> En windows no se como se mate el proceso pero supongo que lo buscan en el monitor de tareas y le dan finalizar proceso.

> Todo el proyecto debe estar tanto en la máquina cliente como en la máquina servidor. Si se va probar que en la misma máquina este el cliente y el servidor cambiamos IP por localhost en los Comandos de Ejecutar Cliente y Ejecutar Servidor.
