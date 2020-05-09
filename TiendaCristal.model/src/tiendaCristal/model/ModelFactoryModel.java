package tiendaCristal.model;

import tiendacristal.ModelFactory;
import tiendacristal.TiendacristalFactory;
import tiendacristal.domain.Domain;
import tiendacristal.domain.DomainFactory;
import tiendacristal.ui.UI;
import tiendacristal.ui.UiFactory;
import tiendacristal.ui.contenedorcrudclientes.ContenedorCRUDClienteViewModel;
import tiendacristal.ui.contenedorcrudpedido.ContenedorCRUDPedidoViewModel;
import tiendacristal.ui.contenedorcrudproductos.ContenedorCRUDProductosViewModel;
import tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorCRUDCompraViewModel;


public class ModelFactoryModel {

	// ------------------------------ Singleton
	// ------------------------------------------------
	// Clase estatica oculta. Tan solo se instanciara el singleton una vez
	private static class SingletonHolder {
		// El constructor de Singleton puede ser llamado desde aquí al ser protected
		private final static ModelFactoryModel eINSTANCE = new ModelFactoryModel();
	}

	// Método para obtener la instancia de nuestra clase
	public static ModelFactoryModel getInstance() {
		return SingletonHolder.eINSTANCE;
	}

	// ------------------------------ Singleton
	// ------------------------------------------------
	ModelFactory modelFactory = TiendacristalFactory.eINSTANCE.createModelFactory();

	public ModelFactoryModel() {
		// TODO Auto-generated constructor stub
		UI ui = null;
		Domain domain = null;
		ModelFactory tempModelFactory = modelFactory;
		modelFactory = modelFactory.cargar();
		if (modelFactory == null) {
			modelFactory = tempModelFactory;
		}
		
			modelFactory.implementarModelo();
		
	}

	public Domain getDomain() {
		// retorna el dominio
		return modelFactory.getTheDomain();
	}

	public UI getUi() {
		
		return modelFactory.getTheUI();
		
	}
	
	public void guardar() {
		modelFactory.guardar();
	}

	public void cargar() {
		
		modelFactory.cargar();
	}
	
	public ContenedorCRUDProductosViewModel getTheContenedorCRUDProductosViewModel() {
		
		return modelFactory.getTheUI().getTheContenedorCRUDProductosViewModel();
	}
	
	public ContenedorCRUDClienteViewModel getTheContenedorCRUDClienteViewModel() {
		
		return modelFactory.getTheUI().getTheContenedorCRUDClienteViewModel();
		
	}
	
	public ContenedorCRUDCompraViewModel getTheContenedorCRUDRealizarCompraViewModel() {
		
		return modelFactory.getTheUI().getTheContenedorCRUDRealizarCompraViewModel();
		
	}
	
	public ContenedorCRUDPedidoViewModel getTheContenedorCRUDPedidoViewModel() {
		
		return modelFactory.getTheUI().getTheContenedorCRUDPedidoViewModel();
				
	}
	
}
