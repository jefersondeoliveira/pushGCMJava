package pushandroid;

/**
 *
 * @author Jeferson
 */
public class App {

    public static void main(String[] args) {
       
        System.out.println( "Sending POST to GCM" );

        String apiKey = "AIzaSyB8azikXJKi_NjpWcVNJVO0d........";
        Content content = createContent();

        POST2GCM.post(content);
        
    }
    
    public static Content createContent(){

        Content c = new Content();

        c.addRegId("APA91bE3jWQWgMFp7-OKL7ovFA18wc926cBmYqw6d6GgZNpqqt1Bjx7AMeYZUYxyBfCO1wRdGNxscuIdEYdTK5Ew4gd8CE9Ip6Cc2ooVv6iSf9aLqOxXeH_jMNMbQPTGAgyEiOWzMvCiRxbIdLfc1YYSzqatJol-kzv8t_AhoH9cu...");
        c.createData("Test Title", "Test Message");

        return c;
    }
    
}
