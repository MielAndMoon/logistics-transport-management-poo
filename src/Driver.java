public class Driver {
//### 👷‍♂️ 2. Módulo de Gestión de Conductores (Equipo B)
//- Clase `Conductor` con atributos:
//            - `nombre`, `licencia`, `añosExperiencia`, `vehiculoAsignado`.
//            - Métodos para **asignar/cambiar vehículo** a un conductor.
//- Validación: Un conductor **no puede** tener más de un vehículo asignado.
    private String name;
    private String license;
    private int yearsExperience;
    private String assignedVehicle;

    public Driver(String name, String license, int yearsExperience, String assignedVehicle) {
        this.name = name;
        this.license = license;
        this.yearsExperience = yearsExperience;
        this.assignedVehicle = assignedVehicle;
    }

    public String setAssignedVehicle(String vehicle) {
        if (this.assignedVehicle.length.trim() > 0) return "No can't assigned again";
       this.assignedVehicle = vehicle;
       return "Vehicle assidned successfully"
    }

    public String changeVehicle() {
        if (this.assignedVehicle.length.trim() == 0) return "No can't change vehicle, No was assigned yet";
        this.assignedVehicle = vehicle;
        return "Vehicle assidned successfully"
    }
}