package com.mygdx.game;

public class Controlador {
    //Estados
//Colección con los tipos de ejercicios disponibles
    private tipoEjercicio TEColeccion;
    //Fichero con los datos
    private final String FILE_DATOS = "tiposejercicios.txt";

    // Comportamientos
//constructor
    public Controlador() {
        TEColeccion = new tipoEjercicio();
    }

    //comportamiento para devolver las KCAL de una determinada actividad
//realizada
    public String calcularKCal(int minutos, float kilos, String descrEjer) {

        String resultado;
        Ejercicio miEjercicio;


        //dado los kg, minutos y el ejercicio seleccionado, creamos los objetos necesarios
        miEjercicio = TEColeccion.getEjercicioByDescr(descrEjer);

        //y después a esos objetos les pedimos trabajar
        resultado = miEjercicio.calcularKCal(minutos, kilos);


        //el resultado del trabajo lo ponemos en la pantalla, concretamente en el LBResultado
        return resultado;
    }

    //Tenemos que inicializar el ComboBox con todos los tipos de ejercicios
//disponibles
    public void iniComboBox() {


    }

//cargar los datos en la coleccion

    private void cargarDatos() {


    }
    // comprobar errores
    private String comprobarErrores(String entrada) {

        String resultado;
        String[] listaParametros = entrada.split(";");

        resultado = "";
        //'linea vacia
        if (listaParametros.length==0) {
            resultado = "Línea vacia";
        } else {
            //'hay al menos uno ;
            if (listaParametros.length > 0) {
                //'Hay más de dos ;
                if (listaParametros.length>1) {
                    resultado = "hay más de dos columnas";
                } else {
                    if (comprobarFloat(listaParametros[1])){
                        resultado = "La segunda columna no es un número decimal";
                    }else{
                        //'solo hay una columna
                        resultado = "Sólo hay una columna";
                    }
                }
                //la segunda columna no es un número

                resultado="la segunda columna no es un número";
            }

        }
        return resultado;
    }

    private boolean comprobarFloat (String unFloat) {
        try {
            float num=Float.parseFloat(unFloat);
        }
        catch(Exception e){
            return false;
        }
        return true;
    }
    public void dispose(){
        this.dispose();
    }


}
