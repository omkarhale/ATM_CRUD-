package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pin extends JFrame implements ActionListener {
    JButton b1,b2;
    JPasswordField p1,p2;
    String pin;
    Pin(String pin){
        this.pin=pin;

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2=i1.getImage().getScaledInstance(1550,830, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l3=new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);

        JLabel label1=new JLabel("CHANGE YOUR PIN");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("System",Font.BOLD,16));
        label1.setBounds(430,180,400,35);
        l3.add(label1);

        JLabel label2=new JLabel("New PIN: ");
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("System",Font.BOLD,16));
        label2.setBounds(430,220,150,35);
        l3.add(label2);

        p1=new JPasswordField();
        p1.setBackground(new Color(28, 103, 104));
        p1.setForeground((Color.WHITE));
        p1.setFont(new Font("Raleway",Font.BOLD,22));
        p1.setBounds(600,220,180,25);
        l3.add(p1);

        JLabel label3=new JLabel("Re-Enter New PIN: ");
        label3.setForeground(Color.WHITE);
        label3.setFont(new Font("System",Font.BOLD,16));
        label3.setBounds(430,250,400,35);
        l3.add(label3);

        p2=new JPasswordField();
        p2.setBackground(new Color(28, 103, 104));
        p2.setForeground((Color.WHITE));
        p2.setFont(new Font("Raleway",Font.BOLD,22));
        p2.setBounds(600,255,180,25);
        l3.add(p2);


        b1=new JButton("CHANGE");
        b1.setBounds(700,360,150,35);
        b1.setBackground(new Color(65,125,128));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        l3.add(b1);

        b2=new JButton("BACK");
        b2.setBounds(700,406,150,35);
        b2.setBackground(new Color(65,125,128));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        l3.add(b2);


        setSize(1550,1080);
        setLayout(null);
        setLocation(0,0);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
            try {
                String pin1=p1.getText ();
                String pin2=p2.getText();

                if(!pin1.equals(pin2)){
                    JOptionPane.showMessageDialog(null,"Entered PIN does not match");
                    return;
                }
                if(pin1.equals("")){
                    JOptionPane.showMessageDialog(null," Please enter PIN ");
                    return;
                }

                if(pin2.equals("")){
                    JOptionPane.showMessageDialog(null," Please re-enter PIN ");
                    return;
                }

                Conn conn=new Conn();
                String query1="update bank set pinnumber ='"+pin1+"' where pinnumber='"+pin+"'" ;
                String query2="update login set pin ='"+pin1+"' where pin='"+pin+"'" ;
                String query3="update signupthree set pin ='"+pin1+"' where pin='"+pin+"'" ;

                conn.s.executeUpdate(query1);
                conn.s.executeUpdate(query2);
                conn.s.executeUpdate(query3);

                JOptionPane.showMessageDialog(null,"PIN change Successfully ");

                setVisible(false);
                new Main_Class(pin1).setVisible(true);

            }   catch(Exception E){
                System.out.println(E);
            }
        }else {
            setVisible(false);
            new Main_Class(pin).setVisible(true);
        }

    }

    public static void main(String[] args) {
        new Pin("");

    }
}
