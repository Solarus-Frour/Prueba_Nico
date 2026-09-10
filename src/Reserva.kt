class Reserva (
    identi: Int,
    nombrecl: String,
    Cnoches: Int,
    var valorpnoche: Double,
    var cantpersonas: Int,
    var tipoAlojo: TipoAlojo)
    :DatosG(identi, nombrecl, Cnoches)

fun Inforeser(): String{
    return "Reserva: #$identi: '$nombre' - Noches: $Cnoches - Precio Noche: $$valorpnoche - Personas: $cantpersonas - Alojamiento: ${TipoAlojo.name}"
}

