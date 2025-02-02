/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.cipfpbatoi;

/**
 *
 * @author batoi
 */
public class Esdeveniment {

    private TipusEsdeviment esdeveniment;
    private Data fechaActual;
    private String notaDescriptiva;
    private String ubicacio;
    private Data fechaProxima;
    
    public static void main(String[] args) {
        TipusEsdeviment hola = TipusEsdeviment.ESPECIAL;
        String hola1 = "ESPECIAL";
        System.out.println(hola.equals(hola1.toUpperCase()));
    }
    
    public Esdeveniment(TipusEsdeviment esdeveniment, String notaDescriptiva,int diesRestants){
        this.esdeveniment=esdeveniment;
        this.fechaProxima=new Data();
        this.fechaProxima=this.fechaProxima.afegir(diesRestants);
        this.notaDescriptiva=notaDescriptiva;
    }
    public Esdeveniment(TipusEsdeviment esdeveniment, String notaDescriptiva){
        this.esdeveniment=esdeveniment;
        this.fechaProxima=new Data();
        this.fechaProxima=this.fechaProxima.afegir(30);
    }
    public Esdeveniment(TipusEsdeviment esdeveniment, String notaDescriptiva,String ubicacio,int diesRestants){
        this.esdeveniment=esdeveniment;
        this.fechaProxima=new Data();
        this.fechaProxima=this.fechaProxima.afegir(diesRestants);
        this.notaDescriptiva=notaDescriptiva;
        this.ubicacio=ubicacio;
    }
    public void mostrar(){
        this.fechaActual= new Data();
        if(this.fechaProxima.esPosteriorA(this.fechaActual)){
            if(this.ubicacio==null){
                System.out.println(this.esdeveniment+" "+this.notaDescriptiva+" -> "+" - "+"Data: "+fechaProxima.getDia()+"/"+fechaProxima.getMes()+"/"+fechaProxima.getAny());
            }
            else{
                System.out.println(this.esdeveniment+" "+this.notaDescriptiva+" -> "+this.ubicacio+" - "+"Data: "+fechaProxima.getDia()+"/"+fechaProxima.getMes()+"/"+fechaProxima.getAny());
            }          
        }
        else{
            System.out.println(this.esdeveniment+" "+this.notaDescriptiva+" -> ja ha tingut lloc el dia "+fechaProxima.getDia()+"/"+fechaProxima.getMes()+"/"+fechaProxima.getAny());
        }
    }
    public void substituir(int dias){
        fechaProxima=fechaProxima.afegir(dias);
}
    public boolean determinarDespuesDeunaFecha(Data esdevenimentActual){
     return esdevenimentActual.esPosteriorA(this.fechaActual);
    }
    public boolean determinarYaHaocurrido(Data esdevenimentActual){
        return fechaActual.esPosteriorA(esdevenimentActual);
    }
    
}
