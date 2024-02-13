import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Calculator extends JFrame implements ActionListener
{
    // Declecration
    double num1 = 0 ,num2 = 0 ,result = 0;
    int Calculation;
    JLabel label ;
    JTextField  textfield ;
    JRadioButton onRadioButton , OffRadioButton;
    JButton one ,two ,three , four , five, six, seven , eight , nine , zero , add , sub , mul , div ,equal
    , sqrt ,square , reciprocal , delete, clr,decimal;
    Calculator()
    {
        super("Calculator");
        Components();
        addActionEvent();
        // Frame Setting
        setSize(305, 510);
        setLayout(null);
        setVisible(true);
        getContentPane().setBackground(Color.BLACK);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void Components()
    {
         // AddComponesnts to the frame
        // Label
        label = new JLabel();   
        label.setBounds(250, 0, 50, 50);
        label.setForeground(Color.WHITE);
        add(label);

        // Textfield
        textfield = new JTextField();
        textfield.setBounds(10, 40,270, 40);
        textfield.setFont(new Font("Ariel" , Font.BOLD,20));
        textfield.setEditable(false);
        textfield.setHorizontalAlignment(SwingConstants.RIGHT);
        add(textfield);

        // Radio Button
        onRadioButton = new JRadioButton("On");
        onRadioButton.setBounds(10,95,60, 40);
        onRadioButton.setSelected(true);
        onRadioButton.setFont(new Font("Arial",Font.BOLD,14));
        onRadioButton.setBackground(Color.BLACK);
        onRadioButton.setForeground(Color.WHITE);
        onRadioButton.setFocusable(false);
        add(onRadioButton);

        OffRadioButton = new JRadioButton("Off");
        OffRadioButton.setBounds(10,120,60, 40);
        OffRadioButton.setSelected(false);
        OffRadioButton.setFont(new Font("Arial",Font.BOLD,14));
        OffRadioButton.setBackground(Color.BLACK);
        OffRadioButton.setForeground(Color.WHITE);
        OffRadioButton.setFocusable(false);
        add(OffRadioButton);

        ButtonGroup bg = new ButtonGroup();
        bg.add(OffRadioButton);
        bg.add(onRadioButton);

        // Adding Buttons
        one = new JButton("1");
        one.setBounds(10, 350, 60, 40);
        one.setFont(new Font("Arial", Font.BOLD, 20));
        add(one);

        two = new JButton("2");
        two.setBounds(80, 350, 60, 40);
        two.setFont(new Font("Arial", Font.BOLD, 20));
        add(two);

        three = new JButton("3");
        three.setBounds(150, 350, 60, 40);
        three.setFont(new Font("Arial", Font.BOLD, 20));
        add(three);

        four = new JButton("4");
        four.setBounds(10, 290, 60, 40);
        four.setFont(new Font("Arial", Font.BOLD, 20));
        add(four);

        five = new JButton("5");
        five.setBounds(80, 290, 60, 40);
        five.setFont(new Font("Arial", Font.BOLD, 20));
        add(five);

        six = new JButton("6");
        six.setBounds(150, 290, 60, 40);
        six.setFont(new Font("Arial", Font.BOLD, 20));
        add(six);

        seven = new JButton("7");
        seven.setBounds(10, 230, 60, 40);
        seven.setFont(new Font("Arial", Font.BOLD, 20));
        add(seven);

        eight = new JButton("8");
        eight.setBounds(80, 230, 60, 40);
        eight.setFont(new Font("Arial", Font.BOLD, 20));
        add(eight);

        nine = new JButton("9");
        nine.setBounds(150, 230, 60, 40);
        nine.setFont(new Font("Arial", Font.BOLD, 20));
        add(nine);

        zero = new JButton("0");
        zero.setBounds(10, 410, 130, 40);
        zero.setFont(new Font("Arial", Font.BOLD, 20));
        add(zero);

        decimal = new JButton(".");
        decimal.setBounds(150, 410, 60, 40);
        decimal.setFont(new Font("Arial", Font.BOLD, 20));
        add(decimal);
        
        equal = new JButton("=");
        equal.setBounds(220, 350, 60, 100);
        equal.setFont(new Font("Arial", Font.BOLD, 20));
        equal.setBackground(new Color(255, 204, 102));
        add(equal);

        div = new JButton("/");
        div.setBounds(220, 110, 60, 40);
        div.setFont(new Font("Arial", Font.BOLD, 20));
        add(div);

        mul = new JButton("*");
        mul.setBounds(220, 230, 60, 40);
        mul.setFont(new Font("Arial", Font.BOLD, 20));
        add(mul);

        add = new JButton("+");
        add.setBounds(220, 290, 60, 40);
        add.setFont(new Font("Arial", Font.BOLD, 20));
        add(add);

        sub = new JButton("-");
        sub.setBounds(220, 170, 60, 40);
        sub.setFont(new Font("Arial", Font.BOLD, 20));
        add(sub);

        sqrt = new JButton(" ");
        sqrt.setBounds(10, 170, 60, 40);
        sqrt.setFont(new Font("Arial", Font.BOLD, 20));
        add(sqrt);

        square = new JButton("sq");
        square.setBounds(80, 170, 60, 40);
        square.setFont(new Font("Arial", Font.BOLD, 20));
        add(square);

        reciprocal = new JButton("1/x");
        reciprocal.setBounds(150, 170, 60, 40);
        reciprocal.setFont(new Font("Arial", Font.BOLD, 15));
        add(reciprocal);

        delete = new JButton("DEL");
        delete.setBounds(150, 110, 60, 40);
        delete.setFont(new Font("Arial", Font.BOLD, 12));
        delete.setBackground(Color.RED);
        delete.setForeground(Color.WHITE);
        add(delete);

        clr = new JButton("C");
        clr.setBounds(80, 110, 60, 40);
        clr.setFont(new Font("Arial", Font.BOLD, 12));
        clr.setBackground(Color.RED);
        clr.setForeground(Color.WHITE);
        add(clr);
    }

    public void addActionEvent()
    {
        // adding action listner to each button
        onRadioButton.addActionListener(this);
        OffRadioButton.addActionListener(this);
        one.addActionListener(this);
        two.addActionListener(this);
        three.addActionListener(this);
        four.addActionListener(this);
        five.addActionListener(this);
        six.addActionListener(this);
        seven.addActionListener(this);
        eight.addActionListener(this);
        nine.addActionListener(this);
        zero.addActionListener(this);
        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
        equal.addActionListener(this);
        sqrt.addActionListener(this);
        square.addActionListener(this);
        clr.addActionListener(this);
        delete.addActionListener(this);
        decimal.addActionListener(this);
    }

    public static void main(String[] args) 
    {
        new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {

        if(e.getSource() == onRadioButton)
        {
            enable();
        }
        else if(e.getSource() == OffRadioButton)
        {

        }
        else if(e.getSource() == clr)
        {
            // clear display when click clr button
            label.setText("");
            textfield.setText("");
        }
        else if (e.getSource() == delete)
        {
            // Delete one number from the screen
            int length = textfield.getText().length();
            int number = length - 1;
            if(length > 0)
            {
                StringBuilder back = new StringBuilder(textfield.getText());
                back.deleteCharAt(number);
                textfield.setText(back.toString());
            }
            if(textfield.getText().endsWith(""))
            {
                label.setText("");
            }
        }
        else if (e.getSource() == zero)
        {
            if(textfield.getText().equals("0"))
            {
                return;
            }
            else
            {
                textfield.setText(textfield.getText()+ "0");
            }
        }
        else if (e.getSource() == one)
        {
            if(textfield.getText().equals("1"))
            {
                return;
            }
            else
            {
                textfield.setText(textfield.getText()+ "1");
            }
        }
        else if (e.getSource() == two)
        {
            if(textfield.getText().equals("2"))
            {
                return;
            }
            else
            {
                textfield.setText(textfield.getText()+ "2");
            }
        }
        else if (e.getSource() == three)
        {
            if(textfield.getText().equals("3"))
            {
                return;
            }
            else
            {
                textfield.setText(textfield.getText()+ "3");
            }
        }
        else if (e.getSource() == four)
        {
            if(textfield.getText().equals("4"))
            {
                return;
            }
            else
            {
                textfield.setText(textfield.getText()+ "4");
            }
        }
        else if (e.getSource() == five)
        {
            if(textfield.getText().equals("5"))
            {
                return;
            }
            else
            {
                textfield.setText(textfield.getText()+ "5");
            }
        }
        else if (e.getSource() == six)
        {
            if(textfield.getText().equals("6"))
            {
                return;
            }
            else
            {
                textfield.setText(textfield.getText()+ "6");
            }
        }
        else if (e.getSource() == seven)
        {
            if(textfield.getText().equals("7"))
            {
                return;
            }
            else
            {
                textfield.setText(textfield.getText()+ "7");
            }
        }
        else if (e.getSource() == eight)
        {
            if(textfield.getText().equals("8"))
            {
                return;
            }
            else
            {
                textfield.setText(textfield.getText()+ "8");
            }
        }
        else if (e.getSource() == nine)
        {
            if(textfield.getText().equals("9"))
            {
                return;
            }
            else
            {
                textfield.setText(textfield.getText()+ "9");
            }
        }
        else if (e.getSource() == decimal)
        {
            if(textfield.getText().contains("."))
            {
                return;
            }
            else
            {
                textfield.setText(textfield.getText()+ ".");
            }
        }
        else if (e.getSource() == add)
        {
            String str = textfield.getText();
            num1 = Double.parseDouble(textfield.getText());
            Calculation = 1;
            textfield.setText("");
            label.setText(str + "+");
        }
        else if (e.getSource() == sub)
        {
            String str = textfield.getText();
            num1 = Double.parseDouble(textfield.getText());
            Calculation = 2;
            textfield.setText("");
            label.setText(str + "-");
        }
        else if (e.getSource() == mul)
        {
            String str = textfield.getText();
            num1 = Double.parseDouble(textfield.getText());
            Calculation = 3;
            textfield.setText("");
            label.setText(str + "*");
        }
        else if (e.getSource() == div)
        {
            String str = textfield.getText();
            num1 = Double.parseDouble(textfield.getText());
            Calculation = 4;
            textfield.setText("");
            label.setText(str + "/");
        }
        else if(e.getSource() == square)
        {
            num1 = Double.parseDouble(textfield.getText());
            double square = Math.pow(num1, 2);
            String string_square = Double.toString(square);
            if(string_square.endsWith(".0"))
            textfield.setText(string_square);
            
        }
        else if(e.getSource() == sqrt)
        {
            double sqrt = Math.sqrt(num1);
            String string_sqrt = Double.toString(sqrt);
            if(string_sqrt.endsWith(".0"))
            {
                textfield.setText(string_sqrt.replace(".0", ""));
            }
            else
            {
                textfield.setText(string_sqrt);
            }
        }
        else if(e.getSource() == reciprocal)
        {
            num1 = Double.parseDouble(textfield.getText());
            double reciprocal = 1/num1;
            String string_recip = Double.toString(reciprocal);
            textfield.setText(string_recip);
        }
        else if (e.getSource() == equal)
        {
            num2 = Double.parseDouble(textfield.getText()); // Store second value 
            switch (Calculation)
            {
                case 1:
                    result = num1 + num2;
                    break;
                
                case 2:
                        result = num1 - num2;
                        break;
                case 3:
                        result = num1 * num2;
                        break;
                case 4:
                        result = num1/num2;
                        break;

                
                    default:
                    break;
            }
            if(Double.toString(result).endsWith(".0"))
            {
                textfield.setText(Double.toString(result).replace(".0", ""));
            }
            else
            {
                textfield.setText(Double.toString(result));
            }
            label.setText("");
            num1 = result;
        }
        
    }
    public void enable()
 {
    onRadioButton.setEnabled(true);
    OffRadioButton.setEnabled(true);
    textfield.setEnabled(true);
    one.setEnabled(true);
    two.setEnabled(true);
    three.setEnabled(true);
    four.setEnabled(true);
    five.setEnabled(true);
    six.setEnabled(true);
    seven.setEnabled(true);
    eight.setEnabled(true);
    nine.setEnabled(true);
    zero.setEnabled(true);
    add.setEnabled(true);
    sub.setEnabled(true);
    mul.setEnabled(true);
    div.setEnabled(true);
    equal.setEnabled(true);
    sqrt.setEnabled(true);
    square.setEnabled(true);
    reciprocal.setEnabled(true);
    delete.setEnabled(true);
    clr.setEnabled(true);
 }
}