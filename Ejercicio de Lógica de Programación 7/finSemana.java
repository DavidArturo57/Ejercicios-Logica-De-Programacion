public class finSemana {

    public static void main(String[] args) {
    	
        //Escribe dia de la semana 
        System.out.println("Ingresa el día de la semana desde lunes al  viernes):");
        String dia = System.console().readLine().toLowerCase();

        int dia_num = 0;

        // ciclo switch asignacion del dia segun el usuario
        switch (dia) {
            case "lunes":
                dia_num = 1;
                break;
            case "martes":
                dia_num = 2;
                break;
            case "miercoles":
                dia_num = 3;
                break;
            case "jueves":
                dia_num = 4;
                break;
            case "viernes":
                dia_num = 5;
                break;
            default:
                System.out.println("Día no es correcto.");
                return; 
        }

        // Ingresar la hora
        System.out.println("Ingresa la hora: ");
        int horas = Integer.parseInt(System.console().readLine());
        

        // Ingresar los minutos
        System.out.println("Ingresa el minuto: ");
        int minuto = Integer.parseInt(System.console().readLine());
        

        // calcula minutos totales y actuales
        int total_min = (4 * 24 * 60) + (15 * 60); 
        int actual_min = ((dia_num - 1) * 24 * 60) + (horas * 60) + minuto; 
        System.out.println("Faltan " + (total_min - actual_min) + " minutos para llegar al fin de semana.");
        
    }
}

