public enum TipoMotocicleta {
    DEPORTIVA ("Deportiva","Moto_Grande", 600),
    CROSS ("Cross","Moto_Mediana",250),
    CHOPPER ("Choper","Moto_Grande", 500),
    ELECTRICA ("Electrica","Moto_Pequeña",150),
    MOTONETA ("Motoneta","Moto_Pequeña",150),
    CUATRIMOTO ("Cuatrimoto","Moto_Mediana", 250),
    DOBLE_PROPOSITO ("Doble proposito","Moto_Mediana",250),
    SURFF ("Acuatica","Moto_Mediana", 110),
    CUSTOM ("Custom","Moto_Grande",600);

    private final String modelo;
    private final String descripcion;
    private final int cilindrada;

    TipoMotocicleta(String modelo, String descripcion, int cilindrada) {
        this.modelo = modelo;
        this.descripcion = descripcion;
        this.cilindrada = cilindrada;
    }
    public String getModelo() {
        return modelo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getCilindrada() {
        return cilindrada;
    }


}
