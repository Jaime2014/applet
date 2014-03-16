package appletdecisiones;

import java.awt.*; 
import java.applet.*; 
import java.awt.event.*; 
 
// <applet width="200" height="200" code="AppletDecisiones4"></applet>
public class AppletDecisiones extends Applet implements ActionListener { 
   Label l1, l2, l3;
   TextField t1, t2, t3;
   Button b;
 
   public AppletDecisiones() { 
      l1 = new Label("mes"); 
      t1 = new TextField(3);
      l2 = new Label("Fecha con letras "); 
      t2 = new TextField(16); 
      l3 = new Label ("dia");
      t3 = new TextField(5);
      b = new Button("CAMBIAR"); 
      add(l1); 
      add(t1); 
      add(b); 
      add(l2); 
      add(t2);
      add(l3);
      add(t3); 
      b. addActionListener(this); 
      } 
   public void actionPerformed(ActionEvent ae) { 
      int mes = Integer.parseInt(t1.getText()); 
     switch (mes) 
      { 
         case 1: 
            t2.setText("Enero"); 
            break; 
         case 2: 
            t2.setText("Febrero"); 
            break; 
         case 3: 
            t2.setText("Marzo"); 
            break; 
         case 4: 
            t2.setText("Abril"); 
            break; 
         case 5: 
            t2.setText("Mayo"); 
            break; 
         case 6: 
            t2.setText("Junio"); 
            break; 
         case 7: 
            t2.setText("Julio"); 
            break; 
         case 8: 
            t2.setText("Agosto"); 
            break; 
         case 9: 
            t2.setText("Septiembre"); 
            break; 
         case 10: 
            t2.setText("Octubre"); 
            break; 
         case 11: 
            t2.setText("Noviembre"); 
            break; 
         case 12: 
            t2.setText("Diciembre"); 
            break; 
         default: 
            t2.setText("Error en el mes"); 
      }
           int dia = Integer.parseInt(t1.getText());
            switch (dia){ 
       
            case 1: 
            t3.setText("lunes"); 
            break;
            case 2: 
            t3.setText("Martes"); 
            break;
            case 3: 
            t3.setText("Miercoles"); 
            break;
            case 4: 
            t3.setText("Jueves"); 
            break;
            case 5: 
            t3.setText("Viernes"); 
            break;
            case 6: 
            t3.setText("Sabado"); 
            break;
            case 7: 
            t3.setText("Domingo"); 
            break; 
         default: 
            t3.setText("Error en el dia");
      }  
   }
}


// codigo modificado 