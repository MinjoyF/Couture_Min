package org.minjoy.Model;


import java.util.Objects;
import java.util.UUID;

public abstract class ClientAccount {
    private String accountId;
    private String name;
    private String phone_number;
    private AccountStatus status;

     public ClientAccount(){
         this.accountId = UUID.randomUUID().toString();
         this.status = AccountStatus.CREATED;

     }
     public ClientAccount(String name, String phone_number){
        this();
        this.name = name;
        this.phone_number = phone_number;
    }

     public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public AccountStatus getStatus() {
        return status;
    }

    public void setStatus(AccountStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Client_data{" +
                "AccountID '" + accountId + '\'' +
                "Name '" + name + '\'' +
                "phone_number '" + phone_number + '\'' +
                "Status" + status +
                '}';
    }

    public int hashCode(){
         return Objects.hashCode(this.accountId)+
                Objects.hashCode(this.name)+
                Objects.hashCode(this.phone_number)+
                Objects.hashCode(this.status);
    }

    public abstract String geType();

}
