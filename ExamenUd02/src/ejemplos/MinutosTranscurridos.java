package ejemplos;

public class MinutosTranscurridos {
    static int minutosTranscurridos(int horaA, int minutoA, int horaB, int minutoB) {
        int diferencia = -1;
        
        if (horaA < 24 || horaB < 24 || minutoA < 60 || minutoB < 60 || horaA >= 0 || horaB >= 0 || minutoA >= 0 || minutoB >= 0) {
            if (horaA > horaB) {
                
                if(minutoA > minutoB){
                    diferencia = ((horaA - horaB) * 60) + (minutoA - minutoB);
                }else if (minutoB > minutoA){
                    diferencia = ((horaA - horaB - 1) * 60) + (minutoA + 60 - minutoB);
                }else{
                    diferencia = ((horaA - horaB ) * 60);
                }

            } else if (horaB > horaA) {

                if(minutoB > minutoA){
                    diferencia = ((horaB - horaA) * 60) + (minutoB - minutoA);
                }else if (minutoA > minutoB){
                    diferencia = ((horaB - horaA - 1) * 60) + (minutoB + 60 - minutoA);
                }else{
                    diferencia = ((horaB - horaA ) * 60);
                }
            }else{
                if(minutoB > minutoA){
                    diferencia = minutoB - minutoA;
                }else if(minutoA > minutoB){
                    diferencia = minutoA - minutoB;
                }else{
                    diferencia = 0;
                }
            }

            
        }
        return diferencia;
    }
}
