
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Modelo;
import vista.Vista;


public class Controlador implements ActionListener {

   // I created two objects of the classes done  
   private Vista view;
   private Modelo model;
   
   //The constructor receive two parameters//
   public Controlador( Vista view, Modelo model ){
       
    this.view=view;
    this.model=model;
    this.view.btnMultiplicar.addActionListener(this);
   }
    
   public void iniciar(){
    view.setTitle("MVX Multiplicar");
    view.setLocationRelativeTo(null);
} 
   
public void actionPerformed(ActionEvent e) {
       
    model.setNumerouno(Integer.parseInt(view.txtnumeroUno.getText()));
    model.setNumeroDos(Integer.parseInt(view.txtnumero2.getText()));
    model.Multiplicar();
    view.txtresultado.setText(String.valueOf(model.getResultado()));
       
    }
    







}
