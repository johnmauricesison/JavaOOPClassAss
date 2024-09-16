/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sisonclass;

import javax.swing.JOptionPane;

/**
 *
 * @author John Maurice Sison
 */
public class agents {
    
    private String name;
    private double sales;
    
    
    public agents(String name, double sales){
        this.name = name;
        this.sales = sales;
    }
    
    
    public static void getAgentInfo(int agentnum, String name[], double sales[]){
        for(int i = 0; i < agentnum; i++){
            JOptionPane.showMessageDialog(null, "Enter Information for Agent " + (i+1) +": ", "Agent Information Input", JOptionPane.INFORMATION_MESSAGE);
            
            String n = JOptionPane.showInputDialog(null, "Enter Agent name: ", "Agent Information Details", JOptionPane.INFORMATION_MESSAGE);
            if(n == null ||  n.isEmpty()){
                JOptionPane.showMessageDialog(null, "Invalid Input!", "Invalid", JOptionPane.ERROR_MESSAGE);
                i--;
            }else{
                String s = JOptionPane.showInputDialog(null, "Enter Agent sales: ", "Agent Information Details", JOptionPane.INFORMATION_MESSAGE);
                
                if(s == null || s.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Invalid Input!", "Invalid", JOptionPane.ERROR_MESSAGE);
                    i--;
                }
                
                try {
                name[i] = n;
                sales[i] = Double.parseDouble(s);
                JOptionPane.showMessageDialog(null, "Agent " + (i + 1) + ": \n\nName: " + name[i] + "\nSales: " + sales[i], "Agent " + (i + 1) + " Details", JOptionPane.INFORMATION_MESSAGE);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Invalid input! Please enter a valid number.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
                    i--;
                }
            }
            

        }
    }
    
    public static int getHighAgent(double[] sales) {
        int max = 0;
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] > sales[max]) {
                max = i;
            }
        }
        return max;
    }
    
    public static double getAverage(double[] sales) {
        double total = 0;
        for (double sale : sales) {
            total += sale;
        }
        return total / sales.length;
    }
    
}
