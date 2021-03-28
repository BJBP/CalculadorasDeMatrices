import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import Jama.*;

public class MatrixCalculator {

	JFrame frame = new JFrame();
	JPanel fuctionsPanel = new JPanel();
	
	JMenuBar menubar = new JMenuBar();
	JMenu infoMenu = new JMenu("Help");
	JMenuItem info = new JMenuItem("Info");
	
	JButton transpose = new JButton("Transpose");
	JButton inverse = new JButton("Inverse");
	JButton rankDet = new JButton("Rank & Det");
	JButton addition = new JButton("Addition");
	JButton subtraction = new JButton("Subtraction");
	JButton multiplication = new JButton("Multiplication");
	JButton LU = new JButton("LU Decompo");
	JButton QR = new JButton("QR Decompo");
	JButton eigen = new JButton("Eigens");
	
	MatrixInputPanel mip1, mip2;
	MatrixOutputPanel mop1 = new MatrixOutputPanel();
	MatrixOutputPanel mop2 = new MatrixOutputPanel();
	
	public void go(){
		frame.setTitle("Matrix Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mip1= new MatrixInputPanel(mip2);
		mip2 = new MatrixInputPanel(mip1);
		
		
		frame.setJMenuBar(menubar);
		menubar.add(infoMenu);
		infoMenu.add(info);
		
		info.addActionListener(new ActionListener () {
			public void actionPerformed (ActionEvent event){
				try{
					JOptionPane.showMessageDialog(null, "Matrix Calculartor V1.0\n With Jama Matrix\n GUI Designer: Ellison Gao\n@I.R.Sisyphus", "Information", JOptionPane.INFORMATION_MESSAGE);
				} catch (Exception infoe) {
					infoe.printStackTrace();
				}
			}
		});
		
		// Set Menu Finished
		
		
		// Set Button
		
		transpose.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				mip1.run.setVisible(true);
				mop1.clear();
				mop2.clear();
				mip1.kindID = 1;
				mip1.setVisible(true);
				mip2.setVisible(false);
				mop1.setVisible(true);
				mop2.setVisible(false);
				frame.repaint();
				
			}
		});
		
		inverse.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				mip1.run.setVisible(true);
				mop1.clear();
				mop2.clear();
				mip1.kindID = 2;
				mip1.setVisible(true);
				mip2.setVisible(false);
				mop1.setVisible(true);
				mop2.setVisible(false);
				frame.repaint();
				
			}
		});
		
		rankDet.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				mip1.run.setVisible(true);
				mop1.clear();
				mop2.clear();
				mip1.kindID = 3;
				mip1.setVisible(true);
				mip2.setVisible(false);
				mop1.setVisible(true);
				mop2.setVisible(false);
				frame.repaint();
				
			}
		});
		
		addition.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				mip1.run.setVisible(false);
				mop1.clear();
				mop2.clear();
				mip2.kindID = 4;
				mip1.setVisible(true);
				mip2.setVisible(true);
				mop1.setVisible(false);
				mop2.setVisible(true);
				frame.repaint();
				
			}
		});
		
		subtraction.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				mip1.run.setVisible(false);
				mop1.clear();
				mop2.clear();
				mip2.kindID = 5;
				mip1.setVisible(true);
				mip2.setVisible(true);
				mop1.setVisible(false);
				mop2.setVisible(true);
				frame.repaint();
				
			}
		});
		
		multiplication.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				mip1.run.setVisible(false);
				mop1.clear();
				mop2.clear();
				mip2.kindID = 6;
				mip1.setVisible(true);
				mip2.setVisible(true);
				mop1.setVisible(false);
				mop2.setVisible(true);
				frame.repaint();
				
			}
		});
		
		LU.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				mip1.run.setVisible(true);
				mop1.clear();
				mop2.clear();
				mip1.kindID = 7;
				mip1.setVisible(true);
				mip2.setVisible(false);
				mop1.setVisible(true);
				mop2.setVisible(true);
				frame.repaint();
				
			}
		});
		
		QR.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				mip1.run.setVisible(true);
				mop1.clear();
				mop2.clear();
				mip1.kindID = 8;
				mip1.setVisible(true);
				mip2.setVisible(false);
				mop1.setVisible(true);
				mop2.setVisible(true);
				frame.repaint();
				
			}
		});
		
		eigen.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				mip1.run.setVisible(true);
				mop1.clear();
				mop2.clear();
				mip1.kindID = 9;
				mip1.setVisible(true);
				mip2.setVisible(false);
				mop1.setVisible(true);
				mop2.setVisible(true);
				frame.repaint();
				
			}
		});
		// Set Button Finished
		
		
		frame.add(mip1);
		frame.add(mip2);
		frame.add(mop1);
		frame.add(mop2);
		mip1.setVisible(false);
		mip2.setVisible(false);
		mop1.setVisible(false);
		mop2.setVisible(false);
		mip1.setBounds(120, 5, 350, 400);
		mip2.setBounds(480, 5, 350, 400);
		mop1.setBounds(480, 5, 350, 400);
		mop2.setBounds(840, 5, 350, 400);
		
		
		fuctionsPanel.add(transpose);
		fuctionsPanel.add(inverse);
		fuctionsPanel.add(rankDet);
		fuctionsPanel.add(addition);
		fuctionsPanel.add(subtraction);
		fuctionsPanel.add(multiplication);
		fuctionsPanel.add(LU);
		fuctionsPanel.add(QR);
		fuctionsPanel.add(eigen);
		
		
		fuctionsPanel.setLayout(null); // Must declare, otherwise setBounds won't work
		transpose.setBounds(10, 15, 100, 40);
		inverse.setBounds(10, 55, 100, 40);
		rankDet.setBounds(10, 95, 100, 40);
		addition.setBounds(10, 135, 100, 40);
		subtraction.setBounds(10, 175, 100, 40);
		multiplication.setBounds(10, 215, 100, 40);
		LU.setBounds(10, 255, 100, 40);
		QR.setBounds(10, 295, 100, 40);
		eigen.setBounds(10, 335, 100, 40);
		
		frame.getContentPane().add(fuctionsPanel);
		frame.setSize(1200, 440);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setVisible(true);
	}
	
	public class MatrixOutputPanel extends JPanel{

		private static final long serialVersionUID = -1123499173411824003L;
		JLabel label = new JLabel("OUTPUT");
		JTextArea area = new JTextArea(20, 28);
		JScrollPane scroller = new JScrollPane(area);
		JButton save = new JButton("Save");
		
		void clear(){
			area.setText("");
		}
		
		MatrixOutputPanel (){
			
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
						JOptionPane.showMessageDialog(null, "Unable to Save", "Fail to save", JOptionPane.ERROR_MESSAGE);
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
	

	public class MatrixInputPanel extends JPanel{

		private static final long serialVersionUID = 8509249981100480189L;
		Matrix matrix;
		MatrixInputPanel another;
		int kindID = 0;
		JLabel label = new JLabel("INPUT");
		JTextArea area = new JTextArea(20, 28);
		JScrollPane scroller = new JScrollPane(area);
		JButton run = new JButton("Run");
		JButton load = new JButton("Load");
		JButton save = new JButton("Save");
		
		void clear(){
			area.setText("");
		}
		
		MatrixInputPanel (MatrixInputPanel mip){
			another = mip;
					
			run.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					switch (kindID){
					
						case 1: matrix = TextToMatrix(area.getText(), area.getLineCount());
								mop1.clear();
								try{
									mop1.area.append(MatrixToText(matrix.transpose()));
								} catch (Exception ee){
									mop1.area.append(ee.getLocalizedMessage());
									mop1.area.append("\nInvalid Matrix.\nMatrix should be m by n,\nentries should be separated by space,\nand there should be no extra empty lines.");
								} break;
								
						case 2: matrix = TextToMatrix(area.getText(), area.getLineCount());
								mop1.clear();
								try{
									mop1.area.append(MatrixToText(matrix.inverse()));
								} catch (Exception ee){
									mop1.area.append(ee.getLocalizedMessage());
									mop1.area.append("\nInvalid Matrix.\nMatrix should be m by n,\nentries should be separated by space,\nand there should be no extra empty lines.");
								} break;
								
						case 3: matrix = TextToMatrix(area.getText(), area.getLineCount());
								mop1.clear();
								try{
									mop1.area.append("rank =  " + String.valueOf(matrix.rank()) + "\ndet = " + String.valueOf(matrix.det()));
								} catch (Exception ee){
									mop1.area.append(ee.getLocalizedMessage());
									mop1.area.append("Invalid Matrix.\nMatrix should be m by n,\nentries should be separated by space,\nand there should be no extra empty lines.");
								} break;
						case 4: matrix = TextToMatrix(area.getText(), area.getLineCount());
								another.matrix = TextToMatrix(another.area.getText(), another.area.getLineCount());
								mop2.clear();
								try{
									mop2.area.append(MatrixToText(matrix.plus(another.matrix)));
								} catch (Exception ee){
									mop2.area.append(ee.getLocalizedMessage());
									mop2.area.append("Invalid Matrix.\nMatrix should be m by n,\nentries should be separated by space,\nand there should be no extra empty lines.");
								} break;
						case 5: matrix = TextToMatrix(area.getText(), area.getLineCount());
								another.matrix = TextToMatrix(another.area.getText(), another.area.getLineCount());
								mop2.clear();
								try{
									mop2.area.append(MatrixToText(matrix.minus(another.matrix)));
								} catch (Exception ee){
									mop2.area.append(ee.getLocalizedMessage());
									mop2.area.append("Invalid Matrix.\nMatrix should be m by n,\nentries should be separated by space,\nand there should be no extra empty lines.");
								} break;
						case 6: matrix = TextToMatrix(area.getText(), area.getLineCount());
								another.matrix = TextToMatrix(another.area.getText(), another.area.getLineCount());
								mop2.clear();
								try{
									mop2.area.append(MatrixToText(another.matrix.times(matrix)));
								} catch (Exception ee){
									mop2.area.append(ee.getLocalizedMessage());
									mop2.area.append("Invalid Matrix.\nMatrix should be m by n,\nentries should be separated by space,\nand there should be no extra empty lines.");
								} break;
						case 7: matrix = TextToMatrix(area.getText(), area.getLineCount());
								mop1.clear();
								mop2.clear();
								
								//NOTE: Consider using Gaussian Elimination rather than Pivoting.
								
								LUDecomposition lu = null;
								try{
									lu = matrix.lu();
									mop1.area.append("Pivot:");
									for (int i : lu.getPivot()){
										mop1.area.append(" "+ (i+1));
									}
									mop1.area.append("\nL:\n" + MatrixToText(lu.getL()));
								} catch (Exception ee){
									mop1.area.append(ee.getLocalizedMessage());
									mop1.area.append("Invalid Matrix.\nMatrix should be m by n,\nentries should be separated by space,\nand there should be no extra empty lines.");
								} try{
									mop2.area.append("U:\n" + MatrixToText(lu.getU()));
								} catch (Exception ee){
									mop2.area.append(ee.getLocalizedMessage());
									mop2.area.append("Invalid Matrix.\nMatrix should be m by n,\nentries should be separated by space,\nand there should be no extra empty lines.");
								} break;
						case 8: matrix = TextToMatrix(area.getText(), area.getLineCount());
								mop1.clear();
								mop2.clear();
								QRDecomposition qr = null;
								try{
									qr = matrix.qr();
									mop1.area.append("Q:\n" + MatrixToText(qr.getQ()));
								} catch (Exception ee){
									mop1.area.append(ee.getLocalizedMessage());
									mop1.area.append("Invalid Matrix.\nMatrix should be m by n,\nentries should be separated by space,\nand there should be no extra empty lines.");
								} try{
									mop2.area.append("R:\n" + MatrixToText(qr.getR()));
								} catch (Exception ee){
									mop2.area.append(ee.getLocalizedMessage());
									mop2.area.append("Invalid Matrix.\nMatrix should be m by n,\nentries should be separated by space,\nand there should be no extra empty lines.");
								} break;
						case 9: matrix = TextToMatrix(area.getText(), area.getLineCount());
							mop1.clear();
							mop2.clear();
							
							//NOTE: Sometimes D matrix is not a diagonal matrix, check it.
							
							EigenvalueDecomposition ev = null;
							try{
								ev = matrix.eig();
								mop1.area.append("Eigenvector Matrix:\n" + MatrixToText(ev.getV()) + "\n");
								mop1.area.append("Inverse of Eigenvector Matrix:\n" + MatrixToText(ev.getV().inverse()));
							} catch (Exception ee){
								mop1.area.append(ee.getLocalizedMessage());
								mop1.area.append("Invalid Matrix.\nMatrix should be m by n,\nentries should be separated by space,\nand there should be no extra empty lines.");
							} try{
								mop2.area.append("Diagonal Matrix:\n" + MatrixToText(ev.getD()));
							} catch (Exception ee){
								mop2.area.append(ee.getLocalizedMessage());
								mop2.area.append("Invalid Matrix.\nMatrix should be m by n,\nentries should be separated by space,\nand there should be no extra empty lines.");
							} break;
					}
				}
			});
			
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
						JOptionPane.showMessageDialog(null, "Unable to Save", "Fail to save", JOptionPane.ERROR_MESSAGE);
					}
				}
			});
			
			load.addActionListener(new ActionListener(){
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
						JOptionPane.showMessageDialog(null, "Unable to load", "Fail to load", JOptionPane.ERROR_MESSAGE);
					}
				}
			});
			
			area.setEditable(true);
			scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED );
			scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED );
			add(label);
			add(scroller);
			add(run);
			add(load);
			add(save);
		}
	}
	
	public String loadFile(File file){
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
	
	public void saveFile(String s, File file){
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
	
	public Matrix TextToMatrix (String text, int m){ 
		
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

	public String MatrixToText (Matrix m){ 
		
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
	
	public static void main (String [] args){
		new MatrixCalculator().go();
	}
}
