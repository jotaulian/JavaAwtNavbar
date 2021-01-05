package es.studium.AwtMenu;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

public class AwtMenu extends Frame
{
	private static final long serialVersionUID = 1L;
	
	//CREAMOS LA BARRA DE MENU
	MenuBar barraMenu = new MenuBar();
	//Ahora creamos los elementos principales del menu:
	Menu menuArchivo = new Menu("Archivo");
	Menu menuEdicion = new Menu("Edición");
	
	//ELEMENTOS DE CADA OPCION DEL MENU PRINCIPAL
	//Primero los de ARCHIVO. menuArchivoNuevo contendrá otros elementos, por lo que es tipo Menu
	Menu menuArchivoNuevo = new Menu("Nuevo");
	// Los siguientes son MenuItem pues dentro no tienen submenús
	MenuItem miArchivoAbrir = new MenuItem("Abrir");
	MenuItem miArchivoGuardar = new MenuItem("Guardar");
	MenuItem miArchivoSalir = new MenuItem("Salir");
	
	//Elementos de EDICION
	MenuItem mniEdicionCortar = new MenuItem("Cortar");
	MenuItem mniEdicionCopiar = new MenuItem("Copiar");
	MenuItem mniEdicionPegar = new MenuItem("Pegar");
	
	//Elementos de Archivo-->Nuevo
	MenuItem mniArchivoNuevoVentana = new MenuItem("Ventana");
	MenuItem mniArchivoNuevoDialogo = new MenuItem("Diálogo");
	
	public AwtMenu(){
		setLayout(new FlowLayout());
		setTitle("Menu Example");
		setMenuBar(barraMenu); //Agregamos la barra de Menu al Frame
		
		// Empezamos a añadirle los elementos
		// Primero a menuArchivoNuevo, le añadimos su submenus
		menuArchivoNuevo.add(mniArchivoNuevoVentana);
		menuArchivoNuevo.add(mniArchivoNuevoDialogo);
		
		//Añadimos los elementos a ARCHIVO
		menuArchivo.add(menuArchivoNuevo);
		menuArchivo.add(miArchivoAbrir);
		menuArchivo.add(miArchivoGuardar);
		// Añadimos un separador
		menuArchivo.addSeparator();
		menuArchivo.add(miArchivoSalir);
		
		//Añadimos los elementos a EDICION:
		menuEdicion.add(mniEdicionCortar);
		menuEdicion.add(mniEdicionCopiar);
		menuEdicion.add(mniEdicionPegar);
		
		//Agregamos ARCHIVO y EDICION a la barra
		barraMenu.add(menuArchivo);
		barraMenu.add(menuEdicion);
		
		setLocationRelativeTo(null);
		setSize(200,200);
		setVisible(true);
	}
	public static void main(String[] args)
	{
		new AwtMenu();
	}

}
