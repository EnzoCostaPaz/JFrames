import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Calendar;
import java.text.DecimalFormat;

public class Aula4 extends JFrame {
    JButton botaoEn, botaoSr;
    JLabel boasVd, boasVd2, nam, telo, esc, rtD, rtH,rtn;
    JTextField nome, esco, tel;
    JComboBox<String> lista;
    String nomes;
    String[] ling = {"Java", "CSS", "HTML", "JavaScript", "Kotlin", "PHP", "SQL"};
    Calendar data;
    int ds, dia, Meses, ano;
    String[] diasS = {"Domingo", "Segunda-Feira", "Terça-Feira", "Quarta-Feira", "Quinta-Feira", "Sexta-Feira", "Sábado"};
    String[] mes = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
    DecimalFormat formato;

    public Aula4() {
        
        super("Cadastro de Curso");
        Container tela = getContentPane();
        setLayout(null);
        ImageIcon icon = new ImageIcon("Cad.png");
        setIconImage(icon.getImage());
        nomes = JOptionPane.showInputDialog(null,"Informe o seu Nome");
        botaoEn = new JButton("Enviar");
        botaoSr = new JButton("Sair");
        boasVd = new JLabel("Bem Vindo!"+nomes.toUpperCase());
        boasVd2 = new JLabel("Vamos Cadastrar suas Informações");
        nome = new JTextField(40);
        esco = new JTextField(40);
        tel = new JTextField(12);
        nam = new JLabel("Nome do Seu filho:");
        telo = new JLabel("Telefone:");
        esc = new JLabel("Escola:");
        rtD = new JLabel();
        rtH = new JLabel();

        data = Calendar.getInstance();
        ds = data.get(Calendar.DAY_OF_WEEK) - 1;
        dia = data.get(Calendar.DAY_OF_MONTH);
        Meses = data.get(Calendar.MONTH);
        ano = data.get(Calendar.YEAR);

        lista = new JComboBox<>(ling);
        lista.setToolTipText("Escolha uma das opções de curso");
        lista.setMaximumRowCount(7);

        // Estilização
        tela.setBackground(new Color(255, 222, 173));
        lista.setBackground(new Color(255, 222, 173));
        nome.setBackground(new Color(245, 222, 179));
        tel.setBackground(new Color(245, 222, 179));
        esco.setBackground(new Color(245, 222, 179));

        botaoEn.addActionListener(new ActionListener() {
            

            public void actionPerformed(ActionEvent e) {
                Object[] bt = {"Enviar", "Cancelar"};
                String conf = (String) JOptionPane.showInputDialog(null,"Deseja mesmo enviar?","Confirmação",JOptionPane.INFORMATION_MESSAGE, null, bt,bt[0]);
                nome.setText(nome.getText().toUpperCase());
                esco.setText(esco.getText().toLowerCase());
                if (conf.equals("Enviar")) {
                    if (nome.getText().toString().equals("")||nome.getText().toString().equals(" ")) {
                        JOptionPane.showMessageDialog(null, "NOME NÃO DEFINIDO", "Mensagem de Erro", JOptionPane.ERROR_MESSAGE);
                    } else if (esco.getText().toString().equals("")||esco.getText().toString().equals(" ")) {
                        JOptionPane.showMessageDialog(null, "ESCOLA NÃO DEFINIDA", "Mensagem de Erro", JOptionPane.ERROR_MESSAGE);
                    } else if (tel.getText().toString().equals("")||tel.getText().toString().equals(" ")) {
                        JOptionPane.showMessageDialog(null, "TELEFONE NÃO DEFINIDO, procure a Secretária para concluir o cadastro", "Mensagem de Erro", JOptionPane.WARNING_MESSAGE);
                        Calendar horaAtual = Calendar.getInstance();
                        int hh = horaAtual.get(Calendar.HOUR_OF_DAY);
                        int mm = horaAtual.get(Calendar.MINUTE);
                        int ss = horaAtual.get(Calendar.SECOND);
                        formato = new DecimalFormat("00");
    
                        String horarioCadastro = "Horário do Cadastro: " + formato.format(hh) + ":" + formato.format(mm) + ":" + formato.format(ss);
                        String dataCadastro = "Data do Cadastro: " + diasS[ds] + ", " + dia + " de " + mes[Meses] + " de " + ano;
    
                        JOptionPane.showMessageDialog(null,
                                "Informações Cadastradas:\n\n" +
                                "Nome: " + nome.getText() + "\n" +
                                "Escola: " + esco.getText() + "\n" +
                                "Telefone: " + tel.getText() + "\n" +
                                "Curso Escolhido: " + lista.getSelectedItem() + "\n\n" +
                                dataCadastro + "\n" + horarioCadastro,
                                getTitle(), JOptionPane.INFORMATION_MESSAGE);
                        System.exit(0);
                    } else {
                        Calendar horaAtual = Calendar.getInstance();
                        int hh = horaAtual.get(Calendar.HOUR_OF_DAY);
                        int mm = horaAtual.get(Calendar.MINUTE);
                        int ss = horaAtual.get(Calendar.SECOND);
                        formato = new DecimalFormat("00");
    
                        String horarioCadastro = "Horário do Cadastro: " + formato.format(hh) + ":" + formato.format(mm) + ":" + formato.format(ss);
                        String dataCadastro = "Data do Cadastro: " + diasS[ds] + ", " + dia + " de " + mes[Meses] + " de " + ano;
    
                        JOptionPane.showMessageDialog(null,
                                "Informações Cadastradas:\n\n" +
                                "Nome do filho: " + nome.getText() + "\n" +
                                "Escola: " + esco.getText() + "\n" +
                                "Telefone: " + tel.getText() + "\n" +
                                "Curso Escolhido: " + lista.getSelectedItem() + "\n\n" +
                                dataCadastro + "\n" + horarioCadastro,
                                getTitle(), JOptionPane.INFORMATION_MESSAGE);
                        System.exit(0);
                    }
                }
                else{
                    nome.setText(null);
                    esco.setText(null);
                    tel.setText(null);
                    nam.requestFocus();
                }
                
            }
        });
        botaoSr.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int opcao;
                Object[] botoes = {"Sim", "Não"};
                opcao = JOptionPane.showOptionDialog(null, "Deseja mesmo fechar a janela?", "Fechar",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, botoes, botoes[0]);
                if (opcao == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            }
        });

        // Mensagem boas vindas
        boasVd.setBounds(255, 1, 190, 100);
        boasVd2.setBounds(193, 15, 210, 100);
        // Text Area
        nome.setBounds(150, 110, 100, 20);
        tel.setBounds(90, 140, 100, 20);
        esco.setBounds(90, 170, 100, 20);
        nam.setBounds(40, 110, 140, 20);
        telo.setBounds(35, 140, 100, 20);
        esc.setBounds(40, 170, 100, 20);
        lista.setBounds(310, 110, 150, 20);
        botaoEn.setBounds(310, 220, 100, 20);
        botaoSr.setBounds(190, 220, 100, 20);

        tela.add(boasVd);
        tela.add(boasVd2);
        tela.add(nome);
        tela.add(tel);
        tela.add(esco);
        tela.add(nam);
        tela.add(telo);
        tela.add(esc);
        tela.add(lista);
        tela.add(botaoEn);
        tela.add(botaoSr);

        setSize(600, 400);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
