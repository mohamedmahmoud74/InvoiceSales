/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectModel;

import java.util.ArrayList;


public class InvData {
    private int number;
    private String date;
    private String customerName;
    private ArrayList<LData> lines;
 

    public InvData(int num, String date, String customer) {
        this.number = num;
        this.date = date;
        this.customerName = customer;
    }

    public double getInvoiceTotal() {
        double total = 0.0;
        for (LData line : getLine()) {
            total += line.getLTotal();
        }
        return total;
    }
    
    public ArrayList<LData> getLine() {
        if (lines == null) {
            lines = new ArrayList<>();
        }
        return lines;
    }

    public String getCustomer() {
        return customerName;
    }

    public void setCustomer(String customer) {
        this.customerName = customer;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int num) {
        this.number = num;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Invoice{" + "num=" + number + ", date=" + date + ", customer=" + customerName + '}';
    }
    
    public String getAsCSV() {
        return number + "," + date + "," + customerName;
    }
    
    
}
