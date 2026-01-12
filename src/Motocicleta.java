class Motocicleta {
    private int id;
    private String marca;
    private String modelo;
    private Color color;
    private double cilindrada;
    private int capacidadTanque = 40;

    private static Color colorPatente = Color.NARANJO;
    private static int capacidadTanqueEstatico = 30;
    private static int ultimoId;

    //Atributos de clase tipo constante o final
    public static final Integer VELOCIDAD_MAX_CARRETERA = 120;
    public static final Integer VELOCIDAD_MAX_CIUDAD = 60;

    //Parametrizando valores del atributo color
    public static final String COLOR_ROJO = "Rojo";
    public static final String COLOR_AMARILLO = "Amarillo";
    public static final String COLOR_AZUL = "Azul";
    public static final String COLOR_BLANCO = "Blanco";
    public static final String COLOR_GRIS = "Gris Oscuro";

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Motocicleta() {
        this.id = ++ ultimoId;
    }


    public Motocicleta(String marca, String modelo) {
        this();
        this.marca = marca;
        this.modelo = modelo;
    }

    public static int getCapacidadTanqueEstatico() {
        return capacidadTanqueEstatico;
    }

    public static void setCapacidadTanqueEstatico(int capacidadTanqueEstatico) {
        Motocicleta.capacidadTanqueEstatico = capacidadTanqueEstatico;
    }



    // En esta parte vemos el termino encapsulamiento que es una de las caracteristicas de la programacion orientada a objetos
    // En esta seccion observamos el metodo get para obtner los valores de los atributos de una clase
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Color getColor() {
        return color;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public int getCapacidadTanque() {
        return capacidadTanque;
    }

    // En esta parte observamos el metodo set para asignar valores a los atributos de una clase
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public void setcapacidadTanque(int capacidadTanque) {
        this.capacidadTanque = capacidadTanque;
    }

    public static Color getColorPatente() {
        return colorPatente;
    }

    public static void setColorPatente(Color colorPatente) {
        Motocicleta.colorPatente = colorPatente;
    }

    public String detalleMotocicleta() {
        StringBuilder sb = new StringBuilder();
        sb.append("moto.id = " + this.id);
        sb.append("\nmoto.fabricante = " + this.marca);
        sb.append("\nmoto.modelo = " + this.modelo);
        sb.append("\nmoto.color = " + this.color.getColor());
        sb.append("\nmoto.cilindrada = " + this.cilindrada);

        return sb.toString();
    }

    public String detalleAcelerar() {
        StringBuilder sb = new StringBuilder();
        sb.append("La motocicleta " + this.modelo + " está acelerando");
        return sb.toString();
    }

    public String acelerar(int rpm) {
        return "La motocicleta " + this.marca + " está acelerando a " + rpm + " revoluciones por minuto.";
    }

    public String frenar() {
        return "La motocicleta " + this.marca + " está frenando.";
    }

    public String acelerarFrenar(int rpm) {
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();
        return acelerar + "\n" + frenar;
    }

    public double calcularConsumo(int km, float porcentajeCombustible) {
        return km / (capacidadTanque * porcentajeCombustible / 100f);
    }

    public static double calcularConsumoEstatico(int km, int porcentajeCombustible) {
        return km / (Motocicleta.capacidadTanqueEstatico * (porcentajeCombustible / 100f));
    }

    // Sobrecarga de constructores
    public Motocicleta(String marca, String modelo,Color color) {
        this(marca, modelo);
        this.color = color;
    }

    public Motocicleta(String marca, String modelo, Color color, double cilindrada) {
        this(marca, modelo, color);
        this.cilindrada = cilindrada;
    }

    public Motocicleta(String marca, String modelo, Color color, double cilindrada, int capacidadTanque) {
        this(marca, modelo, color, cilindrada);
        this.capacidadTanque = capacidadTanque;
    }

    public Motocicleta(int capacidadTanque) {
        this.capacidadTanque = capacidadTanque;
    }

    // Metodo equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Motocicleta)) {
            return false;
        }
        Motocicleta a = (Motocicleta) obj;
        return (this.marca != null
                && this.modelo != null
                && this.marca.equals(a.getMarca())
                && this.modelo.equals(a.getModelo()));
    }

    // Metodo toString

    @Override
    public String toString() {
        return "Motocicleta{" +
                "id=" + id +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", cilindrada=" + cilindrada +
                ", capacidadTanque=" + capacidadTanque +
                '}';
    }
    //Metodo int

}
