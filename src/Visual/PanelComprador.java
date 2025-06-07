package Visual;

import Logica.*;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Clase que representa la interacción del comprador con su billetera, permite seleccionar monedas para la compra en expendedor.
 */
public class PanelComprador extends JPanel {

    public static Comprador comprador;
    private JButton toggleBilletera = new JButton("Abrir Billetera");
    private JButton recargarBilletera = new JButton("Recargar Billetera");
    private JPanel panelBilletera = new JPanel();
    private JPanel panelControles = new JPanel();
    private boolean billeteraAbierta = false;
    private JLabel text = new JLabel("Seleccione una moneda");
    private ArrayList<Moneda> monedasBilletera = new ArrayList<>();
    private ArrayList<JButton> botonesMonedas = new ArrayList<>();



    public PanelComprador() {
        PanelComprador.comprador =new Comprador();
        this.setLayout(new BorderLayout());
        this.setBackground(Color.WHITE);

        text.setFont(new Font("Arial", Font.BOLD, 16));
        text.setHorizontalAlignment(SwingConstants.CENTER);
       text.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));

        acBotones();

        panelBilletera.setLayout(new GridLayout(10,10));
        panelBilletera.setBackground(Color.LIGHT_GRAY);
        panelBilletera.setVisible(false);

        panelControles.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        panelControles.add(toggleBilletera);
        panelControles.add(recargarBilletera);

        recargarBilletera();

        add(text, BorderLayout.NORTH);
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

    /**
     * metodo para recargar la billetera con una cantidad de monedas determinada, en este caso, dos monedas de 500 y dos billetes de 1000.
     */
    private void recargarBilletera() {
        //quiero que mi monedero comience con cierta cantidad de dinero
        agregarMoneda(new Moneda500());
        agregarMoneda(new Moneda500());
        agregarMoneda(new Moneda1000());
        agregarMoneda(new Moneda1000());
        acBilletera();
    }

    /**
     * añade una moneda a la billetera
     * @param moneda se refiere a la moneda a añadir.
     */
    private void agregarMoneda(Moneda moneda) {
       comprador.getBilletera().add(moneda);
    }

    /**
     * actualiza la billetera ordenando las monedas y recreando los botones que corresponden.
     */
    public void acBilletera() {
        panelBilletera.removeAll();
        botonesMonedas.clear();
        Collections.sort(comprador.getBilletera());

        for (Moneda moneda : (comprador.getBilletera())) {

            JButton botonMoneda = crearMoneda(moneda);
            panelBilletera.add(botonMoneda);
            botonesMonedas.add(botonMoneda);
        }

        panelBilletera.revalidate();
        panelBilletera.repaint();
    }

    /**
     * este metodo crea un boton para representar visualmente una moneda clickeable.
     * @param moneda moneda clickeable.
     * @return retorna el boton con las caracteristicas necesarias para representar visualmente la moneda.
     */
    private JButton crearMoneda(Moneda moneda) {
        JButton botonMoneda = new JButton();
        botonMoneda.setPreferredSize(new Dimension(80, 80));
        ImageIcon icono = getIcon(moneda.getValor());
        botonMoneda.setIcon(new ImageIcon(icono.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH)));
        botonMoneda.setText("$" + moneda.getValor());
        botonMoneda.setVerticalTextPosition(SwingConstants.BOTTOM);
        botonMoneda.setHorizontalTextPosition(SwingConstants.CENTER);
        botonMoneda.setBackground(Color.LIGHT_GRAY);
        botonMoneda.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        botonMoneda.addActionListener(e -> {
           comprador.setMonedaSelecc(moneda);
            text.setText("Seleccionado: " + moneda.getSerie());
            botonMoneda.setVisible(true);
        });

        return botonMoneda;
    }

    /**
     * metodo para obtener el icono png de cierta moneda dependiendo de su valor
     * @param valor valor de la monera (100,500,1000)
     * @return retorna la ruta especifica del tipo de moneda.
     */
    private ImageIcon getIcon(int valor) {
            String ruta = "resources/imagenes/moneda" + valor + ".png";
            return new ImageIcon(ruta);
    }

    /**
     * metodo que permite el abrir y cerrar la billetera.
     * cambia el texto del boton dependiendo de la condicion de la billetera.
     */
    private void toggleBilletera() {
        billeteraAbierta = !billeteraAbierta;
        panelBilletera.setVisible(billeteraAbierta);
        toggleBilletera.setText(billeteraAbierta ? "Cerrar Billetera" : "Abrir Billetera");
    }

    /**
     * metodo para obtener un arraylist con las monedas que están en la billetera
     * @return lista de monedas en la billetera.
     */
    public ArrayList<Moneda> getMonedasBilletera() {
        return monedasBilletera;
    }



    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(0, 0, getWidth(), getHeight());
    }

    /**
     * remueve la moneda seleccionada en la billetera, la actualiza luego de removerla.
     */
    public void removerMonedaSelecc(){

        if(comprador.getMonedaSeleccionada()!=null){
            comprador.getBilletera().remove(comprador.getMonedaSeleccionada());
            comprador.setMonedaSelecc(null);
            acBilletera();
        }
    }
}