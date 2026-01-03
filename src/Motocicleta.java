 class Motocicleta {
    private String marca;
    private String modelo;
    private String color;
    private double cilindrada;
    private int capacidadTanque = 40;

    public Motocicleta(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

     public Motocicleta(){
     }

     //En esta parte vemos el termino encapsulamiento que es una de las caracteristicas de la programacion orientada a objetos
    //En esta seccion observamos el metodo get para obtner los valores de los atributos de una clase
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public int getCapacidadTanque() {
        return capacidadTanque;
    }

    //En esta parte observamos el metodo set para asignar valores a los atributos de una clase
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setCilindrada(double cilindrada){
        this.cilindrada = cilindrada;
    }
    public void setcapacidadTanque(int capacidadTanque){
        this.capacidadTanque = capacidadTanque;
    }


    public String detalleMotocicleta(){
        StringBuilder sb = new StringBuilder();
        sb.append("moto.fabricante = " + this.marca);
        sb.append("\nmoto.modelo = " + this.modelo);
        sb.append("\nmoto.color = " + this.color);
        sb.append("\nmoto.cilindrada = " + this.cilindrada);

        return sb.toString();
    }
    public String detalleAcelerar(){
        StringBuilder sb = new StringBuilder();
        sb.append("La motocicleta " + this.modelo + " está acelerando");
        return sb.toString();
    }
    public String acelerar(int rpm){
        return "La motocicleta " + this.marca + " está acelerando a " + rpm + " revoluciones por minuto.";
    }
    public String frenar(){
        return "La motocicleta " + this.marca + " está frenando.";
    }
    public String acelerarFrenar(int rpm){
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();
        return acelerar + "\n" + frenar;
    }
    public double calcularConsumo(int km, float porcentajeCombustible){
        return km/(capacidadTanque*porcentajeCombustible);
    }


    //Sobrecarga de constructores
     public Motocicleta(String marca,String modelo,String color){
        this(marca,modelo);
        this.color = color;
     }

     public Motocicleta(String marca, String modelo, String color, double cilindrada) {
         this(marca,modelo,color);
         this.cilindrada = cilindrada;
     }

     public Motocicleta(String marca, String modelo, String color, double cilindrada, int capacidadTanque) {
         this(marca,modelo,color,cilindrada);
         this.capacidadTanque = capacidadTanque;
     }

     public Motocicleta(int capacidadTanque) {
         this.capacidadTanque = capacidadTanque;
     }

     //Metodo equals

     @Override
     public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(!(obj instanceof Motocicleta)){
            return false;
        }
         Motocicleta a = (Motocicleta)obj;
         return(this.marca != null && this.modelo != null
                 && this.marca.equals(a.getMarca())
                 && this.modelo.equals(a.getModelo()));
     }
 }
