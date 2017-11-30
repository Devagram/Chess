package GUI;
import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.text.*;
import java.io.*;

public class GUI extends JFrame implements ActionListener{

    private TextField tfInput;  // Single-line TextField to receive tfInput key
    private TextArea taDisplay; // Multi-line TextArea to taDisplay result
    private JButton buttonShP = new JButton("Show Packages");
    private JButton buttonAdP = new JButton("Add Package");
    private JButton buttonDeP = new JButton("Delete Package");
    private JButton buttonSe = new JButton("Search");
    private JButton buttonDel = new JButton("Deliver Package");
    private JButton buttonShT = new JButton("Show Transactions");
    private JButton buttonShU = new JButton("Show Users");
    private JButton buttonAdU = new JButton("Add User");
    private JButton buttonUpU = new JButton("Update User");
    private Container contentPane = getContentPane();
    private JPanel buttonPane = new JPanel();
    private JPanel textPane = new JPanel();
    public void runSoftware() {
        buttonPane.setLayout(new BoxLayout(buttonPane, BoxLayout.PAGE_AXIS));
        textPane.setLayout(new BoxLayout(textPane, BoxLayout.PAGE_AXIS));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Shipping Store");

        //button area
        buttonPane.add(new Label("Package Options: "));

        buttonPane.add(buttonShP);

        buttonPane.add(buttonAdP);

        buttonPane.add(buttonDeP);

        buttonPane.add(buttonSe);

        buttonPane.add(buttonDel);

        buttonPane.add(buttonShT);

        buttonPane.add(new Label("User Options: "));

        buttonPane.add(buttonShU);

        buttonPane.add(buttonAdU);

        buttonPane.add(buttonUpU);
        buttonPane.setBorder(BorderFactory.createEmptyBorder(20,20,140,20));

        //text area
        taDisplay = new TextArea(32, 112);
        taDisplay.setFont(new Font("Courier New",Font.PLAIN,12));
        textPane.add(taDisplay);
        textPane.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));

        buttonShP.addActionListener(this);
        buttonAdP.addActionListener(this);
        buttonDeP.addActionListener(this);
        buttonSe.addActionListener(this);
        buttonDel.addActionListener(this);
        buttonShT.addActionListener(this);
        buttonShU.addActionListener(this);
        buttonAdU.addActionListener(this);
        buttonUpU.addActionListener(this);
        // tfInput TextField (source) fires KeyEvent.
        // tfInput adds "this" object as a KeyEvent listener.

        setPreferredSize(new Dimension(1100, 600));         // "super" Frame sets initial size

        //Put everything together, using the content pane's BorderLayout.
        contentPane.add(buttonPane, BorderLayout.CENTER);
        contentPane.add(textPane, BorderLayout.EAST);
        setResizable(false);
        pack();
        setVisible(true);

        redirectSystemStreams();
        //ss = ShippingStore.readDatabase();
        //sc = new Scanner(System.in);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                //ss.writeDatabase();
            }
        });
    }

    private void updateTextArea(final String text) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                taDisplay.append(text);
            }
        });
    }

    private void redirectSystemStreams() {
        OutputStream out = new OutputStream() {
            @Override
            public void write(int b) throws IOException {
                updateTextArea(String.valueOf((char) b));
            }

            @Override
            public void write(byte[] b, int off, int len) throws IOException {
                updateTextArea(new String(b, off, len));
            }

            @Override
            public void write(byte[] b) throws IOException {
                write(b, 0, b.length);
            }
        };

        System.setOut(new PrintStream(out, true));
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == buttonShP) {
            //
        }
    }


}
