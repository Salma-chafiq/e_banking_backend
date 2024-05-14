package org.sid.ebankingbackend.dtos;



import lombok.Data;
import org.sid.ebankingbackend.enums.AccountStatus;
import java.util.Date;


@Data

public class SavingBankAccountDTO extends BankAccountDTO {

    private String id ;
    private Date createdAt;

    private double balance ;

    private AccountStatus status;

    private CustomerDTO customerDTO;
    private double interestRate;
}




















































































































































































































































































































