/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculadorasDeMatriz;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.*;
import javax.swing.*;
import Jama.*;
/**
 *
 * @author BJBP
 */
public class CalculadoraDeMatrizSimple {


	JFrame frame = new JFrame();
	JPanel PanelDeFunciones = new JPanel();
	
	JMenuBar menubar = new JMenuBar();
	JMenu infoMenu = new JMenu("Ayuda");
	JMenuItem info = new JMenuItem("Info");
	
	JButton transponer = new JButton("transponer");
	JButton inverso = new JButton("Inverso");
	JButton determinante = new JButton("Rango & Det");
	JButton adicion = new JButton("adicion");
	JButton subtracion = new JButton("subtracion");
	JButton multiplication = new JButton("Multiplicacion");
	JButton LU = new JButton("LU Descompo");//la descomposición o factorización inferior-superior ( LU ) factoriza una matriz como el producto de una matriz triangular inferior y una matriz triangular superior. El producto a veces también incluye una matriz de permutación . La descomposición LU puede verse como la forma matricial de la eliminación gaussiana . Las computadoras generalmente resuelven sistemas cuadrados de ecuaciones lineales usando la descomposición LU, y también es un paso clave al invertir una matriz o calcular el determinantede una matriz
	JButton QR = new JButton("QR Descompo");//una descomposición QR , también conocido como una factorización QR o factorización QU es una descomposición de una matriz A en un producto A  =  QR de una matriz ortogonal Q y una matriz triangular superior R . La descomposición QR se usa a menudo para resolver el problema de mínimos cuadrados lineales y es la base de un algoritmo de valor propio particular , el algoritmo QR .
	JButton vectorPropio = new JButton("vectorPropio");//un vector propio o vector característico de una transformación lineal es un no nulo vector que los cambios en la mayoría por un escalar factor al que la transformación lineal se aplica a ella. El valor propio correspondiente , a menudo denotado por , es el factor por el cual se escala el vector propio.
	//Geométricamente , un vector propio, correspondiente a un valor propio real distinto de cero, apunta en una dirección en la que se estira por la transformación y el valor propio es el factor por el cual se estira. Si el valor propio es negativo, la dirección se invierte. Hablando libremente, en un espacio vectorial multidimensional , el vector propio no se rota.

	//Si T es una transformación lineal de un espacio vectorial V sobre un campo F en sí mismo yv es un vector distinto de cero en V , entonces v es un vector propio de T si T ( v ) es un múltiplo escalar de v . Esto se puede escribir como
	//donde λ es un escalar en F , conocido como valor propio , valor característico o raíz característica asociada con v
	panelDeEntradaDeMatriz pem1, pem2;
	panelDeSalidaDeMatriz psm1 = new panelDeSalidaDeMatriz();
	panelDeSalidaDeMatriz psm2 = new panelDeSalidaDeMatriz();

	public void Interfaz(){
		frame.setTitle("Calculadora De Matriz");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pem1 = new panelDeEntradaDeMatriz(pem2);
		pem2 = new panelDeEntradaDeMatriz(pem1);


		frame.setJMenuBar(menubar);
		menubar.add(infoMenu);
		infoMenu.add(info);

		info.addActionListener(new ActionListener () {
			public void actionPerformed (ActionEvent event){
				try{
					JOptionPane.showMessageDialog(null, "Calculadora De Matriz V1.0\n Diseñador grafico:\tGutiérrez Pretell Aldahir Kenyi Noe\t\n" +
							"programaciond de interfaz:\tSanchez Ibañez Hans Jefferson\t\n" +
							"programaciond de funciones:\tBamberger Plasencia Braggi\t\n" +
							"documentacion y comentarios:\tDiandra Elizabeth Ticona\t\n" +
							"Esto es referencial, ya que todos hemos apoyado en todo.\t\t\n" +
							"Hecho para el curso de Geometría Analitica\t\t\n" +
							"\t\t\n" +
							"Gracias…\t\t\n\n", "Information", JOptionPane.INFORMATION_MESSAGE);
				} catch (Exception infoe) {
					infoe.printStackTrace();
				}
			}
		});

		// Set Menu Finished


		// Set Button

		transponer.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				pem1.ejecutar.setVisible(true);
				psm1.clear();
				psm2.clear();
				pem1.kindID = 1;
				pem1.setVisible(true);
				pem2.setVisible(false);
				psm1.setVisible(true);
				psm2.setVisible(false);
				frame.repaint();

			}
		});

		inverso.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				pem1.ejecutar.setVisible(true);
				psm1.clear();
				psm2.clear();
				pem1.kindID = 2;
				pem1.setVisible(true);
				pem2.setVisible(false);
				psm1.setVisible(true);
				psm2.setVisible(false);
				frame.repaint();

			}
		});

		determinante.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				pem1.ejecutar.setVisible(true);
				psm1.clear();
				psm2.clear();
				pem1.kindID = 3;
				pem1.setVisible(true);
				pem2.setVisible(false);
				psm1.setVisible(true);
				psm2.setVisible(false);
				frame.repaint();

			}
		});

		adicion.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				pem1.ejecutar.setVisible(false);
				psm1.clear();
				psm2.clear();
				pem2.kindID = 4;
				pem1.setVisible(true);
				pem2.setVisible(true);
				psm1.setVisible(false);
				psm2.setVisible(true);
				frame.repaint();

			}
		});

		subtracion.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				pem1.ejecutar.setVisible(false);
				psm1.clear();
				psm2.clear();
				pem2.kindID = 5;
				pem1.setVisible(true);
				pem2.setVisible(true);
				psm1.setVisible(false);
				psm2.setVisible(true);
				frame.repaint();

			}
		});

		multiplication.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				pem1.ejecutar.setVisible(false);
				psm1.clear();
				psm2.clear();
				pem2.kindID = 6;
				pem1.setVisible(true);
				pem2.setVisible(true);
				psm1.setVisible(false);
				psm2.setVisible(true);
				frame.repaint();

			}
		});

		LU.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				pem1.ejecutar.setVisible(true);
				psm1.clear();
				psm2.clear();
				pem1.kindID = 7;
				pem1.setVisible(true);
				pem2.setVisible(false);
				psm1.setVisible(true);
				psm2.setVisible(true);
				frame.repaint();

			}
		});

		QR.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				pem1.ejecutar.setVisible(true);
				psm1.clear();
				psm2.clear();
				pem1.kindID = 8;
				pem1.setVisible(true);
				pem2.setVisible(false);
				psm1.setVisible(true);
				psm2.setVisible(true);
				frame.repaint();

			}
		});

		vectorPropio.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				pem1.ejecutar.setVisible(true);
				psm1.clear();
				psm2.clear();
				pem1.kindID = 9;
				pem1.setVisible(true);
				pem2.setVisible(false);
				psm1.setVisible(true);
				psm2.setVisible(true);
				frame.repaint();

			}
		});
		// Set Button Finished


		frame.add(pem1);
		frame.add(pem2);
		frame.add(psm1);
		frame.add(psm2);
		pem1.setVisible(false);
		pem2.setVisible(false);
		psm1.setVisible(false);
		psm2.setVisible(false);
		pem1.setBounds(120, 5, 350, 400);
		pem2.setBounds(480, 5, 350, 400);
		psm1.setBounds(480, 5, 350, 400);
		psm2.setBounds(840, 5, 350, 400);


		PanelDeFunciones.add(transponer);
		PanelDeFunciones.add(inverso);
		PanelDeFunciones.add(determinante);
		PanelDeFunciones.add(adicion);
		PanelDeFunciones.add(subtracion);
		PanelDeFunciones.add(multiplication);
		PanelDeFunciones.add(LU);
		PanelDeFunciones.add(QR);
		PanelDeFunciones.add(vectorPropio);


		PanelDeFunciones.setLayout(null); // Must declare, otherwise setBounds won't work
		transponer.setBounds(10, 15, 100, 40);
		inverso.setBounds(10, 55, 100, 40);
		determinante.setBounds(10, 95, 100, 40);
		adicion.setBounds(10, 135, 100, 40);
		subtracion.setBounds(10, 175, 100, 40);
		multiplication.setBounds(10, 215, 100, 40);
		LU.setBounds(10, 255, 100, 40);
		QR.setBounds(10, 295, 100, 40);
		vectorPropio.setBounds(10, 335, 100, 40);

		frame.getContentPane().add(PanelDeFunciones);
		frame.setSize(1200, 440);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setVisible(true);
	}

	public class panelDeSalidaDeMatriz extends JPanel{

		private static final long serialVersionUID = -1123499173411824003L;
		//'serialVersionUID' es un número de 64 bits que se utiliza para identificar de forma única una clase durante el proceso de deserialización. Cuando serializas un objeto, serialVersionUID de la clase también se escribe en el archivo. Siempre que deserialice este objeto, el tiempo de ejecución de Java extrae este valor serialVersionUID de los datos serializados y compare el mismo valor asociado con la clase. Si ambos no coinciden, se lanzará 'java.io.InvalidClassException'.
		//Si una clase serializable no declara explícitamente un serialVersionUID, entonces el tiempo de ejecución de serialización calculará el valor serialVersionUID para esa clase en función de varios aspectos de la clase, como campos, métodos, etc., puede consultar este enlace para la aplicación de demostración Cuota
		JLabel label = new JLabel("SALIDA");
		JTextArea area = new JTextArea(18, 28);
		JScrollPane scroller = new JScrollPane(area);
		JButton save = new JButton("Guardar");

		void clear(){
			area.setText("");
		}

		panelDeSalidaDeMatriz(){

			save.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					try{
						final JFileChooser fc = new JFileChooser();
						int returnVal = fc.showSaveDialog(null);
			            if (returnVal == JFileChooser.APPROVE_OPTION) {
			                FileWriter fw = new FileWriter(fc.getSelectedFile());
			                BufferedWriter bw = new BufferedWriter(fw);
			                bw.write(area.getText());
			                bw.close();
			            }
					} catch (Exception ee){
						JOptionPane.showMessageDialog(null, "Unable to Save", "Fail to guardar", JOptionPane.ERROR_MESSAGE);
					}
				}
			});

			area.setEditable(false);
			scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED );
			scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED );
			add(label);
			add(scroller);
			add(save);
		}

	}


	public class panelDeEntradaDeMatriz extends JPanel{

		private static final long serialVersionUID = 8509249981100480189L;
		Matrix matrix;
		panelDeEntradaDeMatriz another;
		int kindID = 0;
		JLabel label = new JLabel("ENTRADA");
		JTextArea area = new JTextArea(18, 28);
		JScrollPane scroller = new JScrollPane(area);
		JButton ejecutar = new JButton("ejecutar");
		JButton cargar = new JButton("cargar");
		JButton guardar = new JButton("guardar");

		void clear(){
			area.setText("");
		}

		panelDeEntradaDeMatriz(panelDeEntradaDeMatriz mip){
			another = mip;

			ejecutar.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					switch (kindID){

						case 1: matrix = TextoAMatriz(area.getText(), area.getLineCount());
								psm1.clear();
								try{
									psm1.area.append(MatrizATexto(matrix.transpose()));
								} catch (Exception ee){
									psm1.area.append(ee.getLocalizedMessage());
									psm1.area.append("\nMatriz no válida. \nLa matriz debe ser m por n, \nlas entradas deben estar separadas por un espacio, \ny no debe haber líneas vacías adicionales.");
								} break;

						case 2: matrix = TextoAMatriz(area.getText(), area.getLineCount());
								psm1.clear();
								try{
									psm1.area.append(MatrizATexto(matrix.inverse()));
								} catch (Exception ee){
									psm1.area.append(ee.getLocalizedMessage());
									psm1.area.append("\nMatriz no válida. \nLa matriz debe ser m por n, \nlas entradas deben estar separadas por un espacio, \ny no debe haber líneas vacías adicionales.");
								} break;

						case 3: matrix = TextoAMatriz(area.getText(), area.getLineCount());
								psm1.clear();
								try{
									psm1.area.append("rank =  " + String.valueOf(matrix.rank()) + "\ndet = " + String.valueOf(matrix.det()));
								} catch (Exception ee){
									psm1.area.append(ee.getLocalizedMessage());
									psm1.area.append("\nMatriz no válida. \nLa matriz debe ser m por n, \nlas entradas deben estar separadas por un espacio, \ny no debe haber líneas vacías adicionales.");
								} break;
						case 4: matrix = TextoAMatriz(area.getText(), area.getLineCount());
								another.matrix = TextoAMatriz(another.area.getText(), another.area.getLineCount());
								psm2.clear();
								try{
									psm2.area.append(MatrizATexto(matrix.plus(another.matrix)));
								} catch (Exception ee){
									psm2.area.append(ee.getLocalizedMessage());
									psm2.area.append("\nMatriz no válida. \nLa matriz debe ser m por n, \nlas entradas deben estar separadas por un espacio, \ny no debe haber líneas vacías adicionales.");
								} break;
						case 5: matrix = TextoAMatriz(area.getText(), area.getLineCount());
								another.matrix = TextoAMatriz(another.area.getText(), another.area.getLineCount());
								psm2.clear();
								try{
									psm2.area.append(MatrizATexto(matrix.minus(another.matrix)));
								} catch (Exception ee){
									psm2.area.append(ee.getLocalizedMessage());
									psm2.area.append("\nMatriz no válida. \nLa matriz debe ser m por n, \nlas entradas deben estar separadas por un espacio, \ny no debe haber líneas vacías adicionales.");
								} break;
						case 6: matrix = TextoAMatriz(area.getText(), area.getLineCount());
								another.matrix = TextoAMatriz(another.area.getText(), another.area.getLineCount());
								psm2.clear();
								try{
									psm2.area.append(MatrizATexto(another.matrix.times(matrix)));
								} catch (Exception ee){
									psm2.area.append(ee.getLocalizedMessage());
									psm2.area.append("\nMatriz no válida. \nLa matriz debe ser m por n, \nlas entradas deben estar separadas por un espacio, \ny no debe haber líneas vacías adicionales.");
								} break;
						case 7: matrix = TextoAMatriz(area.getText(), area.getLineCount());
								psm1.clear();
								psm2.clear();

								//NOTE: Consider using Gaussian Elimination rather than Pivoting.

								LUDecomposition lu = null;
								try{
									lu = matrix.lu();
									psm1.area.append("Pivot:");
									for (int i : lu.getPivot()){
										psm1.area.append(" "+ (i+1));
									}
									psm1.area.append("\nL:\n" + MatrizATexto(lu.getL()));
								} catch (Exception ee){
									psm1.area.append(ee.getLocalizedMessage());
									psm1.area.append("\nMatriz no válida. \nLa matriz debe ser m por n, \nlas entradas deben estar separadas por un espacio, \ny no debe haber líneas vacías adicionales.");
								} try{
									psm2.area.append("U:\n" + MatrizATexto(lu.getU()));
								} catch (Exception ee){
									psm2.area.append(ee.getLocalizedMessage());
									psm2.area.append("\nMatriz no válida. \nLa matriz debe ser m por n, \nlas entradas deben estar separadas por un espacio, \ny no debe haber líneas vacías adicionales.");
								} break;
						case 8: matrix = TextoAMatriz(area.getText(), area.getLineCount());
								psm1.clear();
								psm2.clear();
								QRDecomposition qr = null;
								try{
									qr = matrix.qr();
									psm1.area.append("Q:\n" + MatrizATexto(qr.getQ()));
								} catch (Exception ee){
									psm1.area.append(ee.getLocalizedMessage());
									psm1.area.append("\nMatriz no válida. \nLa matriz debe ser m por n, \nlas entradas deben estar separadas por un espacio, \ny no debe haber líneas vacías adicionales.");
								} try{
									psm2.area.append("R:\n" + MatrizATexto(qr.getR()));
								} catch (Exception ee){
									psm2.area.append(ee.getLocalizedMessage());
									psm2.area.append("\nMatriz no válida. \nLa matriz debe ser m por n, \nlas entradas deben estar separadas por un espacio, \ny no debe haber líneas vacías adicionales.");
								} break;
						case 9: matrix = TextoAMatriz(area.getText(), area.getLineCount());
							psm1.clear();
							psm2.clear();

							//NOTE: Sometimes D matrix is not a diagonal matrix, check it.

							EigenvalueDecomposition ev = null;
							try{
								ev = matrix.eig();
								psm1.area.append("Eigenvector Matrix:\n" + MatrizATexto(ev.getV()) + "\n");
								psm1.area.append("Inverse of Eigenvector Matrix:\n" + MatrizATexto(ev.getV().inverse()));
							} catch (Exception ee){
								psm1.area.append(ee.getLocalizedMessage());
								psm1.area.append("\nMatriz no válida. \nLa matriz debe ser m por n, \nlas entradas deben estar separadas por un espacio, \ny no debe haber líneas vacías adicionales.");
							} try{
								psm2.area.append("Diagonal Matrix:\n" + MatrizATexto(ev.getD()));
							} catch (Exception ee){
								psm2.area.append(ee.getLocalizedMessage());
								psm2.area.append("\nMatriz no válida. \nLa matriz debe ser m por n, \nlas entradas deben estar separadas por un espacio, \ny no debe haber líneas vacías adicionales.");
							} break;
					}
				}
			});
			
			guardar.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					try{
						final JFileChooser fc = new JFileChooser();
						int returnVal = fc.showSaveDialog(null);
			            if (returnVal == JFileChooser.APPROVE_OPTION) {
			                FileWriter fw = new FileWriter(fc.getSelectedFile());
			                BufferedWriter bw = new BufferedWriter(fw);
			                bw.write(area.getText());
			                bw.close();
			            }
					} catch (Exception ee){
						JOptionPane.showMessageDialog(null, "Unable to Save", "Fail to guardar", JOptionPane.ERROR_MESSAGE);
					}
				}
			});
			
			cargar.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					try{
						final JFileChooser fc = new JFileChooser();
						int returnVal = fc.showOpenDialog(null);
			            if (returnVal == JFileChooser.APPROVE_OPTION) {
			            	clear();
			            	FileReader fr = new FileReader(fc.getSelectedFile());
			                BufferedReader br = new BufferedReader(fr);
			                int i = br.read();
			                while (i != -1){
			                	area.append(String.valueOf((char)i));
			                	i = br.read();
			                }
			                br.close();
			                repaint();
			            }
					} catch (Exception ee){
						JOptionPane.showMessageDialog(null, "Unable to cargar", "Fail to cargar", JOptionPane.ERROR_MESSAGE);
					}
				}
			});
			
			area.setEditable(true);
			scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED );
			scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED );
			add(label);
			add(scroller);
			add(ejecutar);
			add(cargar);
			add(guardar);
		}
	}
	
	public String cargarArchivo(File file){
		StringBuffer sb = new StringBuffer("");
		try{
			FileInputStream fis = new FileInputStream(file);
			BufferedInputStream bis = new BufferedInputStream(fis);
			int readInt = bis.read();
			while (readInt != -1){
				sb.append(String.valueOf((char)readInt));
				readInt = bis.read();
			}
			bis.close();
		} catch (Exception e){
			e.printStackTrace();
		} return sb.toString();
	}
	
	public void guardarArchivo(String s, File file){
		try{
			FileOutputStream fos = new FileOutputStream(file);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			for (int i = 0; i < s.length(); i++){
				bos.write((int)(s.charAt(i)));
			}
			bos.close();
		} catch (Exception e){
			e.printStackTrace();
		}
	}
	
	public Matrix TextoAMatriz(String text, int m){
		
		try{
			String[] firstline;
			if (m != 1) firstline= text.substring(0, text.indexOf("\n")).split(" ");
			else firstline = text.split(" ");
			int n = firstline.length;
			double[][] doubleArray = new double[m][n];
			for (int i = 0; i < m; i++){
				for (int j = 0; j < n-1; j++){
					doubleArray[i][j] = Double.parseDouble(text.substring(0, text.indexOf(" ")));
					text = text.substring(text.indexOf(" ")+1);
				}
				if (i == m-1){
					doubleArray[m-1][n-1] = Double.parseDouble(text); break;
				}
				doubleArray[i][n-1] = Double.parseDouble(text.substring(0, text.indexOf("\n")));
				text = text.substring(text.indexOf("\n")+1);
			}
			return new Matrix(doubleArray);


		} catch (NumberFormatException nfe) {
			nfe.printStackTrace();
		} catch (Exception e){
			e.printStackTrace();
		}
		return null;
	}

	public String MatrizATexto(Matrix m){
		
		StringBuffer output = new StringBuffer("");
		try{
			double[][] doubleArray = m.getArrayCopy();
			for (int i = 0; i < m.getRowDimension(); i++){
				for (int j = 0; j < m.getColumnDimension()-1; j++){
					output.append(doubleArray[i][j]+" ");
				}
				output.append(doubleArray[i][m.getColumnDimension()-1]+"\n");
			}
			
		} catch (Exception e){
			e.printStackTrace();
		}
		return output.toString();
	}

	/**
	 * @param args the command line arguments
	 */

	public static void main1() throws IOException {

		/* Set the Nimbus look and feel */
		//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
		/* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
		 * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			javax.swing.UIManager.LookAndFeelInfo[] installedLookAndFeels=javax.swing.UIManager.getInstalledLookAndFeels();
			for (int idx=0; idx<installedLookAndFeels.length; idx++)
				if ("Nimbus".equals(installedLookAndFeels[idx].getName())) {
					javax.swing.UIManager.setLookAndFeel(installedLookAndFeels[idx].getClassName());
					break;
				}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(CalculadoraDeMatrizAvanzada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(CalculadoraDeMatrizAvanzada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(CalculadoraDeMatrizAvanzada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(CalculadoraDeMatrizAvanzada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>
		//</editor-fold>
		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new CalculadoraDeMatrizAvanzada().setVisible(true);
			}
		});


	}

	public static void main2() throws IOException {
		new CalculadoraDeMatrizSimple().Interfaz();

	}
/*
	public static void main (String [] args) throws IOException {
		new CalculadoraDeMatriz().Interfaz();
		try {
			main1();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
*/
}
/*
usamos float para q sea compatible con decimales q pongas en otro caso , si pongo int no te da decimales
try y  catch son para evitar que error suceda en todo el codigo y colapse

 */