/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.cipfpbatoi;

/**
 *
 * @author batoi
 */
public class Agenda {
    private Esdeveniment Esdeveniment1;
    private Esdeveniment Esdeveniment2;
    private Esdeveniment Esdeveniment3;
    private int ocupado=0;
    
    public void AfegirNouEsdeveniment(TipusEsdeviment esdeviment, String notaDescriptiva){
        if (ocupado==0){
            this.Esdeveniment1=new Esdeveniment(esdeviment,notaDescriptiva);
            ocupado=1;
        }
        else if(ocupado==1){
            this.Esdeveniment3=new Esdeveniment(esdeviment,notaDescriptiva);
            ocupado=2;
        }
        else if(ocupado==3){
            this.Esdeveniment2=new Esdeveniment(esdeviment,notaDescriptiva);
            ocupado=3;
        }
        
    }
    public void AfegirNouEsdeveniment(TipusEsdeviment esdeviment, String notaDescriptiva,int diesRestants){
        if (ocupado==0){
            this.Esdeveniment1=new Esdeveniment(esdeviment,notaDescriptiva,diesRestants);
            ocupado=1;
        }
        else if(ocupado==1){
            this.Esdeveniment2=new Esdeveniment(esdeviment,notaDescriptiva,diesRestants);
            ocupado=2;
        }
        else if(ocupado==3){
            this.Esdeveniment3=new Esdeveniment(esdeviment,notaDescriptiva,diesRestants);
            ocupado=3;
        }
    }
    public void AfegirNouEsdeveniment(TipusEsdeviment esdeviment, String notaDescriptiva,int diesRestants,String ubicacio){
         if (ocupado==0){
            this.Esdeveniment1=new Esdeveniment(esdeviment,notaDescriptiva,ubicacio,diesRestants);
            ocupado=1;
        }
         else if(ocupado==1){
              this.Esdeveniment2=new Esdeveniment(esdeviment,notaDescriptiva,ubicacio,diesRestants);
            ocupado=2;
        }
        else if(ocupado==3){
             this.Esdeveniment3=new Esdeveniment(esdeviment,notaDescriptiva,ubicacio,diesRestants);
            ocupado=3;
        }
    }
    public void esdevimentsguardats(){
    
    }

    }

