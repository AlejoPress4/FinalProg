#Documentación

-Folder Helpers – File Keyboard 
Description:
This class provides methods for reading various data types from the user through the keyboard. It includes methods for reading strings, integers, longs, doubles, booleans, bytes, floats, and enums. Additionally, it offers validation and error handling for each data type.
Attributes:
    sc: Scanner - Scanner object used for reading input from the console.
Methods:
    readString(String message): String: Reads a string from the user with the specified message and returns it.
    readInt(String message): int: Reads an integer from the user with the specified message and returns it.
    readInt(int from, int to, String mensaje): int: Reads an integer within a specified range from the user with the specified message and returns it.
    readString(int from, int to, String message): String: Reads a string with a specific length range from the user with the specified message and returns it.
    readLong(String message): long: Reads a long from the user with the specified message and returns it.
    readLong(long from, long to, String mensaje): long: Reads a long within a specified range from the user with the specified message and returns it.
    readDouble(String message): double: Reads a double from the user with the specified message and returns it.
    readDouble(double from, double to, String mensaje): double: Reads a double within a specified range from the user with the specified message and returns it.
    readBoolean(String message): boolean: Reads a boolean (yes/no) value from the user with the specified message and returns it.
    readEnum<T extends Enum<T>>(Class<T> c, String message): T: Reads an enum value from the user with the specified message and returns it.
    readByte(String message): Byte: Reads a byte from the user with the specified message and returns it.
    readFloat(String message): Float: Reads a float from the user with the specified message and returns it.
Features:
  Input validation: Each method for reading a specific data type provides basic validation to ensure the user entered the correct format.
    Error handling: If the user enters an invalid format, the method will print an error message and prompt them to re-enter the value.
    User prompts: All methods display a message to the user before reading their input.
    Formatted output: Messages and error messages are formatted with ANSI color codes for improved readability.

-Folder Helpers – Utils 
Description:
This class provides various helper methods for file handling, directory creation, random string generation, and terminal formatting.
Attributes:
    Private constructor: Prevents instantiation of the Utils class.
Methods:
    fileExists(String fileName): boolean: Checks whether a file exists at the specified path.
    pathExists(String path): boolean: Checks whether a directory exists at the specified path.
    createFolderIfNotExist(String folder): void Creates a directory at the specified path if it does not already exist.
    getRandomKey(int stringLength): String: Generates a random string of the specified length containing alphanumeric characters.
    RESET: String - ANSI escape code for resetting terminal formatting.
    BLACK, RED, GREEN, YELLOW, BLUE, PURPLE, CYAN, WHITE: String - ANSI escape codes for setting terminal text color.
Features:
    File and directory checks: The class provides methods for checking if files and directories exist at the specified paths.
    Directory creation: Users can create directories using the createFolderIfNotExist method.
    Random string generation: The getRandomKey method generates random strings of a specified length for various use cases.
    Terminal formatting: The class provides ANSI escape codes for setting text color in the terminal.

-Folder Model – File Dietitian
Description:
This class represents a Dietitian within the system. It stores information about the Dietitian's ID, name, and specialty.
Attributes:
    dietitianId: String - Unique identifier for the Dietitian.
    name: String - Name of the Dietitian.
    specialty: String - The Dietitian's area of expertise in nutrition.
Methods:
    Dietitian(String dietitianId, String name, String specialty): Constructor that sets the initial values for all attributes.
    getDietitianId(): String: Returns the Dietitian's ID.
    setDietitianId(String dietitianId): Sets the Dietitian's ID.
    getName(): String: Returns the Dietitian's name.
    setName(String name): Sets the Dietitian's name.
    getSpecialty(): String: Returns the Dietitian's specialty.
    setSpecialty(String specialty): Sets the Dietitian's specialty.
Relationships:
    This class can be associated with the Patient and DietPlan classes.

-Folder Moldel – File DietPlan
 Description 
This class represents a Diet Plan within the system. It stores information about the plan's ID, name, description, associated meals, and the Dietitian and Patient IDs it belongs to.
Attributes:
    dietPlanId: int - Unique identifier for the Diet Plan.
    name: String - Name of the Diet Plan.
    description: String - Description of the Diet Plan.
    meals: List<Meal> - List of Meal objects associated with the Diet Plan.
    dietitianId: String - ID of the Dietitian who created the Diet Plan.
    patientId: String - ID of the Patient assigned to the Diet Plan.
Methods:
    DietPlan(int dietPlanId, String name, String description, List<Meal> meals, String dietitianId, String patientId): Constructor that sets the initial values for all attributes.
    getDietPlanId(): int: Returns the Diet Plan's ID.
    setDietPlanId(int dietPlanId): Sets the Diet Plan's ID.
    getName(): String: Returns the Diet Plan's name.
    setName(String name): Sets the Diet Plan's name, with a validation check for length exceeding 30 characters.
    getDescription(): String: Returns the Diet Plan's description.
    setDescription(String description): Sets the Diet Plan's description, with a validation check for length exceeding 100 characters.
    getMeals(): String[]: Returns an array of strings containing the names of all associated meals.
    addMeal(Meal meal): Adds a Meal object to the meals list.
    getDietitianId(): String: Returns the Dietitian ID associated with the Diet Plan.
    getPatientId(): String: Returns the Patient ID associated with the Diet Plan.
    toCSV(): String: Generates a comma-separated string representation of the Diet Plan's data for saving purposes.
Relationships:
    This class has a one-to-many relationship with the Meal class.
    This class has relationships with the Dietitian and Patient classes through their respective IDs.

-Folder Model – File Meal
Description:
This class represents a Meal within the system. It stores information about the meal's name, macronutrient composition, calorie count, and time of day it should be consumed.
Attributes:
    name: String - Name of the meal.
    macronutrients: String - Comma-separated list of macronutrients (carbohydrates, protein, fat) and their percentages in the meal.
    calories: int - Total number of calories in the meal.
    timeofday: byte - Numeric representation of the time of day the meal should be eaten (0: Breakfast, 1: Lunch, 2: Dinner, 3: Snack).
Methods:
    Meal(String name, String macronutrients, int calories, byte timeofday): Constructor that sets the initial values for all attributes.
    getName(): String: Returns the name of the meal.
    SetName(String name): String: Sets the name of the meal, with a validation check for length exceeding 30 characters.
    getCalories(): int: Returns the calorie count of the meal.
    setCalories(int calories): int: Sets the calorie count of the meal, with a validation check for exceeding 1000 calories.
    getMacronutrients(): String: Returns the string containing the macronutrient composition of the meal.
    setMacronutrients(String macronutrients): String: Sets the string containing the macronutrient composition of the meal, with a validation check for length exceeding 100 characters.
    getTimeofday(): byte: Returns the numeric representation of the time of day the meal should be eaten.
    setTimeofday(byte timeofday): byte: Sets the numeric representation of the time of day the meal should be eaten, with a validation check for invalid values.
Relationships:
 This class is associated with the DietPlan class, as meals are components of Diet Plans.

-Folder Model – File Patient
Description:
This class represents a Patient within the system. It stores information about the patient's ID, name, age, weight, height, and list of pre-existing medical conditions.
Attributes:
    PatientId: String - Unique identifier for the Patient.
    name: String - Name of the Patient.
    age: byte - Age of the Patient.
    weight: float - Weight of the Patient in kilograms.
    height: float - Height of the Patient in meters.
    preexistingConditions: List<String> - List of strings representing the Patient's pre-existing medical conditions.
Methods:
    Patient(String PatientId, String name, byte age, float weight, float height, List<String> preexistingConditions): Constructor that sets the initial values for all attributes.
    getPatientId(): String: Returns the Patient's ID.
    setPatientId(String PatientId): Sets the Patient's ID.
    getName(): String: Returns the Patient's name.
    setName(String name): Sets the Patient's name.
    getAge(): byte: Returns the Patient's age.
    setAge(byte age): Sets the Patient's age.
    getWeight(): float: Returns the Patient's weight.
    setWeight(float weight): Sets the Patient's weight.
    getHeight(): float: Returns the Patient's height.
    setHeight(float height): Sets the Patient's height.
    getPreexistingConditions(): List<String>: Returns the list of the Patient's pre-existing medical conditions.
    setPreexistingConditions(List<String> preexistingConditions): Sets the list of the Patient's pre-existing medical conditions.
Relationships:
    This class can be associated with the DietPlan class, as patients may be assigned specific diet plans.

-Folder Services – File DietitianServices
Description:
This class manages a list of Dietitians and provides various methods for adding, listing, deleting, and retrieving dietitians. It also allows saving the list of dietitians to a CSV file.
Attributes:
    dietitians: ArrayList<Dietitian> - List of Dietitian objects.
Methods:
    add(Dietitian dietitian): Adds a Dietitian object to the list.
    list(): Prints the names of all dietitians in the list.
    Delete(String dietitianid): Deletes a dietitian from the list based on their ID.
    getDietitian(String dietitianid): Returns the Dietitian object with the specified ID.
    saveToCSV(): Saves the list of dietitians to a CSV file named "dietitians.csv".
Features:
    Dietitian management: The class provides methods for managing a list of Dietitian objects.
    Persistence: Dietitian data can be saved to a CSV file for future use.
    Simple interface: The class provides a simple interface for interacting with dietitian data.

-Folder Services – File DietPlanServices
Description:
This class manages a list of Dietitians and provides various methods for adding, listing, deleting, and retrieving dietitians. It also allows saving the list of dietitians to a CSV file.
Attributes:
    dietitians: ArrayList<Dietitian> - List of Dietitian objects.
Methods:
    add(Dietitian dietitian): Adds a Dietitian object to the list.
    list(): Prints the names of all dietitians in the list.
    Delete(String dietitianid): Deletes a dietitian from the list based on their ID.
    getDietitian(String dietitianid): Returns the Dietitian object with the specified ID.
    saveToCSV(): Saves the list of dietitians to a CSV file named "dietitians.csv".
Features:
    Dietitian management: The class provides methods for managing a list of Dietitian objects.
    Persistence: Dietitian data can be saved to a CSV file for future use.
    Simple interface: The class provides a simple interface for interacting with dietitian data.

-Folder Services – File MealServices
MealServices Class Documentation
Package: Services
Description:
This class manages a list of Meal objects and provides methods for adding, listing, and retrieving meals.
Attributes:
meals: ArrayList<Meal> - List of Meal objects.
Methods:
add(Meal meal): Adds a Meal object to the list.
list(): Prints the calorie content of all meals in the list.
Features:
Meal management: The class provides methods for managing a list of Meal objects.
Simple interface: The class provides a simple interface for interacting with meal data.

-Folder Services – File PatientsService
Description:
This class manages a list of Patient objects and provides methods for adding, listing, deleting, and retrieving patients. It also allows saving the list of patients to a CSV file.
Attributes:
 patients: ArrayList<Patient> - List of Patient objects.
Methods:
add(Patient patient): Adds a Patient object to the list.
list(): Prints the names of all patients in the list.
Delete(String patientid): Deletes a patient from the list based on their ID.
getPatient(String patientid): Returns the Patient object with the specified ID.
saveToCSV(): Saves the list of patients to a CSV file named "patients.csv".
Features:
Patient management: The class provides methods for managing a list of Patient objects.
Persistence: Patient data can be saved to a CSV file for future use.
Simple interface: The class provides a simple interface for interacting with patient data
