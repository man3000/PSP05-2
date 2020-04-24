package com.psp05;

import java.io.IOException;
import java.net.Socket;

/**
 *
 * @author Manuel
 */
public class HiloDespachador extends Thread {

    private Socket socketCliente;

    public HiloDespachador(Socket socketCliente) {
        this.socketCliente = socketCliente;
    }

    @Override
    public void run() {
        try {

            System.out.println("Atendiendo al cliente ");
            ServidorHTTP.procesaPeticion(this.socketCliente);
            this.socketCliente.close();
            System.out.println("cliente atendido");
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
