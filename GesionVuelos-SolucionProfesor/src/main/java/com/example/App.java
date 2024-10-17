package com.example;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class App {

    private static final int TOTAL_PLAZAS_VUELO_1 = 3;
    private static final int TOTAL_PLAZAS_VUELO_2 = 3;
    private static final int TOTAL_PLAZAS_VUELO_3 = 3;

    public static void main(String[] args) {

        // Vuelos a destinos diferentes
        List<Vuelo> vuelosDestinosDiferentes = new ArrayList<>();

        // Solucion al punto a). Crear vuelos a tres destinos diferentes.

        Vuelo vuelo1, vuelo2, vuelo3;

        // Listado de Pasajeros del Vuelo 1
        List<Pasajero> pasajerosVuelo1ListaDeEspera = new ArrayList<>();

        Pasajero pasajero1Vuelo1 = Pasajero.builder()
                .nombre("Ruben")
                .primerApellido("Gomez")
                .segundoApellido("Sabio")
                .fechaNacimiento(LocalDate.of(1991, Month.APRIL, 2))
                .sexo(Sexo.HOMBRE)
                .build();

        Pasajero pasajero2Vuelo1 = Pasajero.builder()
                .nombre("Martina")
                .primerApellido("Gomez")
                .segundoApellido("Sabio")
                .fechaNacimiento(LocalDate.of(1990, Month.SEPTEMBER, 2))
                .sexo(Sexo.MUJER)
                .build();

        Pasajero pasajero3Vuelo1 = Pasajero.builder()
                .nombre("Maria")
                .primerApellido("Sanchez")
                .segundoApellido("Perez")
                .fechaNacimiento(LocalDate.of(1994, Month.JULY, 27))
                .sexo(Sexo.MUJER)
                .build();

        Pasajero pasajero4Vuelo1 = Pasajero.builder()
                .nombre("Laura")
                .primerApellido("Machado")
                .segundoApellido("Perez")
                .fechaNacimiento(LocalDate.of(2000, Month.JULY, 25))
                .sexo(Sexo.MUJER)
                .build();

        pasajerosVuelo1ListaDeEspera.add(pasajero1Vuelo1);
        pasajerosVuelo1ListaDeEspera.add(pasajero2Vuelo1);
        pasajerosVuelo1ListaDeEspera.add(pasajero3Vuelo1);
        pasajerosVuelo1ListaDeEspera.add(pasajero4Vuelo1);

        // Listado de Pasajeros del Vuelo 2
        List<Pasajero> pasajerosVuelo2ListaDeEspera = new ArrayList<>();

        Pasajero pasajero1Vuelo2 = Pasajero.builder()
                .nombre("Antonio")
                .primerApellido("Saez")
                .segundoApellido("Vagace")
                .fechaNacimiento(LocalDate.of(1980, Month.FEBRUARY, 25))
                .sexo(Sexo.HOMBRE)
                .build();

        Pasajero pasajero2Vuelo2 = Pasajero.builder()
                .nombre("Susana")
                .primerApellido("Gomez")
                .segundoApellido("Sarmiento")
                .fechaNacimiento(LocalDate.of(1991, Month.SEPTEMBER, 21))
                .sexo(Sexo.MUJER)
                .build();

        Pasajero pasajero3Vuelo2 = Pasajero.builder()
                .nombre("Laura")
                .primerApellido("Machado")
                .segundoApellido("Perez")
                .fechaNacimiento(LocalDate.of(2000, Month.JULY, 25))
                .sexo(Sexo.MUJER)
                .build();

        pasajerosVuelo2ListaDeEspera.add(pasajero1Vuelo2);
        pasajerosVuelo2ListaDeEspera.add(pasajero2Vuelo2);
        pasajerosVuelo2ListaDeEspera.add(pasajero3Vuelo2);

        // Listado de Pasajeros del Vuelo 3
        List<Pasajero> pasajerosVuelo3ListaDeEspera = new ArrayList<>();

        Pasajero pasajero1Vuelo3 = Pasajero.builder()
                .nombre("Mario")
                .primerApellido("Saez")
                .segundoApellido("Vagace")
                .fechaNacimiento(LocalDate.of(1980, Month.FEBRUARY, 25))
                .sexo(Sexo.HOMBRE)
                .build();

        Pasajero pasajero2Vuelo3 = Pasajero.builder()
                .nombre("Antonia")
                .primerApellido("Gomez")
                .segundoApellido("Sarmiento")
                .fechaNacimiento(LocalDate.of(1991, Month.SEPTEMBER, 21))
                .sexo(Sexo.MUJER)
                .build();

        pasajerosVuelo3ListaDeEspera.add(pasajero1Vuelo3);
        pasajerosVuelo3ListaDeEspera.add(pasajero2Vuelo3);

        // Creamos los vuelos

        vuelo1 = Vuelo.builder()
                .destino("Tokio")
                .precio(699.99)
                .fechaSalida(LocalDate.of(2024, Month.NOVEMBER, 1))
                .horaSalida(LocalTime.of(7, 45))
                .fechaLlegada(LocalDate.of(2024, Month.NOVEMBER, 2))
                .horaLlegada(LocalTime.of(7, 50))
                .numeroPlazas(TOTAL_PLAZAS_VUELO_1)
                .build();

        vuelo2 = Vuelo.builder()
                .destino("Barcelona")
                .precio(99.99)
                .fechaSalida(LocalDate.now())
                .horaSalida(LocalTime.of(7, 45))
                .fechaLlegada(LocalDate.of(2024, Month.OCTOBER, 18))
                .horaLlegada(LocalTime.of(9, 50))
                .numeroPlazas(TOTAL_PLAZAS_VUELO_2)
                .build();

        vuelo3 = Vuelo.builder()
                .destino("Roma")
                .precio(125.99)
                .fechaSalida(LocalDate.now())
                .horaSalida(LocalTime.of(19, 0))
                .fechaLlegada(LocalDate.now())
                .horaLlegada(LocalTime.of(22, 0))
                .numeroPlazas(TOTAL_PLAZAS_VUELO_3)
                .build();

        // Agregar pasajeros al vuelo 1

        List<Pasajero> pasajerosVuelo1ListaDefinitiva = new ArrayList<>();

        pasajerosVuelo1ListaDefinitiva.addAll(pasajerosVuelo1ListaDeEspera.stream()
                .limit(TOTAL_PLAZAS_VUELO_1).collect(Collectors.toList()));

        // int contadorPasajeros = 0;

        // for (Pasajero pasajero : pasajerosVuelo1ListaDeEspera) {
        // if (contadorPasajeros++ < vuelo1.getNumeroPlazas()) {
        // pasajerosVuelo1ListaDefinitiva.add(pasajero);
        // } else {
        // System.out.println("Vuelo completo, no se admiten mas pasajeros");
        // break;
        // }

        // }

        System.out.println("El total de pasajeros del vuelo 1 es : " +
                pasajerosVuelo1ListaDefinitiva.size());

        vuelo1.setPasajeros(pasajerosVuelo1ListaDefinitiva);

        // Agregar pasajeros al vuelo 2

        List<Pasajero> pasajerosVuelo2ListaDefinitiva = new ArrayList<>();

        pasajerosVuelo2ListaDefinitiva.addAll(pasajerosVuelo2ListaDeEspera.stream()
                .limit(TOTAL_PLAZAS_VUELO_2).collect(Collectors.toList()));

        // contadorPasajeros = 0;

        // for (Pasajero pasajero : pasajerosVuelo2ListaDeEspera) {
        // if (contadorPasajeros++ < vuelo2.getNumeroPlazas()) {
        // pasajerosVuelo2ListaDefinitiva.add(pasajero);
        // } else {
        // System.out.println("Vuelo completo, no se admiten mas pasajeros");
        // break;
        // }

        // }
        System.out.println("El total de pasajeros del vuelo 2 es : " +
                pasajerosVuelo2ListaDefinitiva.size());

        vuelo2.setPasajeros(pasajerosVuelo2ListaDefinitiva);

        // Agregar pasajeros al vuelo 3

        List<Pasajero> pasajerosVuelo3ListaDefinitiva = new ArrayList<>();

        pasajerosVuelo3ListaDefinitiva.addAll(pasajerosVuelo3ListaDeEspera.stream()
                .limit(TOTAL_PLAZAS_VUELO_3).collect(Collectors.toList()));

        // contadorPasajeros = 0;

        // for (Pasajero pasajero : pasajerosVuelo3ListaDeEspera) {
        // if (contadorPasajeros++ < vuelo3.getNumeroPlazas()) {
        // pasajerosVuelo3ListaDefinitiva.add(pasajero);
        // } else {
        // System.out.println("Vuelo completo, no se admiten mas pasajeros");
        // break;
        // }

        // }
        System.out.println("El total de pasajeros del vuelo 3 es : " +
                pasajerosVuelo3ListaDefinitiva.size());

        vuelo3.setPasajeros(pasajerosVuelo3ListaDefinitiva);

        // Creamos la lista de Vuelos
        vuelosDestinosDiferentes.add(vuelo1);
        vuelosDestinosDiferentes.add(vuelo2);
        vuelosDestinosDiferentes.add(vuelo3);

        /* Solucion Pto 1 */

        List<Vuelo> vuelosCompletos = vuelosDestinosDiferentes.stream()
                .filter(vuelo -> vuelo.getPasajeros().size() == vuelo.getNumeroPlazas())
                .collect(Collectors.toList());

        System.out.println("Total de Vuelos completos " + vuelosCompletos.size());

        /* Solucion al Pto 2 */

        List<Vuelo> vuelosHoy = vuelosDestinosDiferentes.stream()
                .filter(vuelo -> vuelo.getFechaSalida().isEqual(LocalDate.now()))
                .collect(Collectors.toList());

        // Comprobar el resultado
        List<LocalDate> fechasDeHoy = vuelosHoy.stream()
                .map(v -> v.getFechaSalida()).collect(Collectors.toList());

        System.out.println("Fechas de hoy : " + fechasDeHoy);

        /* Solucion al Pto 3 */

        List<Vuelo> vuelosMas10Horas = vuelosDestinosDiferentes.stream()
                .filter(vuelo -> vuelo.getDuracion() > 10)
                .collect(Collectors.toList());

        System.out.println("Vuelos de mas de 10 horas de duracion " + vuelosMas10Horas);

        /* Solucion al Pto. 4 */
        List<Vuelo> vuelosMas24Horas = vuelosDestinosDiferentes.stream()
                .filter(vuelo -> vuelo.getDuracion() > 24)
                .collect(Collectors.toList());

        System.out.println("Vuelos de mas de 24 horas de duracion " + vuelosMas24Horas);

        /* Solucion al Pto 5 */

        // Primero: Recuperar el precio mas alto
        // final Double precioMaximo =
        // vuelosDestinosDiferentes.stream().mapToDouble(Vuelo::getPrecio).max().orElse(0.0);

        // Vuelo vueloPrecioMaximo = vuelosDestinosDiferentes.stream().filter(v ->
        // v.getPrecio() == precioMaximo).findAny().get();

        // System.out.println(vueloPrecioMaximo);

        // Magnifica Solucion de Ivan

        Vuelo vueloMayorPrecio = vuelosDestinosDiferentes.stream()
                .max(
                        (Vuelo v1, Vuelo v2) -> Double.valueOf(v1.getPrecio())
                                .compareTo(v2.getPrecio()))
                .get();

        System.out.println("El vuelo con mayor precio es: " + vueloMayorPrecio);

        /* Solucion al Pto. 6 */

        // Primero: Considerando que los vuelos son a destinos diferentes

        Map<String, List<Pasajero>> pasajerosPorDestino = vuelosDestinosDiferentes.stream()
                .collect(Collectors.toMap(Vuelo::getDestino, Vuelo::getPasajeros));

        System.out.println("PASAJEROS POR DESTINO");
        System.out.println(pasajerosPorDestino);

        /* Solucion al Pto. 7 */

        List<Vuelo> vuelos10DiasAntesMesEnCurso = vuelosDestinosDiferentes.stream()
                .filter(vuelo -> vuelo.getFechaSalida()
                        .with(TemporalAdjusters.lastDayOfMonth()).minusDays(10).isBefore(vuelo.getFechaSalida()))
                .collect(Collectors.toList());

        // Mas desglozada la SOLUCION por Ivan (Tener en cuenta que no hay extraer el
        // LocalDate del LocalDateTime, si no es necesario)

        // List<Vuelo> vuelosSalida10AntesFinalizacionMes = listaVuelos.stream()
        // .filter(vuelo -> {
        // LocalDate fechaSalida = LocalDate.of(
        // vuelo.getFechaHoraSalida().getYear(),
        // vuelo.getFechaHoraSalida().getMonth(),
        // vuelo.getFechaHoraSalida().getDayOfMonth());
        // LocalDate fecha10DiasAntes =
        // fechaSalida.with(TemporalAdjusters.lastDayOfMonth()).minusDays(10);
        // return fechaSalida.isAfter(fecha10DiasAntes);
        // })
        // .collect(Collectors.toList());
        // System.out.println("=====EJERCICIO 7=====");
        // System.out.println("Lista de vuelo que salen 10 dias antes de que termine su
        // mes:\n" + vuelosSalida10AntesFinalizacionMes);

        /* Solucion al Pto. 8 */

        Map<Sexo, Map<Long, List<Pasajero>>> pasajerosPorSexoYEdad = vuelosDestinosDiferentes.stream()
                .map(Vuelo::getPasajeros).flatMap(listaDePasajero -> listaDePasajero.stream())
                .collect(Collectors.groupingBy(Pasajero::getSexo,
                        Collectors.groupingBy(Pasajero::getEdad)));

        System.out.println("Pto 8 ...");

        System.out.println(pasajerosPorSexoYEdad);

        /* Solucion al Pto. 9 */

        System.out.println("Pto 9 ...");
        pasajerosPorSexoYEdad.entrySet().forEach(entry1 -> {
            System.out.println("Del Sexo: " + entry1.getKey());
            Map<Long, List<Pasajero>> valor = entry1.getValue();
            valor.entrySet().forEach(entry2 -> {
                System.out.println("Y edad " + entry2.getKey());

                List<Pasajero> pasajeros = entry2.getValue();

                pasajeros.stream().sorted().forEach(System.out::println);


                
            });

        });

    }
}
