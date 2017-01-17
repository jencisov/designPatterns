package builder.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kuma on 17/01/2017.
 * <p>
 * El patrón Prototype se usa cuando la creación de un objeto cuesta mucho
 * tiempo y recursos y se tiene un objeto similar existiendo actualmente.
 * Este patrón usa la interfaz Cloneable para copiar el objeto.
 * <p>
 * Suponiendo que se tiene un Objeto que carga data de una base de datos y
 * necesitamos modificar esa data en nuestro programa varias veces.
 * Para evitar crear el Objeto varias veces y volver a hacer llamados a la
 * base de datos para cargarlo, lo mejor es usar el objeto existente y clonarlo
 * para manipular la data.
 */
public class Employees implements Cloneable {
    private List<String> empList;

    public Employees() {
        empList = new ArrayList<>();
    }

    public Employees(List list) {
        this.empList = list;
    }

    public void loadData() {
        empList.add("Josué");
        empList.add("Piero");
        empList.add("Marcio");
        empList.add("Jorge");
    }

    public List<String> getEmpList() {
        return empList;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        List temp = new ArrayList();
        for (String string : this.getEmpList()) {
            temp.add(string);
        }

        return new Employees(temp);
    }

}