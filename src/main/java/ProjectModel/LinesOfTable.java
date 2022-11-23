
package ProjectModel;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class LinesOfTable extends AbstractTableModel {

    private ArrayList<LData> lines;
    private String[] columns = {"No.", "Item Name", "Item Price", "Count", "Item Total"};

    public LinesOfTable(ArrayList<LData> lines) {
        this.lines = lines;
    }

    public ArrayList<LData> getLine() {
        return lines;
    }
    
    
    @Override
    public int getRowCount() {
        return lines.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public String getColumnName(int x) {
        return columns[x];
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        LData line = lines.get(rowIndex);
        
        switch(columnIndex) {
            case 0: return line.getInv().getNumber();
            case 1: return line.getItem();
            case 2: return line.getPrice();
            case 3: return line.getCount();
            case 4: return line.getLTotal();
            default : return "";
        }
    }
    
}
