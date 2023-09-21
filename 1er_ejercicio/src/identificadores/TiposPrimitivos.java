package identificadores;

public class TiposPrimitivos {
    //Creador:david sánchez peso

    public static void main(String[] args) {
        
        byte tipoPrim1 = 1;
        short tipoPrim2 = 2;
        int tipoPrim3 = 34;
        long tipoPrim4 = 55555555;
        float tipoPrim5 = 35.88f;
        double tipoPrim6 = 55.55;
        char tipoPrim7 = 'a';
        boolean tipoPrim8 = true;

        System.out.println("La variable" + " varByte " + "es de tipo " + "byte" + " ,tiene como valor " + tipoPrim1 + " y ocupa " + "1" +" byte en memoria");
        System.out.println("La variable" + " varShort " + "es de tipo " + "short" + " ,tiene como valor " + tipoPrim2 + " y ocupa " + "2" +" bytes en memoria");
        System.out.println("La variable" + " varInt " + "es de tipo " + "int" + " ,tiene como valor " + tipoPrim3 + " y ocupa " + "4" +" bytes en memoria");
        System.out.println("La variable" + " varLong " + "es de tipo " + "long" + " ,tiene como valor " + tipoPrim4 + " y ocupa " + "8" +" bytes en memoria");
        System.out.println("La variable" + " varFloat " + "es de tipo " + "float" + " ,tiene como valor " + tipoPrim5 + " y ocupa " + "4" +" bytes en memoria");
        System.out.println("La variable" + " varDouble " + "es de tipo " + "double" + " ,tiene como valor " + tipoPrim6 + " y ocupa " + "8" +" bytes en memoria");
        System.out.println("La variable" + " varChar " + "es de tipo " + "char" + " ,tiene como valor '" + tipoPrim7 + "' y ocupa " + "2" +" bytes en memoria");
        System.out.println("La variable" + " varBoolean " + "es de tipo " + "boolean" + " ,tiene como valor '" + tipoPrim8 + "' y ocupa " + "1" +" bit en memoria");


        System.out.println("===============================================");

        System.out.println("Tipo\tNumBits\t\tValor");
        System.out.println("byte\t|" + 8 + "\t\t|" + tipoPrim1);
        System.out.println("short\t|" + 16 + "\t\t|" + tipoPrim2);
        System.out.println("int\t|" + 32 + "\t\t|" + tipoPrim3);
        System.out.println("long\t|" + 64 + "\t\t|" + tipoPrim4);
        System.out.println("float\t|" + 32 + "\t\t|" + tipoPrim5);
        System.out.println("double\t|" + 64 + "\t\t|" + tipoPrim6);
        System.out.println("char\t|" + 16 + "\t\t|" + tipoPrim7);
        System.out.println("boolean\t|" + 1 + "\t\t|" + tipoPrim8);
    }
    
}
