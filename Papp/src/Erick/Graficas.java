/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Erick;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;
/**
 *
 * @author Personal
 */
public class Graficas {
    
    public static void main(String[] args){
        
        DefaultPieDataset grafica=new DefaultPieDataset();
        grafica.setValue("Categoria 1", 20.5);
        grafica.setValue("Categoria 2 ", 40.6);
        grafica.setValue("Categoria 3", 75.9);
        JFreeChart chart = ChartFactory.createPieChart("Ventas de Categorias", grafica,true,true,true);
        PiePlot plot=(PiePlot) chart.getPlot();
        ChartFrame frame=new ChartFrame("Primer Chart para javax0711",chart);
        frame.setVisible(true);
        frame.setSize(450,500);
  
    }
    
}
