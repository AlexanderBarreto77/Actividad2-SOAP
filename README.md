# Actividad2-SOAP
Servicio SOAP para consultar el estado de paquetes. Proyecto académico - EnvíosExpress S.A.C.
# Seguimiento de Paquetes - API SOAP

---

## Descripción del Proyecto

Este proyecto consiste en el desarrollo de una API SOAP para la empresa **EnviosExpress S.A.C.**, con el objetivo de permitir a sus clientes consultar el estado actual de sus paquetes mediante un número único de seguimiento (**tracking number**). Esta solución garantiza interoperabilidad, seguridad y cumplimiento de estándares para la gestión y consulta de paquetes.

La API devuelve información detallada sobre el estado, ubicación, fecha estimada de entrega y el historial de eventos del paquete. Se implementó utilizando **Java**, **Spring Boot**, **Spring Data JPA**, **PostgreSQL** y **Apache CXF** para servicios SOAP.

---

## Integrantes

- **Alexander Barreto**  
- **Veronica Samaniego**

---

## Tecnologías Utilizadas

- Java 21  
- Spring Boot 3.5.0  
- Spring Data JPA  
- PostgreSQL  
- Apache CXF (Servicio SOAP)  
- Maven  

---

## Estructura del Proyecto

El código está organizado en paquetes que reflejan buenas prácticas de arquitectura y diseño:

- `model` : Entidades y modelos de datos que representan las estructuras del dominio.
- `repository` : Interfaces de acceso a datos que utilizan Spring Data JPA.
- `service` : Lógica de negocio para procesar las solicitudes y respuestas.
- `webservice` : Endpoints SOAP que exponen el servicio para los clientes.
- `exception` : Manejo personalizado de errores y excepciones.

---

## Configuración y Despliegue

### Requisitos Previos

- Java 21 instalado y configurado en tu sistema.  
- Maven instalado para la gestión del proyecto.  
- PostgreSQL funcionando con la base de datos configurada.

### Configuración de la Base de Datos

1. Creamos la base de datos PostgreSQL llamada `db-soap`.
2. Nos aseguramos de tener un usuario con permisos, por ejemplo:
   - Usuario: `postgres`  
   - Contraseña: `qwerty123`  
3. Ajustamos el archivo `src/main/resources/application.properties` con tus credenciales si fueran diferentes.

### Pasos para Ejecutar la Aplicación

1. Tenemos que clona este repositorio:
git clone https://github.com/AlexanderBarreto77/Actividad2-SOAP.git
2. Navegar al directorio del proyecto:
cd seguimiento-paquetes
3. Compilar y ejecuta la aplicación con Maven:
mvn spring-boot:run

Run
Copy code
4. La API SOAP estará disponible en:
http://localhost:8080/services

Run
Copy code

---

## Cómo Probar la API SOAP

Usa herramientas como [SoapUI](https://www.soapui.org/) para enviar solicitudes.

### Ejemplo de Solicitud (SOAP Request)

```xml
<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
               xmlns:log="http://logistica.com/ws/tracking">
<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
                  xmlns:log="http://logistica.com/ws/tracking">
   <soapenv:Header/>
   <soapenv:Body>
      <log:GetTrackingStatusResponse>
         <log:status>En tránsito</log:status>
         <log:currentLocation>Lima - Perú</log:currentLocation>
         <log:estimatedDeliveryDate>2025-04-15</log:estimatedDeliveryDate>
         <log:history>
            <log:event>
               <log:date>2025-04-05</log:date>
               <log:description>Paquete recibido en bodega central</log:description>
               <log:location>Lima</log:location>
            </log:event>
            <log:event>
               <log:date>2025-04-07</log:date>
               <log:description>Salida hacia Lima</log:description>
               <log:location>Arequipa</log:location>
            </log:event>
         </log:history>
      </log:GetTrackingStatusResponse>
   </soapenv:Body>
</soapenv:Envelope>
