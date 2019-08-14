/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imc;

/**
 *
 * @author usuario
 */
public class IMC {

  public IMC (){
  
  }
  public double resultadoIMC(double  peso ,double estatura ){
      
        double resultado = peso/Math.pow(estatura,2);
        
        return resultado;
  }
  public String OBS_IMC(double IMC){
      
        String diagnostico="";
       
        if(IMC<15){
            diagnostico="delgades muy severa ";
            
        }else if (IMC<=15.9){
             diagnostico="delgades severa ";
             
        } else if (IMC<=24.9){
             diagnostico="peso saludable  ";
             
        }else if (IMC<30){
             diagnostico="sobrepeso   ";
             
        }else if (IMC<40){
             diagnostico="sobrepeso severo  ";
             
        }else{
             diagnostico="obesidad movidad y pertunbante  ";
        }
  
  
        return diagnostico;
    }
  
}
