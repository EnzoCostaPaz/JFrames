import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JComboBoxEJlist extends JFrame{
    JComboBox lista;
    JList lista2;
    String paises[] = {"Brasil","França","Estados Unidos","Inglaterra","Espanha","Japão","China","Argentina"};
    String cidades[] = {"Rio de Janeiro","Paris","Nova Iorque","Tokyo","Barcelona","Pequin","Londres","Buenos Aires"};
    JButton exibir,exibirL;
    JLabel rotulo,rotuloL,Comp;

        public JComboBoxEJlist(){
            super("Exemplo de JComboBox");
            ImageIcon icone = new ImageIcon("Viagem.png");
            setIconImage(icone.getImage());
            Container tela =  getContentPane();
            setLayout(null);
            exibirL = new JButton("Exibir Lista");
            rotuloL = new JLabel("");
            lista = new JComboBox(cidades);
            lista2 = new JList(paises);
            Comp = new JLabel("");
            tela.setBackground(new Color(240,248,255));
            lista.setBackground(new Color(240,248,255));
            lista2.setBackground(new Color(240,248,255));

            //Lista
            lista2.setVisibleRowCount(5);
            lista2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            JScrollPane painelRolagem = new JScrollPane(lista2);
            painelRolagem.setBounds(40,50,150,100);
            exibirL.setBounds(150,178,100,30);
            rotuloL.setBounds(50,200,370,30);

            //ComboBox
            lista.setMaximumRowCount(5);
            lista.setBounds(220,50,150,30);
            Comp.setBounds(50,210,220,30);

            exibirL.addActionListener(new ActionListener() {
                public void actionPerformed( ActionEvent e){
                        rotuloL.setText("País escolhido: "+lista2.getSelectedValue().toString()+", Cidade escolhida: "+lista.getSelectedItem().toString());
                        if (lista.getSelectedItem().toString().equals("Rio de Janeiro") && (lista2.getSelectedValue().toString().equals("Brasil"))) {
                            Comp.setText("Os paises se correspondem");
                            Comp.setForeground(new Color(144,238,144));
                        }
                        else if (lista.getSelectedItem().toString().equals("Paris")&&lista2.getSelectedValue().toString().equals("França")) {
                            Comp.setText("Os paises se correspondem");
                            Comp.setForeground(new Color(144,238,144));
                        }
                        else if (lista.getSelectedItem().toString().equals("Nova Iorque")&&lista2.getSelectedValue().toString().equals("Estados Unidos")) {
                            Comp.setText("Os paises se correspondem");
                            Comp.setForeground(new Color(144,238,144));
                        }
                        else if (lista.getSelectedItem().toString().equals("Londres")&&lista2.getSelectedValue().toString().equals("Inglaterra")) {
                            Comp.setText("Os paises se correspondem");
                            Comp.setForeground(new Color(144,238,144));
                        }
                        else if (lista.getSelectedItem().toString().equals("Tokyo")&&lista2.getSelectedValue().toString().equals("Japão")) {
                            Comp.setText("Os paises se correspondem");
                            Comp.setForeground(new Color(144,238,144));
                        }
                        else if (lista.getSelectedItem().toString().equals("Pequin")&&lista2.getSelectedValue().toString().equals("China")) {
                            Comp.setText("Os paises se correspondem");
                            Comp.setForeground(new Color(144,238,144));
                        }
                        else if (lista.getSelectedItem().toString().equals("Buenos Aires")&&lista2.getSelectedValue().toString().equals("Argentina")) {
                            Comp.setText("Os paises se correspondem");
                            Comp.setForeground(new Color(144,238,144));
                        }
                        else if (lista.getSelectedItem().toString().equals("Barcelona")&&lista2.getSelectedValue().toString().equals("Espanha")) {
                            Comp.setText("Os paises se correspondem");
                            Comp.setForeground(new Color(144,238,144));
                        }
                        else{
                            Comp.setText("Os paises não se correspondem");
                            Comp.setForeground(new Color(250,128,114));
                        }
                }  
            });


            tela.add(painelRolagem);
            tela.add(exibirL);
            tela.add(rotuloL);

            tela.add(lista);
            tela.add(Comp);

            
            setSize(500,290);
            setLocationRelativeTo(null);
            setVisible(true);
        }
}