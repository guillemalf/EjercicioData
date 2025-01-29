/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.cipfpbatoi;

import java.util.Calendar;
import java.util.StringTokenizer;


/**
 *
 * @author batoi
 */
public class Data {
    
    private int dia;
    private int mes;
    private int any;

    /**
     *  Constructor por defecto
     *  Inicializa una fecha a la fecha del sistema
     */
    public Data() {
        Calendar fecha = Calendar.getInstance();
        this.dia = fecha.get(Calendar.DATE);
        this.mes = fecha.get(Calendar.MONTH)+1;
        this.any = fecha.get(Calendar.YEAR);
    }
        
        
    /**
     *  Inicializa la fecha a partir de los parámetros recibidos
     * @param dia
     * @param mes
     * @param any
     */
    public Data(int dia, int mes, int any) {
        this.dia=dia;
        this.mes=mes;
        this.any=any;
    }

    /**
     * Inicializa la fecha a partir de otra pasada en formato String dd/mm/yyyy
     *
     * Deberemos trocearlas de forma que asignemos el día més y año a cada uno de los atributoe
     * @param fecha
     */
    public Data(String fecha) {
        StringTokenizer separador = new StringTokenizer(fecha, "/");
        this.dia=Integer.parseInt(separador.nextToken());
        this.mes=Integer.parseInt(separador.nextToken());
        this.any=Integer.parseInt(separador.nextToken());
            
        
    }
        
    /**
     * Modifica la fecha actual a partir de los datos pasados como argumento
     * @param dia
     * @param mes
     * @param any
     */
    public void set(int dia, int mes, int any) {
        this.dia=dia;
        this.mes=mes;
        this.any=any;
    }

    /**
     * Creará y devolverá un nuevo objeto de la clase Data iniciado
     * con los valores que representa el objeto actual, es decir creará un clon exacto del objeto
     * actual.
     * @return
     */
    public Data copy() {
        Data datos = new Data(this.dia,this.mes,this.any);
        return datos;
    }

    /**
     * (Ya implementado) Devuelve el día de la semana que representa por la Data actual
     * @return @dia
     */
    public int getDia() {
        return this.dia;
    }

    /**
     * (Ya implementado) Devuelve el mes que representa la Data actual
     * @return @mes
     */
    public int getMes(){
        return this.mes;
    }

    /**
     * (Ya implementado) Devuelve el año que representa la Data actual
     * @return @mes
     */
    public int getAny(){
        return this.any;
    }

    /**
     * Muestra por pantalla la fecha en formato español dd-mm-yyyy
     */
    public void mostrarEnFormatES()  {
        if(this.mes>0&&this.mes<10){
            System.out.println(this.dia+"/0"+this.mes+"/"+this.any);
        }
        else{
            System.out.println(this.dia+"/"+this.mes+"/"+this.any);
        }
    }

    /**
     * Muestra por pantalla la fecha en formato inglés yyyy-mm-dd
     */
    public void mostrarEnFormatGB() {
        if(this.mes>0&&this.mes<10){
            System.out.println(this.any+"-0"+this.mes+"-"+this.dia);
        }
        else{
            System.out.println(this.any+"-"+this.mes+"-"+this.dia);
        }
    }

    /**
     * Muestra por pantalla la fecha en formato texto dd-mmmmm-yyyy
     */
    public void mostrarEnFormatText() {
        String dia;
        if(this.dia<10&&this.dia>0){
            dia ="0"+this.dia;
        }
        else{
            dia=""+this.dia;
        }
        switch(this.mes){
            case 1 -> System.out.println(dia+"-gener-"+this.any);
            case 2 -> System.out.println(dia+"-febrer-"+this.any);
            case 3 -> System.out.println(dia+"-març-"+this.any);
            case 4 -> System.out.println(dia+"-abril-"+this.any);
            case 5 -> System.out.println(dia+"-maig-"+this.any);
            case 6 -> System.out.println(dia+"-juny-"+this.any);
            case 7 -> System.out.println(dia+"-juliol-"+this.any);
            case 8 -> System.out.println(dia+"-agost-"+this.any);
            case 9 -> System.out.println(dia+"-setembre"+this.any);
            case 10 -> System.out.println(dia+"-octubre-"+this.any);
            case 11 -> System.out.println(dia+"-novembre-"+this.any);
            case 12 -> System.out.println(dia+"-desembre-"+this.any);  
        }
    }
    /**
     * Retorna un booleano indicando si la fecha del objeto es igual a la fecha pasada como
     * argumento
     *
     * @param fecha
     * @return boolean
     */
    public boolean isIgual(Data fecha) {
        if(this.dia==fecha.dia&&this.mes==fecha.mes&&this.any==fecha.any){
            return true;
        }
        return false;
    }

    /**
     * Retorna el dia correspondiente de la semana en formato String
     * @return String
     */
    public String getDiaSetmana() {
        Calendar fecha = Calendar.getInstance();
        switch(fecha.get(Calendar.DAY_OF_WEEK)){
            case 1 -> {return "diumenge";}
            case 2 -> {return "dilluns";}
            case 3 -> {return "dimarts";}
            case 4 -> {return "dimecres";}
            case 5 -> {return "dijous";}
            case 6 -> {return "divendres";}
            case 7 -> {return "dissabte";}
        }
        return "";
    }
    
    /**
     * Solo Festivo sábado o domingo
     * @return boolean
     */
    public boolean isFestiu() {
        Calendar fecha = Calendar.getInstance();
        switch(fecha.get(Calendar.DAY_OF_WEEK)){
            case 1 -> {return true;}
            case 7 -> {return true;}
        }
        return false ;
    }

    /**
     * Obtiene el número de la semana del año de la fecha actual
     * @return 
     */
    public int getNumeroSetmana() {
        return -1;

    }

    /**
     * Crea una nueva fecha con un número de días adicionales a la fecha actual
     *
     * @param numDias
     * @return
     */
    public Data afegir(long numDias) {

        return null;
    }

    /**
     * Crea una nueva fecha con un número de días anteriores a la fecha actual
     * @param numDias
     * @return 
     */
    public Data restar(long numDias){
        return null;
    }
    
    /**
     * Determina si una fecha está compuesta por datos correctos
     * @return 
     */

    public boolean isCorrecta(){
        return false;
    }

    
    /** Devuelve el valor absoluto de la diferencia de dias entre la fecha actual y la proporcionada
     * 
     * @param data
     * @return 
     */
    public long getDiesDeDiferencia(Data data) {
        return -1L;
    }
    
    /**
     * Determina si una fecha es posterior a la fecha proporcionada
     * @param data
     * @return 
     */
    public boolean esPosteriorA(Data data) {
        return false;
    }

    /**
     * Indica si el año pasado como argumento es bisiesto
     * Un año es bisiesto si es divisible por 4 a su vez 100 por 400
     *
     * @param any
     * @return boolean
     */
    public static boolean isBisiesto(int any){
        if(any%4==0&&any%100!=0 || any%4==0&&any%100==0&&any%400==0){
            return true;
        }
        return false;
    }

    /**
     *  Calcula el número de días que tiene el mes representado por la fecha actual
     *
     * @param mes
     * @param any
     *  @return int total dias mes en curso
     *
     */
    public static int getDiesMes(int mes, int any) {
        boolean bisiesto=isBisiesto(any);
        switch(mes){
            case 1 -> {
                return 31;//enero
            }
            case  2 -> {
                
                if (bisiesto){
                    return 29;
                }               //febrero
                else{
                    return 28;
                }
                        }
            case 3 -> {
                return 31;//marzo
                        }
            case 4 -> {
                return 30;//abril
                        }
            case 5 -> {
                return 31;//mayo
                        }
            case 6 -> {
                return 30;//junio
                        }
            case 7 -> {
                return 31;//julio
                        }
            case 8 -> {
                return 31;//agosto
                        }
            case 9 -> {
                return 30;//septiembre
                        }
            case 10 -> {
                return 31;//octubre
                        }
            case 11 -> {
                return 30;//noviembre
                        }
            case 12 -> {
                return 31;//diciembre
                        }
}
        return -1;
    }

    /**
     * Calcula el número total de dias que tiene el año pasado como argumento
     *
     * @param any
     * @return int total dias any en curso
     */
    public static int getDiesAny(int any){
        boolean bisiesto =isBisiesto(any);
        int dias;
        if (bisiesto){
            dias =366;
        }
        else{
            dias =365;
        }
            
            return dias;
    }
        private String getMesEnFormarText(){//al poner estatic no podemos usar las varibles this.nombre
        switch(this.mes){
            case 1 -> {
                return "gener";
                }
            case 2 -> {
                return "febrer";
                }
            case 3 -> {
                return "març";
                }
            case 4 -> {
                return "abril";
                }
            case 5 -> {
                return "maig";
                }
            case 6 -> {
                return "june";
                }
            case 7 -> {
                return "juliol";
                }
            case 8 -> {
                return "agost";
                }
            case 9 -> {
                return "setembre";
                }
            case 10 -> {
                return "octubre";
                }
            case 11 -> {
                return "novembre";
                }
            case 12 -> {
                return "desembre";
                }
    }
    return "";
        
      
        
    }
}
