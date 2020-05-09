package views;

import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.swt.widgets.Group;
import org.eclipse.wb.swt.SWTResourceManager;

import tiendaCristal.model.ModelFactoryModel;
import tiendacristal.ModelFactory;
import tiendacristal.TiendacristalFactory;
import tiendacristal.domain.Cliente;
import tiendacristal.domain.Domain;
import tiendacristal.domain.DomainFactory;
import tiendacristal.ui.UI;
import tiendacristal.ui.UiFactory;
import tiendacristal.ui.contenedorcrudclientes.ClienteViewModel;
import tiendacristal.ui.contenedorcrudclientes.ContenedorCRUDClienteViewModel;
import tiendacristal.ui.contenedorcrudclientes.ContenedorDetalleClienteViewModel;
import tiendacristal.ui.contenedorcrudclientes.ContenedorMaestroClienteViewModel;
import tiendacristal.ui.contenedorcrudclientes.ContenedorcrudclientesFactory;
import tiendacristal.ui.contenedorcrudclientes.util.ContenedorcrudclientesAdapterFactory;
import tiendacristal.ui.contenedorcrudproductos.ContenedorCRUDProductosViewModel;

import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Table;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.jface.databinding.viewers.ObservableListContentProvider;
import org.eclipse.core.databinding.observable.map.IObservableMap;
import org.eclipse.emf.databinding.EMFObservables;
import org.eclipse.emf.ecore.EStructuralFeature;
import tiendacristal.ui.contenedorcrudclientes.ContenedorcrudclientesPackage.Literals;

import org.eclipse.jface.databinding.viewers.ObservableMapLabelProvider;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import tiendacristal.ui.contenedorcrudproductos.ContenedorcrudproductosPackage;
import org.eclipse.core.databinding.observable.value.IObservableValue;

public class CRUDClientesViewPart extends ViewPart {
	private DataBindingContext m_bindingContext;
	
	

	ModelFactoryModel mfm;
	UI ui;
	Domain domain;


	ContenedorCRUDClienteViewModel contenedorCRUDClienteViewModel;
	ContenedorDetalleClienteViewModel contenedorDetalleClienteViewModel;
	ContenedorMaestroClienteViewModel contenedorMaestroClienteViewModel;
	
	
	

	public static final String ID = "views.CRUDPersonasViewPart"; //$NON-NLS-1$
	private final FormToolkit toolkit = new FormToolkit(Display.getCurrent());
	private Text txtCodigo;
	private Table table;
	private TableViewer tableViewer;
	private Text txtNombre;
	private Combo cboTipoCliente;

	public CRUDClientesViewPart() {
		
		//ui = mfm.getUi();
        mfm = ModelFactoryModel.getInstance();
        mfm.getUi().implementarModelo();
        contenedorCRUDClienteViewModel = mfm.getTheContenedorCRUDClienteViewModel();
        
        contenedorMaestroClienteViewModel = mfm.getUi().getTheContenedorCRUDClienteViewModel().getTheContenedorMaestroClienteViewModel();
		contenedorDetalleClienteViewModel = mfm.getUi().getTheContenedorCRUDClienteViewModel().getTheContenedorDetalleClienteViewModel();
		
		mfm.cargar();
		contenedorCRUDClienteViewModel.update();
		
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

		Group grpDetallePersona = new Group(container, SWT.NONE);
		grpDetallePersona.setFont(SWTResourceManager.getFont("Segoe Print", 9, SWT.BOLD));
		grpDetallePersona.setText("Detalle Persona");
		grpDetallePersona.setBounds(10, 20, 429, 172);
		toolkit.adapt(grpDetallePersona);
		toolkit.paintBordersFor(grpDetallePersona);

		Label lblNombre = new Label(grpDetallePersona, SWT.NONE);
		lblNombre.setFont(SWTResourceManager.getFont("Segoe Print", 9, SWT.BOLD));
		lblNombre.setBounds(28, 40, 66, 15);
		toolkit.adapt(lblNombre, true, true);
		lblNombre.setText("Nombre:");

		Label lblApellido = new Label(grpDetallePersona, SWT.NONE);
		lblApellido.setFont(SWTResourceManager.getFont("Segoe Print", 9, SWT.BOLD));
		lblApellido.setBounds(28, 126, 103, 21);
		toolkit.adapt(lblApellido, true, true);
		lblApellido.setText("Tipo de Cliente:");

		Label lblCdigo = new Label(grpDetallePersona, SWT.NONE);
		lblCdigo.setFont(SWTResourceManager.getFont("Segoe Print", 9, SWT.BOLD));
		lblCdigo.setBounds(28, 80, 55, 21);
		toolkit.adapt(lblCdigo, true, true);
		lblCdigo.setText("C\u00F3digo:");

		txtCodigo = new Text(grpDetallePersona, SWT.BORDER);
		txtCodigo.setText("");
		txtCodigo.setBounds(152, 80, 145, 21);
		toolkit.adapt(txtCodigo, true, true);
		
				Button btnEliminar = new Button(grpDetallePersona, SWT.NONE);
				btnEliminar.setBounds(325, 95, 75, 25);
				btnEliminar.addSelectionListener(new SelectionAdapter() {
					@Override
					public void widgetSelected(SelectionEvent e) {

						

					}
				});
				btnEliminar.setFont(SWTResourceManager.getFont("Segoe Print", 9, SWT.BOLD));
				toolkit.adapt(btnEliminar, true, true);
				btnEliminar.setText("Eliminar");
				
				cboTipoCliente = new Combo(grpDetallePersona, SWT.NONE);
				cboTipoCliente.setItems(new String[] {"Tienda Cliente", "Cliente"});
				cboTipoCliente.setBounds(152, 124, 145, 23);
				toolkit.adapt(cboTipoCliente);
				toolkit.paintBordersFor(cboTipoCliente);
				
						Button btnAgregar = new Button(grpDetallePersona, SWT.NONE);
						btnAgregar.setBounds(325, 23, 75, 25);
						btnAgregar.addSelectionListener(new SelectionAdapter() {
							@Override
							public void widgetSelected(SelectionEvent e) {

//								contenedorDetalleClienteViewModel.setCodigo(txtCodigo.getText());
//						
//								contenedorDetalleClienteViewModel.setNombre(txtNombre.getText());
//								
//								contenedorDetalleClienteViewModel.setTipoCliente(cboTipoCliente.getText());
//
//								contenedorCRUDClienteViewModel.crearCliente();
//								
//								
//								txtNombre.setText("");
//								txtCodigo.setText("");
								
								mfm.getUi().crearCliente(contenedorCRUDClienteViewModel);
								mfm.guardar();

							}
						});
						btnAgregar.setFont(SWTResourceManager.getFont("Segoe Print", 9, SWT.BOLD));
						toolkit.adapt(btnAgregar, true, true);
						btnAgregar.setText("Agregar");
						
						Button btnBuscar = new Button(grpDetallePersona, SWT.NONE);
						btnBuscar.addSelectionListener(new SelectionAdapter() {
							@Override
							public void widgetSelected(SelectionEvent e) {
								
//								System.out.println("Entra al buscar");
//								mfm.getUi().buscarCliente(contenedorCRUDClienteViewModel);
//								System.out.println(contenedorCRUDClienteViewModel.getTheContenedorDetalleClienteViewModel().getCodigo());						
//								Cliente cliente = contenedorCRUDClienteViewModel.buscarClienteId(txtCodigo.getText());
//								txtNombre.setText(cliente.getNombre());
								
							mfm.getUi().buscarCliente(contenedorCRUDClienteViewModel);

								
							}
						});
						btnBuscar.setFont(SWTResourceManager.getFont("Segoe Print", 9, SWT.BOLD));
						btnBuscar.setBounds(325, 137, 75, 25);
						toolkit.adapt(btnBuscar, true, true);
						btnBuscar.setText("Buscar");
						
						txtNombre = new Text(grpDetallePersona, SWT.BORDER);
						txtNombre.setBounds(152, 40, 145, 21);
						toolkit.adapt(txtNombre, true, true);
						
						Button btnActualizar = new Button(grpDetallePersona, SWT.NONE);
						btnActualizar.addSelectionListener(new SelectionAdapter() {
							@Override
							public void widgetSelected(SelectionEvent e) {
								
								System.out.println("Entra al CRUD");
								
								mfm.getUi().actualizarCliente(contenedorCRUDClienteViewModel);
								
								
								
							}
						});
						btnActualizar.setBounds(325, 64, 75, 25);
						toolkit.adapt(btnActualizar, true, true);
						btnActualizar.setText("Actualizar");

		Group grpMaestroPersona = new Group(container, SWT.NONE);
		grpMaestroPersona.setFont(SWTResourceManager.getFont("Segoe Print", 9, SWT.BOLD));
		grpMaestroPersona.setText("Maestro Persona");
		grpMaestroPersona.setBounds(10, 198, 429, 260);
		toolkit.adapt(grpMaestroPersona);
		toolkit.paintBordersFor(grpMaestroPersona);

		tableViewer = new TableViewer(grpMaestroPersona, SWT.BORDER | SWT.FULL_SELECTION);
		table = tableViewer.getTable();
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		table.setBounds(10, 31, 409, 219);
		toolkit.paintBordersFor(table);

		TableViewerColumn tableViewerColumn = new TableViewerColumn(tableViewer, SWT.NONE);
		TableColumn tblclmnNombre = tableViewerColumn.getColumn();
		tblclmnNombre.setWidth(119);
		tblclmnNombre.setText("Nombre");

		TableViewerColumn tableViewerColumn_2 = new TableViewerColumn(tableViewer, SWT.NONE);
		TableColumn tblclmnCodigo = tableViewerColumn_2.getColumn();
		tblclmnCodigo.setWidth(123);
		tblclmnCodigo.setText("Codigo");

		TableViewerColumn tableViewerColumn_1 = new TableViewerColumn(tableViewer, SWT.NONE);
		TableColumn tblclmnApellido = tableViewerColumn_1.getColumn();
		tblclmnApellido.setWidth(128);
		tblclmnApellido.setText("Tipo de Cliente");

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
		IObservableMap[] observeMaps = EMFObservables.observeMaps(listContentProvider.getKnownElements(), new EStructuralFeature[]{Literals.CLIENTE_VIEW_MODEL__NOMBRE, Literals.CLIENTE_VIEW_MODEL__CODIGO, Literals.CLIENTE_VIEW_MODEL__TIPO_CLIENTE});
		tableViewer.setLabelProvider(new ObservableMapLabelProvider(observeMaps));
		tableViewer.setContentProvider(listContentProvider);
		//
		IObservableList contenedorMaestroClienteViewModelTheClienteViewModelObserveList = EMFObservables.observeList(Realm.getDefault(), contenedorMaestroClienteViewModel, Literals.CONTENEDOR_MAESTRO_CLIENTE_VIEW_MODEL__THE_CLIENTE_VIEW_MODEL);
		tableViewer.setInput(contenedorMaestroClienteViewModelTheClienteViewModelObserveList);
		//
		IObservableValue observeTextTxtCodigoObserveWidget = WidgetProperties.text(SWT.Modify).observe(txtCodigo);
		IObservableValue contenedorDetalleClienteViewModelCodigoObserveValue = EMFObservables.observeValue(contenedorDetalleClienteViewModel, Literals.CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL__CODIGO);
		bindingContext.bindValue(observeTextTxtCodigoObserveWidget, contenedorDetalleClienteViewModelCodigoObserveValue, null, null);
		//
		IObservableValue observeTextCboTipoClienteObserveWidget = WidgetProperties.text().observe(cboTipoCliente);
		IObservableValue contenedorDetalleClienteViewModelTipoClienteObserveValue = EMFObservables.observeValue(contenedorDetalleClienteViewModel, Literals.CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL__TIPO_CLIENTE);
		bindingContext.bindValue(observeTextCboTipoClienteObserveWidget, contenedorDetalleClienteViewModelTipoClienteObserveValue, null, null);
		//
		IObservableValue observeTextTxtNombreObserveWidget = WidgetProperties.text(SWT.Modify).observe(txtNombre);
		IObservableValue contenedorDetalleClienteViewModelNombreObserveValue = EMFObservables.observeValue(contenedorDetalleClienteViewModel, Literals.CONTENEDOR_DETALLE_CLIENTE_VIEW_MODEL__NOMBRE);
		bindingContext.bindValue(observeTextTxtNombreObserveWidget, contenedorDetalleClienteViewModelNombreObserveValue, null, null);
		//
		return bindingContext;
	}
}
