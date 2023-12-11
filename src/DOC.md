#Sistema de Gestión de Dietas para Pacientes

**Objetivo:** Poder crear un software a partir de un codigo limpio y sostenible que permita a los nutricionistas (Usuarios) gestionar planes de alimentación personalizados para sus pacientes, a partir del manejo de la POO, reforzando la capacidad para manejar datos e información y su respectivo almacenamiento en archivos CSV.

**Requerimientos funcionales: **
**•	**Gestión de pacientes: 
**•	**Implementar una clase Patient con atributos como patientId, name, age, weight, height, preexistingConditions.
**•	**Incluir métodos para registrar, actualizar y eliminar la información de los pacientes.
**•	**Gestión de nutricionistas: 
**•	**Diseñar una clase Dietitian con atributos tales como dietitianId, name, specialty.
Permitir el registro y la gestión de nutricionistas.
**•	**Plan de alimentación: 
**•	**Crear una clase DietPlan que vincule un Patient con un Dietitian e incluya detalles como planId, dailyCalories, macronutrientDistribution, specificRecommendations.
**•	**Desarrollar métodos para crear y ajustar planes de alimentación.
**•	**Registro de comidas: 
**•	**Implementar una clase Meal con atributos como name, macronutrients, calories, timeOfDay.
**•	**Elaborar planes de comidas diarias que se alineen con la estrategia dietética general.
**•	**Persistencia de datos: 
**•	**Leer y guardar información sobre pacientes, nutricionistas y planes de dieta en archivos CSV.
**•	**Interfaz de usuario: 
**•	**Desarrollar una interfaz de consola que permita a los usuarios (nutricionistas) interactuar con el sistema, gestionar pacientes y sus planes de dieta.

Requerimientos no funcionales
El sistema deberá cumplir con los siguientes requisitos no funcionales:
**•	**Principios de orientación a objetos: 
**•	**Uso efectivo de encapsulamiento, herencia y polimorfismo.
**•	**Manejo de excepciones: 
**•	**Manejo adecuado de errores y excepciones, especialmente en la entrada/salida de datos.
**•	**Código limpio y mantenible: 
**•	**El código fuente y los comentarios estarán en inglés.
**•	**Documentación
**•	**Comentarios detallados en el código y documentación del usuario sobre la operación del sistema.

**Proceso de estructuración:**
El proyecto se comenzó a llevó al cabo a partir de tener presente la finalidad del programa a partir de la propuesta dada y del desarrollo del desglosamiento de las múltiples ideas y objetivos de este y poder esbozarlo en un borrador de diagramas de clases (a lápiz y papel) cada una con sus múltiples atributos y métodos, ademas de identificar la relación y el tráfico de datos entre sus clases para así poder lograr una estructuración más sólida, persistente y clara a la hora de la creación de la sintaxis del codigo

**Problemas y Soluciones:**
**•	**Exceso de Codigo: Solución, creación de clase helper para ahorro y codigo 
**•	**Migracion de datos: Solución, repaso de conceptos clave


**Propuestas de mejora:**
Desde un punto de vista subjetivo y como desarrollador del codigo, deberíamos trabajar en diferentes mejoras tales como:
**•	**Mejoras en las excepciones 
**•	**Fortalecimiento en el login (Puede ser fácilmente logeado)
**•	**Agregar una mejor interfaz grafica
**•	**Mejora en la creación de un ID único para nutricionistas como pacientes
**•	**Mejora en ejecutar o estar corriendo el programa por largo tiempo (Puede llegar a presentar algun bug)
**•	**Mejor implementación de los archivos CSV