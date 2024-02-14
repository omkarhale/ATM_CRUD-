
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Signup3  extends JFrame  implements ActionListener{

    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JButton submit,cancel;
    String formno;

    Signup3( String formno){
        this.formno=formno;

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("ICON/bank.png"));
        Image i2=i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(150,5,100,100);
        add(image);

        setLayout(null);

        JLabel l1=new JLabel("Page 3: Account Deatils");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        l1.setBounds(280, 40, 400, 40);
        add(l1);


        JLabel type=new JLabel("Account Type");
        type.setFont(new Font("Raleway",Font.BOLD,22));
        type.setBounds(100, 140, 200, 30);
        add(type);

        r1=new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway",Font.BOLD,16));
        r1.setBackground(new Color(215,252,252));
        r1.setBounds(100,180,250,20);
        add(r1);

        r2=new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Raleway",Font.BOLD,16));
        r2.setBackground(new Color(215,252,252));
        r2.setBounds(350,180,250,20);
        add(r2);

        r3=new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway",Font.BOLD,16));
        r3.setBackground(new Color(215,252,252));
        r3.setBounds(100,220,250,20);
        add(r3);


        r4=new JRadioButton("Recurring Account");
        r4.setFont(new Font("Raleway",Font.BOLD,16));
        r4.setBackground(new Color(215,252,252));
        r4.setBounds(350,220,250,20);
        add(r4);


        ButtonGroup groupaccount=new ButtonGroup();
        groupaccount.add(r1);
        groupaccount.add(r2);
        groupaccount.add(r3);
        groupaccount.add(r4);


        JLabel card=new JLabel("Card Number");
        card.setFont(new Font("Raleway",Font.BOLD,22));
        card.setBounds(100, 300, 200, 30);
        add(card);

        JLabel number=new JLabel("XXXX-XXXX-XXXX");
        number.setFont(new Font("Raleway",Font.BOLD,22));
        number.setBounds(330, 300, 300, 30);
        add(number);

        JLabel cardDeatil=new JLabel("Your 16 Digit Card Number");
        cardDeatil.setFont(new Font("Raleway",Font.BOLD,12));
        cardDeatil.setBounds(100, 330, 300, 20);
        add(cardDeatil);


        JLabel pin=new JLabel("PIN");
        pin.setFont(new Font("Raleway",Font.BOLD,22));
        pin.setBounds(100, 370, 200, 30);
        add(pin);

        JLabel pnumber=new JLabel("XXXX");
        pnumber.setFont(new Font("Raleway",Font.BOLD,22));
        pnumber.setBounds(330, 370, 300, 30);
        add(pnumber);


        JLabel pinDeatil=new JLabel("Your 4 Digit Password");
        pinDeatil.setFont(new Font("Raleway",Font.BOLD,12));
        pinDeatil.setBounds(100, 400, 300, 20);
        add(pinDeatil);


        JLabel services=new JLabel("Services Requried");
        services.setFont(new Font("Raleway",Font.BOLD,22));
        services.setBounds(100, 450, 400, 30);
        add(services);

        c1=new JCheckBox("ATM CARD");
        c1.setBackground(new Color(215,252,252));
        c1.setFont(new Font("Raleway",Font.BOLD,16));
        c1.setBounds(100, 500, 200, 30);
        add(c1);

        c2=new JCheckBox("Internet Banking");
        c2.setBackground(new Color(215,252,252));
        c2.setFont(new Font("Raleway",Font.BOLD,16));
        c2.setBounds(350, 500, 200, 30);
        add(c2);

        c3=new JCheckBox("Mobile Banking");
        c3.setBackground(new Color(215,252,252));
        c3.setFont(new Font("Raleway",Font.BOLD,16));
        c3.setBounds(100, 550, 200, 30);
        add(c3);

        c4=new JCheckBox("Email-SMS Alerts");
        c4.setBackground(new Color(215,252,252));
        c4.setFont(new Font("Raleway",Font.BOLD,16));
        c4.setBounds(350, 550, 200, 30);
        add(c4);

        c5=new JCheckBox("Cheque Book");
        c5.setBackground(new Color(215,252,252));
        c5.setFont(new Font("Raleway",Font.BOLD,16));
        c5.setBounds(100, 600, 200, 30);
        add(c5);

        c6=new JCheckBox("E-Statement");
        c6.setBackground(new Color(215,252,252));
        c6.setFont(new Font("Raleway",Font.BOLD,16));
        c6.setBounds(350, 600, 200, 30);
        add(c6);

        c7=new JCheckBox("hereby declares that  the above entered details are correct to the best of my Knowledge ",true);
        c7.setBackground(new Color(215,252,252));
        c7.setFont(new Font("Raleway",Font.BOLD,12));
        c7.setBounds(100, 680, 600, 30);
        add(c7);

        JLabel l12=new JLabel("Form No");
        l12.setFont(new Font("Raleway",Font.BOLD,14));
        l12.setBounds(700,10,100,30);
        add(l12);

        JLabel l13=new JLabel(formno);
        l13.setFont(new Font("Raleway",Font.BOLD,14));
        l13.setBounds(760,10,60,30);
        add(l13);


        submit =new JButton("Submit");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Raleway",Font.BOLD,14));
        submit.setBounds(250,720,100,30);
        submit.addActionListener(this);
        add(submit);


        cancel =new JButton("Cancel");
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setFont(new Font("Raleway",Font.BOLD,14));
        cancel.setBounds(420,720,100,30);
        cancel.addActionListener(this);
        add(cancel);


        getContentPane().setBackground(new Color(215,252,252));
        setSize(850,820);
        setLocation(350,0);
        setVisible(true);
    }


    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == submit) {
            String accountType = null;
            if (r1.isSelected()){
                accountType ="saving Account";
            }else if(r2.isSelected()){
                accountType ="fixed Desposit Account";
            }else if (r3.isSelected()){
                accountType="current Account";
            }else if (r4.isSelected()){
                accountType ="Reccurring Deposit Account";
            }

            Random random =new Random();
            String cardno = "" + Math.abs((random.nextLong() % 90000000L) + 504093000000000L);

            String pin="" + Math.abs((random.nextLong() % 9000L)+ 1000L);
            String facility="";
            if(c1.isSelected()){
                facility= facility +" ATM card";
            } else if (c2.isSelected()) {
                facility =facility + " Internet Banking";
            }else if (c3.isSelected()) {
                facility=facility + " Mobile Banking";
            }else if (c4.isSelected()) {
                facility=facility +" Email & SMS Alert";
            }else if (c5.isSelected()) {
                facility=facility +" Cheque Book";
            }else if (c6.isSelected()) {
                facility=facility + " E-Statement";
            }
            try {
                if (accountType.equals("")){
                    JOptionPane.showMessageDialog(null,"Account Type is Requried");
                }else {
                    Conn conn =new Conn();
                    String query1 ="insert into signupthree value ('"+formno+"', '"+accountType+"','"+cardno+"','"+pin+"','"+facility+"')";
                    String query2 ="insert into login value ('"+formno+"','"+cardno+"','"+pin+"')";

                    conn.s.executeUpdate(query1);
                    conn.s.executeUpdate(query2);

                    JOptionPane.showMessageDialog(null,"Card Number:" + cardno + "\n Pin:" + pin);


                   new Deposit(pin);
                    setVisible(false);
                }


            } catch (Exception e){
                System.out.println(e);
            }


        } else if (ae.getSource()== cancel) {
            setVisible(false);
            new Login().setVisible(true);
        }
    }

    public static void main(String args[]) {

        new Signup3(" ");

    }
}
