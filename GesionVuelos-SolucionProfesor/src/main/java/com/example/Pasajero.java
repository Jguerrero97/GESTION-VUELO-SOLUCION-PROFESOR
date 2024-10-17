package com.example;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Pasajero implements  Comparable<Pasajero> {

    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private LocalDate fechaNacimiento;
    private Sexo sexo;

    public long getEdad() {
        return ChronoUnit.YEARS.between(fechaNacimiento, LocalDate.now());
    }

    @Override
    public int compareTo(Pasajero pasajero) {
        
        int cmpPrimerApellido = this.primerApellido.compareTo(pasajero.getPrimerApellido());
        int cmpSegundoApellido = this.segundoApellido.compareTo(pasajero.getSegundoApellido());
        int cmpNombre = this.nombre.compareTo(pasajero.getNombre());
        
        return cmpPrimerApellido != 0 ? cmpPrimerApellido : cmpSegundoApellido != 0 ? cmpSegundoApellido : cmpNombre;
    }
}
