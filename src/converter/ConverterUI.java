package converter;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;;

/**
 * This is the UI of the converter software
 * @author Thanut Sajjakulnukit (5810545416)
 *
 */
public class ConverterUI extends JFrame {
	// attributes for graphical component
	private JButton convertButton;
	private UnitConverter unitconverter;
	private JPanel contentPane;
	private JTextField inputField1;
	private JTextField inputField2;
	private JComboBox comboBox1;
	private JComboBox comboBox2;
	
	/**
	 * 
	 * Constructor of this program
	 */
	public ConverterUI( UnitConverter uc){
		this.unitconverter = uc;
		this.setTitle("Area Unit Converter");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		initComponents();
	}
	
	/**
	 * initialize components in the window
	 */
	private void initComponents(){
		setBounds(100, 100, 700, 105);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		this.setResizable(false);
		contentPane.setLayout(new GridLayout(3,1));
		
		Container menuBar = new Container();
		menuBar.setLayout(new BoxLayout(menuBar,BoxLayout.X_AXIS));
		
		Container body = new Container();
		body.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		inputField1 = new JTextField(10);
		inputField1.setHorizontalAlignment(SwingConstants.RIGHT);
		inputField1.addMouseListener(new MouseAdapter() {
			@Override
            public void mouseClicked(MouseEvent e){
				inputField1.setText("");
				inputField2.setText("");
				inputField1.setForeground(Color.BLACK);
				inputField2.setForeground(Color.BLACK);
            }
		});
		inputField1.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {}
			
			@Override
			public void keyReleased(KeyEvent e) {}
			
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER){
					inputField1.addActionListener(new ConvertButtonListener());
				}
			}
		});
		body.add(inputField1);
		
		comboBox1 = new JComboBox(unitconverter.getUnits(UnitType.Area));
		body.add(comboBox1);
		
		JLabel label = new JLabel(" = ");
		body.add(label);
		
		inputField2 = new JTextField(10);
		inputField2.setHorizontalAlignment(SwingConstants.RIGHT);
		inputField2.addMouseListener(new MouseAdapter() {
			@Override
            public void mouseClicked(MouseEvent e){
				inputField1.setText("");
				inputField2.setText("");
				inputField1.setForeground(Color.BLACK);
				inputField2.setForeground(Color.BLACK);
            }
		});
		inputField2.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyReleased(KeyEvent e) {}
			
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER){
					inputField2.addActionListener(new ConvertButtonListener());
				}
			}
		});
		body.add(inputField2);
		
		comboBox2 = new JComboBox<Object>(unitconverter.getUnits(UnitType.Area));
		body.add(comboBox2);
		
		JButton ConvertButton = new JButton("Convert!");
		ConvertButton.addActionListener(new ConvertButtonListener());
		body.add(ConvertButton);
		
		JButton ClearButton = new JButton("Clear");
		ClearButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				inputField1.setText("");
				inputField2.setText("");
			}
		});
		body.add(ClearButton);
		
		Container option = new Container();
		option.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JRadioButton LeftToRight = new JRadioButton("Left - > Right");
		LeftToRight.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(LeftToRight.isSelected()){
					inputField1.setEnabled(false);
					inputField1.setText("");
				}else{
					inputField1.setEnabled(true);
					inputField1.setText("");
				}
				
			}
		});
		option.add(LeftToRight);
		
		JRadioButton RightToLeft = new JRadioButton("Right - > Left");
		RightToLeft.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(RightToLeft.isSelected()){
					inputField2.setEnabled(false);
					inputField2.setText("");
				}else{
					inputField2.setEnabled(true);
					inputField2.setText("");
				}
			}
		});
		option.add(RightToLeft);
		contentPane.add(menuBar);
		
		JMenuBar menuBar_1 = new JMenuBar();
		menuBar.add(menuBar_1);
		
		JMenu unitSelection = new JMenu("Unit Type");
		menuBar_1.add(unitSelection);
		
		JMenuItem convertLength = new JMenuItem("Length");
		convertLength.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				comboBox1.removeAllItems();
				comboBox2.removeAllItems();
				setUnitConverting(UnitType.Length);
			}
		});
		unitSelection.add(convertLength);
		
		JMenuItem convertArea = new JMenuItem("Area");
		convertArea.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				comboBox1.removeAllItems();
				comboBox2.removeAllItems();
				setUnitConverting(UnitType.Area);
			}
		});
		unitSelection.add(convertArea);
		
		JMenuItem convertWeight = new JMenuItem("Weight");
		convertWeight.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				comboBox1.removeAllItems();
				comboBox2.removeAllItems();
				setUnitConverting(UnitType.Weight);
			}
		});
		unitSelection.add(convertWeight);
		
		JMenuItem convertVolume = new JMenuItem("Volume");
		convertVolume.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				comboBox1.removeAllItems();
				comboBox2.removeAllItems();
				setUnitConverting(UnitType.Volume);
			}
		});
		unitSelection.add(convertVolume);
		unitSelection.addSeparator();
		
		JMenuItem exitMenu = new JMenuItem("Exit");
		exitMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		unitSelection.add(exitMenu);
		
		contentPane.add(body);
		contentPane.add(option);
		this.pack();
	}
	
	/**
	 * This method is used to change the choice in combobox due to the menu that user choose
	 * @param uType type of unit that user want to convert
	 */
	public void setUnitConverting(UnitType uType){
		Unit[] first = unitconverter.getUnits(uType);
		for(Unit temp : first){
			comboBox1.addItem(temp);
		}
		Unit[] second = unitconverter.getUnits(uType);
		for(Unit temp : second){
			comboBox2.addItem(temp);
		}
		if(uType.equals(UnitType.Length)){
			this.setTitle("Length Unit Converter");
		}else if(uType.equals(UnitType.Weight)){
			this.setTitle("Weight Unit Converter");
		}else if(uType.equals(UnitType.Volume)){
			this.setTitle("Volume Unit Converter");
		}else{
			this.setTitle("Area Unit Converter");
		}
	}
	
	/**
	 * ConvertButtonListener is an ActionListener that perform an action when
	 * the button is pressed. It is an inner class so it can access private
	 * attributes of ConverterUI
	 * It reads the text from a JTextField, convert the value to a number,
	 * call the unitconverter to convert, and write result in other text field.
	 */
	class ConvertButtonListener implements ActionListener{
		/** the action to perform action when the "convert" button or enter key is pressed */
		
		public void actionPerformed(ActionEvent e) {
			String s = inputField1.getText().trim();
			//This line is for testing. Comment it out after you see how it works.
			if(s.length() >0){
				try{
					double value = Double.valueOf(s);
					Unit formUnit = (Unit)comboBox1.getSelectedItem();
					Unit toUnit = (Unit)comboBox2.getSelectedItem();
					inputField2.setText(String.format("%.3f", unitconverter.convert(value, formUnit, toUnit)));
				}catch(Exception e1){
					inputField1.setForeground(Color.red);
					inputField2.setForeground(Color.red);
				}
			}else{
				try{
					double value = Double.valueOf(inputField2.getText().trim());
					Unit formUnit = (Unit)comboBox2.getSelectedItem();
					Unit toUnit = (Unit)comboBox1.getSelectedItem();
					inputField1.setText(String.format("%.3f", unitconverter.convert(value, formUnit, toUnit)));
				}catch(Exception e1){
					inputField1.setForeground(Color.red);
					inputField2.setForeground(Color.red);
				}
			}
		}
	}
}
