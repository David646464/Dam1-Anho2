package clasesparaninfo.EP0715;

public class Calendario {
    int dia;
    int mes;
    int año;

    public Calendario(int dia, int mes, int año) {
        // Dia
        if (mes == 2 && dia > 28 || mes == 9 && dia > 30 || mes == 11 && dia > 30 || mes == 4 && dia > 30
                || mes == 6 && dia > 30) {
            this.dia = 1;
        } else {
            if (dia > 31) {
                this.dia = 1;
            }
            this.dia = dia;
        }

        // Mes
        if (mes > 12 || mes < 1) {
            this.mes = 1;
        } else {
            this.mes = mes;
        }
        // Año
        if (año == 0) {
            this.año = 1;
        } else {
            this.año = año;
        }
    }

    public Calendario() {
        this.dia = 1;
        this.mes = 1;
        this.año = 1;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if (dia > 31 || dia < 1) {
            this.mes = 1;
        } else {
            this.dia = dia;
        }
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if (mes > 12 || mes < 1) {
            this.mes = 1;
        } else {
            this.mes = mes;
        }
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        if (año == 0) {
            this.año = 1;
        } else {
            this.año = año;
        }

    }

    void mostrar() {
        System.out.println(dia + "/" + mes + "/" + año);
    }

    // Funciones
    public void incrementarDia() {
        boolean indicador = true;
        if (mes == 9 || mes == 11 || mes == 4 || mes == 6) {
            if (dia == 30) {
                dia = 1;
                mes++;
            } else {
                dia++;
            }
        } else if (mes == 2) {
            if (dia == 28) {
                dia = 1;
                mes++;
            } else {
                dia++;
            }
        } else {
            if (dia == 31) {
                dia = 1;
                if (mes == 12) {
                    mes = 1;
                    if (año == -1) {
                        año = 1;
                    } else {
                        año++;
                    }
                } else {
                    mes++;
                }
            } else {
                dia++;
            }
        }
    }

    void incrementarMes() {
        if (mes == 12) {
            if (mes == 12) {
                mes = 1;
                if (año == -1) {
                    año = 1;
                } else {
                    año++;
                }
            }
        } else {
            mes++;
        }
    }

    void incrementarAño(int cantidad) {
        if (año < 0) {
            if (año + cantidad > 0) {
                año += cantidad + 1;
            } else {
                año += cantidad;
            }
        } else {
            año += cantidad;
        }
    }

    public boolean iguales(Calendario otraFecha) {
        boolean iguales = false;
        if (dia == otraFecha.dia && mes == otraFecha.mes && año == otraFecha.año) {
            iguales = true;
        }

        return iguales;
    }
}
