public class Cuenta {
    private String titular;
    private String numeroCuenta;
    private double saldo;
    private String tipoCuenta;

    public Cuenta(String titular, String numeroCuenta) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0;
        this.tipoCuenta = "AHORRO";
    }
//Validar que el saldo no sea negativo
    public Cuenta(String titular, String numeroCuenta, float saldo, String tipoCuenta){
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        if(saldo < 0){
            this.saldo = 0;
        }else {
            this.saldo = saldo;
        }
        this.tipoCuenta = tipoCuenta;
    }


}
