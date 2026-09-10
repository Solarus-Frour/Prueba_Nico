sealed class Memoria {
    object Exito : Memoria()
    data class Error (val motivo: String)
}

class Mantenedor{
    private var registro = mutableListOf<DatosG>()
}

fun validar(datosg : DatosG): Result<String> {
    if (Reserva.identi <=0) {Result.failure(IllegalArgumentException("El id debe ser mayor que cero"))}
    else {
        Result.success("Id ingresado correctamente")
    }

    if (Reserva.nombrecl.isBlank()) {Result.failure(IllegalArgumentException("El nombre del cliente no puede estar vacio"))}
    else {
        Result.success("Nombre ingresado correctamente")
    }

    if (Reserva.Cnoches > 0) {Result.failure(IllegalArgumentException("La cantidad de noches debe ser mayor que cero"))}
    else {
        Result.success("Cantidad de noches ingresado correctamente")
    }

    if (Reserva.valornoche > 0) {Result.failure(IllegalArgumentException("El valor por noche debe ser mayor que cero"))}
    else{
        Result.success("Valor por noche ingresado correctamente")
    }

    if (Reserva.cantpersonas > 0) {Result.failure(IllegalArgumentException("La cantidad de personas debe ser mayor que cero"))}
    else{
        Result.success("Cantidad de personas ingresado correctamente")
    }

    if (DatosG.identificador == identificador) {Result.failure(IllegalArgumentException("No pueden existir reservas con el mismo identificador"))}
    else {
        Result.success("Id ingresado")
    }
}

fun agregarRe(reserva: Reserva){

}


fun obtenerre(){

}

fun Visualizar(){
    println("Reserva")
    for (reserva in registro){
        val totalreserva = Reserva.Cnoches * Reserva.valorpnoche

        println(: ${Reserva.identificador})
        println(Nombre: ${Reserva.nombrecl})
        println(Precio: $${Reserva.valorpnoche})
        println(Noches: ${Reserva.Cnoches})
        println(Tipo Alojamiento: ${Reserva.TipoAlojo.name})
        println(Valor Total: $${Reserva.totalreserva})
        println(Descripción: ${Reserva.inforeser()})
    }

}