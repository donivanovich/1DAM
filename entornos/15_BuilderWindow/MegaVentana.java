//MEGAVENTANA
package Formularios;

import java.awt.EventQueue;

import java.awt.Image;
import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.border.EmptyBorder;

public class MegaVentana extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField txtCambiar;
    private JTextField txtPasarOrigen;
    private JTextField txtPasarDestino;
    private JTextField txtCiudades;
    private JTextField txtNumeros;

    private ImageIcon barcelona, valencia, madrid, castilla;
    private JComboBox<String> cbCiudades;
    private JButton btnCiudades;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                MegaVentana frame = new MegaVentana();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    /**
     * Create the frame.
     */
    public MegaVentana() {
        // Cargar imágenes redimensionadas
        madrid = new ImageIcon(new ImageIcon("G:\\Mi unidad\\Entornos\\assets\\jpg/madrid.jpg")
                .getImage().getScaledInstance(90, 90, Image.SCALE_SMOOTH));
        barcelona = new ImageIcon(new ImageIcon("G:\\Mi unidad\\Entornos\\assets\\jpg/barcelona.jpg")
                .getImage().getScaledInstance(90, 90, Image.SCALE_SMOOTH));
        castilla = new ImageIcon(new ImageIcon("G:\\Mi unidad\\Entornos\\assets\\jpg/castilla.jpg")
                .getImage().getScaledInstance(90, 90, Image.SCALE_SMOOTH));
        valencia = new ImageIcon(new ImageIcon("G:\\Mi unidad\\Entornos\\assets\\jpg/valencia.jpg")
                .getImage().getScaledInstance(90, 90, Image.SCALE_SMOOTH));

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 450);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblCambiar = new JLabel("Hola");
        lblCambiar.setBounds(10, 11, 70, 20);
        contentPane.add(lblCambiar);

        JButton btnCambiar = new JButton("Cambiar");
        btnCambiar.addActionListener(e -> lblCambiar.setText(txtCambiar.getText()));
        btnCambiar.setBounds(129, 11, 90, 20);
        contentPane.add(btnCambiar);

        txtCambiar = new JTextField();
        txtCambiar.setBounds(242, 11, 90, 20);
        contentPane.add(txtCambiar);
        txtCambiar.setColumns(10);

        txtPasarOrigen = new JTextField();
        txtPasarOrigen.setColumns(10);
        txtPasarOrigen.setBounds(10, 66, 90, 20);
        contentPane.add(txtPasarOrigen);

        txtPasarDestino = new JTextField();
        txtPasarDestino.setColumns(10);
        txtPasarDestino.setBounds(242, 66, 90, 20);
        contentPane.add(txtPasarDestino);

        JButton btnPasar = new JButton("->");
        btnPasar.addActionListener(e -> {
            txtPasarDestino.setText(txtPasarOrigen.getText());
            txtPasarOrigen.setText("");
        });
        btnPasar.setBounds(129, 65, 90, 23);
        contentPane.add(btnPasar);

        btnCiudades = new JButton("");
        btnCiudades.setBounds(129, 118, 90, 90);
        contentPane.add(btnCiudades);

        // Panel para los checkboxes de color
        JPanel panel = new JPanel();
        panel.setBounds(10, 118, 90, 90);
        contentPane.add(panel);

        JCheckBox chckbxAzul = new JCheckBox("Azul");
        JCheckBox chckbxVerde = new JCheckBox("Verde");
        JCheckBox chckbxNaranja = new JCheckBox("Naranja");

        // Agrupar checkboxes para que solo se pueda seleccionar uno
        ButtonGroup group = new ButtonGroup();
        group.add(chckbxAzul);
        group.add(chckbxVerde);
        group.add(chckbxNaranja);

        panel.add(chckbxAzul);
        panel.add(chckbxVerde);
        panel.add(chckbxNaranja);

        // Evento para cambiar el color de la ventana
        ActionListener colorListener = e -> cambiarColorVentana((JCheckBox) e.getSource());
        chckbxAzul.addActionListener(colorListener);
        chckbxVerde.addActionListener(colorListener);
        chckbxNaranja.addActionListener(colorListener);

        // Panel de selección de tamaño
        JPanel panel_1 = new JPanel();
        panel_1.setBounds(242, 118, 90, 90);
        contentPane.add(panel_1);

        JCheckBox chckbx88 = new JCheckBox("800x800");
        JCheckBox chckbx17 = new JCheckBox("1200x700");
        JCheckBox chckbx18 = new JCheckBox("1200x800");

        panel_1.add(chckbx88);
        panel_1.add(chckbx17);
        panel_1.add(chckbx18);

        ButtonGroup sizeGroup = new ButtonGroup();
        sizeGroup.add(chckbx88);
        sizeGroup.add(chckbx17);
        sizeGroup.add(chckbx18);

        ActionListener sizeListener = e -> {
            if (chckbx88.isSelected()) setSize(800, 800);
            else if (chckbx17.isSelected()) setSize(1200, 700);
            else if (chckbx18.isSelected()) setSize(1200, 800);
        };

        chckbx88.addActionListener(sizeListener);
        chckbx17.addActionListener(sizeListener);
        chckbx18.addActionListener(sizeListener);

        // ComboBox para seleccionar ciudades
        cbCiudades = new JComboBox<>();
        cbCiudades.setModel(new DefaultComboBoxModel<>(new String[]{"Valencia", "Madrid", "Barcelona", "Castilla y Leon"}));
        cbCiudades.setBounds(10, 238, 90, 22);
        contentPane.add(cbCiudades);

        cbCiudades.addActionListener(e -> {
        	String ciudad = (String) cbCiudades.getSelectedItem();
        	txtCiudades.setText(ciudad);
            actualizarImagenCiudad();
        });

        txtCiudades = new JTextField();
        txtCiudades.setText("Valencia");
        txtCiudades.setColumns(10);
        txtCiudades.setBounds(129, 239, 90, 20);
        contentPane.add(txtCiudades);

        txtNumeros = new JTextField();
        txtNumeros.setColumns(10);
        txtNumeros.setBounds(129, 294, 90, 20);
        contentPane.add(txtNumeros);
        
        txtNumeros.addKeyListener(new KeyAdapter() {
            @Override // anotación en Java que indica que un método sobrescribe un método de una superclase o de una interfaz implementada.
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c)) { 
                    e.consume(); // Bloquea la entrada si no es un número
                }
            }
        });

        JLabel lblNumeros = new JLabel("Solo Numeros");
        lblNumeros.setBounds(10, 294, 90, 20);
        contentPane.add(lblNumeros);

        // Inicializar imagen del botón
        actualizarImagenCiudad();
    }

    /**
     * Método para actualizar la imagen según la ciudad seleccionada en el ComboBox
     */
    private void actualizarImagenCiudad() {
        String ciudad = (String) cbCiudades.getSelectedItem();
        if (ciudad.equals("Madrid")) {
            btnCiudades.setIcon(madrid);
        } else if (ciudad.equals("Barcelona")) {
            btnCiudades.setIcon(barcelona);
        } else if (ciudad.equals("Castilla y Leon")) {
            btnCiudades.setIcon(castilla);
        } else if (ciudad.equals("Valencia")) {
            btnCiudades.setIcon(valencia);
        }
    }

    /**
     * Método para cambiar el color de la ventana según el checkbox seleccionado
     */
    private void cambiarColorVentana(JCheckBox seleccionado) {
        Color color = switch (seleccionado.getText()) {
            case "Azul" -> Color.BLUE;
            case "Verde" -> Color.GREEN;
            case "Naranja" -> Color.ORANGE;
            default -> Color.WHITE;
        };
        contentPane.setBackground(color);
    }
}