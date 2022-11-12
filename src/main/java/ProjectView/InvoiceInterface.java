/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectView;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Eng
 */
public class InvoiceInterface extends JDialog {
    private JTextField customerNameField;
    private JTextField invoiceDateField;
    private JLabel customerNameLbl;
    private JLabel invoiceDateLbl;
    private JButton okButton;
    private JButton cancelButton;

    public InvoiceInterface(SIGFrame frame) {
        customerNameLbl = new JLabel("Customer Name:");
        customerNameField = new JTextField(20);
        invoiceDateLbl = new JLabel("Invoice Date:");
        invoiceDateField = new JTextField(20);
        okButton = new JButton("OK");
        cancelButton = new JButton("Cancel");
        
        okButton.setActionCommand("createInvoiceOK");
        cancelButton.setActionCommand("createInvoiceCancel");
        
        okButton.addActionListener(frame.getController());
        cancelButton.addActionListener(frame.getController());
        setLayout(new GridLayout(1, 2));
        
        add(invoiceDateLbl);
        add(invoiceDateField);
        add(customerNameLbl);
        add(customerNameField);
        add(okButton);
        add(cancelButton);
        
        pack();
        
    }

    public JTextField getCustNameField() {
        return customerNameField;
    }

    public JTextField getInvDateField() {
        return invoiceDateField;
    }
    
}
