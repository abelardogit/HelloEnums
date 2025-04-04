public class HelloEnumsApp {
    public static void main(String[] args) {
        Ordenacion ordenacion = obtenerOrdenCadena1("Albania", "AlbaniA");
        System.out.println(ordenacion);
    }

    private static Ordenacion obtenerOrdenCadena1(String cad1, String cad2) {
        boolean isGreater;
        if (!cad1.equals(cad2)) {
            isGreater = isGreaterString1ThanString2(cad1, cad2);
            return isGreater
                    ? Ordenacion.MAYOR
                    : Ordenacion.MENOR
            ;
        }
        return Ordenacion.IGUAL;
    }

    private static boolean isGreaterString1ThanString2(String cad1, String cad2) {
        boolean isGreater = true;
        char[] carsCad1 = cad1.toCharArray();
        int numCarsCad1 = carsCad1.length;

        char[] carsCad2 = cad2.toCharArray();
        int numCarsCad2 = carsCad2.length;

        int posCurrentChar = 0;

        int numMaxChars = Math.min(numCarsCad1, numCarsCad2);

        //FUNCIONA !!! :)
        if (numCarsCad1 > numCarsCad2)
            return isGreater;

        if (numCarsCad1 < numCarsCad2)
            return !isGreater;

        while(posCurrentChar < numMaxChars && isGreater) {

            char currentChar1 = carsCad1[posCurrentChar];
            char currentChar2 = carsCad2[posCurrentChar];
            isGreater = currentChar1 > currentChar2;
            posCurrentChar++;
        }

        return isGreater;
    }

}
