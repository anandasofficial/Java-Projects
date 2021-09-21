import javax.swing.*;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class Employee extends Applet implements ActionListener
{
    String name = "";
    String msg = "";
    String gender = "";
    String address = "";
    int age;
    TextField n=new TextField();
    TextArea t2=new TextArea("",180,90,TextArea.SCROLLBARS_VERTICAL_ONLY);

    CheckboxGroup g=new CheckboxGroup();
    Checkbox m =new Checkbox("Male",false,g);
    Checkbox f=new Checkbox("Female",false,g);

    Button b1=new Button("save");
    Label l11=new Label("Employee details",Label.CENTER);
    Label l1=new Label("Name:",Label.LEFT);
    Label l2=new Label("age:",Label.LEFT);
    Label l3=new Label("Sex(M/F):",Label.LEFT);
    Label l4=new Label("Address:",Label.LEFT);
    Label l7=new Label("",Label.RIGHT);
    Choice c1=new Choice();
    Choice c = new Choice();

    public void init() {

        setBackground(Color.cyan);
        setForeground(Color.black);
        setLayout(null);
        add(l11);
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(l7);
        add(n);
        add(t2);
        add(m);
        add(f);
        add(c);
        add(b1);
        add(c1);
        b1.addActionListener(this);
        add(b1);


        c.add("17");
        c.add("18");
        c.add("19");
        c.add("20");
        c.add("21");
        l1.setBounds(25,65,90,20);
        l2.setBounds(25,90,90,20);
        l3.setBounds(25,120,90,20);
        l4.setBounds(25,185,90,20);
        l7.setBounds(25,260,90,20);
        l11.setBounds(10,40,280,20);
        n.setBounds(120,65,170,20);
        t2.setBounds(120,185,170,60);
        m.setBounds(120,120,50,20);
        f.setBounds(170,120,60,20);
        c.setBounds(120,90,50,20);
        b1.setBounds(120,350,50,30);


    }
    public void paint(Graphics g) {
        g.drawString(msg,200,420);

        g.drawString("Name :"+name,200,450);
        g.drawString("Age :"+age,200,480);
        g.drawString("Sex :"+gender,200,500);
        g.drawString("Address :"+address,200,520);



    }
    public void actionPerformed(ActionEvent e) {

        if(e.getActionCommand().equals("save"))
        {
            msg="Student details saved!";
            setForeground(Color.YELLOW);

            name = n.getText();
            gender = g.getSelectedCheckbox().getLabel();
            age = Integer.parseInt(c.getSelectedItem());
            address = t2.getText();
            repaint();

        }

        


        }
    }





