# 🚛 Sistema de Gestión de Transporte para Empresas de Logística

## 📄 Descripción General
Este proyecto es un sistema de gestión de flotas de transporte diseñado para empresas de logística. Permite administrar vehículos, asignar conductores, programar rutas y gestionar mantenimientos, asegurando una operación eficiente.

## 🎯 Objetivos del Proyecto
- Aplicar **Programación Orientada a Objetos (POO) en Java**.
- Diseñar un sistema modular y escalable.
- Permitir la colaboración entre varios desarrolladores.
- Implementar buenas prácticas de desarrollo y gestión de versiones con **GitHub**.

## 🏢 Arquitectura del Sistema
El sistema está dividido en **cuatro módulos principales**, cada uno desarrollado por un equipo diferente:

### 🚗 1. Módulo de Gestión de Vehículos (Equipo A)
- Clase abstracta `Vehiculo` con atributos comunes:
  - `marca`, `modelo`, `año`, `kilometraje`, `estado`.
- Subclases que extienden `Vehiculo`:
  - `Automovil` ➔ `numeroDePuertas`, `tipoCombustible`.
  - `Camion` ➔ `capacidadCarga`, `numeroDeEjes`.
  - `Motocicleta` ➔ `cilindrada`.
- Aplicación de **Encapsulación** y uso de **Getters y Setters**.
- Implementación de la **interfaz `Mantenimiento`** con `realizarMantenimiento()`.
- Método polimórfico `calcularCostoMantenimiento()` con lógica diferente por tipo de vehículo.

### 👷‍♂️ 2. Módulo de Gestión de Conductores (Equipo B)
- Clase `Conductor` con atributos:
  - `nombre`, `licencia`, `añosExperiencia`, `vehiculoAsignado`.
- Métodos para **asignar/cambiar vehículo** a un conductor.
- Validación: Un conductor **no puede** tener más de un vehículo asignado.

### 🛵 3. Módulo de Rutas y Viajes (Equipo C)
- Clase `Ruta` con:
  - `origen`, `destino`, `distancia`, `tiempoEstimado`.
- Clase `Viaje` que relaciona:
  - Un `Vehiculo`, un `Conductor`, una `Ruta`, y un `estado` (pendiente, en curso, completado).
- Métodos para **iniciar y finalizar un viaje**, registrando el kilometraje final.

### 📊 4. Módulo de Reportes y Alertas (Equipo D)
- Generación de reportes:
  - Mantenimiento pendiente de vehículos.
  - Conductores sin vehículo asignado.
  - Historial de viajes completados.
- Alertas cuando:
  - Un vehículo supera un cierto kilometraje sin mantenimiento.
  - Un conductor lleva **X** horas conduciendo sin descanso.

## 🔄 Flujo de Trabajo en Equipo
1. **Diseño UML** con la estructura de clases y relaciones.
2. **División de responsabilidades** en GitHub con ramas separadas por módulo.
3. **Definir interfaces** entre módulos para una integración eficiente.
4. **Pruebas unitarias** en cada módulo antes de la integración.

## 🔮 Tecnologías Utilizadas
- **Lenguaje:** Java 17+
- **Gestor de dependencias:** Maven / Gradle
- **Control de versiones:** Git y GitHub
- **Patrones de diseño:** MVC, DAO
- **Pruebas:** JUnit

## 💪 Retos Adicionales para Ampliar el Proyecto
- ✅ Implementar una **base de datos** para almacenamiento de información.
- ✅ Crear una **API REST** para acceso desde una aplicación web/móvil.
- ✅ Incorporar **autenticación y roles de usuario** (admin, operador, conductor).

## 🛠️ Instalación y Ejecución
1. Clonar el repositorio:
   ```bash
   git clone https://github.com/tu-usuario/sistema-transporte.git
   ```
2. Compilar y ejecutar con Maven:
   ```bash
   mvn clean install
   mvn exec:java -Dexec.mainClass="com.empresa.Main"
   ```

## 🏆 Contribución
1. Crea un **fork** del repositorio.
2. Crea una nueva rama para tu funcionalidad (`feature/nueva-funcionalidad`).
3. Sube tus cambios y abre un **Pull Request**.
4. Espera revisión y aprobación antes de hacer merge.

## 📅 Roadmap y Próximas Mejoras
- [ ] Integración con base de datos.
- [ ] Implementación de microservicios.
- [ ] Aplicación web para gestión visual.

## 🚀 ¡Empecemos!
Colabora con nosotros y mejoremos juntos la gestión de flotas de transporte.

---
🌟 **Repo oficial:** [https://github.com/tu-usuario/sistema-transporte](https://github.com/tu-usuario/sistema-transporte)
