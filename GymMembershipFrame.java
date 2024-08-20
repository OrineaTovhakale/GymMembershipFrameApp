/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.UI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Student
 */
public class GymMembershipFrame extends JFrame{
    //panels
    private JPanel headingPnl;
    private JPanel detailsPnl;
    private JPanel namePnl;
    private JPanel surnamePnl;
    private JPanel iDPnl;
    private JPanel genderPnl;
    private JPanel contractsPnl;
    private JPanel personalTrainerOptPnl;
    private JPanel membershipPnl;
    private JPanel commentsPnl;
    private JPanel btnsPnl;
    private JPanel headingClientCombinedPnl;
    private JPanel membershipCommentsCombinedPnl;
    private JPanel mainPnl;
    
    //labels
    private JLabel headingLbl;
    private JLabel nameLbl;
    private JLabel surnameLbl;
    private JLabel iDLbl;
    private JLabel genderLbl;
    private JLabel contractTypeLbl;
    private JLabel personalTrainerLbl;
    
    //textfields
    private JTextField nameTxtFld;
    private JTextField surnameTxtFld;
    private JTextField iDTxtFld;
    
    //comboboxes
    private JComboBox genderCmbobx;
    
    //Radiobuttons
    private JRadioButton monthlyOptRadBtn;
    private JRadioButton sixMonthsOptRadBtn;
    private JRadioButton annualOptRadBtn;
    
    //checkBox 
    private JCheckBox personalTrainerChBox;
    
    //buttongroup
    private ButtonGroup btnGroup;
    
    //textArea
    private JTextArea commentArea;
    
    //ScrollPane
    private JScrollPane scrollableTextArea;
    
    //button
    private JButton applyBtn;
    
    public GymMembershipFrame() {
        setTitle("Gym Membership");
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setDefaultLookAndFeelDecorated(true);
        
        //creating panels
        headingPnl = new JPanel(new FlowLayout(FlowLayout.CENTER));
        //headingPnl.setBorder(new BevelBorder(BevelBorder.RAISED));
        
        detailsPnl = new JPanel(new GridLayout(4,1,1,1));
        detailsPnl.setBorder(new TitledBorder(new LineBorder(Color.BLACK,1),"Client Details"));
        
        namePnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        surnamePnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        iDPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        genderPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        contractsPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        personalTrainerOptPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        membershipPnl = new JPanel(new GridLayout(2,1,1,1));
        membershipPnl.setBorder(new TitledBorder(new LineBorder(Color.BLACK,1),"Contract Options"));
        
        commentsPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        btnsPnl = new JPanel( new FlowLayout(FlowLayout.LEFT));
        
        headingClientCombinedPnl = new JPanel(new BorderLayout());
        
        membershipCommentsCombinedPnl = new JPanel(new BorderLayout());
        mainPnl = new JPanel(new BorderLayout());
        
        //create the labels
        headingLbl = new JLabel("Membership Form");
        headingLbl.setForeground(Color.BLUE);
        headingLbl.setFont(new Font(Font.SANS_SERIF,Font.ITALIC + Font.BOLD,20));
        headingLbl.setBorder(new BevelBorder(BevelBorder.RAISED));
        
        nameLbl = new JLabel("Name: ");
        surnameLbl = new JLabel("Surname: ");
        iDLbl = new JLabel("Id no: ");
        genderLbl = new JLabel("Gender: ");
        contractTypeLbl = new JLabel("Type of contract: ");
        personalTrainerLbl = new JLabel("Select the checkBox if you need a person trainer ");
        
        //create the textField
        nameTxtFld = new JTextField(10);
        surnameTxtFld = new JTextField(10);
        iDTxtFld = new JTextField(10);
        
        //create combobox
        genderCmbobx = new JComboBox();
        genderCmbobx.addItem("Male");
        genderCmbobx.addItem("Female");
        
        //create radio buttons
        monthlyOptRadBtn = new JRadioButton("Month-to-Month");
        sixMonthsOptRadBtn = new JRadioButton("Six Months");
        annualOptRadBtn =  new JRadioButton("Annual");
        
        //create check box
        personalTrainerChBox = new JCheckBox();
        
        //create button group
        btnGroup = new ButtonGroup();
        btnGroup.add(monthlyOptRadBtn);
        btnGroup.add(sixMonthsOptRadBtn);
        btnGroup.add(annualOptRadBtn);
        
        //create the text area 
        commentArea = new JTextArea(20,40);
        commentArea.setBorder(new TitledBorder(new LineBorder(Color.BLACK,1),"Comments"));
        
        scrollableTextArea = new JScrollPane(commentArea , JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        
        applyBtn = new JButton("APPLY");
        
        headingPnl.add(headingLbl);
        
        namePnl.add(nameLbl);
        namePnl.add(nameTxtFld);
        
        surnamePnl.add(surnameLbl);
        surnamePnl.add(surnameTxtFld);
        
        iDPnl.add(iDLbl);
        iDPnl.add(iDTxtFld);
        
        genderPnl.add(genderLbl);
        genderPnl.add(genderCmbobx);
        
        detailsPnl.add(namePnl);
        detailsPnl.add(surnamePnl);
        detailsPnl.add(iDPnl);
        detailsPnl.add(genderPnl);
        
        headingClientCombinedPnl.add(headingPnl, BorderLayout.NORTH);
        headingClientCombinedPnl.add(detailsPnl, BorderLayout.CENTER);
        
        contractsPnl.add(contractTypeLbl);
        contractsPnl.add(monthlyOptRadBtn);
        contractsPnl.add(sixMonthsOptRadBtn);
        contractsPnl.add(annualOptRadBtn);
        
        personalTrainerOptPnl.add(personalTrainerLbl);
        personalTrainerOptPnl.add(personalTrainerChBox);
        
        commentsPnl.add(scrollableTextArea);
        
        btnsPnl.add(applyBtn);
        
        membershipCommentsCombinedPnl.add(contractsPnl, BorderLayout.NORTH);
        membershipCommentsCombinedPnl.add(personalTrainerOptPnl, BorderLayout.CENTER);
        membershipCommentsCombinedPnl.add(commentsPnl, BorderLayout.CENTER);
        
        mainPnl.add(headingClientCombinedPnl, BorderLayout.NORTH);
        mainPnl.add(membershipCommentsCombinedPnl, BorderLayout.CENTER);
        mainPnl.add(btnsPnl, BorderLayout.SOUTH);
        
        add(mainPnl);
        
        pack();
        setVisible(true);
        
                
        
        
    }
    
    
}
