public class ConversionTipodeDatos {
    public static void main(String[] args) {
        String numeroStr = "50";

        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt : " + numeroInt);

        String realStr = "93.7429";

        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble : " + realDouble);

        String logicoStr = "true";
        boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBoolean : " + logicoBoolean);

        int i = 32768;
        short s = (short) i;
        System.out.println("s = " + s);
        long l = i;
        System.out.println("l = " + l);

        //cuando casteas tiene que ser uno superior para no perder informacion, si lo casteas
        //a uno que tiene la memoria inferior entonces la informacion en ese variable perderas
    }
}
