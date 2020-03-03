package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyGdxGame extends ApplicationAdapter {

	//Necesitamos un controlador
	private Controlador miControlador;
	// Parte del GUI
	private JPanel Pform;

	private JLabel Lminutos;
	private JLabel Lkilos;
	private JLabel Lactividad;

	private JTextField Tminutos;
	private JTextField Tkilos;

	private JComboBox Cactividad;

	private JButton Bcalcular;
	/*
	SpriteBatch batch;
	Texture img;*/
	
	@Override
	public void create () {

		//creamos el controlador
		miControlador=new Controlador();
		miControlador.iniComboBox();

		// creamos el GUI
		Pform=new JPanel();

		Lminutos=new JLabel();
		Lkilos=new JLabel();
		Lactividad=new JLabel();

		Tminutos=new JTextField();
		Tkilos=new JTextField();

		Cactividad=new JComboBox();

		Bcalcular=new JButton();

		/*batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");*/
	}

	@Override
	public void render () {


		/*Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(img, 0, 0);
		batch.end();*/
	}
	
	@Override
	public void dispose () {

		miControlador.dispose();

		/*batch.dispose();
		img.dispose();*/
	}
}
/*
' Gambas class file

'Estado de la clase GUI principal
'Necesitamos un controlador
Private miControlador As Controlador



'Comportamiento del GUI

'Boton para realizar el cálculo
Public Sub BCalcular_Click()
  Dim minutos As Integer
  Dim kilos As Float
  Dim descrEjercicio As String

  minutos = CInt(TBMinutos.Text)
  kilos = CFloat(TBPeso.Text)
  descrEjercicio = CBEjercicio.List[CBEjercicio.Index]

  'Tengo que pedirle a mi controlador, que realice el cálculo
  LResultado.Text = "Las Kcal quemadas en el ejercicio " & descrEjercicio
  LResultado.Text = LResultado.Text & " durante " & TBMinutos.Text & " minutos son "
  LResultado.Text = LResultado.Text & miControlador.calcularKCal(minutos, kilos, descrEjercicio) & " Kcal"

End



'Inicialización del formulario
Public Sub Form_Open()

  'Aquí tengo que preparar todos los objetos del GUI y al controlador.
  'Primero creo el controlador
  miControlador = New Controlador


  'Después inicializo el Combobox
  miControlador.iniComboBox(CBEjercicio)

End
 */