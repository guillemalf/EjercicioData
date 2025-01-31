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
        switch(getDiesTranscorregutOrigen()%7){
            case 0:
                return "diumenge";
            case 1:
                return "dilluns";
            case 2:
                return "dimarts";
            case 3:
                return "dimecres";
            case 4:
                return "dijous";
            case 5:
                return "divendres";
            case 6:
                return "dissabte";          
        }
        return "";
    }
    
    /**
     * Solo Festivo sábado o domingo
     * @return boolean
     */
    public boolean isFestiu() {
        switch(getDiesTranscorregutOrigen()%7){
            case 0,6:
                return true;       
        }
        return false;
    }
    

    /**
     * Obtiene el número de la semana del año de la fecha actual
     * @return 
     */
    public int getNumeroSetmana() {
        return 0;
    }
        //falta por hacer

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
        boolean diaCorrecto=false;
        boolean mesCorrecto=false;
        boolean anyCorrecto=false;
        boolean correcto=false;
        switch (this.mes){
            case 1,3,5,7,8,10,12://31 días
                if (this.dia>31||this.dia<1){
                    diaCorrecto=false;
                }
                else{
                    diaCorrecto=true;
                }
                break;
            
            case 11,4,6,9://30 días
                if (this.dia>30||this.dia<1){
                    diaCorrecto=false;
                }
                else{
                    diaCorrecto=true;
                }
                break;
            case 2://febrero 28 o  29 depende
                if (isBisiesto(this.any)){//29
                    if (this.dia>29||this.dia<1){
                    diaCorrecto=false;
                }
                else{
                    diaCorrecto=true;
                }
                }
                else{//28
                    if (this.dia>28||this.dia<1){
                    diaCorrecto=false;
                }
                else{
                    diaCorrecto=true;
                }
                }
        }
        if(this.mes>0||this.mes<13){
            mesCorrecto=true;
        }
        else{
            mesCorrecto=false;
        }
        if(diaCorrecto&&mesCorrecto){
           correcto =true;
       }
        else{
            correcto=false;
        }
        return correcto;
    }

    
    /** Devuelve el valor absoluto de la diferencia de dias entre la fecha actual y la proporcionada
     * 
     * @param data
     * @return 
     */
    public long getDiesDeDiferencia(Data data) {
        long diasTotaless=0;
            for (int i = data.any; i < this.any; i++) {
                
                if(i==this.any){
                    break;
                }
                diasTotaless+=getDiesAny(i);
            }
            for (int i = data.mes; i < this.mes+1; i++) {
                if (i==data.mes){
                    diasTotaless+=this.dia-data.dia;
                }
                else{
                    diasTotaless+=getDiesMes(i, data.any);
                }
            }
            return diasTotaless;
    }
    
    /**
     * Determina si una fecha es posterior a la fecha proporcionada
     * @param data
     * @return 
     */
    public boolean esPosteriorA(Data data) {
        if (this.any>data.any){
            return true;
        }
        else if(this.any>=data.any&&this.mes>data.mes){
            return true;
        }
        else if (this.any>=data.any&&this.mes>=data.mes&&this.dia>data.dia){
        return true;
        }
        else{
        return false;
        }
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
        int diasMes=0;
        switch (mes){
            case 1,3,5,7,8,10,12://31 días
                diasMes=31;
                break;
            
            case 11,4,6,9://30 días
                diasMes=30;
                break;
            case 2://febrero 28 o  29 depende
                if (bisiesto){
                    diasMes=29;
                }
                else{
                    diasMes=28;
                }
        }
        return diasMes;
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
        private static int getDiesTranscorregutsEnAny(int mes,int dia,int año){
        int diasTotales=0;
            for (int i = 1; i < 13; i++) {//for para los meses
                if(i==mes){
                diasTotales+=dia;
                break;
                }
                else{
                diasTotales+=getDiesMes(i, 2020);
                }
            }
            return diasTotales;          
    }
 
        private int getDiesTranscorregutOrigen(){
            int diasTotales=0;
            for (int i = 1; i < this.any+1; i++) {
                if(i==this.any){
                    break;
                }
                diasTotales+=getDiesAny(i);
            }
            for (int i = 1; i < 13; i++) {
                if (i==this.mes){
                    diasTotales+=this.dia;
                    break;
                }
                else{
                    diasTotales+=getDiesMes(i, this.any);
                }
            }
            return diasTotales;
        }
}           
