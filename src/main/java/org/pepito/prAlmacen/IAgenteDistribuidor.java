package org.pepito.prAlmacen;

public interface IAgenteDistribuidor {

    boolean hayAgenteDisponible();

    void solicitarAgente();

    void liberarAgente();
}
