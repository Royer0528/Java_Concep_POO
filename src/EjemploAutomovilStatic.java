public class EjemploAutomovilStatic {
    public static void main(String[] args) {


        Motocicleta.setCapacidadTanqueEstatico(45);
        Motocicleta moto = new Motocicleta("yamaha","R1",Color.AZUL,600,17);
        Motocicleta moto2 = new Motocicleta ("Honda","CBR",Color.ROJO,600);
        Motocicleta moto3 = new Motocicleta ("Honda","CBR",Color.AMARILLO,600);
        Motocicleta moto4 = new Motocicleta("susuki","katana",Color.BLANCO);

        Motocicleta.setColorPatente (Color.NARANJO);

        //Utilizando la parametrizacion del atributo tipo, en los objetos ya creados
        moto.setTipo(TipoMotocicleta.DEPORTIVA);
        moto2.setTipo(TipoMotocicleta.MOTONETA);
        moto3.setTipo(TipoMotocicleta.DOBLE_PROPOSITO);
        moto4.setTipo(TipoMotocicleta.CUSTOM);



        // Metodos llamados del objeto Moto
        System.out.println("Motocicleta.getColoPatente() = " + moto.getColor());
        System.out.println("motocicleta fabricante: " + moto.getMarca());
        System.out.println( moto.detalleMotocicleta());
        System.out.println( moto.detalleAcelerar());
        System.out.println( moto.acelerar(5000));
        System.out.println("kilometros por litros = " + Motocicleta.calcularConsumoEstatico(300,60));

        // Metodos llamados del objeto Moto2
        System.out.println("Motocicleta.getColoPatente() = " + moto2.getColor());
        System.out.println("motocicleta fabricante: " + moto2.getMarca());
        System.out.println( moto2.detalleMotocicleta());
        System.out.println( moto2.detalleAcelerar());
        System.out.println( moto2.acelerar(5000));
        System.out.println("kilometros por litros = " + Motocicleta.calcularConsumoEstatico(300,60));

        // Metodos llamados del objeto Moto3
        System.out.println("Motocicleta.getColoPatente() = " + moto3.getColor());
        System.out.println("motocicleta fabricante: " + moto3.getMarca());
        System.out.println( moto3.detalleMotocicleta());
        System.out.println( moto3.detalleAcelerar());
        System.out.println( moto3.acelerar(5000));
        System.out.println("kilometros por litros = " + Motocicleta.calcularConsumoEstatico(300,60));

        // Metodos llamados del objeto Moto4
        System.out.println("Motocicleta.getColoPatente() = " + moto4.getColor());
        System.out.println("motocicleta fabricante: " + moto4.getMarca());
        System.out.println( moto4.detalleMotocicleta());
        System.out.println( moto4.detalleAcelerar());
        System.out.println( moto4.acelerar(5000));
        System.out.println("kilometros por litros = " + Motocicleta.calcularConsumoEstatico(300,60));

        System.out.println("Velocidad maxima carretera: " + Motocicleta.VELOCIDAD_MAX_CARRETERA);
        System.out.println("Velocidad maxima ciudad: " + Motocicleta.VELOCIDAD_MAX_CIUDAD);

        TipoMotocicleta tipoMotocicleta = moto.getTipo();
        System.out.println("tipo moto: " + tipoMotocicleta.getModelo());
        System.out.println("tipo desc moto: " + tipoMotocicleta.getDescripcion());
    }
}

