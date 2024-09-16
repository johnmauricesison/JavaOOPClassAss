/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sisonclass;

/**
 *
 * @author John Maurice Sison
 */

import javax.swing.*;
public class Sisonclass {

    public static void main(String[] args) {
        
        String num = JOptionPane.showInputDialog(null, "Enter number of Agents", "Agents Number", JOptionPane.INFORMATION_MESSAGE);
        int agentnum;
        try {
            agentnum = Integer.parseInt(num);
            if (agentnum <= 0) {
                JOptionPane.showMessageDialog(null, "Invalid input! Please enter a valid number of agents.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input! Please enter a valid number of agents.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        String[] name = new String[agentnum];
        double[] sales = new double[agentnum];
        
        agents.getAgentInfo(agentnum, name, sales);
        
       
        int highest = agents.getHighAgent(sales);
        double ave = agents.getAverage(sales);
        String average = String.format("%.2f", ave);
            
            
        JOptionPane.showMessageDialog(null, "The agent with the highest sales is:\nName: " + name[highest] + "\nSales: " + sales[highest], "Top Agent", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "The average sales of all agents is: " + average, "Average Sales", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Process Complete! Thank You!", "Completed", JOptionPane.INFORMATION_MESSAGE);
        
    }
}
