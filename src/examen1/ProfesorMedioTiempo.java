/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1;

public class ProfesorMedioTiempo extends Profesor {

    private final int HORAS_SEMANALES = 20;

    public ProfesorMedioTiempo(String cedula, String nombres, String apellidos, int horasClase, String carrera) {
        super(cedula, nombres, apellidos, horasClase, carrera);
    }

    public int getHORAS_SEMANALES() {
        return HORAS_SEMANALES;
    }

    @Override
    public String toString() {
        int control = horasCoplementarias();
        if(control < 0){
            control = 0;
        }
        return this.getCedula() + ";" + this.getNombres() + ";" + this.getApellidos() + ";Profesor Medio Tiempo; " + this.getHorasClase() + ";" + control;

    }

    public int horasCoplementarias() {
        return this.HORAS_SEMANALES - this.getHorasClase();
    }

}
