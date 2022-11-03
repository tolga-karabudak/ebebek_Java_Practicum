/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package firstcase;

import java.util.ArrayList;

/**
 *
 * @author tolga
 */
public class FirstCase {

    /**
     * @param args the command line arguments
     */
    
// ArrayList olarak buraya case ekledim. Dilerseniz Siz de array ekleyebilirsiniz.
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("kemal", 2000, 45, 1985)); //Örnek çıktıya göre tanımlanmış case.
        //Diğer durumları da sağlayabildiğini görmek amacıyla eklediğim caseler.
        employees.add(new Employee("Ahmet Demir", 1500, 40, 2005));
        employees.add(new Employee("Fadime Demir", 2000, 43, 1990));

        
        for (Employee employee : employees) {
            System.out.println(employee.toString()); 
//daha clean olması için bu döngü çalışıyor fakat alttaki de mümkün 
        }
        
        /*for (int i = 0; i < employees.size(); i++) {
            Employee employee = employees.get(i);
            System.out.println(employee.toString());
        }*/

    }
    
}
