import java.awt.*;
import java.awt.event.*;

class MaxOfThreeNumbersAWT {
    private Label label1, label2, label3, resultLabel;
    private TextField textField1, textField2, textField3;
    private Button calculateButton;

    public MaxOfThreeNumbersAWT() {

        Frame frame = new Frame("Find Maximum of Three Numbers");


        label1 = new Label("Enter first number:");
        label2 = new Label("Enter second number:");
        label3 = new Label("Enter third number:");
        resultLabel = new Label("Maximum: ", Label.CENTER);

        textField1 = new TextField(10); 
        textField2 = new TextField(10);
        textField3 = new TextField(10);

        calculateButton = new Button("Calculate Maximum");


        frame.setLayout(new GridLayout(5, 2, 10, 10)); 


        frame.add(label1);
        frame.add(textField1);
        frame.add(label2);
        frame.add(textField2);
        frame.add(label3);
        frame.add(textField3);
        frame.add(new Label()); 
        frame.add(calculateButton);
        frame.add(new Label()); 
        frame.add(resultLabel);

      
        calculateButton.addActionListener(e -> {
            try {
                int num1 = Integer.parseInt(textField1.getText().trim());
                int num2 = Integer.parseInt(textField2.getText().trim());
                int num3 = Integer.parseInt(textField3.getText().trim());

                int max=num1;
                if(num2>max)
                max=num2;
                if(num3>max)
                max=num3;
                resultLabel.setText("Maximum: " + max);
            } catch (NumberFormatException ex) {
                resultLabel.setText("Invalid input. Please enter valid numbers.");
      
                textField1.setText("");
                textField2.setText("");
                textField3.setText("");
                textField1.requestFocus(); 
            }
        });

        
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });


        frame.setSize(400, 250); 
        frame.setLocationRelativeTo(null); 
        frame.setVisible(true);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            try {
                new MaxOfThreeNumbersAWT();
            } catch (Exception e) {
                System.err.println("Failed to initialize GUI: " + e.getMessage());
                e.printStackTrace();
            }
        });
    }
}
