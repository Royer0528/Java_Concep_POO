public class EjemploMotocicletaEnum {
    public static void main(String[] args) {


        Motocicleta.setCapacidadTanqueEstatico(45);
        Motocicleta moto = new Motocicleta("yamaha","R1",Color.AZUL,600,17);
        Motocicleta moto2 = new Motocicleta ("Honda","CBR",Color.ROJO,600);
        Motocicleta moto3 = new Motocicleta ("Honda","CBR",Color.AMARILLO,600);
        Motocicleta moto4 = new Motocicleta("susuki","katana",Color.BLANCO);

        Motocicleta.setColorPatente (Color.NARANJO);

        moto.setTipo(TipoMotocicleta.CUSTOM);
        TipoMotocicleta tipo = moto.getTipo();
        System.out.println("tipo moto: " + tipo.getModelo());
        System.out.println("tipo desc moto: " + tipo.getDescripcion());

        tipo = moto.getTipo();
        switch (tipo) {
            case CROSS ->
                System.out.println("La motocicleta es cross y cilindrada de motor");
            case DEPORTIVA ->
                System.out.println("La motocicleta es deportiva y cilindrada de motor baja");
            case ELECTRICA ->
                System.out.println("La motocicleta es electrica y no gasta en gasolin");
            case SURFF ->
                System.out.println("La motocicleta surf solo sirve para el mar y el agua");
            case CUATRIMOTO ->
                System.out.println("La motocileta tiene 4 ruedas y es todo terreno");
            case CUSTOM ->
                System.out.println("La motocicleta tiene el motor en V");
            case CHOPPER ->
                System.out.println("La motocicleta la usan los rockeros como el TRI");
            case MOTONETA ->
                System.out.println("La motocicleta es para mujeres solamente ");
            case DOBLE_PROPOSITO ->
                System.out.println("Este tipo de motocicleta se puede usar en cualquier tipo de terreno");
        }

        TipoMotocicleta[] tipos = TipoMotocicleta.values();
        for(TipoMotocicleta ta: tipos){
            System.out.println(ta + " => " + ta.name() + ", " +
                    ta.getModelo() + ", " +
                    ta.getDescripcion() + ", " +
                    ta.getCilindrada());

            System.out.println();
        };
    }
}

