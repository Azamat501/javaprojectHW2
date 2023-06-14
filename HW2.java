
import java.io.*;
import java.sql.SQLClientInfoException;



public class HW2 {
   public static void main(String[] args) throws Exception {
    StringBuilder builder = new StringBuilder();
    try (FileReader reader = new FileReader("file.txt")) {
        int c;
        while ((c = reader.read() ) != -1) {
            builder.append((char) c);
        }
    }catch (IOException ex) {
        System.out.println(ex.getMessage());
    }
    System.out.println(SQL(builder)); 

      }
  private static String SQL(StringBuilder builder1) {
    String str = new String(builder1);
    if (str.trim().length() != 0){
        str = str.replace(":", "=");
        str = str.replace("\"","" );
        String[] strlist = str.split(",");
        str = "select * from students where " + strlist[0] + "," + strlist[1] + "," + strlist[2] + "," + strlist[3];
    } else 
        str = "файл пустой ";
        return str;
      }

   }
    






