package views;

//import javax.swing.JOptionPane;
//import javax.swing.table.DefaultTableModel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.swt.widgets.Label;
import org.eclipse.wb.swt.SWTResourceManager;

import tiendaCristal.model.ModelFactoryModel;
import tiendacristal.ModelFactory;
import tiendacristal.TiendacristalFactory;
import tiendacristal.domain.Administrador;
import tiendacristal.domain.Domain;
import tiendacristal.domain.DomainFactory;
import tiendacristal.domain.Producto;
import tiendacristal.ui.UI;
import tiendacristal.ui.UiFactory;
import tiendacristal.ui.contenedorcrudproductos.ContenedorCRUDProductosViewModel;
import tiendacristal.ui.contenedorcrudproductos.ContenedorDetalleProductosViewmodel;
import tiendacristal.ui.contenedorcrudproductos.ContenedorMestroProductosViewModel;
import tiendacristal.ui.contenedorcrudproductos.ContenedorcrudproductosFactory;
import tiendacristal.ui.contenedorcrudproductos.ProductosViewModel;

import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Table;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.jface.databinding.viewers.ObservableListContentProvider;
import org.eclipse.core.databinding.observable.map.IObservableMap;
import org.eclipse.core.databinding.beans.PojoObservables;
import org.eclipse.jface.databinding.viewers.ObservableMapLabelProvider;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.beans.PojoProperties;
import org.eclipse.emf.databinding.EMFObservables;
import org.eclipse.emf.ecore.EStructuralFeature;
import tiendacristal.ui.contenedorcrudproductos.ContenedorcrudproductosPackage.Literals;
import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.FeaturePath;

public class ControlViewPart extends ViewPart {

	private DataBindingContext m_bindingContext;

	ModelFactoryModel mfm;

	ContenedorCRUDProductosViewModel contenedorCRUDProductosViewModel;
	ContenedorDetalleProductosViewmodel contenedorDetalleProductosViewmodel;
	ContenedorMestroProductosViewModel contenedorMaestroProductosViewModel;

	public static final String ID = "views.ControlViewPart"; //$NON-NLS-1$
	private final FormToolkit toolkit = new FormToolkit(Display.getCurrent());
	private Text textNombre;
	private Text textPrecio;
	private Text textCodigo;
	private Table table;
	EList<Administrador> lidta;
	private TableViewer tableViewer;
	private Combo comboCategoria;

	public ControlViewPart() {

		mfm = ModelFactoryModel.getInstance();
		mfm.getUi().implementarModelo();

		contenedorCRUDProductosViewModel = mfm.getTheContenedorCRUDProductosViewModel();
		contenedorMaestroProductosViewModel = mfm.getUi().getTheContenedorCRUDProductosViewModel()
				.getTheContenedorMestroProductosViewModel();
		contenedorDetalleProductosViewmodel = mfm.getUi().getTheContenedorCRUDProductosViewModel()
				.getTheContenedorDetalleProductosViewmodel();

		
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

		Label label = new Label(container, SWT.SEPARATOR | SWT.HORIZONTAL);
		label.setBounds(10, 10, 574, 2);
		toolkit.adapt(label, true, true);

		Label label_1 = new Label(container, SWT.SEPARATOR | SWT.HORIZONTAL);
		label_1.setBounds(10, 456, 574, 2);
		toolkit.adapt(label_1, true, true);

		Group grpDetalleProducto = new Group(container, SWT.NONE);
		grpDetalleProducto.setFont(SWTResourceManager.getFont("Segoe Print", 9, SWT.BOLD));
		grpDetalleProducto.setText("Detalle Producto");
		grpDetalleProducto.setBounds(20, 18, 384, 176);
		toolkit.adapt(grpDetalleProducto);
		toolkit.paintBordersFor(grpDetalleProducto);

		Label lblProducto = new Label(grpDetalleProducto, SWT.NONE);
		lblProducto.setBounds(10, 31, 97, 24);
		lblProducto.setFont(SWTResourceManager.getFont("Segoe Print", 9, SWT.BOLD));
		toolkit.adapt(lblProducto, true, true);
		lblProducto.setText("Producto");

		Label lblNombre = new Label(grpDetalleProducto, SWT.NONE);
		lblNombre.setFont(SWTResourceManager.getFont("Segoe Print", 9, SWT.BOLD));
		lblNombre.setBounds(10, 61, 55, 15);
		toolkit.adapt(lblNombre, true, true);
		lblNombre.setText("Nombre:");

		Label lblNewLabel = new Label(grpDetalleProducto, SWT.NONE);
		lblNewLabel.setFont(SWTResourceManager.getFont("Segoe Print", 9, SWT.BOLD));
		lblNewLabel.setBounds(10, 99, 55, 15);
		toolkit.adapt(lblNewLabel, true, true);
		lblNewLabel.setText("Precio:");

		Label lblNewLabel_1 = new Label(grpDetalleProducto, SWT.NONE);
		lblNewLabel_1.setFont(SWTResourceManager.getFont("Segoe Print", 9, SWT.BOLD));
		lblNewLabel_1.setBounds(169, 61, 55, 24);
		toolkit.adapt(lblNewLabel_1, true, true);
		lblNewLabel_1.setText("C\u00F3digo:");

		Label lblNewLabel_2 = new Label(grpDetalleProducto, SWT.NONE);
		lblNewLabel_2.setFont(SWTResourceManager.getFont("Segoe Print", 9, SWT.BOLD));
		lblNewLabel_2.setBounds(169, 99, 66, 24);
		toolkit.adapt(lblNewLabel_2, true, true);
		lblNewLabel_2.setText("Categoria:");

		textNombre = new Text(grpDetalleProducto, SWT.BORDER);
		textNombre.setBounds(71, 61, 76, 21);
		toolkit.adapt(textNombre, true, true);

		textPrecio = new Text(grpDetalleProducto, SWT.BORDER);
		textPrecio.setBounds(71, 99, 76, 21);
		toolkit.adapt(textPrecio, true, true);

		textCodigo = new Text(grpDetalleProducto, SWT.BORDER);
		textCodigo.setBounds(257, 61, 76, 21);
		toolkit.adapt(textCodigo, true, true);

		comboCategoria = new Combo(grpDetalleProducto, SWT.NONE);
		comboCategoria
				.setItems(new String[] { "Granos", "Confiteria", "Lacteos", "Bebidas", "Verdura", "Aseo", "Consumo" });
		comboCategoria.setBounds(258, 100, 91, 23);
		toolkit.adapt(comboCategoria);
		toolkit.paintBordersFor(comboCategoria);

		Button btnProducto = new Button(grpDetalleProducto, SWT.NONE);
		btnProducto.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {	

//				productosViewModel.setCodigo(textCodigo.getText());
//				productosViewModel.setPrecio(Integer.parseInt(textPrecio.getText()));
//				productosViewModel.setCategoria(comboCategoria.getText());
//				productosViewModel.setNombre(textNombre.getText());
//
//				contenedorMaestroProductosViewModel.getTheProductosViewModel().add(productosViewModel);
//
//				contenedorDetalleProductosViewmodel.setNombre(textNombre.getText());
//				contenedorDetalleProductosViewmodel.setCodigo(textCodigo.getText());
//				contenedorDetalleProductosViewmodel.setPrecio(Integer.parseInt(textPrecio.getText()));
//				contenedorDetalleProductosViewmodel.setCategoria(comboCategoria.getText());
//				textNombre.setText("");
//				textCodigo.setText("");
//				textPrecio.setText("");
				
				contenedorCRUDProductosViewModel.crearProducto();
					
				mfm.guardar();

			}
		});
		btnProducto.setFont(SWTResourceManager.getFont("Segoe Print", 9, SWT.BOLD));
		btnProducto.setBounds(10, 143, 76, 25);
		toolkit.adapt(btnProducto, true, true);
		btnProducto.setText("Ingresar");

		Button btnEliminar = new Button(grpDetalleProducto, SWT.NONE);
		btnEliminar.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {

			}
		});
		btnEliminar.setFont(SWTResourceManager.getFont("Segoe Print", 9, SWT.BOLD));
		btnEliminar.setBounds(113, 143, 66, 25);
		toolkit.adapt(btnEliminar, true, true);
		btnEliminar.setText("Eliminar");
		
		Button btnBuscar = new Button(grpDetalleProducto, SWT.NONE);
		btnBuscar.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				contenedorCRUDProductosViewModel.buscarProducto();
				
			}
		});
		btnBuscar.setBounds(199, 143, 75, 25);
		toolkit.adapt(btnBuscar, true, true);
		btnBuscar.setText("Buscar");
		
		Button btnActualizar = new Button(grpDetalleProducto, SWT.NONE);
		btnActualizar.setBounds(299, 143, 75, 25);
		toolkit.adapt(btnActualizar, true, true);
		btnActualizar.setText("Actualizar");

		Group grpMaestroProducto = new Group(container, SWT.NONE);
		grpMaestroProducto.setFont(SWTResourceManager.getFont("Segoe Print", 9, SWT.BOLD));
		grpMaestroProducto.setText("Maestro Producto");
		grpMaestroProducto.setBounds(20, 224, 384, 234);
		toolkit.adapt(grpMaestroProducto);
		toolkit.paintBordersFor(grpMaestroProducto);

		tableViewer = new TableViewer(grpMaestroProducto, SWT.BORDER | SWT.FULL_SELECTION);
		table = tableViewer.getTable();
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		table.setBounds(10, 24, 363, 200);
		toolkit.paintBordersFor(table);

		TableViewerColumn tableViewerColumn_2 = new TableViewerColumn(tableViewer, SWT.NONE);
		TableColumn tblclmnCodigo = tableViewerColumn_2.getColumn();
		tblclmnCodigo.setWidth(83);
		tblclmnCodigo.setText("Codigo");

		TableViewerColumn tableViewerColumn_3 = new TableViewerColumn(tableViewer, SWT.NONE);
		TableColumn tblclmnPrecio = tableViewerColumn_3.getColumn();
		tblclmnPrecio.setWidth(87);
		tblclmnPrecio.setText("Precio");

		TableViewerColumn tableViewerColumn_1 = new TableViewerColumn(tableViewer, SWT.NONE);
		TableColumn tblclmnCategoria = tableViewerColumn_1.getColumn();
		tblclmnCategoria.setWidth(83);
		tblclmnCategoria.setText("Categoria");

		TableViewerColumn tableViewerColumn = new TableViewerColumn(tableViewer, SWT.NONE);
		TableColumn tblclmnNombre = tableViewerColumn.getColumn();
		tblclmnNombre.setWidth(89);
		tblclmnNombre.setText("Nombre");

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
		IObservableMap[] observeMaps = EMFObservables.observeMaps(listContentProvider.getKnownElements(), new EStructuralFeature[]{Literals.PRODUCTOS_VIEW_MODEL__CODIGO, Literals.PRODUCTOS_VIEW_MODEL__PRECIO, Literals.PRODUCTOS_VIEW_MODEL__CATEGORIA, Literals.PRODUCTOS_VIEW_MODEL__NOMBRE});
		tableViewer.setLabelProvider(new ObservableMapLabelProvider(observeMaps));
		tableViewer.setContentProvider(listContentProvider);
		//
		IObservableList contenedorMaestroProductosViewModelTheProductosViewModelObserveList = EMFObservables.observeList(Realm.getDefault(), contenedorMaestroProductosViewModel, Literals.CONTENEDOR_MESTRO_PRODUCTOS_VIEW_MODEL__THE_PRODUCTOS_VIEW_MODEL);
		tableViewer.setInput(contenedorMaestroProductosViewModelTheProductosViewModelObserveList);
		//
		IObservableValue observeTextTextNombreObserveWidget = WidgetProperties.text(SWT.Modify).observe(textNombre);
		IObservableValue contenedorDetalleProductosViewmodelNombreObserveValue = EMFObservables.observeValue(contenedorDetalleProductosViewmodel, Literals.CONTENEDOR_DETALLE_PRODUCTOS_VIEWMODEL__NOMBRE);
		bindingContext.bindValue(observeTextTextNombreObserveWidget, contenedorDetalleProductosViewmodelNombreObserveValue, null, null);
		//
		IObservableValue observeTextTextCodigoObserveWidget = WidgetProperties.text(SWT.Modify).observe(textCodigo);
		IObservableValue contenedorDetalleProductosViewmodelCodigoObserveValue = EMFObservables.observeValue(contenedorDetalleProductosViewmodel, Literals.CONTENEDOR_DETALLE_PRODUCTOS_VIEWMODEL__CODIGO);
		bindingContext.bindValue(observeTextTextCodigoObserveWidget, contenedorDetalleProductosViewmodelCodigoObserveValue, null, null);
		//
		IObservableValue observeTextTextPrecioObserveWidget = WidgetProperties.text(SWT.Modify).observe(textPrecio);
		IObservableValue contenedorDetalleProductosViewmodelPrecioObserveValue = EMFObservables.observeValue(contenedorDetalleProductosViewmodel, Literals.CONTENEDOR_DETALLE_PRODUCTOS_VIEWMODEL__PRECIO);
		bindingContext.bindValue(observeTextTextPrecioObserveWidget, contenedorDetalleProductosViewmodelPrecioObserveValue, null, null);
		//
		IObservableValue observeTextComboCategoriaObserveWidget = WidgetProperties.text().observe(comboCategoria);
		IObservableValue contenedorDetalleProductosViewmodelCategoriaObserveValue = EMFObservables.observeValue(contenedorDetalleProductosViewmodel, Literals.CONTENEDOR_DETALLE_PRODUCTOS_VIEWMODEL__CATEGORIA);
		bindingContext.bindValue(observeTextComboCategoriaObserveWidget, contenedorDetalleProductosViewmodelCategoriaObserveValue, null, null);
		
		return bindingContext;
	}
}
