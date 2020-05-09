package views;

import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CBanner;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Table;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.wb.swt.SWTResourceManager;

import tiendaCristal.model.ModelFactoryModel;
import tiendacristal.domain.Domain;
import tiendacristal.domain.Producto;
import tiendacristal.ui.UI;
import tiendacristal.ui.contenedorcrudclientes.ContenedorDetalleClienteViewModel;
import tiendacristal.ui.contenedorcrudclientes.ContenedorMaestroClienteViewModel;
import tiendacristal.ui.contenedorcrudpedido.ContenedorCRUDPedidoViewModel;
import tiendacristal.ui.contenedorcrudpedido.ContenedorDetallePedidoViewModel;
import tiendacristal.ui.contenedorcrudpedido.ContenedorMaestroPedidoViewModel;
import tiendacristal.ui.contenedorcrudproductos.ContenedorCRUDProductosViewModel;
import tiendacristal.ui.contenedorcrudproductos.ContenedorMestroProductosViewModel;

import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

import javax.swing.JOptionPane;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.jface.databinding.viewers.ObservableListContentProvider;
import org.eclipse.core.databinding.observable.map.IObservableMap;
import org.eclipse.emf.databinding.EMFObservables;
import org.eclipse.emf.ecore.EStructuralFeature;
import tiendacristal.ui.contenedorcrudclientes.ContenedorcrudclientesPackage.Literals;
import org.eclipse.jface.databinding.viewers.ObservableMapLabelProvider;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.Realm;
import tiendacristal.ui.contenedorcrudproductos.ContenedorcrudproductosPackage;

import tiendacristal.ui.contenedorcrudpedido.ContenedorcrudpedidoPackage;
import tiendacristal.ui.contenedorcrudpedido.ProductoComprarViewModel;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.jface.databinding.swt.WidgetProperties;

public class CRUDCrearPedido extends ViewPart {
	private DataBindingContext m_bindingContext;

	ModelFactoryModel mfm;
	UI ui;
	Domain domain;

	ContenedorCRUDPedidoViewModel contenedorCRUDPedidoViewModel;
	ContenedorCRUDProductosViewModel contenedorCRUDProductosViewModel;
	ContenedorDetallePedidoViewModel contenedorDetallePedidoViewModel;
	ContenedorMaestroPedidoViewModel contenedorMaestroPedidoViewModel;
	ContenedorMestroProductosViewModel contenedorMestroProductosViewModel;
	ContenedorMaestroClienteViewModel contenedorMaestroClienteViewModel;
	//ProductosViewModel productosViewModel;
	

	public static final String ID = "views.CRUDCrearPedido"; //$NON-NLS-1$
	private final FormToolkit toolkit = new FormToolkit(Display.getCurrent());
	private Table table;
	private Text txtCodigo;
	private Text txtFecha;
	private ComboViewer comboViewer;
	private ComboViewer comboViewer_1;
	private TableViewer tableViewer;
	Combo cboCliente;

	public CRUDCrearPedido() {

		mfm = ModelFactoryModel.getInstance();
		mfm.getUi().implementarModelo();

		contenedorCRUDPedidoViewModel = mfm.getTheContenedorCRUDPedidoViewModel();
		contenedorCRUDProductosViewModel = mfm.getUi().getTheContenedorCRUDProductosViewModel();
		contenedorDetallePedidoViewModel = mfm.getUi().getTheContenedorCRUDPedidoViewModel()
				.getTheContenedorDetallePedidoViewModel();
		contenedorMaestroPedidoViewModel = mfm.getUi().getTheContenedorCRUDPedidoViewModel()
				.getTheContenedorMaestroPedidoViewModel();
		contenedorMaestroClienteViewModel = mfm.getUi().getTheContenedorCRUDClienteViewModel()
				.getTheContenedorMaestroClienteViewModel();
		contenedorMestroProductosViewModel = mfm.getUi().getTheContenedorCRUDProductosViewModel()
				.getTheContenedorMestroProductosViewModel();
		
		mfm.cargar();

	}

	/**
	 * Create contents of the view part.
	 * 
	 * @param parent
	 */
	@Override
	public void createPartControl(Composite parent) {
		Composite container = toolkit.createComposite(parent, SWT.NONE);
		toolkit.paintBordersFor(container);
		container.setLayout(null);
		{
			Group grpDetallePedido = new Group(container, SWT.NONE);
			grpDetallePedido.setFont(SWTResourceManager.getFont("Segoe Print", 9, SWT.BOLD));
			grpDetallePedido.setText("Detalle Pedido");
			grpDetallePedido.setBounds(10, 10, 574, 101);
			toolkit.adapt(grpDetallePedido);
			toolkit.paintBordersFor(grpDetallePedido);
			{
				Label lblTienda = new Label(grpDetallePedido, SWT.NONE);
				lblTienda.setFont(SWTResourceManager.getFont("Segoe Print", 9, SWT.BOLD));
				lblTienda.setBounds(300, 37, 55, 30);
				toolkit.adapt(lblTienda, true, true);
				lblTienda.setText("Cliente:");
			}

			Label lblCdigo = new Label(grpDetallePedido, SWT.NONE);
			lblCdigo.setBounds(10, 37, 55, 15);
			toolkit.adapt(lblCdigo, true, true);
			lblCdigo.setText("C\u00F3digo: ");

			txtCodigo = new Text(grpDetallePedido, SWT.BORDER);
			txtCodigo.setBounds(10, 58, 76, 21);
			toolkit.adapt(txtCodigo, true, true);

			Label lblFecha = new Label(grpDetallePedido, SWT.NONE);
			lblFecha.setBounds(180, 40, 55, 15);
			toolkit.adapt(lblFecha, true, true);
			lblFecha.setText("Fecha:");

			txtFecha = new Text(grpDetallePedido, SWT.BORDER);
			txtFecha.setBounds(180, 58, 76, 21);
			toolkit.adapt(txtFecha, true, true);

			comboViewer = new ComboViewer(grpDetallePedido, SWT.NONE);
			cboCliente = comboViewer.getCombo();
			cboCliente.setBounds(287, 55, 91, 25);
			cboCliente.setFont(SWTResourceManager.getFont("Segoe Print", 9, SWT.BOLD));
			toolkit.paintBordersFor(cboCliente);

			Label lblVendedor = new Label(grpDetallePedido, SWT.NONE);
			lblVendedor.setBounds(436, 37, 64, 15);
			toolkit.adapt(lblVendedor, true, true);
			lblVendedor.setText("Vendedor:");

			Combo cboVendedor = new Combo(grpDetallePedido, SWT.NONE);
			cboVendedor.setBounds(426, 58, 91, 23);
			toolkit.adapt(cboVendedor);
			toolkit.paintBordersFor(cboVendedor);

			Button btnBPedido = new Button(grpDetallePedido, SWT.NONE);
			btnBPedido.setBounds(92, 56, 75, 25);
			toolkit.adapt(btnBPedido, true, true);
			btnBPedido.setText("Buscar");
		}
		{
			Group grpMaestroPedido = new Group(container, SWT.NONE);
			grpMaestroPedido.setText("Carrito Compras");
			grpMaestroPedido.setBounds(10, 302, 574, 308);
			toolkit.adapt(grpMaestroPedido);
			toolkit.paintBordersFor(grpMaestroPedido);

			tableViewer = new TableViewer(grpMaestroPedido, SWT.BORDER | SWT.FULL_SELECTION);
			table = tableViewer.getTable();
			table.setLinesVisible(true);
			table.setHeaderVisible(true);
			table.setBounds(10, 23, 288, 222);
			toolkit.paintBordersFor(table);

			TableViewerColumn tableViewerColumn = new TableViewerColumn(tableViewer, SWT.NONE);
			TableColumn tblclmnFechaPedido = tableViewerColumn.getColumn();
			tblclmnFechaPedido.setWidth(74);
			tblclmnFechaPedido.setText("Codigo");

			TableViewerColumn tableViewerColumn_1 = new TableViewerColumn(tableViewer, SWT.NONE);
			TableColumn tblclmnCantidadProductos = tableViewerColumn_1.getColumn();
			tblclmnCantidadProductos.setWidth(66);
			tblclmnCantidadProductos.setText("Nombre");

			TableViewerColumn tableViewerColumn_2 = new TableViewerColumn(tableViewer, SWT.NONE);
			TableColumn tblclmnNombreDeLa = tableViewerColumn_2.getColumn();
			tblclmnNombreDeLa.setWidth(59);
			tblclmnNombreDeLa.setText("Precio");

			TableViewerColumn tableViewerColumn_3 = new TableViewerColumn(tableViewer, SWT.NONE);
			TableColumn tblclmnTipoCliente = tableViewerColumn_3.getColumn();
			tblclmnTipoCliente.setWidth(85);
			tblclmnTipoCliente.setText("Categoria");

			Button btnEliminar = new Button(grpMaestroPedido, SWT.NONE);
			btnEliminar.setBounds(317, 110, 75, 25);
			toolkit.adapt(btnEliminar, true, true);
			btnEliminar.setText("Eliminar");

			Label lblCantidadDeProductos = new Label(grpMaestroPedido, SWT.NONE);
			lblCantidadDeProductos.setBounds(317, 23, 134, 15);
			toolkit.adapt(lblCantidadDeProductos, true, true);
			lblCantidadDeProductos.setText("Cantidad de Productos:");

			Label lblCantproductos = new Label(grpMaestroPedido, SWT.NONE);
			lblCantproductos.setBounds(317, 61, 134, 25);
			toolkit.adapt(lblCantproductos, true, true);
			lblCantproductos.setText("cantProductos");

			Label label = new Label(grpMaestroPedido, SWT.SEPARATOR | SWT.HORIZONTAL);
			label.setBounds(41, 251, 496, 15);
			toolkit.adapt(label, true, true);

			Button btnCerrar = new Button(grpMaestroPedido, SWT.NONE);
			btnCerrar.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					
					contenedorCRUDPedidoViewModel.crearPedido();
					
					mfm.guardar();
					
			
					
				}
			});
			btnCerrar.setBounds(51, 272, 93, 25);
			toolkit.adapt(btnCerrar, true, true);
			btnCerrar.setText("Cerrar Pedido");

			Button btnEditar = new Button(grpMaestroPedido, SWT.NONE);
			btnEditar.setBounds(376, 272, 75, 25);
			toolkit.adapt(btnEditar, true, true);
			btnEditar.setText("Editar");
		}

		Group grpProducto = new Group(container, SWT.NONE);
		grpProducto.setText("Producto");
		grpProducto.setBounds(10, 117, 574, 179);
		toolkit.adapt(grpProducto);
		toolkit.paintBordersFor(grpProducto);

		Label lblNombre = new Label(grpProducto, SWT.NONE);
		lblNombre.setBounds(10, 27, 55, 15);
		toolkit.adapt(lblNombre, true, true);
		lblNombre.setText("Nombre:");

		comboViewer_1 = new ComboViewer(grpProducto, SWT.NONE);
		Combo cboNProducto = comboViewer_1.getCombo();
		cboNProducto.setBounds(68, 27, 347, 23);
		toolkit.paintBordersFor(cboNProducto);
		
		Label lblDProducto = new Label(grpProducto, SWT.NONE);
		lblDProducto.setBounds(10, 86, 405, 25);
		toolkit.adapt(lblDProducto, true, true);

		Button btnBProducto = new Button(grpProducto, SWT.NONE);
		btnBProducto.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				ProductoComprarViewModel  productoComprarViewModel = contenedorCRUDProductosViewModel
						.buscarProductoNombre(cboNProducto.getText());
				lblDProducto.setText( productoComprarViewModel.getNombre() + " " +  productoComprarViewModel.getPrecio());
				

			}
		});
		btnBProducto.setBounds(439, 22, 75, 25);
		toolkit.adapt(btnBProducto, true, true);
		btnBProducto.setText("Buscar");

		

		Button btnAgregar = new Button(grpProducto, SWT.NONE);
		btnAgregar.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {

				
				ProductoComprarViewModel  productoComprarViewModel = contenedorCRUDProductosViewModel
						.buscarProductoNombre(cboNProducto.getText());
				
				System.out.println("El producto es: " + productoComprarViewModel.getNombre());
				contenedorCRUDPedidoViewModel.getTheContenedorMaestroPedidoViewModel().getListaProductoComprarViewModel().add(productoComprarViewModel);
				System.out.println("El elemento de la lista es: ");
				System.out.println(contenedorCRUDPedidoViewModel.getTheContenedorMaestroPedidoViewModel().getListaProductoComprarViewModel().get(0).getNombre());
				mfm.guardar();

			}
		});
		btnAgregar.setBounds(62, 143, 75, 25);
		toolkit.adapt(btnAgregar, true, true);
		btnAgregar.setText("Agregar");

		Label lblDescripcin = new Label(grpProducto, SWT.NONE);
		lblDescripcin.setBounds(10, 66, 75, 15);
		toolkit.adapt(lblDescripcin, true, true);
		lblDescripcin.setText("Descripci\u00F3n:");

		Label label = new Label(grpProducto, SWT.SEPARATOR | SWT.HORIZONTAL);
		label.setBounds(37, 56, 496, 2);
		toolkit.adapt(label, true, true);

		Label label_1 = new Label(grpProducto, SWT.SEPARATOR | SWT.HORIZONTAL);
		label_1.setBounds(37, 135, 496, 2);
		toolkit.adapt(label_1, true, true);

		Button btnLimpiar = new Button(grpProducto, SWT.NONE);
		btnLimpiar.setBounds(318, 143, 75, 25);
		toolkit.adapt(btnLimpiar, true, true);
		btnLimpiar.setText("Limpiar");

		createActions();
		initializeToolBar();
		initializeMenu();
		m_bindingContext = initDataBindings();
	}

	public void dispose() {
		toolkit.dispose();
		super.dispose();
	}

	/**
	 * Create the actions.
	 */
	private void createActions() {
		// Create the actions
	}

	/**
	 * Initialize the toolbar.
	 */
	private void initializeToolBar() {
		IToolBarManager tbm = getViewSite().getActionBars().getToolBarManager();
	}

	/**
	 * Initialize the menu.
	 */
	private void initializeMenu() {
		IMenuManager manager = getViewSite().getActionBars().getMenuManager();
	}

	@Override
	public void setFocus() {
		// Set the focus
	}
	protected DataBindingContext initDataBindings() {
		DataBindingContext bindingContext = new DataBindingContext();
		//
		ObservableListContentProvider listContentProvider = new ObservableListContentProvider();
		IObservableMap[] observeMaps = EMFObservables.observeMaps(listContentProvider.getKnownElements(), new EStructuralFeature[]{Literals.CLIENTE_VIEW_MODEL__CODIGO});
		comboViewer.setLabelProvider(new ObservableMapLabelProvider(observeMaps));
		comboViewer.setContentProvider(listContentProvider);
		//
		IObservableList contenedorMaestroClienteViewModelTheClienteViewModelObserveList = EMFObservables.observeList(Realm.getDefault(), contenedorMaestroClienteViewModel, Literals.CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL__THE_CLIENTE_VIEW_MODEL);
		comboViewer.setInput(contenedorMaestroClienteViewModelTheClienteViewModelObserveList);
		//
		ObservableListContentProvider listContentProvider_1 = new ObservableListContentProvider();
		IObservableMap[] observeMaps_1 = EMFObservables.observeMaps(listContentProvider_1.getKnownElements(), new EStructuralFeature[]{ContenedorcrudproductosPackage.Literals.PRODUCTOS_VIEW_MODEL__CODIGO, ContenedorcrudproductosPackage.Literals.PRODUCTOS_VIEW_MODEL__NOMBRE, ContenedorcrudproductosPackage.Literals.PRODUCTOS_VIEW_MODEL__PRECIO, ContenedorcrudproductosPackage.Literals.PRODUCTOS_VIEW_MODEL__CATEGORIA});
		tableViewer.setLabelProvider(new ObservableMapLabelProvider(observeMaps_1));
		tableViewer.setContentProvider(listContentProvider_1);
		//
		IObservableList contenedorMaestroPedidoViewModelListaProductoComprarViewModelObserveList = EMFObservables.observeList(Realm.getDefault(), contenedorMaestroPedidoViewModel, ContenedorcrudpedidoPackage.Literals.CONTENEDOR_MAESTRO_PEDIDO_VIEW_MODEL__LISTA_PRODUCTO_COMPRAR_VIEW_MODEL);
		tableViewer.setInput(contenedorMaestroPedidoViewModelListaProductoComprarViewModelObserveList);
		//
		ObservableListContentProvider listContentProvider_2 = new ObservableListContentProvider();
		IObservableMap[] observeMaps_2 = EMFObservables.observeMaps(listContentProvider_2.getKnownElements(), new EStructuralFeature[]{ContenedorcrudproductosPackage.Literals.PRODUCTOS_VIEW_MODEL__NOMBRE});
		comboViewer_1.setLabelProvider(new ObservableMapLabelProvider(observeMaps_2));
		comboViewer_1.setContentProvider(listContentProvider_2);
		//
		IObservableList contenedorMestroProductosViewModelTheProductosViewModelObserveList = EMFObservables.observeList(Realm.getDefault(), contenedorMestroProductosViewModel, ContenedorcrudproductosPackage.Literals.CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL__THE_PRODUCTOS_VIEW_MODEL);
		comboViewer_1.setInput(contenedorMestroProductosViewModelTheProductosViewModelObserveList);
		//
		IObservableValue observeTextTxtCodigoObserveWidget = WidgetProperties.text(SWT.Modify).observe(txtCodigo);
		IObservableValue contenedorDetallePedidoViewModelCodigoObserveValue = EMFObservables.observeValue(contenedorDetallePedidoViewModel, ContenedorcrudpedidoPackage.Literals.CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL__CODIGO);
		bindingContext.bindValue(observeTextTxtCodigoObserveWidget, contenedorDetallePedidoViewModelCodigoObserveValue, null, null);
		//
		IObservableValue observeTextTxtFechaObserveWidget = WidgetProperties.text(SWT.Modify).observe(txtFecha);
		IObservableValue contenedorDetallePedidoViewModelFechaPedidoObserveValue = EMFObservables.observeValue(contenedorDetallePedidoViewModel, ContenedorcrudpedidoPackage.Literals.CONTENEDOR_DETALLE_PEDIDO_VIEW_MODEL__FECHA_PEDIDO);
		bindingContext.bindValue(observeTextTxtFechaObserveWidget, contenedorDetallePedidoViewModelFechaPedidoObserveValue, null, null);
		//
		return bindingContext;
	}
}
