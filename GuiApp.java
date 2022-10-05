public class GuiApp{
  JFrame frame;
  JButton button;
  JTextField field;
  JLabel prompt,result,to;
  JPanel contentpane;
  JComboBox list,list2;

  public GuiApp(){
    frame = new JFrame("Mass Conversion Application");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    contentpane=new JPanel();
    contentpane.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
    String [] type={"Units", "Gram(s)","Kilogram(s)", "Pound(s)","Ounce(s)"};
    list=new JComboBox(type);
    list.setAlignmentX(JComboBox.LEFT_ALIGNMENT);
    list.setSelectedIndex(0);
    list.addActionListener(new converty());
    contentpane.add(list);
    to=new JLabel("to");
    contentpane.add(to);
    list2=new JComboBox(type);
    list2.setAlignmentX(JComboBox.RIGHT_ALIGNMENT);
    list2.setSelectedIndex(0);   
    list2.addActionListener(new converty());
    contentpane.add(list2);
    prompt=new JLabel("Enter here:");
    prompt.setAlignmentX(JLabel.LEFT_ALIGNMENT);
    contentpane.add(prompt);
    field=new JTextField(10);
    contentpane.add(field);
    button=new JButton("Convert");
    button.setAlignmentX(JButton.CENTER_ALIGNMENT);
    button.setEnabled(false);
    button.addActionListener(new converty());
    button.setActionCommand("Convert");
    contentpane.add(button);     
    result=new JLabel(" asdff ");
    result.setAlignmentX(JLabel.CENTER_ALIGNMENT);
    contentpane.add(result);
    frame.pack();
    frame.setVisible(true);
    frame.setContentPane(contentpane); 
  }

  class converty implements ActionListener{

    public void actionPerformed(ActionEvent event){    
      if (!list.getSelectedItem().toString().equalsIgnoreCase("Units") && !list2.getSelectedItem().toString().equalsIgnoreCase("Units")){
        button.setEnabled(true);
      }
      if (list.getSelectedItem().toString().equalsIgnoreCase(list2.getSelectedItem().toString()) && button.getActionCommand().equals("Convert")){
        double thing=Double.parseDouble(field.getText());
        result.setText(thing+" "+list.getSelectedItem().toString()+" is equal to "+thing+" "+list2.getSelectedItem().toString());
      }
      else if (list.getSelectedItem().toString().equalsIgnoreCase("Gram(s)") && !list2.getSelectedItem().toString().equalsIgnoreCase("Kilogram(s)") && button.getActionCommand().equals("Convert")){
        double thing=Double.parseDouble(field.getText());
        result.setText(thing+" "+list.getSelectedItem().toString()+" is equal to "+(thing/1000)+" "+list2.getSelectedItem().toString());             
      }
      else if (list.getSelectedItem().toString().equalsIgnoreCase("Gram(s)") && !list2.getSelectedItem().toString().equalsIgnoreCase("Pound(s)") && button.getActionCommand().equals("Convert")){
        double thing=Double.parseDouble(field.getText());
        result.setText(thing+" "+list.getSelectedItem().toString()+" is equal to "+(thing*453.59237)+" "+list2.getSelectedItem().toString());
      }
      else if (list.getSelectedItem().toString().equalsIgnoreCase("Gram(s)") && !list2.getSelectedItem().toString().equalsIgnoreCase("Ounce(s)") && button.getActionCommand().equals("Convert")){
        double thing=Double.parseDouble(field.getText());
        result.setText(thing+" "+list.getSelectedItem().toString()+" is equal to "+(thing*28.349523125)+" "+list2.getSelectedItem().toString());
      }
      else if (list.getSelectedItem().toString().equalsIgnoreCase("Kilogram(s)") && !list2.getSelectedItem().toString().equalsIgnoreCase("Gram(s)") && button.getActionCommand().equals("Convert")){
        double thing=Double.parseDouble(field.getText());
        result.setText(thing+" "+list.getSelectedItem().toString()+" is equal to "+(thing*1000)+" "+list2.getSelectedItem().toString());
      }
      else if (list.getSelectedItem().toString().equalsIgnoreCase("Kilogram(s)") && !list2.getSelectedItem().toString().equalsIgnoreCase("Pound(s)") && button.getActionCommand().equals("Convert")){
        double thing=Double.parseDouble(field.getText());
        result.setText(thing+" "+list.getSelectedItem().toString()+" is equal to "+(thing/0.45359237)+" "+list2.getSelectedItem().toString());
      }
      else if (list.getSelectedItem().toString().equalsIgnoreCase("Kilogram(s)") && !list2.getSelectedItem().toString().equalsIgnoreCase("Ounce(s)") && button.getActionCommand().equals("Convert")){
        double thing=Double.parseDouble(field.getText());
        result.setText(thing+" "+list.getSelectedItem().toString()+" is equal to "+(thing/0.0283495231257)+" "+list2.getSelectedItem().toString());
      }
      else if (list.getSelectedItem().toString().equalsIgnoreCase("Ounce(s)") && !list2.getSelectedItem().toString().equalsIgnoreCase("Gram(s)") && button.getActionCommand().equals("Convert")){
        double thing=Double.parseDouble(field.getText());
        result.setText(thing+" "+list.getSelectedItem().toString()+" is equal to "+(thing*28.349523125)+" "+list2.getSelectedItem().toString());    
      }   
      else if (list.getSelectedItem().toString().equalsIgnoreCase("Ounce(s)") && !list2.getSelectedItem().toString().equalsIgnoreCase("Pound(s)") && button.getActionCommand().equals("Convert")){
        double thing=Double.parseDouble(field.getText());
        result.setText(thing+" "+list.getSelectedItem().toString()+" is equal to "+(thing/0.0625)+" "+list2.getSelectedItem().toString());
      }
      else if (list.getSelectedItem().toString().equalsIgnoreCase("Ounce(s)") && !list2.getSelectedItem().toString().equalsIgnoreCase("Kilogram(s)") && button.getActionCommand().equals("Convert")){
        double thing=Double.parseDouble(field.getText());
        result.setText(thing+" "+list.getSelectedItem().toString()+" is equal to "+(thing/0.0625)+" "+list2.getSelectedItem().toString());
      }
      else if (list.getSelectedItem().toString().equalsIgnoreCase("Ounce(s)") && !list2.getSelectedItem().toString().equalsIgnoreCase("Pound(s)") && button.getActionCommand().equals("Convert")){
        double thing=Double.parseDouble(field.getText());
        result.setText(thing+" "+list.getSelectedItem().toString()+" is equal to "+(thing/0.0625)+" "+list2.getSelectedItem().toString());
      }
    }

  }

  private static void GuiApp(){
    JFrame.setDefaultLookAndFeelDecorated(true);
    GuiApp greeting= new GuiApp();
  }

  public static void main(String[] args) {
    javax.swing.SwingUtilities.invokeLater(new Runnable(){
      public void run() {  
        GuiApp();
      }
    });
  }
}
