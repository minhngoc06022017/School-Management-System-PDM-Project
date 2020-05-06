/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectgroup20lovely;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;


public class ProjectGroup20Lovely extends JFrame {
    
    JButton _search,_schedule,_salary,_tuitionFee;
    JCheckBox _name,_id;
    JComboBox _job;
    JTextField _fillInfo;
    JTabbedPane tb;
    JPanel p1,p2;
    JTable _timeTable;
    JScrollPane _jscroll;
    JLabel l1,l2;
    

    public boolean fee = true;
    public ProjectGroup20Lovely(){
        l1=new JLabel("Name:");
        l1.setBounds(100,40,100,50);
        l2=new JLabel("ID:");
        l2.setBounds(100,120,100,50);        
        
        String data[][]={
            {"Tiet 1","","","","","","",""},
            {"Tiet 2","","","","","","",""},
            {"Tiet 3","","","","","","",""},
            {"Tiet 4","","","","","","",""},
            {"Tiet 5","","","","","","",""},
            {"Tiet 6","","","","","","",""},
            {"Tiet 7","","","","","","",""},
            {"Tiet 8","","","","","","",""},
            {"Tiet 9","","","","","","",""},
            {"Tiet 10","","","","","","",""},
            {"Tiet 11","","","","","","",""}};
        String columm[]={"","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY","SUNDAY"};
        _timeTable = new JTable(data,columm);
        _jscroll= new JScrollPane(_timeTable);
        _jscroll.setBounds(0,200,880,550);
        
        
        p1=new JPanel();
        p2=new JPanel();
        
        
        String jobs[]={"Student","Teacher"};
        _job= new JComboBox(jobs);
        _job.setBounds(50,200,100,30);
        
        _search = new JButton("Search");
        _search.setBounds(750,50,100,30);
        _schedule=new JButton("Schedule");
        _schedule.setBounds(0,450,200,100);
        _salary = new JButton("Salary");
        _salary.setBounds(340,450,200,100);
        _tuitionFee=new JButton("Tuition Fee");
        _tuitionFee.setBounds(680,450,200,100);
        
        _fillInfo = new JTextField();
        _fillInfo.setBounds(50, 50, 600, 30);
        
        _name = new JCheckBox("Name");
        _name.setBounds(50,100,100,50);
        
        _id = new JCheckBox("ID");
        _id.setBounds(50,150,100,50);
        
        
         _search.addActionListener(new ActionListener(){  
             public void actionPerformed(ActionEvent e){  
                    
        }
       }); 
         _schedule.addActionListener(new ActionListener(){  
             public void actionPerformed(ActionEvent e){  
                    
        }
       }); 
         _salary.addActionListener(new ActionListener(){  
             public void actionPerformed(ActionEvent e){  
                    String name = "Name: Ngoc master";
                    String Id = "ID: ITITIU17068-113";
                    String cutInfo = "......................";
                    String salary = "Salary: 100.000 Dollars ";    
                    String info= name + "\n" + Id + "\n" + cutInfo + "\n" + salary;
                    
                    JOptionPane.showMessageDialog(new ProjectGroup20Lovely(),info,"TUITION FEE",JOptionPane.INFORMATION_MESSAGE);
                    
        }
       }); 
         _tuitionFee.addActionListener(new ActionListener(){  
             public void actionPerformed(ActionEvent e){  
                    if(false){
                    String name = "Name: cho Thanh bi gay";
                    String Id = "ID: ITITIU17070";
                    String cutInfo = "......................";
                    String credit = "CREDIT: 135 ";
                    String fee = "10.000 Dollars";
                    
                    String info= name + "\n" + Id + "\n" + cutInfo + "\n" + credit +"\n"+ fee;
                    
                    JOptionPane.showMessageDialog(new ProjectGroup20Lovely(),info,"TUITION FEE",JOptionPane.INFORMATION_MESSAGE);
                    }else{
                        String info="YOU ARE NOT ALLOWED TO SEE\nTHE SCHEDULE!\nPLEASE PAY THE TUITION FEE AND\nTRY AGAIN!";
                      
                      JOptionPane.showMessageDialog(new ProjectGroup20Lovely(),info,"UNPAID",JOptionPane.ERROR_MESSAGE);
                    }
                    
        }
       }); 
        
        
        
        p1.add(_search);p1.add(_salary);p1.add(_tuitionFee);p1.add(_schedule);
        p1.add(_fillInfo);
        p1.add(_name); p1.add(_id);
        p1.add(_job);
        p1.setLayout(null);
        
        p2.add(l1);p2.add(l2);
        p2.add(_jscroll);
        p2.setLayout(null);
        
        tb = new JTabbedPane();
        tb.setBounds(50,50,880,550);
        tb.add("Find Info",p1);
        tb.add("Time Table",p2);
        
        
        this.add(tb);
        this.setSize(1000,700);
        this.setLocation(500, 200);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    
    public static void main(String[] args) {
         ProjectGroup20Lovely f =new ProjectGroup20Lovely();
    }
    
}
