package estructural.facade;

import estructural.facade.helpers.FacadeHelper;
import estructural.facade.helpers.MySqlHelper;
import estructural.facade.helpers.OracleHelper;

import java.sql.Connection;

/**
 * Created by Kuma on 17/01/2017.
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
 *
 * Es más como un Helper para aplicaciones Cliente, no esconde
 * las Interfaces del subsistema. Usarlo o no es dependiente del código Cliente.
 *
 * Puede ser aplicado en cualquier momento del desarrollo. Usualmente cuando
 * la cantidad de Interfaces crece y el sistema se hace complejo.
 *
 * Los Subsistemas no deben notar la existencia de Facade ni debe haber referencias.
 *
 * El propósito es proporcionar una Interface en lugar de multiples.
 *
 * Se puede usar el patrón Factory Method con Facade para proveer mejor Interface.
 */