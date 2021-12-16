package kata5;

import java.util.List;

/**
 *
 * @author Simon
 */

public class Kata5 {

    public static void main(String[] args) {
        SelectApp app = new SelectApp();
        app.selectAll();

        String fileName  = ".\\src\\kata5\\email.txt";
        List<String> list = MailListReader.read(fileName);
        InsertarDatosTabla idt = new InsertarDatosTabla();
        for(int i=0; i<list.size();i++)
        {
            String x = list.get(i);
            idt.insert(x);
        }
        System.out.println(list);
    }
    
}
