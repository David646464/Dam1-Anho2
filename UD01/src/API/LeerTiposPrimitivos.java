package API;

import java.util.Scanner;

public class LeerTiposPrimitivos {
    //Creador:david sánchez peso
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce un dato de tipo " + "Byte");
        byte tipoPrim1 = sc.nextByte();

        System.out.println("introduce un dato de tipo " + "short");
        short tipoPrim2 = sc.nextShort();

        System.out.println("introduce un dato de tipo " + "int");
        int tipoPrim3 = sc.nextInt();

        System.out.println("introduce un dato de tipo " + "long");
        long tipoPrim4 = sc.nextLong();

        System.out.println("introduce un dato de tipo " + "float");
        float tipoPrim5 = sc.nextFloat();

       System.out.println("introduce un dato de tipo " + "double");
        double tipoPrim6 = sc.nextDouble();

        System.out.println("introduce un dato de tipo " + "char");
        char tipoPrim7 = sc.next().charAt(0);

        System.out.println("introduce un dato de tipo " + "boolean");
        boolean tipoPrim8 = sc.nextBoolean();

        System.out.println("introduce un dato de tipo " + "String");
        String tipoPrim9 = sc.next();
        

        System.out.println("Tipo\t\tValor");
        System.out.println("byte\t\t|" + tipoPrim1);
        System.out.println("short\t\t|" + tipoPrim2);
        System.out.println("int\t\t|" + tipoPrim3);
        System.out.println("long\t\t|" + tipoPrim4);
        System.out.println("float\t\t|" + tipoPrim5);
        System.out.println("double\t\t|" + tipoPrim6);
        System.out.println("char\t\t|" + tipoPrim7);
        System.out.println("boolean\t\t|" + tipoPrim8);
        System.out.println("string\t\t|" + tipoPrim9);
    }
    
}
