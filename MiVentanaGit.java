import javax.swing.*;

class MiVentanaGit extends JFrame
{
	public MiVentanaGit()
	{
		JPanel panel;
		JLabel lblTexto1;
		JButton boton1;

		panel = new JPanel();
		panel.setLayout(null);
		lblTexto1 = new JLabel("ETIQUETA 1");
		lblTexto1.setBounds(50,40,200,10);
		boton1 = new JButton("OK");
		boton1.setBounds(50,100,100,30);

		panel.add(lblTexto1);
		panel.add(boton1);

		this.add(panel);
		this.setBounds(400,400,500,350);
		this.setTitle("VENTANA PRINCIPAL");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}