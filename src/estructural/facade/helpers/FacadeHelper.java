package estructural.facade.helpers;

import java.sql.Connection;

/**
 * Created by Kuma on 17/01/2017.
 * <p>
 * Podemos crear una Interface Facade. Notar el uso de JAVA ENUM para
 * seguridad de tipado
 */
public class FacadeHelper {

    public static void generateReport(DBTypes dbTypes, ReportTypes reportTypes, String tableName) {
        Connection connection = null;
        switch (dbTypes) {
            case MYSQL:
                connection = MySqlHelper.getMySqlDBConnection();
                MySqlHelper mySqlHelper = new MySqlHelper();
                switch (reportTypes) {
                    case HTML:
                        mySqlHelper.generateMySqlHTMLReport(tableName, connection);
                        break;
                    case PDF:
                        mySqlHelper.generateMySqlPDFReport(tableName, connection);
                        break;
                }
                break;
            case ORACLE:
                connection = OracleHelper.getOracleDBConnection();
                OracleHelper oracleHelper = new OracleHelper();
                switch (reportTypes) {
                    case HTML:
                        oracleHelper.generateOracleHTMLReport(tableName, connection);
                        break;
                    case PDF:
                        oracleHelper.generateOraclePDFReport(tableName, connection);
                }
        }
    }

    public static enum DBTypes {
        MYSQL, ORACLE;
    }

    public static enum ReportTypes {
        HTML, PDF;
    }

}