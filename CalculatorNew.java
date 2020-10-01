import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;


public class CalculatorNew implements ActionListener {
    //calculator what do we need?

    //add function

    //subtract function

    //divide function

    //times function

    //CE function

    //function for adding numbers entering numbers

    //deleting numbers backspacing

    // an = button
    public JTextField numberTextField;


    //buttons

    public JButton oneButton;
    public JButton twoButton;
    public JButton threeButton;
    public JButton fourButton;
    public JButton fiveButton;
    public JButton sixButton;
    public JButton sevenButton;
    public JButton eightButton;
    public JButton nineButton;
    public JButton zeroButton;

    public JButton plusButton;
    public JButton minusButton;
    public JButton timesButton;
    public JButton divideButton;

    public JButton dotButton;

    public JButton CEButton;

    public JButton equalsButton;

    //-------------------------------
    public String Operator;
    public double firstNumber;


    //----------------------------


    private JFrame frame;

    public CalculatorNew() {

        //framing
        frame = new JFrame("Ryan's Calculator");
        frame.setSize(5000, 3000); // doesnt do anything???
        frame.setResizable(true);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel p1 = new JPanel(new GridLayout(6, 3, 5 , 5));

        ImageIcon img = new ImageIcon("calculator.png");

        frame.setIconImage(img.getImage());



        //---------------------------------------------


        numberTextField = new JTextField(10);
        p1.add(numberTextField);


        numberTextField.setEditable(false);


        numberTextField.setText("");


        //------buttons--------


        //----------operator buttons-----------

        JButton plusButton = new JButton("+");
        p1.add(plusButton);
        plusButton.addActionListener(this);

        JButton minusButton = new JButton("-");
        p1.add(minusButton);
        minusButton.addActionListener(this);

        JButton timesButton = new JButton("X");
        p1.add(timesButton);
        timesButton.addActionListener(this);

        JButton divideButton = new JButton("/");
        p1.add(divideButton);
        divideButton.addActionListener(this);

        //-------------end of operator buttons-------------


        JButton CEButton = new JButton("C/E");
        p1.add(CEButton);
        CEButton.addActionListener(this);


        JButton oneButton = new JButton("1");
        p1.add(oneButton);
        oneButton.addActionListener(this);

        JButton twoButton = new JButton("2");
        p1.add(twoButton);
        twoButton.addActionListener(this);

        JButton threeButton = new JButton("3");
        p1.add(threeButton);
        threeButton.addActionListener(this);

        JButton fourButton = new JButton("4");
        p1.add(fourButton);
        fourButton.addActionListener(this);

        JButton fiveButton = new JButton("5");
        p1.add(fiveButton);
        fiveButton.addActionListener(this);

        JButton sixButton = new JButton("6");
        p1.add(sixButton);
        sixButton.addActionListener(this);

        JButton sevenButton = new JButton("7");
        p1.add(sevenButton);
        sevenButton.addActionListener(this);

        JButton eightButton = new JButton("8");
        p1.add(eightButton);
        eightButton.addActionListener(this);

        JButton nineButton = new JButton("9");
        p1.add(nineButton);
        nineButton.addActionListener(this);

        JButton zeroButton = new JButton("0");
        p1.add(zeroButton);
        zeroButton.addActionListener(this);


        JButton equalsButton = new JButton("=");
        p1.add(equalsButton);
        equalsButton.addActionListener(this);

        JButton dotButton = new JButton(".");
        p1.add(dotButton);
        dotButton.addActionListener(this);


        //----end of buttons-------

        //----normal varibles---

        Operator = "";
        firstNumber = 0.00;


        // ----end of noraml varibles---

        frame.add(p1);
        frame.pack();

        frame.setVisible(true);


        //----- styling -----

        oneButton.setFont(new Font("Arial", Font.PLAIN, 30));
        twoButton.setFont(new Font("Arial", Font.PLAIN, 30));
        threeButton.setFont(new Font("Arial", Font.PLAIN, 30));
        fourButton.setFont(new Font("Arial", Font.PLAIN, 30));
        fiveButton.setFont(new Font("Arial", Font.PLAIN, 30));
        sixButton.setFont(new Font("Arial", Font.PLAIN, 30));
        sevenButton.setFont(new Font("Arial", Font.PLAIN, 30));
        eightButton.setFont(new Font("Arial", Font.PLAIN, 30));
        nineButton.setFont(new Font("Arial", Font.PLAIN, 30));
        zeroButton.setFont(new Font("Arial", Font.PLAIN, 30));


        plusButton.setFont(new Font("Arial", Font.PLAIN, 30));
        minusButton.setFont(new Font("Arial", Font.PLAIN, 30));
        divideButton.setFont(new Font("Arial", Font.PLAIN, 30));
        timesButton.setFont(new Font("Arial", Font.PLAIN, 30));
        equalsButton.setFont(new Font("Arial", Font.PLAIN, 30));
        CEButton.setFont(new Font("Arial", Font.PLAIN, 30));
        dotButton.setFont(new Font("Arial", Font.PLAIN, 30));

        numberTextField.setFont(new Font("Arial", Font.PLAIN, 30));







    }

    public static void main(String[] args) {
        CalculatorNew firstOne = new CalculatorNew();

    }

    public void actionPerformed(ActionEvent event) {
        String command = event.getActionCommand();

        switch (command) {

            case "1":
                pressOne();
                break;

            case "2":
                pressTwo();
                break;

            case "3":
                pressThree();
                break;

            case "4":
                pressFour();
                break;

            case "5":
                pressFive();
                break;

            case "6":
                pressSix();
                break;

            case "7":
                pressSeven();
                break;

            case "8":
                pressEight();
                break;

            case "9":
                pressNine();
                break;

            case "0":
                pressZero();
                break;

            case "+":
                changeOperatorPlus();
                break;

            case "-":
                changeOperatorMinus();
                break;

            case "X":
                changeOperatorTimes();
                break;

            case "/":
                changeOperatorDivide();
                break;

            case "=":
                equalEquations();
                break;

            case "C/E":
                clear();
                break;

            case ".":
                pressDot();
                break;

        }

    }


    public void pressOne() {
        numberTextField.setText((numberTextField.getText()).concat("1"));
    }

    public void pressTwo() {
        numberTextField.setText((numberTextField.getText()).concat("2"));
    }

    public void pressThree() {
        numberTextField.setText((numberTextField.getText()).concat("3"));
    }

    public void pressFour() {
        numberTextField.setText((numberTextField.getText()).concat("4"));
    }

    public void pressFive() {
        numberTextField.setText((numberTextField.getText()).concat("5"));
    }

    public void pressSix() {
        numberTextField.setText((numberTextField.getText()).concat("6"));
    }

    public void pressSeven() {
        numberTextField.setText((numberTextField.getText()).concat("7"));
    }

    public void pressEight() {
        numberTextField.setText((numberTextField.getText()).concat("8"));
    }

    public void pressNine() {
        numberTextField.setText((numberTextField.getText()).concat("9"));
    }

    public void pressZero() {
        numberTextField.setText((numberTextField.getText()).concat("0"));
    }


    //---------------------------------------------------


    public void changeOperatorPlus() {
        Operator = "+";
        firstNumber = Double.parseDouble(numberTextField.getText());
        numberTextField.setText("");
    }

    public void changeOperatorMinus() {
        Operator = "-";
        firstNumber = Double.parseDouble(numberTextField.getText());
        numberTextField.setText("");
    }

    public void changeOperatorTimes() {
        Operator = "X";
        firstNumber = Double.parseDouble(numberTextField.getText());
        numberTextField.setText("");
    }

    public void changeOperatorDivide() {
        Operator = "/";
        firstNumber = Double.parseDouble(numberTextField.getText());
        numberTextField.setText("");
    }

    public void pressDot() {
        if (!numberTextField.getText().contains(".")) {
            numberTextField.setText((numberTextField.getText()).concat("."));
        }
    }

    public void clear() {
        numberTextField.setText("");
        Operator = "";
        firstNumber = 0.00;
    }

    public void equalEquations() {
        if (Operator == "") {
            JOptionPane.showMessageDialog(frame, "No Operator selected", "Message :", JOptionPane.INFORMATION_MESSAGE);

        } else {
            switch (Operator) {
                case "+":
                    numberTextField.setText(Double.toString(firstNumber + Double.parseDouble(numberTextField.getText())));
                    break;
                case "-":
                    numberTextField.setText(Double.toString(firstNumber - Double.parseDouble(numberTextField.getText())));
                    break;
                case "X":
                    numberTextField.setText(Double.toString(firstNumber * Double.parseDouble(numberTextField.getText())));
                    break;
                case "/":
                    numberTextField.setText(Double.toString(firstNumber / Double.parseDouble(numberTextField.getText())));
                    break;
            }
        }
    }
}
