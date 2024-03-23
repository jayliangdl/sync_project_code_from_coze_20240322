package com.xxx.user.model;

import lombok.Data;
import java.sql.Timestamp;

@Data
public class UserDO {
  private Long id; 
  private String userName; 
  private char gender;
  private char status;
  private String psw;
  private Timestamp createDatetime;
  private Timestamp updateDatetime;
}
