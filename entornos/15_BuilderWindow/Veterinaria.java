package Formularios;

import java.awt.EventQueue;

import java.awt.Image;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.HashMap;
import java.util.Map;

public class Veterinaria extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textNombre;
    private JTextField textNombreDueño;
    private JTextField textEdad;
    private JCheckBox chckbxEsterilizado;
    private JComboBox<String> comboBoxAnimal; //Desplegable global para seleccionar el tipo de Animal
    private JComboBox<String> comboBoxRaza; //Desplegable global para seleccionar la raza del animal seleccionado anteriormente
    private JButton btnAnimal;

    // Imágenes de los animales
    private ImageIcon perro, gato, huron, conejo; //Variable global para las imagenes
    private Map<String, String[]> razas; //Variable global sin inicializar para las razas de los animales

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
            	Veterinaria frame = new Veterinaria();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public Veterinaria() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 497, 348);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        // Cargar imágenes de los animales
        perro = new ImageIcon(new ImageIcon("G:\\Mi unidad\\Entornos\\assets\\jpg/perro.jpg")
                .getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH));
        gato = new ImageIcon(new ImageIcon("G:\\Mi unidad\\Entornos\\assets\\jpg/gato.jpg")
                .getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH));
        huron = new ImageIcon(new ImageIcon("G:\\Mi unidad\\Entornos\\assets\\jpg/huron.jpg")
                .getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH));
        conejo = new ImageIcon(new ImageIcon("G:\\Mi unidad\\Entornos\\assets\\jpg/conejo.jpg")
                .getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH));
        
        // Inicializacion de las razas 
        razas = new HashMap<>();
        razas.put("Perro", new String[]{"Labrador", "Bulldog", "Beagle"});
        razas.put("Gato", new String[]{"Siames", "Persa", "Maine Coon"});
        razas.put("Huron", new String[]{"Europeo", "Americano", "Albino"});
        razas.put("Conejo", new String[]{"Holandes", "Cabeza de Leon", "Belier"});
        
        JLabel lblAnimal = new JLabel("Animal:");
        lblAnimal.setBounds(279, 11, 92, 34);
        contentPane.add(lblAnimal);
        comboBoxAnimal = new JComboBox<>();
        comboBoxAnimal.setModel(new DefaultComboBoxModel<>(new String[]{"Perro", "Gato", "Conejo", "Huron"}));
        comboBoxAnimal.setBounds(370, 17, 100, 22);
        contentPane.add(comboBoxAnimal);

        JLabel lblNombre = new JLabel("Nombre:");
        lblNombre.setBounds(10, 21, 70, 14);
        contentPane.add(lblNombre);
        textNombre = new JTextField();
        textNombre.setBounds(112, 18, 100, 20);
        contentPane.add(textNombre);
        textNombre.setColumns(10);

        JLabel lblNombreDueño = new JLabel("Dueño:");
        lblNombreDueño.setBounds(10, 81, 70, 14);
        contentPane.add(lblNombreDueño);
        textNombreDueño = new JTextField();
        textNombreDueño.setBounds(112, 78, 100, 20);
        contentPane.add(textNombreDueño);
        textNombreDueño.setColumns(10);

        JLabel lblEdad = new JLabel("Edad:");
        lblEdad.setBounds(10, 140, 70, 14);
        contentPane.add(lblEdad);
        textEdad = new JTextField();
        textEdad.setBounds(112, 137, 100, 20);
        contentPane.add(textEdad);
        textEdad.setColumns(10);

        JLabel lblRaza = new JLabel("Raza:");
        lblRaza.setBounds(10, 198, 70, 14);
        contentPane.add(lblRaza);   
        comboBoxRaza = new JComboBox<>();
        comboBoxRaza.setBounds(112, 194, 100, 22);
        contentPane.add(comboBoxRaza);
        actualizarRazas();

        chckbxEsterilizado = new JCheckBox("Está esterilizado");
        chckbxEsterilizado.setBounds(10, 270, 180, 23);
        contentPane.add(chckbxEsterilizado);

        btnAnimal = new JButton("");
        btnAnimal.setBounds(370, 114, 100, 101);
        contentPane.add(btnAnimal);
        
        
        //Esto sirve para actualizar la imagen y las razas segun el tipo de animal seleccionado
        comboBoxAnimal.addActionListener(e -> {
            actualizarImagenAnimal();
            actualizarRazas();
        });

        // Asignar la imagen inicial
        actualizarImagenAnimal();

        // Agregar evento para cambiar la imagen cuando se seleccione un animal en el ComboBox
        comboBoxAnimal.addActionListener(e -> actualizarImagenAnimal());

        JButton btnEnviar = new JButton("Enviar");
        btnEnviar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {              
                int edad = Integer.parseInt(textEdad.getText());
                String nombre = textNombre.getText();
                String nombreDueño = textNombreDueño.getText();
                String raza = (String) comboBoxRaza.getSelectedItem();
                String tipoAnimal = (String) comboBoxAnimal.getSelectedItem();
                boolean esterilizado = chckbxEsterilizado.isSelected();

                String mensaje = String.format(
                        "Dueño: %s\nNombre: %s\nAnimal: %s\nRaza: %s\nEdad: %d\nEsterilizado: %s",
                        nombreDueño, nombre, tipoAnimal, raza, edad, esterilizado ? "Sí" : "No"
                );

                JOptionPane.showMessageDialog(null, mensaje, "Datos ingresados", JOptionPane.INFORMATION_MESSAGE);
                
            }
        });
        btnEnviar.setBounds(342, 264, 128, 34);
        contentPane.add(btnEnviar);
    }

    
    // Método para actualizar la imagen del botón según el animal seleccionado en el ComboBox.
     
    private void actualizarImagenAnimal() {
        String tipoAnimal = (String) comboBoxAnimal.getSelectedItem();
        if (tipoAnimal.equals("Perro")) {
            btnAnimal.setIcon(perro);
        } else if (tipoAnimal.equals("Gato")) {
            btnAnimal.setIcon(gato);
        } else if (tipoAnimal.equals("Huron")) {
            btnAnimal.setIcon(huron);
        } else if (tipoAnimal.equals("Conejo")) {
            btnAnimal.setIcon(conejo);
        }
    }
    
    //Metodo para actializar las razas
    
    private void actualizarRazas() {
        comboBoxRaza.setModel(new DefaultComboBoxModel<>(razas.get(comboBoxAnimal.getSelectedItem())));
    }
}