package lambda.sec03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by soongon on 201720/03/.
 */
public class EmployeeDemo {

    public static void main(String[] args) {

        EmployeeComparable emp1 = new EmployeeComparable("kim", 50000);
        EmployeeComparable emp2 = new EmployeeComparable("lee", 90000);
        EmployeeComparable emp3 = new EmployeeComparable("choi", 80000);
        EmployeeComparable emp4 = new EmployeeComparable("moon", 70000);
        EmployeeComparable emp5 = new EmployeeComparable("park", 60000);

        List<EmployeeComparable> list = new ArrayList<>();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);
        list.add(emp5);

        System.out.println(list);

        Collections.sort(list);

        System.out.println(list);


    }
}
