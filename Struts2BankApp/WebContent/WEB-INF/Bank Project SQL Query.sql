create table user_account(accountnamuber integer NOT NULL PRIMARY KEY DEFAULT  nextval('player_id_seq1') ,
firstName varchar(120),lastName varchar(120), mobileNo integer,occupation varchar(120),gender varchar(10),
address varchar(450),officeAddress varchar(450));


create sequence player_id_seq1 start 1 increment 100001;
alter table user_account alter accountnamuber set default nextval('player_id_seq1');


CREATE TABLE user_credential (
        accountNo    integer references user_account(accountnamuber),
        userName   varchar(80),
        password   varchar(20),
        confirmPassword      varchar(20)
      )	
	  CREATE TABLE user_transaction (
        accountNo    integer references user_account(accountnamuber),
        amount   float,
        netAmount float,
        Transaction_date date
      )