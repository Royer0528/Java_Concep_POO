public class Automovil {
    private String fabricante;
    private String modelo;
    private String color;
    private double cilindrada;

    public Automovil(String fabricante, String modelo) {
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public String detalleAutomovil(){
        StringBuilder sb = new StringBuilder();
        sb.append("Auto.fabricante = " + this.fabricante);
        sb.append("\nAuto.modelo = " + this.modelo);
        sb.append("\nAuto.color = " + this.color);
        sb.append("\nAuto.cilindrada = " + this.cilindrada);

        return sb.toString();
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }
}