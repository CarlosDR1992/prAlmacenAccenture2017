package org.pepito.prAlmacen;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.pepito.prAlmacen.Pedido.ESTADO;
import static org.mockito.Mockito.*;

public class ListaPedidoTest {
  IAgenteDistribuidor distribuidor;
  ListaPedidos listaPedidos;
  Pedido pedido;
  
  @Before
  public void setUp() throws Exception {
    distribuidor = mock(IAgenteDistribuidor.class);
    listaPedidos = mock(ListaPedidos.class);
    pedido = mock(Pedido.class);
    when(pedido.getEstado());
    pedido = new Pedido(1);
  }

  @After
  public void tearDown() throws Exception {
    distribuidor = null;
    listaPedidos = null;
    pedido = null;
  }

  @Test
  public void siSeGeneraUnPedidoEnEspera_ElEspacioLibreDeLaListaDisminuyeEnUno() {
    when(pedido).thenReturn(1);
    
    listaPedidos.generarPedidoEnEspera();
    
  }

}
