package builder.prototype;

import java.util.List;

/**
 * Created by Kuma on 17/01/2017.
 */
public class PrototypePatternTest {

    public static void main(String... args) throws CloneNotSupportedException {
        Employees emps = new Employees();
        emps.loadData();

        //Use the clone method to get the Employee object
        Employees empsNew = (Employees) emps.clone();
        Employees empsNew1 = (Employees) emps.clone();
        List<String> list = empsNew.getEmpList();
        list.add("Eddu");
        List<String> list1 = empsNew1.getEmpList();
        list1.remove("Piero");

        System.out.println("emp List: " + emps.getEmpList());
        System.out.println("empsNew List: " + list);
        System.out.println("empsNew1 List: " + list1);
    }

}

/**
 * Si la clonación del objeto no se diera, cada vez que se necesita hacer
 * una llamada a la BD para traer la lista de empleados, consumiría tiempo
 * y recursos
 */