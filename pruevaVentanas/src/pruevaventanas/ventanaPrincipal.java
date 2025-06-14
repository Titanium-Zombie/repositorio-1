/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruevaventanas;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author PC
 */
public class ventanaPrincipal extends JFrame{
    public JPanel panel;
    JButton boton1;
    
    
    
    public ventanaPrincipal(){
        
        setSize(500, 500);
        setTitle("Rancho Viejo Caborca");
        setLocationRelativeTo(null);
        panelInicio();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
       
        
        
      
    }
    
    
    private void panelInicio(){
        colocarPanel();
        ventanaInicio();
        
        
        
        
        
        
        
        
    }
     private void colocarPanel(){
        
        panel= new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
        
    }
    
    
    private void ventanaInicio(){
        boton1=new JButton("ventas");
        boton1.setBounds(350, 350, 100, 20);
        boton1.setFont(new Font("arial",0,15));
        panel.add(boton1);
        ActionListener abrirVentas =new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
               
                System.out.println("hola mundo");
               
            }
            
            
        };
        boton1.addActionListener(abrirVentas);
       
        
        
    }
    
    private void panelVentas(){
        boton1=new JButton("facturas");
        boton1.setBounds(50, 50, 100, 20);
        boton1.setFont(new Font("arial",0,15));
        panel.add(boton1);
        
        boton1=new JButton("Notas de credito");
        boton1.setBounds(50, 100, 100, 20);
        boton1.setFont(new Font("arial",0,15));
        panel.add(boton1);
        
        
        
        
    }
    
    public void colocarBotones(){
        
        
        
        
        
        
        
    }
   
    
    


    
}
