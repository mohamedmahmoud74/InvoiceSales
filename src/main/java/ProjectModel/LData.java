/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectModel;

/**
 *
 * @author Eng
 */
public class LData {
     private String item;
    private double price;
    private int count;
    private InvData invo;

    public LData() {
    }

    public LData(String item, double price, int count, InvData invoice) {
        this.item = item;
        this.price = price;
        this.count = count;
        this.invo = invoice;
    }

    public double getLTotal() {
        return price * count;
    }
    
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Line{" + "num=" + invo.getNumber() + ", item=" + item + ", price=" + price + ", count=" + count + '}';
    }

    public InvData getInv() {
        return invo;
    }
    
    public String getAsCSV() {
        return invo.getNumber() + "," + item + "," + price + "," + count;
    }
    
}
