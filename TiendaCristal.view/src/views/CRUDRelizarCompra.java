package views;

import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.SWTResourceManager;

import tiendaCristal.model.ModelFactoryModel;
import tiendacristal.ui.contenedorcrudclientes.ContenedorDetalleClienteViewModel;
import tiendacristal.ui.contenedorcrudclientes.ContenedorMaestroClienteViewModel;
import tiendacristal.ui.contenedorcrudproductos.ContenedorMestroProductosViewModel;
import tiendacristal.ui.contenedorcrudrealizarcompra.CompraViewModel;
import tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorCRUDCompraViewModel;
import tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorDetalleCompraViewModel;
import tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorMaestroCompraViewModel;
import tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorcrudrealizarcompraFactory;

import org.eclipse.swt.widgets.Table;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.jface.databinding.viewers.ObservableListContentProvider;
import org.eclipse.core.databinding.observable.map.IObservableMap;
import org.eclipse.emf.databinding.EMFObservables;
import org.eclipse.emf.ecore.EStructuralFeature;
import tiendacristal.ui.contenedorcrudclientes.ContenedorcrudclientesPackage.Literals;
import tiendacristal.ui.contenedorcrudpedido.ContenedorMaestroPedidoViewModel;

import org.eclipse.jface.databinding.viewers.ObservableMapLabelProvider;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.Realm;
import tiendacristal.ui.contenedorcrudproductos.ContenedorcrudproductosPackage;
import tiendacristal.ui.contenedorcrudrealizarcompra.ContenedorcrudrealizarcompraPackage;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import tiendacristal.ui.contenedorcrudpedido.ContenedorcrudpedidoPackage;

public class CRUDRelizarCompra extends ViewPart {
	private DataBindingContext m_bindingContext;

	public static final String ID = "CRUDRelizarCompra"; //$NON-NLS-1$
	private final FormToolkit toolkit = new FormToolkit(Display.getCurrent());
	private Text txtFechaC;
	private Text txtTotalC;
	private Table table;

	ModelFactoryModel mfm;

	ContenedorCRUDCompraViewModel contenedorCRUDRealizarCompraViewModel;
	ContenedorDetalleCompraViewModel contenedorDetalleCompraViewModel;
	ContenedorMaestroCompraViewModel contenedorMaestroCompraViewModel;
	ContenedorMaestroClienteViewModel contenedorMaestroClienteViewModel;
	ContenedorMestroProductosViewModel contenedorMestroProductosViewModel;
	ContenedorMaestroPedidoViewModel contenedorMaestroPedidoViewModel;

	private ComboViewer comboViewer;
	private ComboViewer comboViewer_1;
	private TableViewer tableViewer;
	private Text txtCodigoC;

	public CRUDRelizarCompra() {

		mfm = ModelFactoryModel.getInstance();
		mfm.getUi().implementarModelo();

		contenedorCRUDRealizarCompraViewModel = mfm.getTheContenedorCRUDRealizarCompraViewModel();
		contenedorDetalleCompraViewModel = mfm.getUi().getTheContenedorCRUDRealizarCompraViewModel()
				.getTheContenedorDetalleCompraViewModel();
		contenedorMaestroCompraViewModel = mfm.getUi().getTheContenedorCRUDRealizarCompraViewModel()
				.getTheContenedorMaestroCompraViewModel();
		contenedorMaestroClienteViewModel = mfm.getUi().getTheContenedorCRUDClienteViewModel()
				.getTheContenedorMaestroClienteViewModel();
		contenedorMestroProductosViewModel = mfm.getUi().getTheContenedorCRUDProductosViewModel()
				.getTheContenedorMestroProductosViewModel();
		contenedorMaestroPedidoViewModel = mfm.getUi().getTheContenedorCRUDPedidoViewModel()
				.getTheContenedorMaestroPedidoViewModel();

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

		Group grpDetalleCompra = new Group(container, SWT.NONE);
		grpDetalleCompra.setText("Detalle Compra");
		grpDetalleCompra.setBounds(10, 0, 493, 316);
		toolkit.adapt(grpDetalleCompra);
		toolkit.paintBordersFor(grpDetalleCompra);

		Label lblCliente = new Label(grpDetalleCompra, SWT.NONE);
		lblCliente.setFont(SWTResourceManager.getFont("Segoe Print", 9, SWT.BOLD));
		lblCliente.setBounds(10, 96, 55, 15);
		toolkit.adapt(lblCliente, true, true);
		lblCliente.setText("Cliente:");

		Label lblProducto = new Label(grpDetalleCompra, SWT.NONE);
		lblProducto.setFont(SWTResourceManager.getFont("Segoe Print", 9, SWT.BOLD));
		lblProducto.setBounds(10, 137, 55, 15);
		toolkit.adapt(lblProducto, true, true);
		lblProducto.setText("Pedido:");

		Label lblCodigoPedido = new Label(grpDetalleCompra, SWT.NONE);
		lblCodigoPedido.setFont(SWTResourceManager.getFont("Segoe Print", 9, SWT.BOLD));
		lblCodigoPedido.setBounds(10, 180, 100, 21);
		toolkit.adapt(lblCodigoPedido, true, true);
		lblCodigoPedido.setText("Fecha Compra:");

		Label lblFechaPedido = new Label(grpDetalleCompra, SWT.NONE);
		lblFechaPedido.setFont(SWTResourceManager.getFont("Segoe Print", 9, SWT.BOLD));
		lblFechaPedido.setBounds(10, 223, 100, 21);
		toolkit.adapt(lblFechaPedido, true, true);
		lblFechaPedido.setText("Total Compra:");

		txtFechaC = new Text(grpDetalleCompra, SWT.BORDER);
		txtFechaC.setFont(SWTResourceManager.getFont("Segoe Print", 9, SWT.BOLD));
		txtFechaC.setBounds(148, 177, 91, 21);
		toolkit.adapt(txtFechaC, true, true);

		txtTotalC = new Text(grpDetalleCompra, SWT.BORDER);
		txtTotalC.setText("");
		txtTotalC.setBounds(148, 223, 91, 21);
		toolkit.adapt(txtTotalC, true, true);

		comboViewer = new ComboViewer(grpDetalleCompra, SWT.NONE);
		Combo cboCliente = comboViewer.getCombo();
		cboCliente.setBounds(148, 96, 91, 23);
		toolkit.paintBordersFor(cboCliente);

		comboViewer_1 = new ComboViewer(grpDetalleCompra, SWT.NONE);
		Combo cboPedido = comboViewer_1.getCombo();
		cboPedido.setBounds(148, 137, 91, 23);
		toolkit.paintBordersFor(cboPedido);

		Button btnAgregarC = new Button(grpDetalleCompra, SWT.NONE);
		btnAgregarC.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {

				// contenedorDetalleCompraViewModel.setCodigo(txtFechaC.getText());
				// contenedorDetalleCompraViewModel.setCantidad(Integer.parseInt(txtCodigoC.getText()));
				// contenedorDetalleCompraViewModel.setIdCliente(cboCliente.getText());
				// contenedorDetalleCompraViewModel.setNombreProducto(cboPedido.getText());
				// contenedorDetalleCompraViewModel.setFecha(txtTotalC.getText());
				//// String precio = contenedorCRUDRealizarCompraViewModel.buscarProducto();
				//// contenedorDetalleCompraViewModel.setPrecio(Integer.parseInt(precio));
				//// contenedorDetalleCompraViewModel.setTotal(Integer.parseInt(precio)*Integer.parseInt(textCantidad.getText()));
				//
				// contenedorCRUDRealizarCompraViewModel.crearCompra();
				//
				mfm.guardar();

			}
		});
		btnAgregarC.setFont(SWTResourceManager.getFont("Segoe Print", 9, SWT.BOLD));
		btnAgregarC.setBounds(10, 269, 110, 25);
		toolkit.adapt(btnAgregarC, true, true);
		btnAgregarC.setText("Agregar Compra");

		Label lblCantidadAComprar = new Label(grpDetalleCompra, SWT.NONE);
		lblCantidadAComprar.setFont(SWTResourceManager.getFont("Segoe Print", 9, SWT.BOLD));
		lblCantidadAComprar.setBounds(10, 48, 132, 21);
		toolkit.adapt(lblCantidadAComprar, true, true);
		lblCantidadAComprar.setText("C\u00F3digo Compra:");

		txtCodigoC = new Text(grpDetalleCompra, SWT.BORDER);
		txtCodigoC.setBounds(148, 48, 91, 21);
		toolkit.adapt(txtCodigoC, true, true);

		Button btnEliminarC = new Button(grpDetalleCompra, SWT.NONE);
		btnEliminarC.setBounds(186, 269, 110, 25);
		toolkit.adapt(btnEliminarC, true, true);
		btnEliminarC.setText("Eliminar Compra");

		Label lblDetallePedido = new Label(grpDetalleCompra, SWT.NONE);
		lblDetallePedido.setBounds(273, 10, 91, 15);
		toolkit.adapt(lblDetallePedido, true, true);
		lblDetallePedido.setText("Detalle Pedido:");

		Label lblDetalleP = new Label(grpDetalleCompra, SWT.NONE);
		lblDetalleP.setBounds(273, 35, 193, 176);
		toolkit.adapt(lblDetalleP, true, true);
		lblDetalleP.setText("Detalle del pedido");

		Group grpMaestroCompra = new Group(container, SWT.NONE);
		grpMaestroCompra.setText("Maestro Compra");
		grpMaestroCompra.setBounds(10, 322, 493, 241);
		toolkit.adapt(grpMaestroCompra);
		toolkit.paintBordersFor(grpMaestroCompra);

		tableViewer = new TableViewer(grpMaestroCompra, SWT.BORDER | SWT.FULL_SELECTION);
		table = tableViewer.getTable();
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		table.setBounds(10, 24, 374, 202);
		toolkit.paintBordersFor(table);

		TableViewerColumn tableViewerColumn = new TableViewerColumn(tableViewer, SWT.NONE);
		TableColumn tblclmnFechaCompra = tableViewerColumn.getColumn();
		tblclmnFechaCompra.setWidth(67);
		tblclmnFechaCompra.setText("C\u00F3digo");

		TableViewerColumn tableViewerColumn_1 = new TableViewerColumn(tableViewer, SWT.NONE);
		TableColumn tblclmnCodigoCompra = tableViewerColumn_1.getColumn();
		tblclmnCodigoCompra.setWidth(78);
		tblclmnCodigoCompra.setText("Id Cliente");

		TableViewerColumn tableViewerColumn_2 = new TableViewerColumn(tableViewer, SWT.NONE);
		TableColumn tblclmnNewColumn = tableViewerColumn_2.getColumn();
		tblclmnNewColumn.setWidth(70);
		tblclmnNewColumn.setText("Id Pedido");

		TableViewerColumn tableViewerColumn_3 = new TableViewerColumn(tableViewer, SWT.NONE);
		TableColumn tblclmnNewColumn_1 = tableViewerColumn_3.getColumn();
		tblclmnNewColumn_1.setWidth(97);
		tblclmnNewColumn_1.setText("Fecha Pedido");

		TableViewerColumn tableViewerColumn_4 = new TableViewerColumn(tableViewer, SWT.NONE);
		TableColumn tblclmnPrecioProducto = tableViewerColumn_4.getColumn();
		tblclmnPrecioProducto.setWidth(53);
		tblclmnPrecioProducto.setText("Total");

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
		
		return bindingContext;
	}
}
