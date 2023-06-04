package org.minjoy;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.minjoy.Model.AccountStatus;
import org.minjoy.Model.BestAccount;
import org.minjoy.Model.BestNewAccount;
import org.minjoy.Model.ClientAccount;

import java.util.*;

public class App {
    public static void main(String[] args) throws JsonProcessingException {


        List<ClientAccount> clientAccounts = new ArrayList<>();
        clientAccounts.add(new BestAccount("Ghislain", "012733727466",5.3));
        clientAccounts.add(new BestAccount("Ghislain", "012733727466",3.5));
        clientAccounts.add(new BestAccount("Ghislain", "012733727466",3.5));
        clientAccounts.add(new BestAccount("Ghislain", "012733727466",3.5));
        clientAccounts.add(new BestAccount("Ghislain", "012733727466",3.5));

        for (ClientAccount acc : clientAccounts) {
            System.out.println(acc.toString());
            System.out.println(acc.geType());

        }

        Map<String, ClientAccount> clientAccountMap = new HashMap<>();
        clientAccountMap.put("acc1",new BestNewAccount("Ghislain", "012733727466",3.5));
        clientAccountMap.put("acc2",new BestAccount("Nicaise", "012733727466",3.5));
        clientAccountMap.put("acc3",new BestNewAccount("Ornella", "012733727466",3.5));
        clientAccountMap.put("acc4",new BestAccount("Prudence", "012733727466",3.5));
        clientAccountMap.put("acc5",new BestAccount("Megane", "012733727466",3.5));
        clientAccountMap.put("acc6",new BestNewAccount("Pascaline", "012733727466",3.5));

        System.out.println("-------CLIENT1---------");
        ClientAccount acc= clientAccountMap.get("acc2");
        System.out.println(acc.geType());

        ClientAccount acc1= clientAccountMap.get("acc3");
        System.out.println(toJson(acc1));


        System.out.println("-------CLIENT2---------");
        ClientAccount acc2= clientAccountMap.get("acc6");
        System.out.println(toJson(acc2));

        System.out.println("-------CLIENT3---------");
        for(String key: clientAccountMap.keySet()){
            System.out.println(toJson(clientAccountMap.get(key)));
        }

        System.out.println("-------CLIENT4---------");
        for( ClientAccount ca: clientAccountMap.values()){
            System.out.println(toJson(ca));
        }
    }
    public static String toJson(ClientAccount o) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(o);
    }
}