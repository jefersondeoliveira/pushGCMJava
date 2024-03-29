package pushandroid;

import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
/**
 *
 * @author Jeferson
 */
public class Content implements Serializable {
    
    public List<String> registration_ids;
    public Map<String,String> data;
    
    public void addRegId(String regId){
        if(registration_ids == null)
            registration_ids = new LinkedList<>();
        registration_ids.add(regId);
    }

    public void createData(String title, String message){
        if(data == null)
            data = new HashMap<>();

        data.put("title", title);
        data.put("message", message);
    }
}
