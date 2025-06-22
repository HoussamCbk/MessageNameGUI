import javax.swing.*;

public class NameMessageGUI {
    public static void main(String[] args) {
        // Create a new window (JFrame)
        JFrame frame = new JFrame("Greeting App");
        frame.setSize(450, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null); // Using absolute positioning

        // Name input field
        JTextField nameField = new JTextField();
        nameField.setBounds(20, 20, 200, 25);
        nameField.setToolTipText("Enter your name");

        // Message input field
        JTextField messageField = new JTextField();
        messageField.setBounds(20, 60, 200, 25);
        messageField.setToolTipText("Enter your message");

        // Button to submit
        JButton button = new JButton("Submit");
        button.setBounds(240, 20, 100, 25);

        // Label to display result
        JLabel outputLabel = new JLabel("Your greeting will appear here.");
        outputLabel.setBounds(20, 100, 400, 25);

        // Action listener for the button
        button.addActionListener(e -> {
            String name = nameField.getText().trim();
            String message = messageField.getText().trim();

            if (name.isEmpty() || message.isEmpty()) {
                outputLabel.setText("Please enter both your name and a message.");
            } else {
                outputLabel.setText("Hello, " + name + "! " + message);
            }
        });

        // Add components to the frame
        frame.add(nameField);
        frame.add(messageField);
        frame.add(button);
        frame.add(outputLabel);

        frame.setVisible(true); // Make the frame visible
    }
}
