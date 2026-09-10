sealed class TipoAlojo(string: String) {
    object Habitacion: TipoAlojo("Incluye cama y baño")
    object Cabaña: TipoAlojo("Incluye cama, cocina, baño, 2 cuartos")
    object Departamento: TipoAlojo("Incluye cama, cocina, baño y un cuarto")

}
