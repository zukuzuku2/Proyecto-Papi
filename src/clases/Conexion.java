package clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    public static Connection conectar() {

//        La conexion siempre hay que establecerla dentro de un try catch
        try {
//            Conexion con base de datos local con acces para ser mas especifico
            Connection cn = DriverManager.getConnection("jdbc:ucanaccess://E:\\MI CATALOGO DE PELICULAS\\SegundoCatalogo.accdb");
//            Connection cn = DriverManager.getConnection("jdbc:ucanaccess://C:\\Program Files (x86)\\Catalogo\\SegundoCatalogo.accdb");
            
            return cn;
        } catch (SQLException sqlex) {
            System.out.println("Error en la conexion!!!" + sqlex);
        }
        return null;
    }
}
