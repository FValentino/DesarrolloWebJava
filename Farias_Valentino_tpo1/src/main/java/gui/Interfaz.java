package gui;

import javax.swing.JOptionPane;

public class Interfaz extends javax.swing.JFrame {
    
    private String [] vNombre = new String [10];
    private String [] vApellido = new String [10];
    private String [] vTelefono = new String [10];
    private String [] vDni = new String [10];
    private String [] vDireccion = new String [10];
    private String [] vFecha = new String [10];
    
    private int indiceActual;
    
    //Con estas variables se verifica que a la hora de guardar los datos, estos sean correctos
    private boolean correctoTel = true;
    private boolean correctoDni = true;
    private boolean correctoFecha = true;
    
    public Interfaz() {
        initComponents();
        
        for (int i=0; i<10; i++){
            vNombre[i]="";
            vApellido[i]="";
            vTelefono[i]="";
            vDni[i]="";
            vDireccion[i]="";
            vFecha[i]="";
        }
        
        this.setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ingresoNombre = new javax.swing.JTextField();
        ingresoApellido = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ingresoTelefono = new javax.swing.JTextField();
        ingresoDNI = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ingresoDireccion = new javax.swing.JTextField();
        ingresoFecha = new javax.swing.JTextField();
        guardar = new javax.swing.JButton();
        sgte = new javax.swing.JButton();
        ant = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        indice = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(41, 49, 51));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(218, 206, 192));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("AGENDA ELECTRONICA");
        jLabel9.setToolTipText("");
        jLabel9.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("NOMBRE");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("APELLIDO");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("TELEFONO");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DNI");

        ingresoTelefono.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                ingresoTelefonoFocusLost(evt);
            }
        });
        ingresoTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ingresoTelefonoKeyTyped(evt);
            }
        });

        ingresoDNI.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                ingresoDNIFocusLost(evt);
            }
        });
        ingresoDNI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ingresoDNIKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("DIRECCION");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("FECHA DE NACIMIENTO");

        ingresoFecha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ingresoFecha.setText("DD/MM/AAAA");
        ingresoFecha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                ingresoFechaFocusLost(evt);
            }
        });
        ingresoFecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ingresoFechaKeyTyped(evt);
            }
        });

        guardar.setText("GUARDAR");
        guardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guardarMouseClicked(evt);
            }
        });

        sgte.setText(">>>");
        sgte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sgteMouseClicked(evt);
            }
        });

        ant.setText("<<<");
        ant.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                antMouseClicked(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("INDICE");

        indice.setEditable(false);
        indice.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        indice.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ingresoNombre)
                            .addComponent(ingresoTelefono)
                            .addComponent(ingresoDireccion, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ingresoApellido)
                            .addComponent(ingresoDNI)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ingresoFecha, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ant)
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(indice, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(guardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                        .addComponent(sgte)))
                .addGap(0, 76, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel9)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ingresoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ingresoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ingresoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ingresoDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ingresoDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ingresoFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardar)
                    .addComponent(sgte)
                    .addComponent(ant))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(indice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ingresoTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ingresoTelefonoKeyTyped
        
        /*
            Cada vez que se llama al metodo (cuando se presiona una tecla), se almacena en una variable
        el largo del texto en ese momento y la tecla presionada
        */
        
        int largo = ingresoTelefono.getText().length(); //largo del texto 
        char ingreso = evt.getKeyChar(); //Tecla presionada
        
        /*
            Si al presionar la tecla, esta es distinta a un numero o si el largo del texto en ese momento
        es mayor o igual a 10, se rechaza la tecla presionada
        */
        if ( (largo>=10) || (ingreso<'0'||ingreso>'9') ){
            
            evt.consume();
        } 
    }//GEN-LAST:event_ingresoTelefonoKeyTyped
        
    private void ingresoDNIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ingresoDNIKeyTyped
        
        /*
            Cada vez que se llama al metodo (cuando se presiona una tecla), se almacena en una variable
        el largo del texto en ese momento y la tecla presionada
        */
        
        int largo = ingresoDNI.getText().length(); //largo del texto
        char ingreso = evt.getKeyChar(); //Tecla presionada
        
        /*
            Control de input:
                Como maximo solo 8 caracteres 
                Solo se permiten caracteres numericos 
        */
        
        if ( (largo>=8) || (ingreso<'0'||ingreso>'9') ){
            
            evt.consume();
        } 
        
    }//GEN-LAST:event_ingresoDNIKeyTyped

    private void ingresoFechaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ingresoFechaKeyTyped
        
        /*
            Cada vez que se llama al metodo (cuando se presiona una tecla), se almacena en una variable
        el largo del texto en ese momento y la tecla presionada
        */
        
        int largo = ingresoFecha.getText().length(); //largo del texto
        char ingreso = evt.getKeyChar(); //Tecla presionada
        
        /*
            Control de input:
                Como maximo solo 10 caracteres (8 corresponden a la fecha y 2 son "/")
                Solo se permiten caracteres numericos y '/'
        */
        if ( (largo>=10) || (ingreso<'/'||ingreso>'9') ){
            
            evt.consume();
        } 
    }//GEN-LAST:event_ingresoFechaKeyTyped

    private void antMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_antMouseClicked
        
        /*
            Al hacer click en el boton de atras se actualiza el indice y 
        muestra los datos de los arreglos
        */
        
        //Obtengo el indice actual
        indiceActual = Integer.parseInt(indice.getText());

        //Actualizo y controlo que el indice no sea menor a 0
        if (indiceActual > 0){

            indiceActual = indiceActual - 1;
        }

        //muestro los datos cada vez que se pasa el indice
        ingresoNombre.setText(vNombre[indiceActual]);
        ingresoApellido.setText(vApellido[indiceActual]);
        ingresoTelefono.setText(vTelefono[indiceActual]);
        ingresoDNI.setText(vDni[indiceActual]);
        ingresoDireccion.setText(vDireccion[indiceActual]);
        
        //En caso de que no se halla ingresado una fecha, el campo queda en blanco
        if ( vNombre[indiceActual].equals("") ){ 
            ingresoFecha.setText("DD/MM/AAAA");
        }
        else{
            ingresoFecha.setText(vFecha[indiceActual]);
        }

        //Muestro el indice actual
        indice.setText(Integer.toString(indiceActual));
    }//GEN-LAST:event_antMouseClicked

    private void sgteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sgteMouseClicked
        
        /*
            Al hacer click en el boton de siguiente se actualiza el indice y 
        muestra los datos de los arreglos
        */
        
        //Obtengo el indice actual
        indiceActual = Integer.parseInt(indice.getText());
        
        //actualizo y controlo que el indice no pase de 9
        if (indiceActual<9){

            indiceActual = indiceActual + 1;
        }

        //muestro los datos cada vez que se pasa el indice
        ingresoNombre.setText(vNombre[indiceActual]);
        ingresoApellido.setText(vApellido[indiceActual]);
        ingresoTelefono.setText(vTelefono[indiceActual]);
        ingresoDNI.setText(vDni[indiceActual]);
        ingresoDireccion.setText(vDireccion[indiceActual]);
        
        /*
            En caso de que no se detecte un nombre ingresado, el campo fecha
        tendra DD/MM/AAAA mostrando el formato en que se debe ingresar
        */
        if ( vNombre[indiceActual].equals("") ){
            ingresoFecha.setText("DD/MM/AAAA");
        }
        else{
            ingresoFecha.setText(vFecha[indiceActual]);
        }
        
        //muestro el indice actual
        indice.setText(Integer.toString(indiceActual));
    }//GEN-LAST:event_sgteMouseClicked
    
    private void guardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarMouseClicked
        
        /*
            Al hacer click en el boton de guardar se almacenan los datos ingresados
        en cada campo en sus respectivos arreglos, para que esto ocurra se solicita
        que como minimo se ingrese un nombre y un telefono
        */
        
        //Obtengo el indice
        indiceActual = Integer.parseInt(indice.getText());

        //Obtengo los valores ingresados
        String nombre = ingresoNombre.getText();
        String apellido = ingresoApellido.getText();
        String telefono = ingresoTelefono.getText();
        String dni = ingresoDNI.getText();
        String direccion = ingresoDireccion.getText();
        String fecha = ingresoFecha.getText();
        
        //Verificacion de datos y almacenamiento de los mismos en los vectores

        if ( (nombre.equals("")) || (telefono.equals("")) ){
            JOptionPane.showMessageDialog(null, "Como minimo se debe ingresar un nombre y un telefono");
        }
        else{
            if (correctoDni && correctoTel && correctoFecha){
                vNombre[indiceActual] = nombre;
                vApellido[indiceActual] = apellido;
                vTelefono[indiceActual] = telefono;
                vDni[indiceActual] = dni;
                vDireccion[indiceActual] = direccion;   
                if (fecha.equals("DD/MM/AAAA")){ //por si no se ingresa una fecha
                    fecha = "";
                }
                vFecha[indiceActual] = fecha;
            }
            else{
                JOptionPane.showMessageDialog(null, "Alguno de los datos no se ingresode forma correcta");
            }
        }
    }//GEN-LAST:event_guardarMouseClicked

    private void ingresoTelefonoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ingresoTelefonoFocusLost
        
        /*
            Si al perder el foco, se verifica que el se intento ingresar algo (el campo no esta vacio)
        y se lo hizo de forma incompleta, notifica al usuario.
            En caso de que no se arregle, la variable 'CorrectoTel' no cambiara de valor
        y no permitira guardar los datos
        */
        if ( !(ingresoTelefono.getText().equals("")) ){
            
            if ( (ingresoTelefono.getText().length() < 10)){
                JOptionPane.showMessageDialog(null, "Faltan digitos en el numero de telefono");
                correctoTel = false;
            }
            else{
                correctoTel = true;
            }
        }
    }//GEN-LAST:event_ingresoTelefonoFocusLost

    private void ingresoDNIFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ingresoDNIFocusLost
        
        /*
            Si al perder el foco, se verifica que el se intento ingresar algo (el campo no esta vacio)
        y se lo hizo de forma incompleta, notifica al usuario.
            En caso de que no se arregle, la variable 'CorrectoDNI' no cambiara de valor
        y no permitira guardar los datos
        */
        
        if ( !(ingresoDNI.getText().equals("")) ){
            if ( (ingresoDNI.getText().length() < 8) ){
                JOptionPane.showMessageDialog(null, "Faltan digitos en el DNI");
                correctoDni = false;
            }
            else{
                correctoDni = true;
            }
        }
    }//GEN-LAST:event_ingresoDNIFocusLost

    private void ingresoFechaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ingresoFechaFocusLost
        
        /*
            Si al perder el foco, se verifica que el se intento ingresar algo (el campo no esta vacio)
        y se lo hizo de forma incompleta, notifica al usuario. En caso de que no se arregle, 
        la variable 'CorrectoFecha' no cambiara de valor y no permitira guardar los datos.
        
            En caso de que se hallan ingresado la cantidad de caracteres esperados
        se realizara un control para saber si la fecha ingresada es correcta (si la fecha existe)
        */
        
        //Arreglo de caracteres con la fecha, para poder manipular los datos
        char [] cFecha = ingresoFecha.getText().toCharArray();
        
        //Dia, Mes y Año
        String dia;
        String mes;
        String anio;
        
        if ( !(ingresoTelefono.getText().equals("")) ){
            
            if ( (ingresoFecha.getText().length() < 10) ){
                JOptionPane.showMessageDialog(null, "Faltan digitos en la fecha, recuerde que el formato es 'DD/MM/AAAA'");
                correctoFecha = false;
                ingresoFecha.setText("");
            }
            else{
                correctoFecha = true;
                dia = String.valueOf(cFecha[0]) + String.valueOf(cFecha[1]);
                mes = String.valueOf(cFecha[3]) + String.valueOf(cFecha[4]);
                anio = String.valueOf(cFecha[6]) + String.valueOf(cFecha[7]) + String.valueOf(cFecha[8]) + String.valueOf(cFecha[9]);

                //Se ingresaron dias que no existen
                if ( (Integer.parseInt(dia)>31) || (Integer.parseInt(mes)>12) || (Integer.parseInt(anio)>2021) ){ 
                    correctoFecha = false;
                }
                else{
                    if ((Integer.parseInt(mes)==2)){
                        if ( Integer.parseInt(anio)%4!=0 )  {
                            if (Integer.parseInt(dia)>28){
                                correctoFecha = false;
                            }
                        }
                        else{
                            if (Integer.parseInt(dia)>29){
                                correctoFecha = false;
                            }
                        }
                    }
                    else{
                        if ( Integer.parseInt(mes)<7 ){
                            if ( (Integer.parseInt(mes)%2==0) && (Integer.parseInt(dia)==31) ){
                                correctoFecha = false;
                            }        
                        }
                        else{
                            if ( (Integer.parseInt(mes)%2!=0) && (Integer.parseInt(dia)==31) ){
                                correctoFecha = false;
                            }
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_ingresoFechaFocusLost

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ant;
    private javax.swing.JButton guardar;
    private javax.swing.JTextField indice;
    private javax.swing.JTextField ingresoApellido;
    private javax.swing.JTextField ingresoDNI;
    private javax.swing.JTextField ingresoDireccion;
    private javax.swing.JTextField ingresoFecha;
    private javax.swing.JTextField ingresoNombre;
    private javax.swing.JTextField ingresoTelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton sgte;
    // End of variables declaration//GEN-END:variables
}
