import javax.swing.*;
import java.awt.*;
import java.awt.event.*;;
public class ComboBoxRadio extends JFrame{
    JLabel rotulo1,rotulo2,rotulo3,texto;
    JCheckBox negrito,italico,normal,negritoitalico;
    JRadioButton tam1,tam2,tam3,tam4;
    ButtonGroup grupo;

    String cor[] = {"Sem Cor","Vermelho","Azul","Verde","Amarelo","Branco","Preto"};
    JComboBox lista;
    Integer estilo, tamfonte;

    public ComboBoxRadio(){
        super("Exemplo Combo Radio BOX");
        Container tela = getContentPane();
        setLayout(null);
        rotulo1 = new JLabel("Cor");
        rotulo2 = new JLabel("Estilo");
        rotulo3 = new JLabel("Tamanho");
        texto = new JLabel("Programa feito em Java");
        lista = new JComboBox(cor);
        lista.setMaximumRowCount(7);
        negrito = new JCheckBox("Negrito");
        italico = new JCheckBox("Italico");
        normal = new JCheckBox("Normal");
        negritoitalico = new JCheckBox("Negrito Italico");

        tam1 = new JRadioButton("12");
        tam2 = new JRadioButton("14");
        tam3 = new JRadioButton("16");
        tam4 = new JRadioButton("18");
        grupo = new ButtonGroup();

        grupo.add(tam1);
        grupo.add(tam2);
        grupo.add(tam3);
        grupo.add(tam4);

        rotulo1.setBounds(40,20,70,20);
        rotulo2.setBounds(200,20,70,20);
        rotulo3.setBounds(300,20,70,20);

        texto.setBounds(100,200,300,20);
        lista.setBounds(40,50,150,20);
        negrito.setBounds(200,50,100,20);
        italico.setBounds(200,70,100,20);
        normal.setBounds(200,90,100,20);
        negritoitalico.setBounds(200,110,150,20);
        tam1.setBounds(350,50,100,20);
        tam2.setBounds(350,70,100,20);
        tam3.setBounds(350,90,100,20);
        tam4.setBounds(350,110,100,20);
        estilo=Font.PLAIN;

        //coloca cor na fonte
        lista.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                if (lista.getSelectedItem().toString() == "Sem Cor") {
                    texto.setForeground(Color.BLACK);
                }
                if (lista.getSelectedItem().toString() == "Vermelho") {
                    texto.setForeground(Color.RED);
                }
                if (lista.getSelectedItem().toString() == "Azul") {
                    texto.setForeground(Color.BLUE);
                }
                if (lista.getSelectedItem().toString() == "Verde") {
                    texto.setForeground(Color.GREEN);
                }
                if (lista.getSelectedItem().toString() == "Amarelo") {
                    texto.setForeground(Color.YELLOW);
                }
                if (lista.getSelectedItem().toString() == "Branco") {
                    texto.setForeground(Color.WHITE);
                }
                if (lista.getSelectedItem().toString()== "Preto") {
                    texto.setForeground(Color.BLACK);
                }
            }
        });
        //fonte 12
        tam1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                tamfonte = 12;
                texto.setFont(new Font("",estilo,tamfonte));
            }
        });
        //fonte 14
        tam2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                tamfonte = 14;
                texto.setFont(new Font("",estilo,tamfonte));
            }
        });
        //fonte 16
        tam3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                tamfonte = 16;
                texto.setFont(new Font("",estilo,tamfonte));
            }
        });
        //fonte 18
        tam4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                tamfonte = 18;
                texto.setFont(new Font("",estilo,tamfonte));
            }
        });
        //fonte em negrito
        negrito.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
              estilo = Font.BOLD;
              normal.setSelected(false);
              italico.setSelected(false);
              negritoitalico.setSelected(false);
              texto.setFont(new Font("",estilo, tamfonte));
            }
        });
        //fonte italico
        italico.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
              estilo = Font.ITALIC;
              normal.setSelected(false);
              negrito.setSelected(false);
              negritoitalico.setSelected(false);
              texto.setFont(new Font("",estilo, tamfonte));
            }
        });
        //fonte normal
        normal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
              estilo = Font.PLAIN;
              italico.setSelected(false);
              negrito.setSelected(false);
              negritoitalico.setSelected(false);
              texto.setFont(new Font("",estilo, tamfonte));
            }
        });
        //fonte negrito e italico
        negritoitalico.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
              estilo = Font.ITALIC+Font.BOLD;
              normal.setSelected(false);
              negrito.setSelected(false);
              italico.setSelected(false);
              texto.setFont(new Font("",estilo, tamfonte));
            }
        });

        tela.add(rotulo1);
        tela.add(rotulo2);
        tela.add(rotulo3);
        tela.add(texto);
        tela.add(negrito);
        tela.add(italico);
        tela.add(normal);
        tela.add(negritoitalico);

        tela.add(tam1);
        tela.add(tam2);
        tela.add(tam3);
        tela.add(tam4);
        tela.add(lista);

        setSize(500,300);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
