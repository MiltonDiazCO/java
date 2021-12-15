package basico;

public class DatosPrimitivos {

    public static void main(String[] args) {

        // Enteros
        byte varByte = 10; // 1-byte (-128 to 127)
        short varShort = 30000; // 2-bytes (-32,768 to 32,767)
        int varInt = 2000000; // 4-byts (-2,147,483,648 to 2,147,483,647)
        long varLong = 670000000000L; // 8-byts (-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807)

        System.out.println(varByte + ", " + varShort + ", " + varInt + ", " + varLong);

        // Decimales
        float varFloat = 2.34F; // 4-byts (7 cifras decimales)
        double varDouble = 5.7852; // 8-byts (15 cifras decimales)

        System.out.println(varFloat + ", " + varDouble);

        // Char - representa caracteres
        char varChar = 'a';
        System.out.println(varChar);

        // Booleanos - true and false
        boolean varBoolean = true;
        System.out.println(varBoolean);

        // Constantes - no se puede modificar su valor
        final int varConst = 1;
        System.out.println(varConst);
    }

}