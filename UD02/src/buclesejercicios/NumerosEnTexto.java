package buclesejercicios;


public class NumerosEnTexto {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            numToText(i);
        }
    }
    public static void numToText(int num){

        String texto = "";
        int numero = num;
        switch (numero / 10) {
            case 9 -> {
                texto += "noventa";

            }
            case 8 -> {
                texto += "ochenta";

            }
            case 7 -> {
                texto += "setenta";

            }
            case 6 -> {
                texto += "sesenta";

            }
            case 5 -> {
                texto += "cincuenta";

            }
            case 4 -> {
                texto += "cuarenta";

            }
            case 3 -> {
                texto += "treinta";

            }
            case 2 -> {

                texto += "veinte";

            }
            case 1 -> {
                switch (numero % 10) {
                    case 0 -> {
                        texto += "diez";
                    }
                    case 1 -> {
                        texto += "once";
                    }
                    case 2 -> {
                        texto += "doce";
                    }
                    case 3 -> {
                        texto += "trece";
                    }
                    case 4 -> {
                        texto += "catorce";
                    }
                    case 5 -> {
                        texto += "quince";
                    }
                    case 6 -> {
                        texto += "dieciseis";
                    }
                    case 7 -> {
                        texto += "diecisiete";
                    }
                    case 8 -> {
                        texto += "dieciocho";
                    }
                    case 9 -> {
                        texto += "diecinueve";
                    }
                }

            }
        }

        if (numero > 20 && numero % 10 != 0) {
            texto += " y ";
        }
        if ((numero > 20 || numero < 10) && (numero % 10) != 0) {
            switch (numero % 10) {
                case 9 -> {
                    texto += "nueve";
                }
                case 8 -> {
                    texto += "ocho";
                }
                case 7 -> {
                    texto += "siete";
                }
                case 6 -> {
                    texto += "seis";
                }
                case 5 -> {
                    texto += "cinco";
                }
                case 4 -> {
                    texto += "cuatro";
                }
                case 3 -> {
                    texto += "tres";
                }
                case 2 -> {
                    texto += "dos";
                }
                case 1 -> {
                    texto += "uno";
                }
            }
        }
        System.out.println(texto);
    }
}

