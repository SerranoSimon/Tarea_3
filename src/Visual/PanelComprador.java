package Visual;

import Logica.Moneda;
import Logica.Moneda100;
import Logica.Moneda500;
import Logica.Moneda1000;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class PanelComprador extends JPanel {
    private JButton toggleBilletera = new JButton("Abrir Billetera");
    private JButton recargarBilletera = new JButton("Recargar Billetera");
    private JPanel panelBilletera = new JPanel();
    private JPanel panelControles = new JPanel();
    private boolean billeteraAbierta = false;
    private JLabel contador = new JLabel("Seleccione una moneda");
    private List<Moneda> monedasBilletera = new ArrayList<>();
    private List<JButton> botonesMonedas = new ArrayList<>();
    private Moneda monedaSeleccionada = null;

    public PanelComprador() {
        this.setLayout(new BorderLayout());
        this.setBackground(Color.WHITE);

        contador.setFont(new Font("Arial", Font.BOLD, 16));
        contador.setHorizontalAlignment(SwingConstants.CENTER);
        contador.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));

        acBotones();

        panelBilletera.setLayout(new GridLayout(0, 4, 5, 5));
        panelBilletera.setBackground(new Color(230, 230, 250));
        panelBilletera.setVisible(false);

        panelControles.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        panelControles.add(toggleBilletera);
        panelControles.add(recargarBilletera);

        recargarBilletera();

        add(contador, BorderLayout.NORTH);
        add(panelBilletera, BorderLayout.CENTER);
        add(panelControles, BorderLayout.SOUTH);
    }

    private void acBotones() {

        toggleBilletera.setFont(new Font("Arial", Font.BOLD, 14));
        toggleBilletera.setBackground(new Color(240, 240, 240));
        toggleBilletera.addActionListener(e -> toggleBilletera());


        recargarBilletera.setFont(new Font("Arial", Font.BOLD, 14));
        recargarBilletera.setBackground(new Color(200, 255, 200));
        recargarBilletera.addActionListener(e -> recargarBilletera());
    }

    private void recargarBilletera() {
        //quiero que mi monedero comience con cierta cantidad de dinero
        agregarMoneda(new Moneda100());
        agregarMoneda(new Moneda100());
        agregarMoneda(new Moneda500());
        agregarMoneda(new Moneda500());
        agregarMoneda(new Moneda1000());
        acBilletera();
    }

    private void agregarMoneda(Moneda moneda) {
        monedasBilletera.add(moneda);
    }

    private void acBilletera() {
        panelBilletera.removeAll();
        botonesMonedas.clear();

        for (Moneda moneda : monedasBilletera) {
            JButton botonMoneda = crearMoneda(moneda);
            panelBilletera.add(botonMoneda);
            botonesMonedas.add(botonMoneda);
        }

        panelBilletera.revalidate();
        panelBilletera.repaint();
    }

    private JButton crearMoneda(Moneda moneda) {
        JButton botonMoneda = new JButton();
        botonMoneda.setPreferredSize(new Dimension(80, 80));
        ImageIcon icono = getIcon(moneda.getValor());
        botonMoneda.setIcon(new ImageIcon(icono.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH)));
        botonMoneda.setText("$" + moneda.getValor());
        botonMoneda.setVerticalTextPosition(SwingConstants.BOTTOM);
        botonMoneda.setHorizontalTextPosition(SwingConstants.CENTER);
        botonMoneda.setBackground(Color.WHITE);
        botonMoneda.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        botonMoneda.addActionListener(e -> {
            monedaSeleccionada = moneda;
            contador.setText("Seleccionado: " + moneda.getSerie());
            botonMoneda.setVisible(false);
        });

        return botonMoneda;
    }

    private ImageIcon getIcon(int valor) {
            String ruta = "resources/imagenes/moneda" + valor + ".png";
            return new ImageIcon(ruta);
    }

    private void toggleBilletera() {
        billeteraAbierta = !billeteraAbierta;
        panelBilletera.setVisible(billeteraAbierta);
        toggleBilletera.setText(billeteraAbierta ? "Cerrar Billetera" : "Abrir Billetera");
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(0, 0, getWidth(), getHeight());
    }

    public Moneda getMonedaSeleccionada() {
        return monedaSeleccionada;
    }
}