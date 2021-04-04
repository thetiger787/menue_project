/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menue.project;

import java.awt.*;
import java.awt.event.*;
import java.awt.print.PrinterException;
import java.io.PrintWriter;
import java.util.Arrays;
import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.text.*;
/**
 *
 * @author Ali Alramdan -- Mohammed Almotawa -- Mohammed AlAbdulmohsen
 */
public class inside extends JFrame {
 //all fonts here
     Font font1 = new Font("monospaced", Font.ITALIC, 22);
     Font font2 = new Font("monospaced", Font.BOLD, 24);
     Font font3 = new Font("monospaced", Font.BOLD, 12);
     Font font4 = new Font("monospaced", Font.BOLD, 16);
     Font font5 = new Font("monospaced", Font.BOLD, 16);

    //all textfields here
     JTextField textField_id = new JTextField();
     JTextField textField_dish= new JTextField();
     JTextField textField_price = new JTextField();
     
     //all buttons here
     JButton btn_add = new JButton("Add");
     JButton btn_clear = new JButton("Clear");
     JButton btn_delete = new JButton("Delete Selected");
     JButton btn_deleteAll = new JButton("Delete All");
     JButton b_save = new JButton("Save/Print");
     JButton b_account = new JButton("Accounting");
     JButton discount_code = new JButton("Discount");
     JButton b_new = new JButton("New receipt");
     JButton add_rowsT2 = new JButton("Add Selected >>");
     JButton rem_rowsT2  = new JButton("Remove");      
     JButton del_allT2 = new JButton("Delete All");
     JButton b_exit = new JButton("EXIT");
     JButton b_back = new JButton("Back to main page");
     
     
     //table content
     String columns_t1[] = {"ID", "Dish", "Price S.R"};
       String data1[][] = {                                         
            {"1", "meat kabab", "8" },
            {"2", "chicken Shawarma", "6" },
            {"3", "meat Shawarma", "6" },
            {"4", "cheese", " 4" },
            {"5", "meat hamburger", "10" },
            {"6", "chicken hamburger", "10" },
            {"7", "chicken Pizza", "15" },
            {"8", "meat Pizza", "15" },
            {"9", "vigitable Pizza", "15" },
            {"10", "falafel", "4" }
        };
      
       
     DefaultTableModel model = new DefaultTableModel();
      //table 1
     JTable table = new JTable( model );
     JScrollPane tableScroller = new JScrollPane( table );
     //all labels here
      JLabel label_id = new JLabel("ID");
     JLabel label_dish = new JLabel("Dish");
     JLabel label_price = new JLabel("Price");
     JLabel acc_la = new JLabel("Account");
     JLabel sub_l = new JLabel("Sub-Total:   0.0 SR");
     JLabel vat_l = new JLabel("VAT 15%:     0.0 SR");
     JLabel discount_l = new JLabel("Discount:    0.0 SR");
     JLabel total_l = new JLabel("Total:       0.0 SR");
     
     //panel 1 here
     JPanel panel1 = new JPanel();
     String title = "Account";
     TitledBorder border = BorderFactory.createTitledBorder(title);
   
     //number of receipts
     JSpinner s1 = new JSpinner();
     int Customer_Counter=0;
     JLabel CustomerCounterLabel = new JLabel("Num of receipt: 0");
     
     //defind new variables
     double total ,subtotal , vat, discount;

   
      DefaultTableModel model2 = new DefaultTableModel();
      
      //table 2
      JTable table2 = new JTable(model2);
      JScrollPane tableScroller2 = new JScrollPane(table2);
      
       PrintWriter output;
       
     
       

    
      
      
      

     
     
    
  public inside(){
      
   // Title , Layout , and  
      super("Menu inside ");
      setLayout(null);
      model.setDataVector(data1, columns_t1);
      
    
      
      
   // Output
         add(label_id);
         add(label_dish);
         add(label_price);
         add(textField_id);
         add(textField_dish);
         add(textField_price);
         add(btn_add);
         add(btn_clear);
         add(btn_delete);
         add(btn_deleteAll);
         add(tableScroller);
         add(acc_la);
         add(sub_l);
         add(vat_l);
         add(discount_l);
         add(total_l);
         add(panel1);
         add(b_account);
         add(b_new);
         add(b_save);
         add(b_exit);
         add(b_back);
         add(CustomerCounterLabel);
         add(add_rowsT2);
         add(rem_rowsT2);
         add(del_allT2);
         add(discount_code);
         add(tableScroller2);
         
        
        model2.addColumn("ID");
        model2.addColumn("Dish");
        model2.addColumn("Price 'SR'");
        
        
        
    // Font 
        sub_l.setFont(font1);
        vat_l.setFont(font1);
        total_l.setFont(font1);
        discount_l.setFont(font1);
        b_account.setFont(font3);
        b_new.setFont(font3);
        b_save.setFont(font3);
        b_exit.setFont(font1);
        b_back.setFont(font1);
        label_id.setFont(font4);
        label_dish.setFont(font4);
        label_price.setFont(font4);
        btn_add.setFont(font4);
        btn_clear.setFont(font4);
        btn_delete.setFont(font3);
        btn_deleteAll.setFont(font3);
        CustomerCounterLabel.setFont(font2);
        textField_id.setFont(font2);
        textField_dish.setFont(font2);
        textField_price.setFont(font2);
        add_rowsT2.setFont(font3);
        discount_code.setFont(font3);
        
        
    // Background and foreward
        b_account.setBackground(Color.darkGray);
        b_account.setForeground(Color.white);
        b_new.setBackground(Color.darkGray);
        b_new.setForeground(Color.white);
        b_save.setBackground(Color.darkGray);
        b_save.setForeground(Color.white);
        b_exit.setBackground(Color.WHITE);
        b_exit.setForeground(Color.black);
        b_back.setBackground(Color.WHITE);
        b_back.setForeground(Color.black);
        btn_add.setBackground(Color.darkGray);
        btn_add.setForeground(Color.white);
        btn_clear.setBackground(Color.darkGray);
        btn_clear.setForeground(Color.white);
        btn_delete.setBackground(Color.darkGray);
        btn_delete.setForeground(Color.white);
        btn_deleteAll.setBackground(Color.darkGray);
        btn_deleteAll.setForeground(Color.white);
        add_rowsT2.setBackground(Color.darkGray);
        add_rowsT2.setForeground(Color.white);
        rem_rowsT2.setBackground(Color.darkGray);
        rem_rowsT2.setForeground(Color.white);
        del_allT2.setBackground(Color.darkGray);
        del_allT2.setForeground(Color.white);
        discount_code.setBackground(Color.darkGray);
        discount_code.setForeground(Color.white);
        
         
     // Locations
        label_id.setBounds(20, 400, 50, 40);
        label_dish.setBounds(20, 450, 50, 40);
        label_price.setBounds(20, 500, 50, 40);
        textField_id.setBounds(80, 400, 270, 40);
        textField_dish.setBounds(80, 450, 270, 40);
        textField_price.setBounds(80, 500, 270, 40);
        btn_add.setBounds(80, 575, 130, 40);
        btn_clear.setBounds(220, 575, 130, 40);
        btn_delete.setBounds(290, 360, 140, 30);
        btn_deleteAll.setBounds(100, 360, 140, 30);
        tableScroller.setBounds(50, 55, 430, 300);
        sub_l.setBounds(710, 310, 400, 300);
        vat_l.setBounds(710 , 350, 400, 300);
        discount_l.setBounds(710, 390, 400, 300);
        total_l.setBounds(710, 430, 400, 300);
        b_account.setBounds(1030, 405, 140, 40);
        b_save.setBounds(1030, 455, 140, 40);
        b_new.setBounds(1030, 505, 140, 40);
        discount_code.setBounds(1030, 555, 140, 40);
        b_exit.setBounds(470, 700, 300, 40);
        b_back.setBounds(470, 650, 300, 40);
        CustomerCounterLabel.setBounds(700, 25, 250, 30);
        add_rowsT2.setBounds(500,150, 180, 80);
        rem_rowsT2.setBounds(750, 360,140, 30);
        del_allT2.setBounds(940, 360,140, 30);
        tableScroller2.setBounds(700, 55, 430, 300);
              
        panel1.setBounds(700 , 400 , 320, 200);
        panel1.setBorder(border);
        border.setTitleFont(font2);
        
        
    //disable discount_code button
        discount_code.setEnabled(false);
        b_new.setEnabled(false);
     
        
        
    // Actions:
    
    //add new dish to menue
        btn_add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if( !textField_id.getText().equals("") && !textField_dish.getText().equals("") && !textField_price.getText().equals("") )
                {
                    String id = textField_id.getText();
                    String name = textField_dish.getText();
                    String price = textField_price.getText();
 
                    String[] userInfo = { id, name, price };
                    model.addRow( userInfo );
                }
            }
        });
         
    //clear the 3 textfields 
        btn_clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                textField_id.setText("");
                textField_dish.setText("");
                textField_price.setText("");
            }
        });
    
    //delete selected dish from menue
        btn_delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if( table.getSelectedRowCount() > 0 )
                {
                    int[] selectedIndices = table.getSelectedRows();
                    for( int i=selectedIndices.length-1; i>=0; i-- )
                    {
                        model.removeRow( selectedIndices[i] );
                    }
                }
            }
        });
         
    //delete all dishes from menue(Table1)
        btn_deleteAll.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                model.setRowCount(0);
            }
        });
      
    // make new recive
        b_new.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent ae) {
              
        //disable discount_code button
              discount_code.setEnabled(false);
              discount_l.setFont(font1);
              discount_l.setForeground(Color.black);
              
              {
            if (total > 0)
            {
            discount=0;
            b_new.setEnabled(false);
            sub_l.setText("Sub-Total: 0.0 SR");
            vat_l.setText("VAT(%15): 0.0 SR");
            discount_l.setText("Discount 0%: 0.0 SR");
            total_l.setText("Total: 0.0 SR");
            
            
            Customer_Counter++;
            CustomerCounterLabel.setText("Num of receipt: " +Customer_Counter);
            model2.setRowCount(0);      

            }
            
        }
              
          }
      });
         
    //Calculation here (subtotal-VAT-total)
          b_account.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent ae) {
              
               b_new.setEnabled(true);
               int numrow = model2.getRowCount();
               subtotal = 0;
               vat=0;
               total=0;
               
              
              
              for(int i=0 ; i < numrow ; i++){
                  double val = Double.valueOf(model2.getValueAt(i, 2).toString());
                  
                  subtotal = subtotal + val;
                   vat = subtotal * 0.15;
                   vat = vat * 100;
                   vat = (double)((int) vat);
                   vat = vat/100 ;
                   
                   
                   total = subtotal + vat;
                   total = total * 100;
                   total = (double)((int)total);
                   total = total/100;
                  
              }
             
              sub_l.setText("Sub-Total: " + subtotal + " SR");
              vat_l.setText("VAT(%15):  " + vat+ " SR");
              total_l.setText("Total:   "   + total +  " SR");
              
              if (total>0)
              {
                  b_new.setEnabled(true);
              }
              
              //enable discount_code button
              if (total>0)
              {
                  discount_code.setEnabled(true);
              }
             
              
              
          }
      });
        
    //Calculate discount
        discount_code.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent ae) {
            String backupDir = "";
            String[] copuns = {"a","b","c"};
            int copNum = copuns.length;
              
    
        // create a jframe
            JFrame frame = new JFrame("JOptionPane showMessageDialog example");
    
        // show a joptionpane dialog using showMessageDialog
            String copun = JOptionPane.showInputDialog(frame, "insert discount copun "  );
            discount_l.setForeground(Color.red);
            discount_l.setFont(font1);
            
            for (int i=0;i<=copNum;i++){
                if (Arrays.asList(copuns).contains(copun)){
                   
                    if(copun.equals("a")){
                           JOptionPane.showMessageDialog(frame,  "( "+copun +" )"+" is valid"+" ,10% discount");
                   discount = subtotal * 0.10;
                   discount = discount * 100;
                   discount = (double)((int) discount);
                   discount = discount/100;
                   
                   
                   total = (subtotal + vat) - discount;
                   total = total * 100;
                   total = (double)((int)total);
                   total = total/100;
                   discount_l.setText("Discount(10%): -" + discount+ " SR");
                   total_l.setText("Total:   "   + total +  " SR");
                   
                    
                    }
                    else if (copun.equals("b"))
                    {
                   JOptionPane.showMessageDialog(frame,  "( "+copun +" )"+" is valid"+" ,15% discount");
                   
                  
                   discount = subtotal * 0.15;
                   discount = discount * 100;
                   discount = (double)((int) discount);
                   discount = discount/100; 
                   
                    
                   total = (subtotal + vat) - discount;
                   total = total * 100;
                   total = (double)((int)total);
                   total = total/100;
                   discount_l.setText("Discount(15%): -" + discount+ " SR");
                   total_l.setText("Total:   "   + total +  " SR");
                   
                    }
                    else if (copun.equals("c"))
                    {
                   JOptionPane.showMessageDialog(frame,  "( "+copun +" )"+" is valid "+" ,20% discount");
                   discount = subtotal * 0.20;
                   discount = discount * 100;
                   discount = (double)((int) discount);
                   discount = discount/100;
                    
                   total = subtotal + vat - discount;
                   total = total * 100;
                   total = (double)((int)total);
                   total = total/100;
                   discount_l.setText("Discount(20%): -" + discount+ " SR");
                   total_l.setText("Total:   "   + total +  " SR");
                    }
               
                  
                break;
                }
                else {
                    JOptionPane.showMessageDialog(frame,"( "+copun +" )"+" is invalid copun!!!");
                        break;
                    }
            
            }
    
            
                     }
      });
         
     //save and print the recive  
        b_save.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent ae) {
              
             MessageFormat header = new MessageFormat("ReciveNo " + Customer_Counter);
              MessageFormat footer = new MessageFormat("Sub_total =  " + subtotal + "  SR "
                                                      +"VAT[15%] =  " + vat + "  SR  "
                                                      +"Discount =  " + discount + "  SR "
                                                      +"Total =  " + total + "  SR ");
              

                try{
                   
                    table2.print(JTable.PrintMode.FIT_WIDTH , header , footer);
                    
                
                }catch(PrinterException e){
                    System.err.format("Cannot print!!", e.getMessage());
                } 
            
           
                      }
      });
         
        
    //Add selected dish to recive (from table1 to table2)
        add_rowsT2.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent ae) {
                 
        TableModel model = table.getModel();
        int[] indexs = table.getSelectedRows();
        Object[] row = new Object[4];
        DefaultTableModel model2 = (DefaultTableModel) table2.getModel();

        for(int i = 0; i < indexs.length; i++)
        {
            row[0] = model.getValueAt(indexs[i], 0);
            row[1] = model.getValueAt(indexs[i], 1);
            row[2] = model.getValueAt(indexs[i], 2);
            model2.addRow(row);
        }
                    
              
          }});
          
    //Remove selected dish from recive (from table2)
        rem_rowsT2.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent ae) {

              if( table2.getSelectedRowCount() > 0 )
                {
                    int[] selectedIndices = table2.getSelectedRows();
                    for( int i=selectedIndices.length-1; i>=0; i-- )
                    {
                        model2.removeRow( selectedIndices[i] );
                    }
                }
          }
      });
        
    // delete all the recive (from table2)
        del_allT2.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent ae) {
              
              model2.setRowCount(0);
              
              }
      });
         
    // back to main class
        b_back.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent ae) {
              
              MenueProject main = new MenueProject();
              main.startMain();
              inside.this.setVisible(false);
              
          }
      });
        
    //Exit from the app
        b_exit.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent ae) {

              System.exit(0);
              
            }
      });

  
     

}
    
    public void  startIn(){
        
    
        inside frame = new inside();
        frame.setSize(1200,820);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(true);
        frame.getContentPane().setBackground( Color.LIGHT_GRAY );
        
        
}
    
   
    
}