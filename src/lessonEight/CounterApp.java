package lessonEight;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

public class CounterApp extends JFrame {
    private int value;

    public CounterApp (int initialValue) {
        setBounds(500, 500, 300, 120);
        setTitle("Корзина товаров");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Font font = new Font ("Arial", Font.BOLD, 32);
        JLabel counterValueView = new JLabel();
        counterValueView.setFont(font);
        counterValueView.setHorizontalAlignment(SwingConstants.CENTER);
        add(counterValueView, BorderLayout.CENTER);

        value = initialValue;
        counterValueView.setText(String.valueOf(value));

        JButton decrementButton = new JButton(" <");
        decrementButton.setFont(font);
        add (decrementButton, BorderLayout.WEST);
        decrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("Вы уменьшили значение! \nТекущее значение " + value);
            }

        });

        JButton incrementButton = new JButton(" >");
        incrementButton.setFont(font);
        add(incrementButton, BorderLayout.EAST);
        incrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                    System.out.println("Вы увеличели значение! \nТекущее значение " + value);
            }
        });


        decrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (value > 0){
                    value--;
                } else System.out.println("В корзине нет товаров!");
                counterValueView.setText(String.valueOf(value));
            }
        });
        incrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                value++;
                counterValueView.setText(String.valueOf(value));
            }
        });

        setVisible(true);
    }
    public static void main (String[]args) {
        new CounterApp(0);
    }
}
