package br.com.bankslife.trocatrocabks.modelo;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class RadioButton extends JFrame {
	private static final long serialVersionUID = 1L;
	private JRadioButton java, csharp, sim, nao;
	private JLabel myLabel, myLabel2;
	private ButtonGroup grupo1, grupo2;
	private RadioButtonHandler handler;

	public RadioButton() {
		super("Radio Buttons - JavaProgressivo.net");
		setLayout(new FlowLayout());
		handler = new RadioButtonHandler();

		myLabel = new JLabel("Qual a melhor linguagem de programação?");
		myLabel2 = new JLabel("\nVocê tem certeza disso?");
		java = new JRadioButton("Java", false);
		csharp = new JRadioButton("C#", false);
		sim = new JRadioButton("Sim", false);
		nao = new JRadioButton("Não", false);

		add(myLabel);
		add(java);
		add(csharp);
		add(myLabel2);
		add(sim);
		add(nao);

		grupo1 = new ButtonGroup();
		grupo1.add(java);
		grupo1.add(csharp);

		grupo2 = new ButtonGroup();
		grupo2.add(sim);
		grupo2.add(nao);

		java.addItemListener(handler);
		csharp.addItemListener(handler);
		sim.addItemListener(handler);
		nao.addItemListener(handler);
	}

	private class RadioButtonHandler implements ItemListener {

		@Override
		public void itemStateChanged(ItemEvent event) {
			if (java.isSelected() && sim.isSelected())
				JOptionPane.showMessageDialog(null, "Parabéns, você é o cara");
			if (csharp.isSelected() && sim.isSelected())
				JOptionPane.showMessageDialog(null, "Sabe de nada, inocente!");
		}

	}

}