package estructural.facade;

import estructural.facade.helpers.FacadeHelper;
import estructural.facade.helpers.MySqlHelper;
import estructural.facade.helpers.OracleHelper;

import java.sql.Connection;

/**
 * Created by Kuma on 17/01/2017.
 * <p>
 * Suponiendo que nuestra aplicación tiene varias Interfaces para usar MySql/Oracle y generar
 * diferentes tipos de reportes, tendremos diferentes Interfaces para trabajar con diferentes
 * tipos de Bases de Datos.
 * Cuando la complejidad crece, la aplicación cliente encontrará esto complicado de manejar.
 * <p>
 * Entonces podemos aplicar Facade como Interface envoltura encima de las Interfaces existentes
 * para ayudar a la aplicación Cliente
 */
public class FacadePatternTest {

    public static void main(String... args) {
        String tableName = "Employee";

        //generating MySql HTML report and Oracle PDF report without using Facade
        Connection connectionMySql = MySqlHelper.getMySqlDBConnection();
        MySqlHelper mySqlHelper = new MySqlHelper();
        mySqlHelper.generateMySqlHTMLReport(tableName, connectionMySql);

        Connection connectionOracle = MySqlHelper.getMySqlDBConnection();
        OracleHelper oracleHelper = new OracleHelper();
        oracleHelper.generateOraclePDFReport(tableName, connectionOracle);

        //generating MySql HTML report and Oracle PDF report using Facade
        FacadeHelper.generateReport(FacadeHelper.DBTypes.MYSQL, FacadeHelper.ReportTypes.HTML, tableName);
        FacadeHelper.generateReport(FacadeHelper.DBTypes.ORACLE, FacadeHelper.ReportTypes.PDF, tableName);
        /**
         * Usar la Interface Facade es mucho más fácil y limpio y evita tener mucha lógica
         * del lado del cliente.
         */
    }

}

/**
 * PUNTOS IMPORTANTES:
 * <p>
 * Es más como un Helper para aplicaciones Cliente, no esconde
 * las Interfaces del subsistema. Usarlo o no es dependiente del código Cliente.
 * <p>
 * Puede ser aplicado en cualquier momento del desarrollo. Usualmente cuando
 * la cantidad de Interfaces crece y el sistema se hace complejo.
 * <p>
 * Los Subsistemas no deben notar la existencia de Facade ni debe haber referencias.
 * <p>
 * El propósito es proporcionar una Interface en lugar de multiples.
 * <p>
 * Se puede usar el patrón Factory Method con Facade para proveer mejor Interface.
 */