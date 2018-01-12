/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refactorizacion.longMethod;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

/**
 *
 * @author Israel
 */
public class LongMethod {
     public void shapeInformation(){
    
        Circle circulo = new Circle(1+Math.random()*10);
        circulo.setFill(Color.CADETBLUE);
        print(circulo);
    }
     
     public void print(Circle circulo){
     
         System.out.println("el radio del circulo es: "+circulo.getRadius());
        System.out.println("el color del circulo es : "+circulo.getFill().toString());
     }
    
}
