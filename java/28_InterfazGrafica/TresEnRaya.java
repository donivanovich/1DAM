package InterfazGrafica;

import java.awt.EventQueue;



import javax.swing.border.EmptyBorder;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.*;

public class TresEnRaya extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private int opc = 0;
	private int mapa[][];
	private int tablero[];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TresEnRaya frame = new TresEnRaya();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TresEnRaya() {
		int i, j;
		mapa = new int[3][3]; 
		int tablero[] = new int[9];
		for(i=0; i<3; i++) {
			for(j=0; j<3; j++) {
				mapa[i][j] = -1;
			}
		}
		for(i=0; i<9; i++) {
			tablero[i] = 0;
		}
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ImageIcon x = new ImageIcon(new ImageIcon("G:\\Mi unidad\\Entornos\\assets\\png/x.png")
                .getImage().getScaledInstance(135, 135, Image.SCALE_SMOOTH));
		ImageIcon o = new ImageIcon(new ImageIcon("G:\\Mi unidad\\Entornos\\assets\\png/o.png")
                .getImage().getScaledInstance(135, 135, Image.SCALE_SMOOTH));
		
		JButton btn1 = new JButton();
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tablero[0] == 0) {
					tablero[0] = 1;
					if(opc == 0) {
						btn1.setIcon(x);
						opc = 1;
						mapa[0][0] = 1;
					} else if (opc == 1) {
						btn1.setIcon(o);
						opc = 0;
						mapa[0][0] = 0;
					}
					
				}
				
				verificar();
			}
		});
		btn1.setBounds(10, 11, 135, 135);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton();
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tablero[1] == 0) {
					tablero[1] = 1;
					if(opc == 0) {
						btn2.setIcon(x);
						opc = 1;
						mapa[0][1] = 1;
					} else if (opc == 1) {
						btn2.setIcon(o);
						opc = 0;
						mapa[0][1] = 0;
					}
				}
				verificar();
			}
		});
		btn2.setBounds(173, 11, 135, 135);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton();
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tablero[2] == 0) {
					tablero[2] = 1;
					if(opc == 0) {
						btn3.setIcon(x);
						opc = 1;
						mapa[0][2] = 1;
					} else if (opc == 1) {
						btn3.setIcon(o);
						opc = 0;
						mapa[0][2] = 0;
					}
				}
				verificar();
			}
		});
		btn3.setBounds(339, 11, 135, 135);
		contentPane.add(btn3);
		
		JButton btn4 = new JButton();
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tablero[3] == 0) {
					tablero[3] = 1;
					if(opc == 0) {
						btn4.setIcon(x);
						opc = 1;
						mapa[1][0] = 1;
					} else if (opc == 1) {
						btn4.setIcon(o);
						opc = 0;
						mapa[1][0] = 0;
					}
				}
				verificar();
			}
		});
		btn4.setBounds(10, 157, 135, 135);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton();
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tablero[4] == 0) {
					tablero[4] = 1;
					if(opc == 0) {
						btn5.setIcon(x);
						opc = 1;
						mapa[1][1] = 1;
					} else if (opc == 1) {
						btn5.setIcon(o);
						opc = 0;
						mapa[1][1] = 0;
					}
				}
				verificar();
			}
		});
		btn5.setBounds(173, 157, 135, 135);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton();
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tablero[5] == 0) {
					tablero[5] = 1;
					if(opc == 0) {
						btn6.setIcon(x);
						opc = 1;
						mapa[1][2] = 1;
					} else if (opc == 1) {
						btn6.setIcon(o);
						opc = 0;
						mapa[1][2] = 0;
					}
				}
				verificar();
			}
		});
		btn6.setBounds(339, 157, 135, 135);
		contentPane.add(btn6);
		
		JButton btn7 = new JButton();
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tablero[6] == 0) {
					tablero[6] = 1;
					if(opc == 0) {
						btn7.setIcon(x);
						opc = 1;
						mapa[2][0] = 1;
					} else if (opc == 1) {
						btn7.setIcon(o);
						opc = 0;
						mapa[2][0] = 0;
					}
				}
				verificar();
			}
		});
		btn7.setBounds(10, 315, 135, 135);
		contentPane.add(btn7);
		
		JButton btn8 = new JButton();
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tablero[7] == 0) {
					tablero[7] = 1;
					if(opc == 0) {
						btn8.setIcon(x);
						opc = 1;
						mapa[2][1] = 1;
					} else if (opc == 1) {
						btn8.setIcon(o);
						opc = 0;
						mapa[2][1] = 0;
					}
				}
				verificar();
			}
		});
		btn8.setBounds(173, 315, 135, 135);
		contentPane.add(btn8);
		
		JButton btn9 = new JButton();
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tablero[8] == 0) {
					tablero[8] = 1;
					if(opc == 0) {
						btn9.setIcon(x);
						opc = 1;
						mapa[2][2] = 1;
					} else if (opc == 1) {
						btn9.setIcon(o);
						opc = 0;
						mapa[2][2] = 0;
					}
				}
				verificar();
			}
		});
		btn9.setBounds(339, 315, 135, 135);
		contentPane.add(btn9);
		
	}
	
	private void verificar() {
		boolean ganaJ1 = false;
	    boolean ganaJ2 = false;
	    
	    System.out.println("Verificando estado del tablero...");
	    for (int i = 0; i < 3; i++) {
	        for (int j = 0; j < 3; j++) {
	            System.out.print(mapa[i][j] + " ");
	        }
	        System.out.println();
	    }
		
		if ((mapa[0][0] == 0 && mapa[1][1] == 0 && mapa[2][2] == 0) || 
	        (mapa[0][2] == 0 && mapa[1][1] == 0 && mapa[2][0] == 0) || 
	        (mapa[0][0] == 0 && mapa[1][0] == 0 && mapa[2][0] == 0) || 
	        (mapa[0][1] == 0 && mapa[1][1] == 0 && mapa[2][1] == 0) || 
	        (mapa[0][2] == 0 && mapa[1][2] == 0 && mapa[2][2] == 0) ||
	        (mapa[0][0] == 0 && mapa[0][1] == 0 && mapa[0][2] == 0) ||
	        (mapa[1][0] == 0 && mapa[1][1] == 0 && mapa[1][2] == 0) || 
	        (mapa[2][0] == 0 && mapa[2][1] == 0 && mapa[2][2] == 0))  
	    {
	        ganaJ1 = true;
	    }

	    if ((mapa[0][0] == 1 && mapa[1][1] == 1 && mapa[2][2] == 1) ||
	        (mapa[0][2] == 1 && mapa[1][1] == 1 && mapa[2][0] == 1) ||
	        (mapa[0][0] == 1 && mapa[1][0] == 1 && mapa[2][0] == 1) ||
	        (mapa[0][1] == 1 && mapa[1][1] == 1 && mapa[2][1] == 1) ||
	        (mapa[0][2] == 1 && mapa[1][2] == 1 && mapa[2][2] == 1) ||
	        (mapa[0][0] == 1 && mapa[0][1] == 1 && mapa[0][2] == 1) ||
	        (mapa[1][0] == 1 && mapa[1][1] == 1 && mapa[1][2] == 1) ||
	        (mapa[2][0] == 1 && mapa[2][1] == 1 && mapa[2][2] == 1))
	    {
	        ganaJ2 = true;
	    }

	    if (ganaJ1) {
	        JOptionPane.showMessageDialog(null, "Ha ganado el Jugador 1 (O)", "Resultado", JOptionPane.INFORMATION_MESSAGE);
	        return;
	    } else if (ganaJ2) {
	        JOptionPane.showMessageDialog(null, "Ha ganado el Jugador 2 (X)", "Resultado", JOptionPane.INFORMATION_MESSAGE);
	        return;
	    } else if(mapa[0][0] != -1 && mapa[0][1] != -1 && mapa[0][2] != -1 &&
	       mapa[1][0] != -1 && mapa[1][1] != -1 && mapa[1][2] != -1 &&
	       mapa[1][0] != -1 && mapa[1][1] != -1 && mapa[1][2] != -1) {
	    	JOptionPane.showMessageDialog(null, "Empate", "Resultado", JOptionPane.INFORMATION_MESSAGE);
	        return;
	    }
	}
}